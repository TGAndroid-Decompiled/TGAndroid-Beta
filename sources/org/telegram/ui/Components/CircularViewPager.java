package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import org.telegram.ui.ProfileActivity;

public abstract class CircularViewPager extends ViewPager {
    public Adapter adapter;

    public abstract class Adapter extends PagerAdapter {
        public abstract int getExtraCount();

        public final int getRealPosition(int i) {
            int size = ((ProfileGalleryView.ViewPagerAdapter) this).objects.size();
            int extraCount = getExtraCount();
            if (i < extraCount) {
                return ((size - (extraCount * 2)) - ((extraCount - i) - 1)) - 1;
            }
            int i2 = size - extraCount;
            return i >= i2 ? i - i2 : i - extraCount;
        }
    }

    public CircularViewPager(Context context) {
        super(context);
        addOnPageChangeListener(new AnonymousClass1(0, (ProfileGalleryView) this));
    }

    @Override
    @Deprecated
    public void setAdapter(PagerAdapter pagerAdapter) {
        if (!(pagerAdapter instanceof Adapter)) {
            throw new IllegalArgumentException();
        }
        setAdapter((Adapter) pagerAdapter);
    }

    public void setAdapter(Adapter adapter) {
        this.adapter = adapter;
        super.setAdapter((PagerAdapter) adapter);
        if (adapter != null) {
            setCurrentItem(adapter.getExtraCount(), false);
        }
    }

    public final class AnonymousClass1 implements ViewPager.OnPageChangeListener {
        public final int $r8$classId;
        public int scrollState;
        public final View this$0;

        public AnonymousClass1(int i, View view) {
            this.$r8$classId = i;
            this.this$0 = view;
        }

        @Override
        public final void onPageScrollStateChanged(int i) {
            switch (this.$r8$classId) {
                case 0:
                    if (i == 0) {
                        ProfileGalleryView profileGalleryView = (ProfileGalleryView) this.this$0;
                        if (((CircularViewPager) profileGalleryView).adapter != null) {
                            int currentItem = profileGalleryView.getCurrentItem();
                            int realPosition = ((CircularViewPager) profileGalleryView).adapter.getRealPosition(currentItem) + ((CircularViewPager) profileGalleryView).adapter.getExtraCount();
                            if (currentItem != realPosition) {
                                profileGalleryView.setCurrentItem(realPosition, false);
                            }
                        }
                    }
                    this.scrollState = i;
                    break;
            }
        }

        @Override
        public final void onPageScrolled(float f, int i, int i2) {
            switch (this.$r8$classId) {
                case 0:
                    ProfileGalleryView profileGalleryView = (ProfileGalleryView) this.this$0;
                    if (i == profileGalleryView.getCurrentItem() && f == 0.0f && this.scrollState == 1 && ((CircularViewPager) profileGalleryView).adapter != null) {
                        int currentItem = profileGalleryView.getCurrentItem();
                        int realPosition = ((CircularViewPager) profileGalleryView).adapter.getRealPosition(currentItem) + ((CircularViewPager) profileGalleryView).adapter.getExtraCount();
                        if (currentItem != realPosition) {
                            profileGalleryView.setCurrentItem(realPosition, false);
                        }
                        break;
                    }
                    break;
            }
        }

        @Override
        public final void onPageSelected(int i) {
            switch (this.$r8$classId) {
                case 0:
                    break;
                default:
                    ProfileActivity.PagerIndicatorView pagerIndicatorView = (ProfileActivity.PagerIndicatorView) this.this$0;
                    int realPosition = ((ProfileGalleryView) ProfileActivity.this.avatarsViewPager).adapter.getRealPosition(i);
                    pagerIndicatorView.invalidateIndicatorRect(this.scrollState != realPosition);
                    this.scrollState = realPosition;
                    pagerIndicatorView.updateAvatarItems();
                    break;
            }
        }

        private final void onPageScrollStateChanged$org$telegram$ui$ProfileActivity$PagerIndicatorView$2(int i) {
        }

        private final void onPageSelected$org$telegram$ui$Components$CircularViewPager$1(int i) {
        }

        private final void onPageScrolled$org$telegram$ui$ProfileActivity$PagerIndicatorView$2(float f, int i, int i2) {
        }
    }
}
