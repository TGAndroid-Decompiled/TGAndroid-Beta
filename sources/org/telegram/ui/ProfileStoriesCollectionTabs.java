package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.text.SpannableStringBuilder;
import android.view.MotionEvent;
import android.view.View;
import j$.util.Objects;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.BlurredFrameLayout;
import org.telegram.ui.Components.ColoredImageSpan;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.SizeNotifierFrameLayout;
import org.telegram.ui.Components.ViewPagerFixed;
import org.telegram.ui.Stories.StoriesController;

public abstract class ProfileStoriesCollectionTabs extends BlurredFrameLayout implements NotificationCenter.NotificationCenterDelegate {
    private final Adapter adapter;
    private final Rect clipRect;
    private final StoriesController.StoriesCollections collections;
    int initialAlbumId;
    private boolean reorderingCollections;
    private final Runnable sendCollectionsOrder;
    public final ViewPagerFixed.TabsView tabsView;
    private final ViewPagerFixed viewPager;
    private ValueAnimator visibilityAnimator;
    private float visibilityFactor;
    private boolean visibilityValue;

    public interface Delegate {
        void onTabAlbumAnimationUpdate(float f);

        void onTabAlbumCreateCollection();

        void onTabAlbumLongClick(View view, int i);

        void onTabAlbumScrollEnd(int i);

        void onTabAlbumSelected(int i, boolean z);
    }

    protected abstract void updatedReordering(boolean z);

    public ProfileStoriesCollectionTabs(Context context, SizeNotifierFrameLayout sizeNotifierFrameLayout, final StoriesController.StoriesCollections storiesCollections, final Delegate delegate) {
        super(context, sizeNotifierFrameLayout);
        this.clipRect = new Rect();
        this.collections = storiesCollections;
        Objects.requireNonNull(storiesCollections);
        this.sendCollectionsOrder = new Runnable() {
            @Override
            public final void run() {
                storiesCollections.sendOrder();
            }
        };
        ViewPagerFixed viewPagerFixed = new ViewPagerFixed(context) {
            @Override
            public void onTabAnimationUpdate(boolean z) {
                super.onTabAnimationUpdate(z);
                Delegate delegate2 = delegate;
                if (delegate2 != null) {
                    delegate2.onTabAlbumAnimationUpdate(ProfileStoriesCollectionTabs.this.tabsView.getAnimatingIndicatorProgress());
                }
            }

            @Override
            protected void onTabScrollEnd(int i) {
                super.onTabScrollEnd(i);
                Delegate delegate2 = delegate;
                if (delegate2 != null) {
                    delegate2.onTabAlbumScrollEnd(ProfileStoriesCollectionTabs.this.getAlbumIdByPosition(i));
                }
            }

            @Override
            protected void onTabPageSelected(int i, boolean z) {
                Delegate delegate2 = delegate;
                if (delegate2 != null) {
                    delegate2.onTabAlbumSelected(ProfileStoriesCollectionTabs.this.getAlbumIdByPosition(i), z);
                }
            }
        };
        this.viewPager = viewPagerFixed;
        viewPagerFixed.setAllowDisallowInterceptTouch(true);
        Adapter adapter = new Adapter();
        this.adapter = adapter;
        adapter.canCreateNewAlbum = storiesCollections.canCreateNewAlbum();
        viewPagerFixed.setAdapter(adapter);
        viewPagerFixed.setTranslationY(AndroidUtilities.dp(42.0f));
        ViewPagerFixed.TabsView tabsViewCreateTabsView = viewPagerFixed.createTabsView(true, 10);
        this.tabsView = tabsViewCreateTabsView;
        tabsViewCreateTabsView.setColors(Theme.key_profile_tabSelectedLine, Theme.key_windowBackgroundWhiteBlackText, Theme.key_profile_tabText, Theme.key_profile_tabSelector, Theme.key_actionBarDefault);
        tabsViewCreateTabsView.tabMarginDp = 12;
        tabsViewCreateTabsView.setPreTabClick(new Utilities.Callback2Return() {
            @Override
            public final Object run(Object obj, Object obj2) {
                return ProfileStoriesCollectionTabs.m3934$r8$lambda$jugj49GTYchGqFg_rZSVDI7n38(this.f$0, delegate, (Integer) obj, (Integer) obj2);
            }
        });
        tabsViewCreateTabsView.setOnTabLongClick(new Utilities.Callback2Return() {
            @Override
            public final Object run(Object obj, Object obj2) {
                return ProfileStoriesCollectionTabs.$r8$lambda$iIn89rVPExoQELe6HNJwIo4tUPM(this.f$0, delegate, (Integer) obj, (View) obj2);
            }
        });
        addView(tabsViewCreateTabsView, LayoutHelper.createFrame(-1, 42, 48));
        setVisibility(!storiesCollections.collections.isEmpty(), false, true);
    }

    public static Boolean m3934$r8$lambda$jugj49GTYchGqFg_rZSVDI7n38(ProfileStoriesCollectionTabs profileStoriesCollectionTabs, Delegate delegate, Integer num, Integer num2) {
        if (profileStoriesCollectionTabs.reorderingCollections) {
            return Boolean.TRUE;
        }
        if (num.intValue() == -1) {
            if (delegate != null) {
                delegate.onTabAlbumCreateCollection();
            }
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }

    public static Boolean $r8$lambda$iIn89rVPExoQELe6HNJwIo4tUPM(ProfileStoriesCollectionTabs profileStoriesCollectionTabs, Delegate delegate, Integer num, View view) {
        profileStoriesCollectionTabs.getClass();
        if (num.intValue() == -1 || num.intValue() == 0 || profileStoriesCollectionTabs.reorderingCollections) {
            return Boolean.FALSE;
        }
        if (delegate != null) {
            delegate.onTabAlbumLongClick(view, num.intValue());
        }
        return Boolean.TRUE;
    }

    public void setInitialTabId(final int i) {
        if (this.adapter.getItemPosition(i) != -1) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.scrollToAlbumId(i);
                }
            }, 500L);
        } else {
            this.initialAlbumId = i;
        }
    }

    public int getCurrentAlbumId() {
        return this.adapter.getItemId(this.tabsView.getCurrentPosition());
    }

    public int getNextAlbumId(boolean z) {
        return this.tabsView.getNextPageId(z);
    }

    public int getAlbumIdByPosition(int i) {
        return this.tabsView.getPageIdByPosition(i);
    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getInstance(this.collections.currentAccount).addObserver(this, NotificationCenter.storyAlbumsCollectionsUpdate);
    }

    @Override
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.collections.currentAccount).removeObserver(this, NotificationCenter.storyAlbumsCollectionsUpdate);
    }

    @Override
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == NotificationCenter.storyAlbumsCollectionsUpdate && ((Long) objArr[0]).longValue() == this.collections.dialogId) {
            ViewPagerFixed.TabsView tabsView = this.tabsView;
            int currentTabId = tabsView != null ? tabsView.getCurrentTabId() : 0;
            this.adapter.canCreateNewAlbum = this.collections.canCreateNewAlbum();
            this.viewPager.fillTabs(true);
            setVisibility(!this.collections.collections.isEmpty(), true, false);
            int i3 = this.initialAlbumId;
            if (i3 > 0) {
                if (this.adapter.getItemPosition(i3) != -1) {
                    final int i4 = this.initialAlbumId;
                    AndroidUtilities.runOnUIThread(new Runnable() {
                        @Override
                        public final void run() {
                            this.f$0.scrollToAlbumId(i4);
                        }
                    }, 500L);
                    this.initialAlbumId = 0;
                    return;
                }
                return;
            }
            if (this.tabsView == null || currentTabId <= 0 || this.collections.findById(currentTabId) != null) {
                return;
            }
            this.tabsView.scrollToTab(0, 0);
        }
    }

    public void selectTabWithId(int i, float f) {
        this.tabsView.selectTabWithId(i, f);
    }

    public void scrollToAlbumId(int i) {
        this.tabsView.scrollToTab(i, this.adapter.getItemPosition(i));
    }

    @Override
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        checkUi_clipRect();
    }

    public boolean isReordering() {
        return this.reorderingCollections;
    }

    public void resetReordering() {
        setReorderingAlbums(false);
    }

    public void setReorderingAlbums(boolean z) {
        if (this.reorderingCollections == z) {
            return;
        }
        this.reorderingCollections = z;
        this.tabsView.setReordering(z);
        updatedReordering(isReordering());
        if (z) {
            final BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
            if (safeLastFragment instanceof ProfileActivity) {
                ((ProfileActivity) safeLastFragment).scrollToSharedMedia(false);
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        ((ProfileActivity) safeLastFragment).scrollToSharedMedia(true);
                    }
                });
            }
        }
        if (z) {
            return;
        }
        AndroidUtilities.cancelRunOnUIThread(this.sendCollectionsOrder);
        this.collections.reorderComplete(false);
        int itemId = this.adapter.getItemId(this.tabsView.getCurrentPosition());
        this.viewPager.fillTabs(true);
        int itemPosition = this.adapter.getItemPosition(itemId);
        this.tabsView.selectTab(itemPosition, itemPosition, 0.0f);
    }

    private void setVisibility(boolean z, boolean z2, boolean z3) {
        if (this.visibilityValue != z || z3) {
            this.visibilityValue = z;
            setEnabled(z);
            ValueAnimator valueAnimator = this.visibilityAnimator;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.visibilityAnimator = null;
            }
            if (!z2) {
                float f = z ? 1.0f : 0.0f;
                this.visibilityFactor = f;
                onVisibilityChange(f);
            } else {
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.visibilityFactor, z ? 1.0f : 0.0f);
                this.visibilityAnimator = valueAnimatorOfFloat;
                valueAnimatorOfFloat.setDuration(480L);
                this.visibilityAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
                this.visibilityAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                        ProfileStoriesCollectionTabs.$r8$lambda$KixG3VjeET89lijEJDg_qjQ1W18(this.f$0, valueAnimator2);
                    }
                });
                this.visibilityAnimator.start();
            }
        }
    }

    public static void $r8$lambda$KixG3VjeET89lijEJDg_qjQ1W18(ProfileStoriesCollectionTabs profileStoriesCollectionTabs, ValueAnimator valueAnimator) {
        profileStoriesCollectionTabs.getClass();
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        profileStoriesCollectionTabs.visibilityFactor = fFloatValue;
        profileStoriesCollectionTabs.onVisibilityChange(fFloatValue);
    }

    protected void onVisibilityChange(float f) {
        checkUi_clipRect();
        invalidate();
    }

    private void checkUi_clipRect() {
        this.clipRect.set(0, 0, getMeasuredWidth(), (int) getVisualHeight());
        setClipBounds(this.clipRect);
    }

    public float getVisibilityFactor() {
        return this.visibilityFactor;
    }

    public float getVisualHeight() {
        return getMeasuredHeight() * this.visibilityFactor;
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.visibilityValue && super.dispatchTouchEvent(motionEvent);
    }

    private class Adapter extends ViewPagerFixed.Adapter {
        private boolean canCreateNewAlbum;

        @Override
        public void bindView(View view, int i, int i2) {
        }

        private Adapter() {
        }

        @Override
        public int getItemCount() {
            return ProfileStoriesCollectionTabs.this.collections.collections.size() + 1 + (this.canCreateNewAlbum ? 1 : 0);
        }

        @Override
        public View createView(int i) {
            if (i == -1) {
                return null;
            }
            return new View(ProfileStoriesCollectionTabs.this.getContext());
        }

        @Override
        public boolean canReorder(int i) {
            if (i == 0) {
                return false;
            }
            return (this.canCreateNewAlbum && i == getItemCount() - 1) ? false : true;
        }

        @Override
        public void applyReorder(ArrayList arrayList) {
            ArrayList arrayList2 = new ArrayList();
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                Integer num = (Integer) obj;
                int iIntValue = num.intValue();
                if (iIntValue != -1 && iIntValue != -2 && iIntValue != 0) {
                    arrayList2.add(num);
                }
            }
            int itemId = getItemId(ProfileStoriesCollectionTabs.this.tabsView.getCurrentPosition());
            ProfileStoriesCollectionTabs.this.collections.reorderStep(arrayList2);
            if (itemId >= 0) {
                int itemPosition = getItemPosition(itemId);
                ProfileStoriesCollectionTabs.this.tabsView.selectTab(itemPosition, itemPosition, 0.0f);
            }
            AndroidUtilities.cancelRunOnUIThread(ProfileStoriesCollectionTabs.this.sendCollectionsOrder);
            AndroidUtilities.runOnUIThread(ProfileStoriesCollectionTabs.this.sendCollectionsOrder, 1000L);
        }

        public int getItemPosition(int i) {
            if (i == 0) {
                return 0;
            }
            int iIndexOf = ProfileStoriesCollectionTabs.this.collections.indexOf(i);
            if (iIndexOf == -1) {
                return -1;
            }
            return iIndexOf + 1;
        }

        @Override
        public int getItemId(int i) {
            if (i == 0) {
                return 0;
            }
            if (this.canCreateNewAlbum && i == getItemCount() - 1) {
                return -1;
            }
            return ((StoriesController.StoryAlbum) ProfileStoriesCollectionTabs.this.collections.collections.get(i - 1)).album_id;
        }

        @Override
        public int getItemViewType(int i) {
            if (this.canCreateNewAlbum && i == getItemCount() - 1) {
                return -1;
            }
            return i;
        }

        @Override
        public CharSequence getItemTitle(int i) {
            if (i == 0) {
                return LocaleController.getString(R.string.StoriesAlbumNameAllStories);
            }
            if (this.canCreateNewAlbum && i == getItemCount() - 1) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("+ ");
                spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.StoriesAlbumAddAlbum));
                ColoredImageSpan coloredImageSpan = new ColoredImageSpan(R.drawable.poll_add_plus);
                coloredImageSpan.spaceScaleX = 0.8f;
                spannableStringBuilder.setSpan(coloredImageSpan, 0, 1, 33);
                return spannableStringBuilder;
            }
            return ((StoriesController.StoryAlbum) ProfileStoriesCollectionTabs.this.collections.collections.get(i - 1)).title;
        }
    }
}
