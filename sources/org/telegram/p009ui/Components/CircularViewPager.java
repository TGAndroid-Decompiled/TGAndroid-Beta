package org.telegram.p009ui.Components;

import android.content.Context;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

public class CircularViewPager extends ViewPager {
    private Adapter adapter;

    public CircularViewPager(Context context) {
        super(context);
        addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            private int scrollState;

            @Override
            public void onPageSelected(int i) {
            }

            @Override
            public void onPageScrolled(int i, float f, int i2) {
                if (i == CircularViewPager.this.getCurrentItem() && f == 0.0f && this.scrollState == 1) {
                    checkCurrentItem();
                }
            }

            @Override
            public void onPageScrollStateChanged(int i) {
                if (i == 0) {
                    checkCurrentItem();
                }
                this.scrollState = i;
            }

            private void checkCurrentItem() {
                if (CircularViewPager.this.adapter != null) {
                    int currentItem = CircularViewPager.this.getCurrentItem();
                    int extraCount = CircularViewPager.this.adapter.getExtraCount() + CircularViewPager.this.adapter.getRealPosition(currentItem);
                    if (currentItem != extraCount) {
                        CircularViewPager.this.setCurrentItem(extraCount, false);
                    }
                }
            }
        });
    }

    @Override
    @Deprecated
    public void setAdapter(PagerAdapter pagerAdapter) {
        if (pagerAdapter instanceof Adapter) {
            setAdapter((Adapter) pagerAdapter);
            return;
        }
        throw new IllegalArgumentException();
    }

    public void setAdapter(Adapter adapter) {
        this.adapter = adapter;
        super.setAdapter((PagerAdapter) adapter);
        if (adapter != null) {
            setCurrentItem(adapter.getExtraCount(), false);
        }
    }

    public static abstract class Adapter extends PagerAdapter {
        public abstract int getExtraCount();

        public int getRealPosition(int i) {
            int count = getCount();
            int extraCount = getExtraCount();
            if (i < extraCount) {
                return ((count - (extraCount * 2)) - ((extraCount - i) - 1)) - 1;
            }
            int i2 = count - extraCount;
            return i >= i2 ? i - i2 : i - extraCount;
        }
    }
}
