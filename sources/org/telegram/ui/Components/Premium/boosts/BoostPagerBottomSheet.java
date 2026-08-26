package org.telegram.ui.Components.Premium.boosts;

import android.app.Activity;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.MotionEvent;
import androidx.core.graphics.ColorUtils;
import com.google.zxing.BinaryBitmap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.ViewPagerFixed;
import org.telegram.ui.Gifts.SendGiftSheet;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PollItemMenu;
import org.telegram.ui.Stories.DarkThemeResourceProvider;

public final class BoostPagerBottomSheet extends BottomSheet {
    public static BoostPagerBottomSheet instance;
    public boolean isLandscapeOrientation;
    public final SelectorBottomSheet rightSheet;
    public final AnonymousClass1 viewPager;

    public final class AnonymousClass4 {
        public final BoostViaGiftsBottomSheet val$leftSheet;
        public final Theme.ResourcesProvider val$resourcesProvider;

        public AnonymousClass4(BoostViaGiftsBottomSheet boostViaGiftsBottomSheet, Theme.ResourcesProvider resourcesProvider) {
            this.val$leftSheet = boostViaGiftsBottomSheet;
            this.val$resourcesProvider = resourcesProvider;
        }
    }

    public BoostPagerBottomSheet(Activity activity, final BoostViaGiftsBottomSheet boostViaGiftsBottomSheet, final SelectorBottomSheet selectorBottomSheet, final Theme.ResourcesProvider resourcesProvider, boolean z) {
        super(activity, resourcesProvider, true, false);
        this.rightSheet = selectorBottomSheet;
        setApplyBottomPadding(false);
        setApplyTopPadding(false);
        this.useBackgroundTopPadding = false;
        setBackgroundColor(0);
        fixNavigationBar();
        AndroidUtilities.setLightStatusBar(this, ColorUtils.calculateLuminance(Theme.getColor(Theme.key_dialogBackground, this.resourcesProvider)) > 0.699999988079071d);
        this.isLandscapeOrientation = getContext().getResources().getConfiguration().orientation == 2;
        ?? r3 = new ViewPagerFixed(getContext()) {
            public boolean isKeyboardVisible;
            public boolean isScrolling;
            public final Path path = new Path();
            public final Paint backgroundPaint = new Paint(1);
            public final boolean isTablet = AndroidUtilities.isTablet();

            @Override
            public final boolean canScroll(MotionEvent motionEvent) {
                return getCurrentPosition() == 1;
            }

            @Override
            public final void dispatchDraw(Canvas canvas) {
                int iDp;
                float f;
                Paint paint = this.backgroundPaint;
                paint.setColor(Theme.getColor(Theme.key_dialogBackground, resourcesProvider));
                boolean z2 = this.isScrolling;
                BoostPagerBottomSheet boostPagerBottomSheet = BoostPagerBottomSheet.this;
                if (!z2) {
                    if (this.isTablet || boostPagerBottomSheet.isLandscapeOrientation) {
                        canvas.clipRect(0, 0, getMeasuredWidth(), getMeasuredHeight());
                    }
                    super.dispatchDraw(canvas);
                    return;
                }
                int i = -AndroidUtilities.dp(16.0f);
                BoostViaGiftsBottomSheet boostViaGiftsBottomSheet2 = boostViaGiftsBottomSheet;
                int i2 = boostViaGiftsBottomSheet2.top;
                if (boostViaGiftsBottomSheet2.actionBar.getVisibility() == 0) {
                    iDp = AndroidUtilities.dp(16.0f) + AndroidUtilities.statusBarHeight;
                } else {
                    iDp = 0;
                }
                int iDp2 = AndroidUtilities.dp(10.0f) + Math.max(i, i2 - iDp);
                SelectorBottomSheet selectorBottomSheet2 = selectorBottomSheet;
                int iMax = Math.max(0, selectorBottomSheet2.top - (selectorBottomSheet2.statusBarT.value == 1.0f ? AndroidUtilities.statusBarHeight : 0));
                int iAbs = Math.abs(iDp2 - iMax);
                int currentPosition = boostPagerBottomSheet.viewPager.getCurrentPosition();
                AnonymousClass1 anonymousClass1 = boostPagerBottomSheet.viewPager;
                if (currentPosition == 0) {
                    float positionAnimated = anonymousClass1.getPositionAnimated() * iAbs;
                    f = iDp2 < iMax ? iDp2 + positionAnimated : iDp2 - positionAnimated;
                } else {
                    float positionAnimated2 = (1.0f - anonymousClass1.getPositionAnimated()) * iAbs;
                    f = iMax < iDp2 ? iMax + positionAnimated2 : iMax - positionAnimated2;
                }
                int i3 = (int) f;
                float fDp = AndroidUtilities.dp(14.0f);
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(0.0f, i3, getWidth(), AndroidUtilities.dp(8.0f) + getHeight());
                canvas.drawRoundRect(rectF, fDp, fDp, paint);
                canvas.save();
                Path path = this.path;
                path.rewind();
                path.addRoundRect(rectF, fDp, fDp, Path.Direction.CW);
                canvas.clipPath(path);
                super.dispatchDraw(canvas);
                canvas.restore();
            }

            @Override
            public final float getAvailableTranslationX() {
                return (this.isTablet || BoostPagerBottomSheet.this.isLandscapeOrientation) ? getMeasuredWidth() : super.getAvailableTranslationX();
            }

            @Override
            public final void onLayout(boolean z2, int i, int i2, int i3, int i4) {
                super.onLayout(z2, i, i2, i3, i4);
                boolean z3 = this.isKeyboardVisible;
                BoostPagerBottomSheet boostPagerBottomSheet = BoostPagerBottomSheet.this;
                if (z3 != boostPagerBottomSheet.isKeyboardVisible()) {
                    boolean zIsKeyboardVisible = boostPagerBottomSheet.isKeyboardVisible();
                    this.isKeyboardVisible = zIsKeyboardVisible;
                    if (zIsKeyboardVisible) {
                        selectorBottomSheet.scrollToTop(true);
                    }
                }
            }

            @Override
            public final void onScrollEnd() {
                this.isScrolling = false;
                invalidate();
            }

            @Override
            public final void onTabAnimationUpdate(boolean z2) {
                BoostPagerBottomSheet boostPagerBottomSheet = BoostPagerBottomSheet.this;
                float positionAnimated = boostPagerBottomSheet.viewPager.getPositionAnimated();
                if (positionAnimated <= 0.0f || positionAnimated >= 1.0f) {
                    this.isScrolling = false;
                } else if (!this.isScrolling) {
                    this.isScrolling = true;
                    if (boostPagerBottomSheet.isKeyboardVisible()) {
                        AndroidUtilities.hideKeyboard(boostPagerBottomSheet.rightSheet.getContainerView());
                    }
                }
                boostPagerBottomSheet.viewPager.invalidate();
            }
        };
        this.viewPager = r3;
        r3.setOverScrollMode(2);
        r3.setClipToPadding(false);
        r3.setAdapter(new PollItemMenu.AnonymousClass4(boostViaGiftsBottomSheet, selectorBottomSheet));
        r3.setPosition(0);
        setCustomView(r3);
        boostViaGiftsBottomSheet.onCloseClick = new BoostPagerBottomSheet$$ExternalSyntheticLambda0(this, 0);
        boostViaGiftsBottomSheet.actionListener = new BinaryBitmap(28, this, selectorBottomSheet);
        selectorBottomSheet.selectedObjectsListener = new AnonymousClass4(boostViaGiftsBottomSheet, resourcesProvider);
        selectorBottomSheet.onCloseClick = new BoostPagerBottomSheet$$ExternalSyntheticLambda0(this, 1);
        if (!z) {
            MessagesController.getInstance(this.currentAccount).getStoriesController().loadSendAs();
        }
        BottomSheet.ContainerView containerView = this.container;
        LaunchActivity.AnonymousClass7 anonymousClass7 = new LaunchActivity.AnonymousClass7(5);
        if (containerView != null) {
            containerView.setTag(R.id.bulletin_delegate_tag, anonymousClass7);
        }
    }

    public static void show(BaseFragment baseFragment, Theme.ResourcesProvider resourcesProvider, long j, TL_stories.PrepaidGiveaway prepaidGiveaway) {
        if (instance != null) {
            return;
        }
        boolean z = resourcesProvider instanceof DarkThemeResourceProvider;
        BaseFragment anonymousClass8 = z ? new SendGiftSheet.AnonymousClass8(baseFragment) : baseFragment;
        BoostPagerBottomSheet boostPagerBottomSheet = new BoostPagerBottomSheet(baseFragment.getParentActivity(), new BoostViaGiftsBottomSheet(j, prepaidGiveaway, anonymousClass8), new SelectorBottomSheet(anonymousClass8, j), anonymousClass8.getResourceProvider(), z);
        boostPagerBottomSheet.show();
        instance = boostPagerBottomSheet;
    }

    @Override
    public final boolean canDismissWithSwipe() {
        return false;
    }

    @Override
    public final void dismissInternal() {
        super.dismissInternal();
        instance = null;
    }

    @Override
    public final void lambda$openCrafting$8() {
        AnonymousClass1 anonymousClass1 = this.viewPager;
        if (anonymousClass1.getCurrentPosition() <= 0) {
            super.lambda$openCrafting$8();
            return;
        }
        SelectorBottomSheet selectorBottomSheet = this.rightSheet;
        if (selectorBottomSheet.hasChanges()) {
            return;
        }
        if (isKeyboardVisible()) {
            AndroidUtilities.hideKeyboard(selectorBottomSheet.getContainerView());
        }
        anonymousClass1.scrollToPosition$1(0);
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        this.rightSheet.onConfigurationChanged(configuration);
        this.isLandscapeOrientation = getContext().getResources().getConfiguration().orientation == 2;
        super.onConfigurationChanged(configuration);
    }
}
