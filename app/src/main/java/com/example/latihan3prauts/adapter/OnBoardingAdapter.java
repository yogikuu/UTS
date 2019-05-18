package com.example.latihan3prauts.adapter;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.latihan3prauts.fragment.BiodataFragment;
import com.example.latihan3prauts.fragment.DailyActivityFragment;
import com.example.latihan3prauts.fragment.GalleryFragment;
import com.example.latihan3prauts.fragment.OnBoarding1;
import com.example.latihan3prauts.fragment.OnBoarding2;
import com.example.latihan3prauts.fragment.OnBoarding3;
//10116332-YogiKusumaSantika 15/05/2019
public class OnBoardingAdapter extends FragmentPagerAdapter {
    private static int ITEM_COUNT = 3;

    public OnBoardingAdapter(FragmentManager fragmentManager) {
        super(fragmentManager);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new OnBoarding1();
            case 1:
                return new OnBoarding2();
            case 2:
                return new OnBoarding3();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return ITEM_COUNT;
    }
}