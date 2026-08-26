package org.telegram.ui.Components.Premium;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.Scroller;
import android.widget.TextView;
import androidx.core.graphics.ColorUtils;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import com.google.android.gms.internal.mlkit_vision_common.zzlb;
import java.lang.reflect.Field;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SvgHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.Components.BottomPagesView;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.LinkSpanDrawable;
import org.telegram.ui.Components.PasscodeView$9$$ExternalSyntheticLambda0;
import org.telegram.ui.IntroActivity;
import org.telegram.ui.LoginActivity;
import org.telegram.ui.PassportActivity$$ExternalSyntheticLambda55;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.Stars.StarGiftSheet;
import org.telegram.ui.ThemePreviewActivity;

public final class PremiumFeatureBottomSheet extends BottomSheet implements NotificationCenter.NotificationCenterDelegate {
    public AnonymousClass7 actionBar;
    public final BaseFragment baseFragment;
    public final FrameLayout closeLayout;
    public final IntroActivity.AnonymousClass1 content;
    public int contentHeight;
    public boolean enterAnimationIsRunning;
    public boolean forceAbout;
    public boolean fullscreenNext;
    public int gradientAlpha;
    public final boolean onlySelectedType;
    public final PremiumButtonView premiumButtonView;
    public final ArrayList premiumFeatures;
    public float progress;
    public float progressToFullscreenView;
    public float progressToGradient;
    public int selectedPosition;
    public final PremiumPreviewFragment.SubscriptionTier selectedTier;
    public final int startType;
    public final SvgHelper.SvgDrawable svgIcon;
    public int toPosition;
    public int topCurrentOffset;
    public int topGlobalOffset;
    public final AnonymousClass3 viewPager;

    public final class AnonymousClass11 extends PremiumStickersPreviewRecycler {
        @Override
        public final void setOffset(float f) {
            setAutoPlayEnabled(f == 0.0f);
            super.setOffset(f);
        }
    }

    public final class AnonymousClass3 extends ViewPager {
        public long lastTapTime;
        public final AnonymousClass1 scroller;
        public boolean smoothScroll;

        public AnonymousClass3(Context context) {
            super(context);
            try {
                Field declaredField = ViewPager.class.getDeclaredField("mScroller");
                declaredField.setAccessible(true);
                ?? r3 = new Scroller(getContext()) {
                    @Override
                    public final void startScroll(int i, int i2, int i3, int i4, int i5) {
                        super.startScroll(i, i2, i3, i4, (AnonymousClass3.this.smoothScroll ? 3 : 1) * i5);
                    }
                };
                this.scroller = r3;
                declaredField.set(this, r3);
            } catch (Exception e) {
                FileLog.e(e);
            }
        }

        @Override
        public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            try {
                processTap(motionEvent);
                return super.onInterceptTouchEvent(motionEvent);
            } catch (Exception unused) {
                return false;
            }
        }

        @Override
        public final void onMeasure(int i, int i2) {
            int iDp = AndroidUtilities.dp(100.0f);
            if (getChildCount() > 0) {
                getChildAt(0).measure(i, View.MeasureSpec.makeMeasureSpec(0, 0));
                iDp = getChildAt(0).getMeasuredHeight();
            }
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(iDp + PremiumFeatureBottomSheet.this.topGlobalOffset, 1073741824));
        }

        @Override
        public final boolean onTouchEvent(MotionEvent motionEvent) {
            if (PremiumFeatureBottomSheet.this.enterAnimationIsRunning) {
                return false;
            }
            return super.onTouchEvent(motionEvent) || processTap(motionEvent);
        }

        public final boolean processTap(MotionEvent motionEvent) {
            AnonymousClass1 anonymousClass1;
            if (motionEvent.getAction() == 0) {
                this.lastTapTime = System.currentTimeMillis();
                return true;
            }
            if (motionEvent.getAction() == 1) {
                if (System.currentTimeMillis() - this.lastTapTime <= ViewConfiguration.getTapTimeout() && (anonymousClass1 = this.scroller) != null && anonymousClass1.isFinished()) {
                    this.smoothScroll = true;
                    float x = motionEvent.getX();
                    float width = getWidth() * 0.45f;
                    PremiumFeatureBottomSheet premiumFeatureBottomSheet = PremiumFeatureBottomSheet.this;
                    if (x <= width) {
                        int i = premiumFeatureBottomSheet.selectedPosition - 1;
                        if (i >= 0) {
                            setCurrentItem(i, true);
                        }
                    } else if (premiumFeatureBottomSheet.selectedPosition + 1 < premiumFeatureBottomSheet.premiumFeatures.size()) {
                        setCurrentItem(premiumFeatureBottomSheet.selectedPosition + 1, true);
                    }
                    this.smoothScroll = false;
                }
            } else if (motionEvent.getAction() == 3) {
                this.lastTapTime = -1L;
            }
            return false;
        }
    }

    public final class AnonymousClass5 implements ViewPager.OnPageChangeListener {
        public final BottomPagesView val$bottomPages;

        public AnonymousClass5(BottomPagesView bottomPagesView) {
            this.val$bottomPages = bottomPagesView;
        }

        public final void checkPage() {
            PremiumFeatureBottomSheet premiumFeatureBottomSheet;
            int i;
            int i2;
            int i3 = 0;
            while (true) {
                premiumFeatureBottomSheet = PremiumFeatureBottomSheet.this;
                float measuredWidth = 0.0f;
                if (i3 >= premiumFeatureBottomSheet.viewPager.getChildCount()) {
                    break;
                }
                ViewPage viewPage = (ViewPage) premiumFeatureBottomSheet.viewPager.getChildAt(i3);
                if (!premiumFeatureBottomSheet.enterAnimationIsRunning || !(viewPage.topView instanceof PremiumAppIconsPreviewView)) {
                    int i4 = viewPage.position;
                    int i5 = premiumFeatureBottomSheet.selectedPosition;
                    PagerHeaderView pagerHeaderView = viewPage.topHeader;
                    if (i4 == i5) {
                        measuredWidth = (-viewPage.getMeasuredWidth()) * premiumFeatureBottomSheet.progress;
                        pagerHeaderView.setOffset(measuredWidth);
                    } else if (i4 == premiumFeatureBottomSheet.toPosition) {
                        measuredWidth = ((-viewPage.getMeasuredWidth()) * premiumFeatureBottomSheet.progress) + viewPage.getMeasuredWidth();
                        pagerHeaderView.setOffset(measuredWidth);
                    } else {
                        pagerHeaderView.setOffset(viewPage.getMeasuredWidth());
                    }
                }
                if (viewPage.topView instanceof PremiumAppIconsPreviewView) {
                    viewPage.setTranslationX(-measuredWidth);
                    viewPage.title.setTranslationX(measuredWidth);
                    viewPage.description.setTranslationX(measuredWidth);
                }
                i3++;
            }
            int i6 = premiumFeatureBottomSheet.selectedPosition;
            ArrayList arrayList = premiumFeatureBottomSheet.premiumFeatures;
            boolean z = i6 >= 0 && i6 < arrayList.size() && ((i2 = ((PremiumPreviewFragment.PremiumFeatureData) arrayList.get(premiumFeatureBottomSheet.selectedPosition)).type) == 0 || i2 == 14 || i2 == 28);
            int i7 = premiumFeatureBottomSheet.toPosition;
            boolean z2 = i7 >= 0 && i7 < arrayList.size() && ((i = ((PremiumPreviewFragment.PremiumFeatureData) arrayList.get(premiumFeatureBottomSheet.toPosition)).type) == 0 || i == 14 || i == 28);
            if (z && z2) {
                premiumFeatureBottomSheet.progressToGradient = 1.0f;
                float f = premiumFeatureBottomSheet.progress;
                if (f == 0.0f) {
                    f = 1.0f;
                }
                premiumFeatureBottomSheet.progressToFullscreenView = f;
                premiumFeatureBottomSheet.fullscreenNext = true;
            } else if (z) {
                float f2 = 1.0f - premiumFeatureBottomSheet.progress;
                premiumFeatureBottomSheet.progressToFullscreenView = f2;
                premiumFeatureBottomSheet.progressToGradient = f2;
                premiumFeatureBottomSheet.fullscreenNext = true;
            } else if (z2) {
                float f3 = premiumFeatureBottomSheet.progress;
                premiumFeatureBottomSheet.progressToFullscreenView = f3;
                premiumFeatureBottomSheet.progressToGradient = f3;
                premiumFeatureBottomSheet.fullscreenNext = false;
            } else {
                premiumFeatureBottomSheet.progressToFullscreenView = 0.0f;
                premiumFeatureBottomSheet.progressToGradient = 0.0f;
                premiumFeatureBottomSheet.fullscreenNext = true;
            }
            int i8 = (int) ((1.0f - premiumFeatureBottomSheet.progressToFullscreenView) * 255.0f);
            if (i8 != premiumFeatureBottomSheet.gradientAlpha) {
                premiumFeatureBottomSheet.gradientAlpha = i8;
                premiumFeatureBottomSheet.content.invalidate();
                AndroidUtilities.runOnUIThread(new PasscodeView$9$$ExternalSyntheticLambda0(this, 15));
            }
        }

        @Override
        public final void onPageScrollStateChanged(int i) {
        }

        @Override
        public final void onPageScrolled(float f, int i, int i2) {
            BottomPagesView bottomPagesView = this.val$bottomPages;
            bottomPagesView.progress = f;
            bottomPagesView.scrollPosition = i;
            bottomPagesView.invalidate();
            PremiumFeatureBottomSheet premiumFeatureBottomSheet = PremiumFeatureBottomSheet.this;
            premiumFeatureBottomSheet.selectedPosition = i;
            premiumFeatureBottomSheet.toPosition = i2 > 0 ? i + 1 : i - 1;
            premiumFeatureBottomSheet.progress = f;
            checkPage();
        }

        @Override
        public final void onPageSelected(int i) {
            PremiumFeatureBottomSheet premiumFeatureBottomSheet = PremiumFeatureBottomSheet.this;
            if (((PremiumPreviewFragment.PremiumFeatureData) premiumFeatureBottomSheet.premiumFeatures.get(i)).type == 0) {
                premiumFeatureBottomSheet.actionBar.setTitle(LocaleController.getString(R.string.DoubledLimits));
                premiumFeatureBottomSheet.actionBar.requestLayout();
            } else {
                ArrayList arrayList = premiumFeatureBottomSheet.premiumFeatures;
                if (((PremiumPreviewFragment.PremiumFeatureData) arrayList.get(i)).type == 14) {
                    premiumFeatureBottomSheet.actionBar.setTitle(LocaleController.getString(R.string.UpgradedStories));
                    premiumFeatureBottomSheet.actionBar.requestLayout();
                } else if (((PremiumPreviewFragment.PremiumFeatureData) arrayList.get(i)).type == 40) {
                    premiumFeatureBottomSheet.actionBar.setTitle(LocaleController.getString(R.string.FeaturePreviewGifts));
                    premiumFeatureBottomSheet.actionBar.requestLayout();
                } else if (((PremiumPreviewFragment.PremiumFeatureData) arrayList.get(i)).type == 28) {
                    premiumFeatureBottomSheet.actionBar.setTitle(LocaleController.getString(R.string.TelegramBusiness));
                    premiumFeatureBottomSheet.actionBar.requestLayout();
                }
            }
            checkPage();
        }
    }

    public final class ViewPage extends LinearLayout {
        public final LinkSpanDrawable.LinksTextView description;
        public LinearLayout featuresLayout;
        public int position;
        public final TextView title;
        public final PagerHeaderView topHeader;
        public final ViewGroup topView;
        public boolean topViewOnFullHeight;

        public ViewPage(Context context, int i) {
            super(context);
            setOrientation(1);
            ViewGroup viewForPosition = PremiumFeatureBottomSheet.this.getViewForPosition(context, i);
            this.topView = viewForPosition;
            addView(viewForPosition);
            this.topHeader = (PagerHeaderView) viewForPosition;
            TextView textView = new TextView(context);
            this.title = textView;
            textView.setGravity(1);
            int i2 = Theme.key_dialogTextBlack;
            textView.setTextColor(PremiumFeatureBottomSheet.this.getThemedColor(i2));
            textView.setTextSize(1, 20.0f);
            textView.setTypeface(AndroidUtilities.bold());
            addView(textView, LayoutHelper.createFrame(-1, -2.0f, 0, 21.0f, 20.0f, 21.0f, 0.0f));
            LinkSpanDrawable.LinksTextView linksTextView = new LinkSpanDrawable.LinksTextView(context, null);
            this.description = linksTextView;
            linksTextView.setGravity(1);
            linksTextView.setTextSize(1, 15.0f);
            linksTextView.setTextColor(PremiumFeatureBottomSheet.this.getThemedColor(i2));
            if (!PremiumFeatureBottomSheet.this.onlySelectedType) {
                linksTextView.setLines(2);
            }
            addView(linksTextView, LayoutHelper.createLinear(-1, -2, 1, 21, 10, 21, 16));
            setImportantForAccessibility(2);
            setClipChildren(false);
        }

        @Override
        public final boolean drawChild(Canvas canvas, View view, long j) {
            if (view != this.topView) {
                return super.drawChild(canvas, view, j);
            }
            boolean z = view instanceof BaseListPageView;
            if (z) {
                setTranslationY(0.0f);
            } else {
                setTranslationY(PremiumFeatureBottomSheet.this.topGlobalOffset);
            }
            if (z) {
                return super.drawChild(canvas, view, j);
            }
            canvas.save();
            canvas.clipRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
            boolean zDrawChild = super.drawChild(canvas, view, j);
            canvas.restore();
            return zDrawChild;
        }

        @Override
        public final void onMeasure(int i, int i2) {
            TextView textView = this.title;
            textView.setVisibility(0);
            ViewGroup viewGroup = this.topView;
            boolean z = viewGroup instanceof BaseListPageView;
            PremiumFeatureBottomSheet premiumFeatureBottomSheet = PremiumFeatureBottomSheet.this;
            if (z) {
                ((BaseListPageView) viewGroup).setTopOffset(premiumFeatureBottomSheet.topGlobalOffset);
            }
            viewGroup.getLayoutParams().height = premiumFeatureBottomSheet.contentHeight;
            LinkSpanDrawable.LinksTextView linksTextView = this.description;
            linksTextView.setVisibility(0);
            ((ViewGroup.MarginLayoutParams) viewGroup.getLayoutParams()).bottomMargin = 0;
            super.onMeasure(i, i2);
            if (this.topViewOnFullHeight) {
                viewGroup.getLayoutParams().height = getMeasuredHeight() - AndroidUtilities.dp(16.0f);
                ((ViewGroup.MarginLayoutParams) viewGroup.getLayoutParams()).bottomMargin = AndroidUtilities.dp(16.0f);
                textView.setVisibility(8);
                linksTextView.setVisibility(8);
                super.onMeasure(i, i2);
            }
        }
    }

    public PremiumFeatureBottomSheet(Context context, int i, Theme.ResourcesProvider resourcesProvider) {
        this(null, context, UserConfig.selectedAccount, false, i, true, null, resourcesProvider);
    }

    @Override
    public final boolean canDismissWithSwipe() {
        int i = 0;
        while (true) {
            AnonymousClass3 anonymousClass3 = this.viewPager;
            if (i >= anonymousClass3.getChildCount()) {
                return true;
            }
            ViewPage viewPage = (ViewPage) anonymousClass3.getChildAt(i);
            if (viewPage.position == this.selectedPosition) {
                ViewGroup viewGroup = viewPage.topView;
                if (viewGroup instanceof BaseListPageView) {
                    return !((BaseListPageView) viewGroup).recyclerListView.canScrollVertically(-1);
                }
            }
            i++;
        }
    }

    public final void checkTopOffset() {
        AnonymousClass3 anonymousClass3;
        View viewFindViewByPosition;
        View viewFindViewByPosition2;
        int top = -1;
        int top2 = -1;
        int i = 0;
        while (true) {
            anonymousClass3 = this.viewPager;
            if (i >= anonymousClass3.getChildCount()) {
                break;
            }
            ViewPage viewPage = (ViewPage) anonymousClass3.getChildAt(i);
            int i2 = viewPage.position;
            int i3 = this.selectedPosition;
            ViewGroup viewGroup = viewPage.topView;
            if (i2 == i3 && (viewGroup instanceof BaseListPageView) && ((viewFindViewByPosition2 = ((BaseListPageView) viewGroup).layoutManager.findViewByPosition(0)) == null || (top = viewFindViewByPosition2.getTop()) < 0)) {
                top = 0;
            }
            if (viewPage.position == this.toPosition && (viewGroup instanceof BaseListPageView) && ((viewFindViewByPosition = ((BaseListPageView) viewGroup).layoutManager.findViewByPosition(0)) == null || (top2 = viewFindViewByPosition.getTop()) < 0)) {
                top2 = 0;
            }
            i++;
        }
        int iMin = this.topGlobalOffset;
        if (top >= 0) {
            float f = 1.0f - this.progress;
            iMin = Math.min(iMin, (int) DiffUtil.m(1.0f, f, iMin, top * f));
        }
        if (top2 >= 0) {
            float f2 = this.progress;
            iMin = Math.min(iMin, (int) DiffUtil.m(1.0f, f2, this.topGlobalOffset, top2 * f2));
        }
        FrameLayout frameLayout = this.closeLayout;
        frameLayout.setAlpha(1.0f - this.progressToGradient);
        if (this.progressToFullscreenView == 1.0f) {
            frameLayout.setVisibility(4);
        } else {
            frameLayout.setVisibility(0);
        }
        boolean z = this.fullscreenNext;
        IntroActivity.AnonymousClass1 anonymousClass1 = this.content;
        anonymousClass1.setTranslationX((z ? anonymousClass1.getMeasuredWidth() : -anonymousClass1.getMeasuredWidth()) * this.progressToGradient);
        if (iMin != this.topCurrentOffset) {
            this.topCurrentOffset = iMin;
            for (int i4 = 0; i4 < anonymousClass3.getChildCount(); i4++) {
                if (!((ViewPage) anonymousClass3.getChildAt(i4)).topViewOnFullHeight) {
                    anonymousClass3.getChildAt(i4).setTranslationY(this.topCurrentOffset);
                }
            }
            anonymousClass1.setTranslationY(this.topCurrentOffset);
            frameLayout.setTranslationY(this.topCurrentOffset);
            this.containerView.invalidate();
            AndroidUtilities.updateViewVisibilityAnimated(this.actionBar, this.topCurrentOffset < AndroidUtilities.dp(this.startType == 40 ? 5.0f : 30.0f), 1.0f, true);
        }
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == NotificationCenter.billingProductDetailsUpdated || i == NotificationCenter.premiumPromoUpdated) {
            setButtonText();
            return;
        }
        if (i == NotificationCenter.currentUserPremiumStatusChanged) {
            boolean zIsPremium = UserConfig.getInstance(this.currentAccount).isPremium();
            PremiumButtonView premiumButtonView = this.premiumButtonView;
            if (zIsPremium) {
                premiumButtonView.setOverlayText(LocaleController.getString(R.string.OK), false, true);
            } else {
                premiumButtonView.showOverlay = false;
                premiumButtonView.updateOverlay(true);
            }
        }
    }

    @Override
    public final void lambda$showGiftOfferSheet$15() {
        super.lambda$showGiftOfferSheet$15();
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.billingProductDetailsUpdated);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.premiumPromoUpdated);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 16);
    }

    public final ViewGroup getViewForPosition(Context context, int i) {
        PremiumPreviewFragment.PremiumFeatureData premiumFeatureData = (PremiumPreviewFragment.PremiumFeatureData) this.premiumFeatures.get(i);
        int i2 = premiumFeatureData.type;
        if (i2 == 0) {
            DoubleLimitsPageView doubleLimitsPageView = new DoubleLimitsPageView(context, this.resourcesProvider);
            final int i3 = 0;
            doubleLimitsPageView.recyclerListView.setOnScrollListener(new RecyclerView.OnScrollListener(this) {
                public final PremiumFeatureBottomSheet this$0;

                {
                    this.this$0 = this;
                }

                @Override
                public final void onScrolled(RecyclerView recyclerView, int i4, int i5) {
                    switch (i3) {
                        case 0:
                            PremiumFeatureBottomSheet premiumFeatureBottomSheet = this.this$0;
                            ((BottomSheet) premiumFeatureBottomSheet).containerView.invalidate();
                            premiumFeatureBottomSheet.checkTopOffset();
                            break;
                        default:
                            PremiumFeatureBottomSheet premiumFeatureBottomSheet2 = this.this$0;
                            ((BottomSheet) premiumFeatureBottomSheet2).containerView.invalidate();
                            premiumFeatureBottomSheet2.checkTopOffset();
                            break;
                    }
                }
            });
            return doubleLimitsPageView;
        }
        if (i2 == 14 || i2 == 28) {
            FeaturesPageView featuresPageView = new FeaturesPageView(context, i2 == 28 ? 1 : 0, this.resourcesProvider);
            final int i4 = 1;
            featuresPageView.recyclerListView.setOnScrollListener(new RecyclerView.OnScrollListener(this) {
                public final PremiumFeatureBottomSheet this$0;

                {
                    this.this$0 = this;
                }

                @Override
                public final void onScrolled(RecyclerView recyclerView, int i5, int i6) {
                    switch (i4) {
                        case 0:
                            PremiumFeatureBottomSheet premiumFeatureBottomSheet = this.this$0;
                            ((BottomSheet) premiumFeatureBottomSheet).containerView.invalidate();
                            premiumFeatureBottomSheet.checkTopOffset();
                            break;
                        default:
                            PremiumFeatureBottomSheet premiumFeatureBottomSheet2 = this.this$0;
                            ((BottomSheet) premiumFeatureBottomSheet2).containerView.invalidate();
                            premiumFeatureBottomSheet2.checkTopOffset();
                            break;
                    }
                }
            });
            return featuresPageView;
        }
        if (i2 == 5) {
            return new AnonymousClass11(context, this.currentAccount);
        }
        if (i2 == 10) {
            return new PremiumAppIconsPreviewView(context, this.resourcesProvider);
        }
        return new VideoScreenPreview(context, this.svgIcon, this.currentAccount, premiumFeatureData.type, this.resourcesProvider);
    }

    @Override
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.billingProductDetailsUpdated);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.premiumPromoUpdated);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
        ?? r11 = new ActionBar(getContext()) {
            @Override
            public final void setAlpha(float f) {
                if (getAlpha() != f) {
                    super.setAlpha(f);
                    ((BottomSheet) PremiumFeatureBottomSheet.this).containerView.invalidate();
                }
            }

            @Override
            public final void setTag(Object obj) {
                super.setTag(obj);
                PremiumFeatureBottomSheet premiumFeatureBottomSheet = PremiumFeatureBottomSheet.this;
                AnonymousClass7 anonymousClass7 = premiumFeatureBottomSheet.actionBar;
                if (anonymousClass7 != null && anonymousClass7.getTag() != null) {
                    AndroidUtilities.setLightStatusBar(premiumFeatureBottomSheet, ColorUtils.calculateLuminance(premiumFeatureBottomSheet.getThemedColor(Theme.key_dialogBackground)) > 0.699999988079071d);
                    return;
                }
                BaseFragment baseFragment = premiumFeatureBottomSheet.baseFragment;
                if (baseFragment != null) {
                    AndroidUtilities.setLightStatusBar(premiumFeatureBottomSheet, baseFragment.isLightStatusBar());
                }
            }
        };
        this.actionBar = r11;
        r11.setBackgroundColor(getThemedColor(Theme.key_dialogBackground));
        setTitleColor(getThemedColor(Theme.key_windowBackgroundWhiteBlackText));
        setItemsBackgroundColor(getThemedColor(Theme.key_actionBarActionModeDefaultSelector), false);
        AnonymousClass7 anonymousClass7 = this.actionBar;
        int i = Theme.key_actionBarActionModeDefaultIcon;
        anonymousClass7.setItemsColor(getThemedColor(i), false);
        setItemsColor(getThemedColor(i), true);
        setCastShadows(true);
        setExtraHeight(AndroidUtilities.dp(2.0f));
        setBackButtonImage(R.drawable.ic_ab_back);
        setActionBarMenuOnItemClick(new LoginActivity.AnonymousClass1(this, 4));
        this.containerView.addView(this.actionBar, LayoutHelper.createFrame(-1, -2.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
        ((FrameLayout.LayoutParams) getLayoutParams()).topMargin = (-this.backgroundPaddingTop) - AndroidUtilities.dp(2.0f);
        AndroidUtilities.updateViewVisibilityAnimated(this.actionBar, false, 1.0f, false);
        ArrayList arrayList = this.premiumFeatures;
        if (((PremiumPreviewFragment.PremiumFeatureData) arrayList.get(this.selectedPosition)).type == 14) {
            setTitle(LocaleController.getString(R.string.UpgradedStories));
            requestLayout();
        } else if (((PremiumPreviewFragment.PremiumFeatureData) arrayList.get(this.selectedPosition)).type == 28) {
            setTitle(LocaleController.getString(R.string.TelegramBusiness));
            requestLayout();
        } else if (((PremiumPreviewFragment.PremiumFeatureData) arrayList.get(this.selectedPosition)).type == 40) {
            setTitle(LocaleController.getString(R.string.FeaturePreviewGifts));
            requestLayout();
        } else {
            setTitle(LocaleController.getString(R.string.DoubledLimits));
            requestLayout();
        }
    }

    @Override
    public final boolean onCustomOpenAnimation() {
        boolean z = false;
        AnonymousClass3 anonymousClass3 = this.viewPager;
        if (anonymousClass3.getChildCount() > 0) {
            ViewPage viewPage = (ViewPage) anonymousClass3.getChildAt(0);
            ViewGroup viewGroup = viewPage.topView;
            if (viewGroup instanceof PremiumAppIconsPreviewView) {
                PremiumAppIconsPreviewView premiumAppIconsPreviewView = (PremiumAppIconsPreviewView) viewGroup;
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(viewPage.getMeasuredWidth(), 0.0f);
                premiumAppIconsPreviewView.setOffset(viewPage.getMeasuredWidth());
                this.enterAnimationIsRunning = true;
                valueAnimatorOfFloat.addUpdateListener(new ChatActivity.AnonymousClass133(premiumAppIconsPreviewView, 9));
                valueAnimatorOfFloat.addListener(new ChatActivity.AnonymousClass74(this, premiumAppIconsPreviewView, z, 23));
                valueAnimatorOfFloat.setDuration(500L);
                valueAnimatorOfFloat.setStartDelay(100L);
                valueAnimatorOfFloat.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
                valueAnimatorOfFloat.start();
            }
        }
        return super.onCustomOpenAnimation();
    }

    public final void setButtonText() {
        boolean z = this.forceAbout;
        PremiumButtonView premiumButtonView = this.premiumButtonView;
        if (z) {
            premiumButtonView.buttonTextView.setText(LocaleController.getString(R.string.AboutTelegramPremium));
            return;
        }
        if (!this.onlySelectedType) {
            premiumButtonView.buttonTextView.setText(PremiumPreviewFragment.getPremiumButtonText(this.currentAccount, this.selectedTier));
            return;
        }
        int i = this.startType;
        if (i == 4) {
            premiumButtonView.buttonTextView.setText(LocaleController.getString(R.string.UnlockPremiumReactions));
            premiumButtonView.setIcon(R.raw.unlock_icon);
        } else if (i != 10) {
            premiumButtonView.buttonTextView.setText(LocaleController.getString(R.string.AboutTelegramPremium));
        } else {
            premiumButtonView.buttonTextView.setText(LocaleController.getString(R.string.UnlockPremiumIcons));
            premiumButtonView.setIcon(R.raw.unlock_icon);
        }
    }

    public final void setForceAbout() {
        this.forceAbout = true;
        PremiumButtonView premiumButtonView = this.premiumButtonView;
        premiumButtonView.showOverlay = false;
        premiumButtonView.updateOverlay(true);
        setButtonText();
    }

    @Override
    public final void show() {
        super.show();
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 16);
    }

    public PremiumFeatureBottomSheet(BaseFragment baseFragment, int i, boolean z) {
        this(baseFragment, baseFragment.getContext(), baseFragment.getCurrentAccount(), false, i, z, null);
    }

    public PremiumFeatureBottomSheet(BaseFragment baseFragment, Context context, int i, boolean z, int i2, boolean z2, PremiumPreviewFragment.SubscriptionTier subscriptionTier) {
        Theme.ResourcesProvider resourceProvider;
        if (baseFragment == null) {
            resourceProvider = null;
        } else if (baseFragment.getLastStoryViewer() != null && !baseFragment.getLastStoryViewer().isClosed) {
            resourceProvider = baseFragment.getLastStoryViewer().resourcesProvider;
        } else {
            resourceProvider = baseFragment.getResourceProvider();
        }
        this(baseFragment, context, i, z, i2, z2, subscriptionTier, resourceProvider);
    }

    public PremiumFeatureBottomSheet(BaseFragment baseFragment, Context context, int i, boolean z, int i2, boolean z2, PremiumPreviewFragment.SubscriptionTier subscriptionTier, Theme.ResourcesProvider resourcesProvider) {
        super(context, resourcesProvider, false, false);
        ArrayList arrayList = new ArrayList();
        this.premiumFeatures = arrayList;
        this.gradientAlpha = 255;
        this.baseFragment = baseFragment;
        this.selectedTier = subscriptionTier;
        fixNavigationBar(getThemedColor(Theme.key_dialogBackground));
        this.startType = i2;
        this.onlySelectedType = z2;
        this.svgIcon = SvgHelper.getDrawable(AndroidUtilities.readRes(R.raw.star_loader));
        ChatActivity.AnonymousClass60 anonymousClass60 = new ChatActivity.AnonymousClass60(this, getContext(), 19);
        if (!z && i2 != 35) {
            PremiumPreviewFragment.fillPremiumFeaturesList(i, arrayList);
        } else {
            PremiumPreviewFragment.fillBusinessFeaturesList(i, arrayList, false);
            PremiumPreviewFragment.fillBusinessFeaturesList(i, arrayList, true);
        }
        if (i2 == 40) {
            arrayList.clear();
            arrayList.add(new PremiumPreviewFragment.PremiumFeatureData(40, R.drawable.gift, LocaleController.getString(R.string.FeaturePreviewGifts), LocaleController.getString(R.string.FeaturePreviewGiftsDescription)));
        }
        int i3 = 0;
        while (true) {
            if (i3 >= this.premiumFeatures.size()) {
                i3 = 0;
                break;
            } else if (((PremiumPreviewFragment.PremiumFeatureData) this.premiumFeatures.get(i3)).type == i2) {
                break;
            } else {
                i3++;
            }
        }
        if (z2) {
            PremiumPreviewFragment.PremiumFeatureData premiumFeatureData = (PremiumPreviewFragment.PremiumFeatureData) this.premiumFeatures.get(i3);
            this.premiumFeatures.clear();
            this.premiumFeatures.add(premiumFeatureData);
            i3 = 0;
        }
        PremiumPreviewFragment.PremiumFeatureData premiumFeatureData2 = (PremiumPreviewFragment.PremiumFeatureData) this.premiumFeatures.get(i3);
        setApplyTopPadding(false);
        setApplyBottomPadding(false);
        this.useBackgroundTopPadding = false;
        PremiumGradient.PremiumGradientTools premiumGradientTools = new PremiumGradient.PremiumGradientTools(Theme.key_premiumGradientBottomSheet1, Theme.key_premiumGradientBottomSheet2, Theme.key_premiumGradientBottomSheet3, -1, null);
        premiumGradientTools.y1 = 1.1f;
        premiumGradientTools.x2 = 1.5f;
        premiumGradientTools.y2 = -0.2f;
        premiumGradientTools.exactly = true;
        IntroActivity.AnonymousClass1 anonymousClass1 = new IntroActivity.AnonymousClass1(this, getContext(), premiumGradientTools, 12);
        this.content = anonymousClass1;
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.closeLayout = frameLayout;
        frameLayout.setContentDescription(LocaleController.getString(R.string.Close));
        ImageView imageView = new ImageView(getContext());
        imageView.setImageResource(R.drawable.msg_close);
        int iDp = AndroidUtilities.dp(12.0f);
        int alphaComponent = ColorUtils.setAlphaComponent(-1, 40);
        int alphaComponent2 = ColorUtils.setAlphaComponent(-1, 100);
        imageView.setBackground(Theme.createSimpleSelectorRoundRectDrawable(iDp, iDp, iDp, iDp, alphaComponent, alphaComponent2, alphaComponent2));
        frameLayout.addView(imageView, LayoutHelper.createFrame(24, 24, 17));
        final int i4 = 0;
        frameLayout.setOnClickListener(new View.OnClickListener(this) {
            public final PremiumFeatureBottomSheet f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i4) {
                    case 0:
                        this.f$0.lambda$new$0$13(view);
                        break;
                    default:
                        this.f$0.lambda$new$2$7(view);
                        break;
                }
            }
        });
        anonymousClass60.addView(anonymousClass1, LayoutHelper.createLinear(-1, -2, 1, 0, 16, 0, 0));
        AnonymousClass3 anonymousClass3 = new AnonymousClass3(getContext());
        this.viewPager = anonymousClass3;
        anonymousClass3.setOverScrollMode(2);
        anonymousClass3.setOffscreenPageLimit(0);
        anonymousClass3.setAdapter(new ThemePreviewActivity.AnonymousClass29(this, 1));
        this.selectedPosition = i3;
        anonymousClass3.setCurrentItem(i3);
        anonymousClass60.addView(anonymousClass3, LayoutHelper.createFrame(-1, 100.0f, 0, 0.0f, 18.0f, 0.0f, 0.0f));
        anonymousClass60.addView(frameLayout, LayoutHelper.createFrame(52, 52.0f, 53, 0.0f, 24.0f, 0.0f, 0.0f));
        BottomPagesView bottomPagesView = new BottomPagesView(getContext(), anonymousClass3, this.premiumFeatures.size());
        anonymousClass3.addOnPageChangeListener(new AnonymousClass5(bottomPagesView));
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.addView(anonymousClass60);
        linearLayout.setOrientation(1);
        int i5 = Theme.key_chats_unreadCounterMuted;
        int i6 = Theme.key_chats_actionBackground;
        bottomPagesView.colorKey = i5;
        bottomPagesView.selectedColorKey = i6;
        if (!z2) {
            linearLayout.addView(bottomPagesView, LayoutHelper.createLinear(this.premiumFeatures.size() * 11, 5, 1, 0, 0, 0, 10));
        }
        PremiumButtonView premiumButtonView = new PremiumButtonView(AndroidUtilities.dp(8.0f), getContext(), resourcesProvider, true);
        this.premiumButtonView = premiumButtonView;
        premiumButtonView.buttonLayout.setOnClickListener(new PassportActivity$$ExternalSyntheticLambda55(this, baseFragment, z2, premiumFeatureData2, 1));
        final int i7 = 1;
        premiumButtonView.overlayTextView.setOnClickListener(new View.OnClickListener(this) {
            public final PremiumFeatureBottomSheet f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i7) {
                    case 0:
                        this.f$0.lambda$new$0$13(view);
                        break;
                    default:
                        this.f$0.lambda$new$2$7(view);
                        break;
                }
            }
        });
        FrameLayout frameLayout2 = new FrameLayout(getContext());
        frameLayout2.addView(premiumButtonView, LayoutHelper.createFrame(-1, 48.0f, 16, 16.0f, 0.0f, 16.0f, 0.0f));
        frameLayout2.setBackgroundColor(getThemedColor(Theme.key_dialogBackground));
        linearLayout.addView(frameLayout2, LayoutHelper.createLinear(-1, 68, 80));
        if (i2 == 40) {
            premiumButtonView.setOverlayText(StarGiftSheet.replaceUnderstood(LocaleController.getString(R.string.Understood)), true, false);
        } else if (UserConfig.getInstance(i).isPremium()) {
            premiumButtonView.setOverlayText(LocaleController.getString(R.string.OK), false, false);
        }
        final ScrollView scrollView = new ScrollView(getContext());
        scrollView.addView(linearLayout);
        setCustomView(scrollView);
        MediaDataController.getInstance(i).preloadPremiumPreviewStickers();
        setButtonText();
        this.customViewGravity = 83;
        final Drawable drawableMutate = getContext().getDrawable(R.drawable.header_shadow).mutate();
        FrameLayout frameLayout3 = new FrameLayout(getContext()) {
            public final Path path = new Path();

            @Override
            public final void dispatchDraw(Canvas canvas) {
                PremiumFeatureBottomSheet premiumFeatureBottomSheet = PremiumFeatureBottomSheet.this;
                ((BottomSheet) premiumFeatureBottomSheet).shadowDrawable.setBounds(0, zzlb.m(((BottomSheet) premiumFeatureBottomSheet).backgroundPaddingTop + premiumFeatureBottomSheet.topCurrentOffset, 2.0f, 1), getMeasuredWidth(), getMeasuredHeight());
                ((BottomSheet) premiumFeatureBottomSheet).shadowDrawable.draw(canvas);
                super.dispatchDraw(canvas);
                AnonymousClass7 anonymousClass7 = premiumFeatureBottomSheet.actionBar;
                if (anonymousClass7 == null || anonymousClass7.getVisibility() != 0 || premiumFeatureBottomSheet.actionBar.getAlpha() == 0.0f) {
                    return;
                }
                int bottom = premiumFeatureBottomSheet.actionBar.getBottom();
                int measuredWidth = getMeasuredWidth();
                int bottom2 = premiumFeatureBottomSheet.actionBar.getBottom();
                Drawable drawable = drawableMutate;
                drawable.setBounds(0, bottom, measuredWidth, drawable.getIntrinsicHeight() + bottom2);
                drawable.setAlpha((int) (premiumFeatureBottomSheet.actionBar.getAlpha() * 255.0f));
                drawable.draw(canvas);
            }

            @Override
            public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
                if (motionEvent.getAction() == 0) {
                    float y = motionEvent.getY();
                    PremiumFeatureBottomSheet premiumFeatureBottomSheet = PremiumFeatureBottomSheet.this;
                    if (y < AndroidUtilities.dp(2.0f) + (premiumFeatureBottomSheet.topCurrentOffset - ((BottomSheet) premiumFeatureBottomSheet).backgroundPaddingTop)) {
                        premiumFeatureBottomSheet.lambda$showGiftOfferSheet$15();
                    }
                }
                return super.dispatchTouchEvent(motionEvent);
            }

            @Override
            public final boolean drawChild(Canvas canvas, View view, long j) {
                if (view != scrollView) {
                    return super.drawChild(canvas, view, j);
                }
                canvas.save();
                Path path = this.path;
                path.rewind();
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(getPaddingLeft(), AndroidUtilities.dp(18.0f) + PremiumFeatureBottomSheet.this.topCurrentOffset, getMeasuredWidth() - getPaddingRight(), getMeasuredHeight());
                path.addRoundRect(rectF, AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f), Path.Direction.CW);
                canvas.clipPath(path);
                super.drawChild(canvas, view, j);
                canvas.restore();
                return true;
            }

            @Override
            public final boolean hasOverlappingRendering() {
                return false;
            }

            @Override
            public final void onMeasure(int i8, int i9) {
                PremiumFeatureBottomSheet premiumFeatureBottomSheet = PremiumFeatureBottomSheet.this;
                premiumFeatureBottomSheet.topGlobalOffset = 0;
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9), Integer.MIN_VALUE);
                ScrollView scrollView2 = scrollView;
                scrollView2.measure(i8, iMakeMeasureSpec);
                premiumFeatureBottomSheet.topGlobalOffset = ((BottomSheet) premiumFeatureBottomSheet).backgroundPaddingTop + (View.MeasureSpec.getSize(i9) - scrollView2.getMeasuredHeight());
                super.onMeasure(i8, i9);
                premiumFeatureBottomSheet.checkTopOffset();
            }

            @Override
            public final void setTranslationY(float f) {
                super.setTranslationY(f);
                PremiumFeatureBottomSheet.this.onContainerTranslationYChanged(f);
            }
        };
        this.containerView = frameLayout3;
        int i8 = this.backgroundPaddingLeft;
        frameLayout3.setPadding(i8, this.backgroundPaddingTop - 1, i8, 0);
    }
}
