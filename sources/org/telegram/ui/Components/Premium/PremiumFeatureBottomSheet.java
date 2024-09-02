package org.telegram.ui.Components.Premium;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
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
import androidx.core.content.ContextCompat;
import androidx.core.graphics.ColorUtils;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
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
import org.telegram.ui.Components.ChatAttachAlert;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.Premium.PremiumGradient;
import org.telegram.ui.Components.RLottieDrawable;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.ThemePreviewActivity;

public class PremiumFeatureBottomSheet extends BottomSheet implements NotificationCenter.NotificationCenterDelegate {
    ActionBar actionBar;
    private final BaseFragment baseFragment;
    private FrameLayout buttonContainer;
    FrameLayout closeLayout;
    boolean containerViewsForward;
    float containerViewsProgress;
    FrameLayout content;
    int contentHeight;
    boolean enterAnimationIsRunning;
    private boolean forceAbout;
    boolean fullscreenNext;
    private int gradientAlpha;
    private final boolean onlySelectedType;
    private PremiumButtonView premiumButtonView;
    ArrayList<PremiumPreviewFragment.PremiumFeatureData> premiumFeatures;
    float progress;
    float progressToFullscreenView;
    float progressToGradient;
    int selectedPosition;
    private PremiumPreviewFragment.SubscriptionTier selectedTier;
    private final int startType;
    SvgHelper.SvgDrawable svgIcon;
    int toPosition;
    int topCurrentOffset;
    int topGlobalOffset;
    ViewPager viewPager;

    public boolean isFullscreenType(int i) {
        return i == 0 || i == 14 || i == 28;
    }

    public PremiumFeatureBottomSheet(BaseFragment baseFragment, int i, boolean z) {
        this(baseFragment, i, z, null);
    }

    public PremiumFeatureBottomSheet(BaseFragment baseFragment, int i, boolean z, PremiumPreviewFragment.SubscriptionTier subscriptionTier) {
        this(baseFragment, baseFragment.getContext(), baseFragment.getCurrentAccount(), false, i, z, subscriptionTier);
    }

    public PremiumFeatureBottomSheet(BaseFragment baseFragment, Context context, int i, int i2, boolean z) {
        this(baseFragment, context, i, false, i2, z, null);
    }

    public PremiumFeatureBottomSheet(final BaseFragment baseFragment, Context context, int i, boolean z, int i2, final boolean z2, PremiumPreviewFragment.SubscriptionTier subscriptionTier) {
        super(context, false, getResourceProvider(baseFragment));
        this.premiumFeatures = new ArrayList<>();
        this.gradientAlpha = 255;
        this.baseFragment = baseFragment;
        if (baseFragment == null) {
            throw new RuntimeException("fragmnet can't be null");
        }
        this.selectedTier = subscriptionTier;
        fixNavigationBar(getThemedColor(Theme.key_dialogBackground));
        this.startType = i2;
        this.onlySelectedType = z2;
        this.svgIcon = SvgHelper.getDrawable(RLottieDrawable.readRes(null, R.raw.star_loader));
        FrameLayout frameLayout = new FrameLayout(getContext()) {
            @Override
            protected void onMeasure(int i3, int i4) {
                if (((BottomSheet) PremiumFeatureBottomSheet.this).isPortrait) {
                    PremiumFeatureBottomSheet.this.contentHeight = View.MeasureSpec.getSize(i3);
                } else {
                    PremiumFeatureBottomSheet.this.contentHeight = (int) (View.MeasureSpec.getSize(i4) * 0.65f);
                }
                super.onMeasure(i3, i4);
            }
        };
        if (z || i2 == 35) {
            PremiumPreviewFragment.fillBusinessFeaturesList(this.premiumFeatures, i, false);
            PremiumPreviewFragment.fillBusinessFeaturesList(this.premiumFeatures, i, true);
        } else {
            PremiumPreviewFragment.fillPremiumFeaturesList(this.premiumFeatures, i, false);
        }
        int i3 = 0;
        while (true) {
            if (i3 >= this.premiumFeatures.size()) {
                i3 = 0;
                break;
            } else if (this.premiumFeatures.get(i3).type == i2) {
                break;
            } else {
                i3++;
            }
        }
        if (z2) {
            PremiumPreviewFragment.PremiumFeatureData premiumFeatureData = this.premiumFeatures.get(i3);
            this.premiumFeatures.clear();
            this.premiumFeatures.add(premiumFeatureData);
            i3 = 0;
        }
        final PremiumPreviewFragment.PremiumFeatureData premiumFeatureData2 = this.premiumFeatures.get(i3);
        setApplyTopPadding(false);
        setApplyBottomPadding(false);
        this.useBackgroundTopPadding = false;
        final PremiumGradient.PremiumGradientTools premiumGradientTools = new PremiumGradient.PremiumGradientTools(Theme.key_premiumGradientBottomSheet1, Theme.key_premiumGradientBottomSheet2, Theme.key_premiumGradientBottomSheet3, -1);
        premiumGradientTools.x1 = 0.0f;
        premiumGradientTools.y1 = 1.1f;
        premiumGradientTools.x2 = 1.5f;
        premiumGradientTools.y2 = -0.2f;
        premiumGradientTools.exactly = true;
        this.content = new FrameLayout(getContext()) {
            @Override
            protected void onMeasure(int i4, int i5) {
                super.onMeasure(i4, View.MeasureSpec.makeMeasureSpec(PremiumFeatureBottomSheet.this.contentHeight + AndroidUtilities.dp(2.0f), 1073741824));
            }

            @Override
            protected void dispatchDraw(Canvas canvas) {
                premiumGradientTools.gradientMatrix(0, 0, getMeasuredWidth(), getMeasuredHeight(), 0.0f, 0.0f);
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(0.0f, AndroidUtilities.dp(2.0f), getMeasuredWidth(), getMeasuredHeight() + AndroidUtilities.dp(18.0f));
                canvas.save();
                canvas.clipRect(0, 0, getMeasuredWidth(), getMeasuredHeight());
                premiumGradientTools.paint.setAlpha(PremiumFeatureBottomSheet.this.gradientAlpha);
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(12.0f) - 1, AndroidUtilities.dp(12.0f) - 1, premiumGradientTools.paint);
                canvas.restore();
                super.dispatchDraw(canvas);
            }
        };
        this.closeLayout = new FrameLayout(getContext());
        ImageView imageView = new ImageView(getContext());
        imageView.setImageResource(R.drawable.msg_close);
        imageView.setBackground(Theme.createSimpleSelectorRoundRectDrawable(AndroidUtilities.dp(12.0f), ColorUtils.setAlphaComponent(-1, 40), ColorUtils.setAlphaComponent(-1, 100)));
        this.closeLayout.addView(imageView, LayoutHelper.createFrame(24, 24, 17));
        this.closeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                PremiumFeatureBottomSheet.this.lambda$new$0(view);
            }
        });
        frameLayout.addView(this.content, LayoutHelper.createLinear(-1, -2, 1, 0, 16, 0, 0));
        ViewPager viewPager = new ViewPager(getContext()) {
            long lastTapTime;
            private Scroller scroller;
            private boolean smoothScroll;

            {
                try {
                    Field declaredField = ViewPager.class.getDeclaredField("mScroller");
                    declaredField.setAccessible(true);
                    Scroller scroller = new Scroller(getContext()) {
                        @Override
                        public void startScroll(int i4, int i5, int i6, int i7, int i8) {
                            super.startScroll(i4, i5, i6, i7, (AnonymousClass3.this.smoothScroll ? 3 : 1) * i8);
                        }
                    };
                    this.scroller = scroller;
                    declaredField.set(this, scroller);
                } catch (Exception e) {
                    FileLog.e(e);
                }
            }

            @Override
            public void onMeasure(int i4, int i5) {
                int dp = AndroidUtilities.dp(100.0f);
                if (getChildCount() > 0) {
                    getChildAt(0).measure(i4, View.MeasureSpec.makeMeasureSpec(0, 0));
                    dp = getChildAt(0).getMeasuredHeight();
                }
                super.onMeasure(i4, View.MeasureSpec.makeMeasureSpec(dp + PremiumFeatureBottomSheet.this.topGlobalOffset, 1073741824));
            }

            private boolean processTap(MotionEvent motionEvent, boolean z3) {
                Scroller scroller;
                if (motionEvent.getAction() == 0) {
                    this.lastTapTime = System.currentTimeMillis();
                    return true;
                }
                if (motionEvent.getAction() == 1) {
                    if (System.currentTimeMillis() - this.lastTapTime <= ViewConfiguration.getTapTimeout() && (scroller = this.scroller) != null && scroller.isFinished()) {
                        this.smoothScroll = true;
                        if (motionEvent.getX() > getWidth() * 0.45f) {
                            PremiumFeatureBottomSheet premiumFeatureBottomSheet = PremiumFeatureBottomSheet.this;
                            if (premiumFeatureBottomSheet.selectedPosition + 1 < premiumFeatureBottomSheet.premiumFeatures.size()) {
                                setCurrentItem(PremiumFeatureBottomSheet.this.selectedPosition + 1, true);
                            }
                        } else {
                            int i4 = PremiumFeatureBottomSheet.this.selectedPosition;
                            if (i4 - 1 >= 0) {
                                setCurrentItem(i4 - 1, true);
                            }
                        }
                        this.smoothScroll = false;
                    }
                } else if (motionEvent.getAction() == 3) {
                    this.lastTapTime = -1L;
                }
                return false;
            }

            @Override
            public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
                try {
                    processTap(motionEvent, true);
                    return super.onInterceptTouchEvent(motionEvent);
                } catch (Exception unused) {
                    return false;
                }
            }

            @Override
            public boolean onTouchEvent(MotionEvent motionEvent) {
                if (PremiumFeatureBottomSheet.this.enterAnimationIsRunning) {
                    return false;
                }
                return super.onTouchEvent(motionEvent) || processTap(motionEvent, false);
            }
        };
        this.viewPager = viewPager;
        viewPager.setOverScrollMode(2);
        this.viewPager.setOffscreenPageLimit(0);
        this.viewPager.setAdapter(new PagerAdapter() {
            @Override
            public boolean isViewFromObject(View view, Object obj) {
                return view == obj;
            }

            @Override
            public int getCount() {
                return PremiumFeatureBottomSheet.this.premiumFeatures.size();
            }

            @Override
            public Object instantiateItem(ViewGroup viewGroup, int i4) {
                PremiumFeatureBottomSheet premiumFeatureBottomSheet = PremiumFeatureBottomSheet.this;
                ViewPage viewPage = new ViewPage(premiumFeatureBottomSheet.getContext(), i4);
                viewGroup.addView(viewPage);
                viewPage.position = i4;
                viewPage.setFeatureDate(PremiumFeatureBottomSheet.this.premiumFeatures.get(i4));
                return viewPage;
            }

            @Override
            public void destroyItem(ViewGroup viewGroup, int i4, Object obj) {
                viewGroup.removeView((View) obj);
            }
        });
        ViewPager viewPager2 = this.viewPager;
        this.selectedPosition = i3;
        viewPager2.setCurrentItem(i3);
        frameLayout.addView(this.viewPager, LayoutHelper.createFrame(-1, 100.0f, 0, 0.0f, 18.0f, 0.0f, 0.0f));
        frameLayout.addView(this.closeLayout, LayoutHelper.createFrame(52, 52.0f, 53, 0.0f, 24.0f, 0.0f, 0.0f));
        BottomPagesView bottomPagesView = new BottomPagesView(getContext(), this.viewPager, this.premiumFeatures.size());
        this.viewPager.addOnPageChangeListener(new AnonymousClass5(bottomPagesView));
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.addView(frameLayout);
        linearLayout.setOrientation(1);
        bottomPagesView.setColor(Theme.key_chats_unreadCounterMuted, Theme.key_chats_actionBackground);
        if (!z2) {
            linearLayout.addView(bottomPagesView, LayoutHelper.createLinear(this.premiumFeatures.size() * 11, 5, 1, 0, 0, 0, 10));
        }
        PremiumButtonView premiumButtonView = new PremiumButtonView(getContext(), true, this.resourcesProvider);
        this.premiumButtonView = premiumButtonView;
        premiumButtonView.buttonLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                PremiumFeatureBottomSheet.this.lambda$new$1(baseFragment, z2, premiumFeatureData2, view);
            }
        });
        this.premiumButtonView.overlayTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                PremiumFeatureBottomSheet.this.lambda$new$2(view);
            }
        });
        FrameLayout frameLayout2 = new FrameLayout(getContext());
        this.buttonContainer = frameLayout2;
        frameLayout2.addView(this.premiumButtonView, LayoutHelper.createFrame(-1, 48.0f, 16, 16.0f, 0.0f, 16.0f, 0.0f));
        this.buttonContainer.setBackgroundColor(getThemedColor(Theme.key_dialogBackground));
        linearLayout.addView(this.buttonContainer, LayoutHelper.createLinear(-1, 68, 80));
        if (UserConfig.getInstance(i).isPremium()) {
            this.premiumButtonView.setOverlayText(LocaleController.getString("OK", R.string.OK), false, false);
        }
        final ScrollView scrollView = new ScrollView(getContext());
        scrollView.addView(linearLayout);
        setCustomView(scrollView);
        MediaDataController.getInstance(i).preloadPremiumPreviewStickers();
        setButtonText();
        this.customViewGravity = 83;
        final Drawable mutate = ContextCompat.getDrawable(getContext(), R.drawable.header_shadow).mutate();
        FrameLayout frameLayout3 = new FrameLayout(getContext()) {
            Path path = new Path();

            @Override
            public boolean hasOverlappingRendering() {
                return false;
            }

            @Override
            public void setTranslationY(float f) {
                super.setTranslationY(f);
                PremiumFeatureBottomSheet.this.onContainerTranslationYChanged(f);
            }

            @Override
            protected void onMeasure(int i4, int i5) {
                PremiumFeatureBottomSheet.this.topGlobalOffset = 0;
                scrollView.measure(i4, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i5), Integer.MIN_VALUE));
                PremiumFeatureBottomSheet.this.topGlobalOffset = (View.MeasureSpec.getSize(i5) - scrollView.getMeasuredHeight()) + ((BottomSheet) PremiumFeatureBottomSheet.this).backgroundPaddingTop;
                super.onMeasure(i4, i5);
                PremiumFeatureBottomSheet.this.checkTopOffset();
            }

            @Override
            protected void dispatchDraw(Canvas canvas) {
                Drawable drawable = ((BottomSheet) PremiumFeatureBottomSheet.this).shadowDrawable;
                PremiumFeatureBottomSheet premiumFeatureBottomSheet = PremiumFeatureBottomSheet.this;
                drawable.setBounds(0, ((premiumFeatureBottomSheet.topCurrentOffset + ((BottomSheet) premiumFeatureBottomSheet).backgroundPaddingTop) - AndroidUtilities.dp(2.0f)) + 1, getMeasuredWidth(), getMeasuredHeight());
                ((BottomSheet) PremiumFeatureBottomSheet.this).shadowDrawable.draw(canvas);
                super.dispatchDraw(canvas);
                ActionBar actionBar = PremiumFeatureBottomSheet.this.actionBar;
                if (actionBar == null || actionBar.getVisibility() != 0 || PremiumFeatureBottomSheet.this.actionBar.getAlpha() == 0.0f) {
                    return;
                }
                mutate.setBounds(0, PremiumFeatureBottomSheet.this.actionBar.getBottom(), getMeasuredWidth(), PremiumFeatureBottomSheet.this.actionBar.getBottom() + mutate.getIntrinsicHeight());
                mutate.setAlpha((int) (PremiumFeatureBottomSheet.this.actionBar.getAlpha() * 255.0f));
                mutate.draw(canvas);
            }

            @Override
            protected boolean drawChild(Canvas canvas, View view, long j) {
                if (view == scrollView) {
                    canvas.save();
                    this.path.rewind();
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set(0.0f, PremiumFeatureBottomSheet.this.topCurrentOffset + AndroidUtilities.dp(18.0f), getMeasuredWidth(), getMeasuredHeight());
                    this.path.addRoundRect(rectF, AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f), Path.Direction.CW);
                    canvas.clipPath(this.path);
                    super.drawChild(canvas, view, j);
                    canvas.restore();
                    return true;
                }
                return super.drawChild(canvas, view, j);
            }

            @Override
            public boolean dispatchTouchEvent(MotionEvent motionEvent) {
                if (motionEvent.getAction() == 0) {
                    float y = motionEvent.getY();
                    PremiumFeatureBottomSheet premiumFeatureBottomSheet = PremiumFeatureBottomSheet.this;
                    if (y < (premiumFeatureBottomSheet.topCurrentOffset - ((BottomSheet) premiumFeatureBottomSheet).backgroundPaddingTop) + AndroidUtilities.dp(2.0f)) {
                        PremiumFeatureBottomSheet.this.dismiss();
                    }
                }
                return super.dispatchTouchEvent(motionEvent);
            }
        };
        this.containerView = frameLayout3;
        int i4 = this.backgroundPaddingLeft;
        frameLayout3.setPadding(i4, this.backgroundPaddingTop - 1, i4, 0);
    }

    public void lambda$new$0(View view) {
        dismiss();
    }

    public class AnonymousClass5 implements ViewPager.OnPageChangeListener {
        final BottomPagesView val$bottomPages;

        @Override
        public void onPageScrollStateChanged(int i) {
        }

        AnonymousClass5(BottomPagesView bottomPagesView) {
            this.val$bottomPages = bottomPagesView;
        }

        @Override
        public void onPageScrolled(int i, float f, int i2) {
            this.val$bottomPages.setPageOffset(i, f);
            PremiumFeatureBottomSheet premiumFeatureBottomSheet = PremiumFeatureBottomSheet.this;
            premiumFeatureBottomSheet.selectedPosition = i;
            premiumFeatureBottomSheet.toPosition = i2 > 0 ? i + 1 : i - 1;
            premiumFeatureBottomSheet.progress = f;
            checkPage();
        }

        @Override
        public void onPageSelected(int i) {
            if (PremiumFeatureBottomSheet.this.premiumFeatures.get(i).type == 0) {
                PremiumFeatureBottomSheet.this.actionBar.setTitle(LocaleController.getString("DoubledLimits", R.string.DoubledLimits));
                PremiumFeatureBottomSheet.this.actionBar.requestLayout();
            } else if (PremiumFeatureBottomSheet.this.premiumFeatures.get(i).type == 14) {
                PremiumFeatureBottomSheet.this.actionBar.setTitle(LocaleController.getString("UpgradedStories", R.string.UpgradedStories));
                PremiumFeatureBottomSheet.this.actionBar.requestLayout();
            } else if (PremiumFeatureBottomSheet.this.premiumFeatures.get(i).type == 28) {
                PremiumFeatureBottomSheet.this.actionBar.setTitle(LocaleController.getString(R.string.TelegramBusiness));
                PremiumFeatureBottomSheet.this.actionBar.requestLayout();
            }
            checkPage();
        }

        private void checkPage() {
            throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.Premium.PremiumFeatureBottomSheet.AnonymousClass5.checkPage():void");
        }

        public void lambda$checkPage$0() {
            PremiumFeatureBottomSheet.this.checkTopOffset();
        }
    }

    public void lambda$new$1(BaseFragment baseFragment, boolean z, PremiumPreviewFragment.PremiumFeatureData premiumFeatureData, View view) {
        if (baseFragment instanceof ChatActivity) {
            ChatActivity chatActivity = (ChatActivity) baseFragment;
            chatActivity.closeMenu();
            ChatAttachAlert chatAttachAlert = chatActivity.chatAttachAlert;
            if (chatAttachAlert != null) {
                chatAttachAlert.dismiss(true);
            }
        }
        BaseFragment lastFragment = LaunchActivity.getLastFragment();
        int i = 0;
        while (i < 2) {
            BaseFragment baseFragment2 = i == 0 ? baseFragment : lastFragment;
            if (baseFragment2 != null && baseFragment2.getLastStoryViewer() != null) {
                baseFragment2.getLastStoryViewer().dismissVisibleDialogs();
            }
            if (baseFragment2 != null && baseFragment2.getVisibleDialog() != null) {
                baseFragment2.getVisibleDialog().dismiss();
            }
            i++;
        }
        if ((z || this.forceAbout) && baseFragment != null) {
            PremiumPreviewFragment premiumPreviewFragment = new PremiumPreviewFragment(PremiumPreviewFragment.featureTypeToServerString(premiumFeatureData.type));
            if (baseFragment instanceof ThemePreviewActivity) {
                BaseFragment.BottomSheetParams bottomSheetParams = new BaseFragment.BottomSheetParams();
                bottomSheetParams.transitionFromLeft = true;
                bottomSheetParams.allowNestedScroll = false;
                baseFragment.showAsSheet(premiumPreviewFragment, bottomSheetParams);
            } else {
                baseFragment.presentFragment(premiumPreviewFragment);
            }
        } else {
            PremiumPreviewFragment.buyPremium(baseFragment, this.selectedTier, PremiumPreviewFragment.featureTypeToServerString(premiumFeatureData.type));
        }
        dismiss();
    }

    public void lambda$new$2(View view) {
        dismiss();
    }

    private static Theme.ResourcesProvider getResourceProvider(BaseFragment baseFragment) {
        if (baseFragment == null) {
            return null;
        }
        if (baseFragment.getLastStoryViewer() != null && baseFragment.getLastStoryViewer().isShown()) {
            return baseFragment.getLastStoryViewer().getResourceProvider();
        }
        return baseFragment.getResourceProvider();
    }

    public PremiumFeatureBottomSheet setForceAbout() {
        this.forceAbout = true;
        this.premiumButtonView.clearOverlayText();
        setButtonText();
        return this;
    }

    private void setButtonText() {
        if (this.forceAbout) {
            this.premiumButtonView.buttonTextView.setText(LocaleController.getString(R.string.AboutTelegramPremium));
            return;
        }
        if (this.onlySelectedType) {
            int i = this.startType;
            if (i == 4) {
                this.premiumButtonView.buttonTextView.setText(LocaleController.getString(R.string.UnlockPremiumReactions));
                this.premiumButtonView.setIcon(R.raw.unlock_icon);
                return;
            } else if (i == 10) {
                this.premiumButtonView.buttonTextView.setText(LocaleController.getString(R.string.UnlockPremiumIcons));
                this.premiumButtonView.setIcon(R.raw.unlock_icon);
                return;
            } else {
                this.premiumButtonView.buttonTextView.setText(LocaleController.getString(R.string.AboutTelegramPremium));
                return;
            }
        }
        this.premiumButtonView.buttonTextView.setText(PremiumPreviewFragment.getPremiumButtonText(this.currentAccount, this.selectedTier));
    }

    @Override
    public void show() {
        super.show();
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 16);
    }

    @Override
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.billingProductDetailsUpdated);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.premiumPromoUpdated);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
        ActionBar actionBar = new ActionBar(getContext()) {
            @Override
            public void setAlpha(float f) {
                if (getAlpha() != f) {
                    super.setAlpha(f);
                    ((BottomSheet) PremiumFeatureBottomSheet.this).containerView.invalidate();
                }
            }

            @Override
            public void setTag(Object obj) {
                super.setTag(obj);
                PremiumFeatureBottomSheet.this.updateStatusBar();
            }
        };
        this.actionBar = actionBar;
        actionBar.setBackgroundColor(getThemedColor(Theme.key_dialogBackground));
        this.actionBar.setTitleColor(getThemedColor(Theme.key_windowBackgroundWhiteBlackText));
        this.actionBar.setItemsBackgroundColor(getThemedColor(Theme.key_actionBarActionModeDefaultSelector), false);
        ActionBar actionBar2 = this.actionBar;
        int i = Theme.key_actionBarActionModeDefaultIcon;
        actionBar2.setItemsColor(getThemedColor(i), false);
        this.actionBar.setItemsColor(getThemedColor(i), true);
        this.actionBar.setCastShadows(true);
        this.actionBar.setExtraHeight(AndroidUtilities.dp(2.0f));
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setActionBarMenuOnItemClick(new ActionBar.ActionBarMenuOnItemClick() {
            @Override
            public void onItemClick(int i2) {
                if (i2 == -1) {
                    PremiumFeatureBottomSheet.this.dismiss();
                }
            }
        });
        this.containerView.addView(this.actionBar, LayoutHelper.createFrame(-1, -2.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
        ((FrameLayout.LayoutParams) this.actionBar.getLayoutParams()).topMargin = (-this.backgroundPaddingTop) - AndroidUtilities.dp(2.0f);
        AndroidUtilities.updateViewVisibilityAnimated(this.actionBar, false, 1.0f, false);
        if (this.premiumFeatures.get(this.selectedPosition).type == 14) {
            this.actionBar.setTitle(LocaleController.getString("UpgradedStories", R.string.UpgradedStories));
            this.actionBar.requestLayout();
        } else if (this.premiumFeatures.get(this.selectedPosition).type == 28) {
            this.actionBar.setTitle(LocaleController.getString(R.string.TelegramBusiness));
            this.actionBar.requestLayout();
        } else {
            this.actionBar.setTitle(LocaleController.getString("DoubledLimits", R.string.DoubledLimits));
            this.actionBar.requestLayout();
        }
    }

    @Override
    public void dismiss() {
        super.dismiss();
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.billingProductDetailsUpdated);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.premiumPromoUpdated);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 16);
    }

    @Override
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == NotificationCenter.billingProductDetailsUpdated || i == NotificationCenter.premiumPromoUpdated) {
            setButtonText();
        } else if (i == NotificationCenter.currentUserPremiumStatusChanged) {
            if (UserConfig.getInstance(this.currentAccount).isPremium()) {
                this.premiumButtonView.setOverlayText(LocaleController.getString("OK", R.string.OK), false, true);
            } else {
                this.premiumButtonView.clearOverlayText();
            }
        }
    }

    public class ViewPage extends LinearLayout {
        TextView description;
        public int position;
        TextView title;
        PagerHeaderView topHeader;
        View topView;
        boolean topViewOnFullHeight;

        public ViewPage(Context context, int i) {
            super(context);
            setOrientation(1);
            View viewForPosition = PremiumFeatureBottomSheet.this.getViewForPosition(context, i);
            this.topView = viewForPosition;
            addView(viewForPosition);
            this.topHeader = (PagerHeaderView) this.topView;
            TextView textView = new TextView(context);
            this.title = textView;
            textView.setGravity(1);
            TextView textView2 = this.title;
            int i2 = Theme.key_dialogTextBlack;
            textView2.setTextColor(PremiumFeatureBottomSheet.this.getThemedColor(i2));
            this.title.setTextSize(1, 20.0f);
            this.title.setTypeface(AndroidUtilities.bold());
            addView(this.title, LayoutHelper.createFrame(-1, -2.0f, 0, 21.0f, 20.0f, 21.0f, 0.0f));
            TextView textView3 = new TextView(context);
            this.description = textView3;
            textView3.setGravity(1);
            this.description.setTextSize(1, 15.0f);
            this.description.setTextColor(PremiumFeatureBottomSheet.this.getThemedColor(i2));
            if (!PremiumFeatureBottomSheet.this.onlySelectedType) {
                this.description.setLines(2);
            }
            addView(this.description, LayoutHelper.createFrame(-1, -2.0f, 0, 21.0f, 10.0f, 21.0f, 16.0f));
            setClipChildren(false);
        }

        @Override
        protected void onMeasure(int i, int i2) {
            this.title.setVisibility(0);
            View view = this.topView;
            if (view instanceof BaseListPageView) {
                ((BaseListPageView) view).setTopOffset(PremiumFeatureBottomSheet.this.topGlobalOffset);
            }
            ViewGroup.LayoutParams layoutParams = this.topView.getLayoutParams();
            PremiumFeatureBottomSheet premiumFeatureBottomSheet = PremiumFeatureBottomSheet.this;
            layoutParams.height = premiumFeatureBottomSheet.contentHeight;
            this.description.setVisibility(((BottomSheet) premiumFeatureBottomSheet).isPortrait ? 0 : 8);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.title.getLayoutParams();
            if (((BottomSheet) PremiumFeatureBottomSheet.this).isPortrait) {
                marginLayoutParams.topMargin = AndroidUtilities.dp(20.0f);
                marginLayoutParams.bottomMargin = 0;
            } else {
                marginLayoutParams.topMargin = AndroidUtilities.dp(10.0f);
                marginLayoutParams.bottomMargin = AndroidUtilities.dp(10.0f);
            }
            ((ViewGroup.MarginLayoutParams) this.topView.getLayoutParams()).bottomMargin = 0;
            super.onMeasure(i, i2);
            if (this.topViewOnFullHeight) {
                this.topView.getLayoutParams().height = getMeasuredHeight() - AndroidUtilities.dp(16.0f);
                ((ViewGroup.MarginLayoutParams) this.topView.getLayoutParams()).bottomMargin = AndroidUtilities.dp(16.0f);
                this.title.setVisibility(8);
                this.description.setVisibility(8);
                super.onMeasure(i, i2);
            }
        }

        @Override
        protected boolean drawChild(Canvas canvas, View view, long j) {
            if (view == this.topView) {
                boolean z = view instanceof BaseListPageView;
                if (z) {
                    setTranslationY(0.0f);
                } else {
                    setTranslationY(PremiumFeatureBottomSheet.this.topGlobalOffset);
                }
                if ((view instanceof CarouselView) || z) {
                    return super.drawChild(canvas, view, j);
                }
                canvas.save();
                canvas.clipRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
                boolean drawChild = super.drawChild(canvas, view, j);
                canvas.restore();
                return drawChild;
            }
            return super.drawChild(canvas, view, j);
        }

        void setFeatureDate(PremiumPreviewFragment.PremiumFeatureData premiumFeatureData) {
            int i = premiumFeatureData.type;
            if (i != 0 && i != 14 && i != 28) {
                if (PremiumFeatureBottomSheet.this.onlySelectedType) {
                    if (PremiumFeatureBottomSheet.this.startType != 4) {
                        if (PremiumFeatureBottomSheet.this.startType != 3) {
                            if (PremiumFeatureBottomSheet.this.startType != 24) {
                                if (PremiumFeatureBottomSheet.this.startType != 10) {
                                    if (PremiumFeatureBottomSheet.this.startType != 2) {
                                        if (PremiumFeatureBottomSheet.this.startType != 9) {
                                            if (PremiumFeatureBottomSheet.this.startType != 8) {
                                                if (PremiumFeatureBottomSheet.this.startType != 13) {
                                                    if (PremiumFeatureBottomSheet.this.startType != 38) {
                                                        if (PremiumFeatureBottomSheet.this.startType != 22) {
                                                            if (PremiumFeatureBottomSheet.this.startType == 23) {
                                                                this.title.setText(LocaleController.getString(R.string.PremiumPreviewProfileColor));
                                                                this.description.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.PremiumPreviewProfileColorDescription)));
                                                            } else {
                                                                this.title.setText(premiumFeatureData.title);
                                                                this.description.setText(AndroidUtilities.replaceTags(premiumFeatureData.description));
                                                            }
                                                        } else {
                                                            this.title.setText(LocaleController.getString(R.string.PremiumPreviewWallpaper));
                                                            this.description.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.PremiumPreviewWallpaperDescription)));
                                                        }
                                                    } else {
                                                        this.title.setText(LocaleController.getString(R.string.PremiumPreviewEffects));
                                                        this.description.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.PremiumPreviewEffectsDescription)));
                                                    }
                                                } else {
                                                    this.title.setText(LocaleController.getString(R.string.PremiumPreviewTranslations));
                                                    this.description.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.PremiumPreviewTranslationsDescription)));
                                                }
                                            } else {
                                                this.title.setText(LocaleController.getString(R.string.PremiumPreviewVoiceToText));
                                                this.description.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.PremiumPreviewVoiceToTextDescription2)));
                                            }
                                        } else {
                                            this.title.setText(LocaleController.getString(R.string.PremiumPreviewAdvancedChatManagement));
                                            this.description.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.PremiumPreviewAdvancedChatManagementDescription2)));
                                        }
                                    } else {
                                        this.title.setText(LocaleController.getString(R.string.PremiumPreviewDownloadSpeed));
                                        this.description.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.PremiumPreviewDownloadSpeedDescription2)));
                                    }
                                } else {
                                    this.title.setText(LocaleController.getString("PremiumPreviewAppIcon", R.string.PremiumPreviewAppIcon));
                                    this.description.setText(AndroidUtilities.replaceTags(LocaleController.getString("PremiumPreviewAppIconDescription2", R.string.PremiumPreviewAppIconDescription2)));
                                }
                            } else {
                                this.title.setText(LocaleController.getString(R.string.PremiumPreviewTags));
                                this.description.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.PremiumPreviewTagsDescription)));
                            }
                        } else {
                            this.title.setText(LocaleController.getString(R.string.PremiumPreviewNoAds));
                            this.description.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.PremiumPreviewNoAdsDescription2)));
                        }
                    } else {
                        this.title.setText(LocaleController.getString("AdditionalReactions", R.string.AdditionalReactions));
                        this.description.setText(AndroidUtilities.replaceTags(LocaleController.getString("AdditionalReactionsDescription", R.string.AdditionalReactionsDescription)));
                    }
                    this.topViewOnFullHeight = false;
                } else {
                    this.title.setText(premiumFeatureData.title);
                    this.description.setText(AndroidUtilities.replaceTags(premiumFeatureData.description));
                    this.topViewOnFullHeight = false;
                }
            } else {
                this.title.setText("");
                this.description.setText("");
                this.topViewOnFullHeight = true;
            }
            requestLayout();
        }
    }

    View getViewForPosition(Context context, int i) {
        PremiumPreviewFragment.PremiumFeatureData premiumFeatureData = this.premiumFeatures.get(i);
        int i2 = premiumFeatureData.type;
        if (i2 == 0) {
            DoubleLimitsPageView doubleLimitsPageView = new DoubleLimitsPageView(context, this.resourcesProvider);
            doubleLimitsPageView.recyclerListView.setOnScrollListener(new RecyclerView.OnScrollListener() {
                @Override
                public void onScrolled(RecyclerView recyclerView, int i3, int i4) {
                    super.onScrolled(recyclerView, i3, i4);
                    ((BottomSheet) PremiumFeatureBottomSheet.this).containerView.invalidate();
                    PremiumFeatureBottomSheet.this.checkTopOffset();
                }
            });
            return doubleLimitsPageView;
        }
        if (i2 == 14 || i2 == 28) {
            FeaturesPageView featuresPageView = new FeaturesPageView(context, i2 == 28 ? 1 : 0, this.resourcesProvider);
            featuresPageView.recyclerListView.setOnScrollListener(new RecyclerView.OnScrollListener() {
                @Override
                public void onScrolled(RecyclerView recyclerView, int i3, int i4) {
                    super.onScrolled(recyclerView, i3, i4);
                    ((BottomSheet) PremiumFeatureBottomSheet.this).containerView.invalidate();
                    PremiumFeatureBottomSheet.this.checkTopOffset();
                }
            });
            return featuresPageView;
        }
        if (i2 == 5) {
            return new PremiumStickersPreviewRecycler(this, context, this.currentAccount) {
                @Override
                public void setOffset(float f) {
                    setAutoPlayEnabled(f == 0.0f);
                    super.setOffset(f);
                }
            };
        }
        if (i2 == 10) {
            return new PremiumAppIconsPreviewView(context, this.resourcesProvider);
        }
        return new VideoScreenPreview(context, this.svgIcon, this.currentAccount, premiumFeatureData.type, this.resourcesProvider);
    }

    @Override
    public boolean onCustomOpenAnimation() {
        if (this.viewPager.getChildCount() > 0) {
            View view = ((ViewPage) this.viewPager.getChildAt(0)).topView;
            if (view instanceof PremiumAppIconsPreviewView) {
                final PremiumAppIconsPreviewView premiumAppIconsPreviewView = (PremiumAppIconsPreviewView) view;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(r0.getMeasuredWidth(), 0.0f);
                premiumAppIconsPreviewView.setOffset(r0.getMeasuredWidth());
                this.enterAnimationIsRunning = true;
                ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                    @Override
                    public void onAnimationUpdate(ValueAnimator valueAnimator) {
                        premiumAppIconsPreviewView.setOffset(((Float) valueAnimator.getAnimatedValue()).floatValue());
                    }
                });
                ofFloat.addListener(new AnimatorListenerAdapter() {
                    @Override
                    public void onAnimationEnd(Animator animator) {
                        PremiumFeatureBottomSheet.this.enterAnimationIsRunning = false;
                        premiumAppIconsPreviewView.setOffset(0.0f);
                        super.onAnimationEnd(animator);
                    }
                });
                ofFloat.setDuration(500L);
                ofFloat.setStartDelay(100L);
                ofFloat.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
                ofFloat.start();
            }
        }
        return super.onCustomOpenAnimation();
    }

    void checkTopOffset() {
        View findViewByPosition;
        View findViewByPosition2;
        int i = -1;
        int i2 = -1;
        for (int i3 = 0; i3 < this.viewPager.getChildCount(); i3++) {
            ViewPage viewPage = (ViewPage) this.viewPager.getChildAt(i3);
            if (viewPage.position == this.selectedPosition) {
                View view = viewPage.topView;
                if ((view instanceof BaseListPageView) && ((findViewByPosition2 = ((BaseListPageView) view).layoutManager.findViewByPosition(0)) == null || (i = findViewByPosition2.getTop()) < 0)) {
                    i = 0;
                }
            }
            if (viewPage.position == this.toPosition) {
                View view2 = viewPage.topView;
                if ((view2 instanceof BaseListPageView) && ((findViewByPosition = ((BaseListPageView) view2).layoutManager.findViewByPosition(0)) == null || (i2 = findViewByPosition.getTop()) < 0)) {
                    i2 = 0;
                }
            }
        }
        int i4 = this.topGlobalOffset;
        if (i >= 0) {
            float f = 1.0f - this.progress;
            i4 = Math.min(i4, (int) ((i * f) + (i4 * (1.0f - f))));
        }
        if (i2 >= 0) {
            float f2 = this.progress;
            i4 = Math.min(i4, (int) ((i2 * f2) + (this.topGlobalOffset * (1.0f - f2))));
        }
        this.closeLayout.setAlpha(1.0f - this.progressToGradient);
        if (this.progressToFullscreenView == 1.0f) {
            this.closeLayout.setVisibility(4);
        } else {
            this.closeLayout.setVisibility(0);
        }
        this.content.setTranslationX((this.fullscreenNext ? r0.getMeasuredWidth() : -r0.getMeasuredWidth()) * this.progressToGradient);
        if (i4 != this.topCurrentOffset) {
            this.topCurrentOffset = i4;
            for (int i5 = 0; i5 < this.viewPager.getChildCount(); i5++) {
                if (!((ViewPage) this.viewPager.getChildAt(i5)).topViewOnFullHeight) {
                    this.viewPager.getChildAt(i5).setTranslationY(this.topCurrentOffset);
                }
            }
            this.content.setTranslationY(this.topCurrentOffset);
            this.closeLayout.setTranslationY(this.topCurrentOffset);
            this.containerView.invalidate();
            AndroidUtilities.updateViewVisibilityAnimated(this.actionBar, this.topCurrentOffset < AndroidUtilities.dp(30.0f), 1.0f, true);
        }
    }

    public void updateStatusBar() {
        ActionBar actionBar = this.actionBar;
        if (actionBar != null && actionBar.getTag() != null) {
            AndroidUtilities.setLightStatusBar(getWindow(), isLightStatusBar());
        } else if (this.baseFragment != null) {
            AndroidUtilities.setLightStatusBar(getWindow(), this.baseFragment.isLightStatusBar());
        }
    }

    private boolean isLightStatusBar() {
        return ColorUtils.calculateLuminance(getThemedColor(Theme.key_dialogBackground)) > 0.699999988079071d;
    }

    @Override
    protected boolean canDismissWithSwipe() {
        for (int i = 0; i < this.viewPager.getChildCount(); i++) {
            ViewPage viewPage = (ViewPage) this.viewPager.getChildAt(i);
            if (viewPage.position == this.selectedPosition) {
                if (viewPage.topView instanceof BaseListPageView) {
                    return !((BaseListPageView) r1).recyclerListView.canScrollVertically(-1);
                }
            }
        }
        return true;
    }
}
