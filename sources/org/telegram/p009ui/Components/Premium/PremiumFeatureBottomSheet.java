package org.telegram.p009ui.Components.Premium;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.ColorUtils;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.C1072R;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SvgHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.p009ui.ActionBar.BaseFragment;
import org.telegram.p009ui.ActionBar.BottomSheet;
import org.telegram.p009ui.ActionBar.C1133ActionBar;
import org.telegram.p009ui.ActionBar.Theme;
import org.telegram.p009ui.ChatActivity;
import org.telegram.p009ui.Components.BottomPagesView;
import org.telegram.p009ui.Components.ChatAttachAlert;
import org.telegram.p009ui.Components.CubicBezierInterpolator;
import org.telegram.p009ui.Components.LayoutHelper;
import org.telegram.p009ui.Components.Premium.PremiumGradient;
import org.telegram.p009ui.Components.RLottieDrawable;
import org.telegram.p009ui.PremiumPreviewFragment;

public class PremiumFeatureBottomSheet extends BottomSheet implements NotificationCenter.NotificationCenterDelegate {
    C1133ActionBar actionBar;
    private final BaseFragment baseFragment;
    private FrameLayout buttonContainer;
    FrameLayout closeLayout;
    boolean containerViewsForward;
    float containerViewsProgress;
    FrameLayout content;
    int contentHeight;
    boolean enterAnimationIsRunning;
    private boolean forceAbout;
    private int gradientAlpha;
    private final boolean onlySelectedType;
    private PremiumButtonView premiumButtonView;
    ArrayList<PremiumPreviewFragment.PremiumFeatureData> premiumFeatures;
    float progressToFullscreenView;
    private PremiumPreviewFragment.SubscriptionTier selectedTier;
    private final int startType;
    SvgHelper.SvgDrawable svgIcon;
    int topCurrentOffset;
    int topGlobalOffset;
    ViewPager viewPager;

    public PremiumFeatureBottomSheet(BaseFragment baseFragment, int i, boolean z) {
        this(baseFragment, i, z, null);
    }

    public PremiumFeatureBottomSheet(BaseFragment baseFragment, int i, boolean z, PremiumPreviewFragment.SubscriptionTier subscriptionTier) {
        this(baseFragment, baseFragment.getContext(), baseFragment.getCurrentAccount(), i, z, subscriptionTier);
    }

    public PremiumFeatureBottomSheet(BaseFragment baseFragment, Context context, int i, int i2, boolean z) {
        this(baseFragment, context, i, i2, z, null);
    }

    public PremiumFeatureBottomSheet(final BaseFragment baseFragment, Context context, int i, int i2, final boolean z, PremiumPreviewFragment.SubscriptionTier subscriptionTier) {
        super(context, false);
        this.premiumFeatures = new ArrayList<>();
        this.gradientAlpha = 255;
        this.baseFragment = baseFragment;
        if (baseFragment == null) {
            throw new RuntimeException("fragmnet can't be null");
        }
        this.selectedTier = subscriptionTier;
        fixNavigationBar();
        this.startType = i2;
        this.onlySelectedType = z;
        this.svgIcon = SvgHelper.getDrawable(RLottieDrawable.readRes(null, C1072R.raw.star_loader));
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
        PremiumPreviewFragment.fillPremiumFeaturesList(this.premiumFeatures, i);
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
        if (z) {
            this.premiumFeatures.clear();
            this.premiumFeatures.add(this.premiumFeatures.get(i3));
            i3 = 0;
        }
        final PremiumPreviewFragment.PremiumFeatureData premiumFeatureData = this.premiumFeatures.get(i3);
        setApplyBottomPadding(false);
        this.useBackgroundTopPadding = false;
        final PremiumGradient.GradientTools gradientTools = new PremiumGradient.GradientTools("premiumGradientBottomSheet1", "premiumGradientBottomSheet2", "premiumGradientBottomSheet3", null);
        gradientTools.f1113x1 = 0.0f;
        gradientTools.f1115y1 = 1.1f;
        gradientTools.f1114x2 = 1.5f;
        gradientTools.f1116y2 = -0.2f;
        gradientTools.exactly = true;
        this.content = new FrameLayout(getContext()) {
            @Override
            protected void onMeasure(int i4, int i5) {
                super.onMeasure(i4, View.MeasureSpec.makeMeasureSpec(PremiumFeatureBottomSheet.this.contentHeight + AndroidUtilities.m35dp(2.0f), 1073741824));
            }

            @Override
            protected void dispatchDraw(Canvas canvas) {
                gradientTools.gradientMatrix(0, 0, getMeasuredWidth(), getMeasuredHeight(), 0.0f, 0.0f);
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(0.0f, AndroidUtilities.m35dp(2.0f), getMeasuredWidth(), getMeasuredHeight() + AndroidUtilities.m35dp(18.0f));
                canvas.save();
                canvas.clipRect(0, 0, getMeasuredWidth(), getMeasuredHeight());
                gradientTools.paint.setAlpha(PremiumFeatureBottomSheet.this.gradientAlpha);
                canvas.drawRoundRect(rectF, AndroidUtilities.m35dp(12.0f) - 1, AndroidUtilities.m35dp(12.0f) - 1, gradientTools.paint);
                canvas.restore();
                super.dispatchDraw(canvas);
            }
        };
        this.closeLayout = new FrameLayout(getContext());
        ImageView imageView = new ImageView(getContext());
        imageView.setImageResource(C1072R.C1073drawable.msg_close);
        imageView.setBackground(Theme.createSimpleSelectorRoundRectDrawable(AndroidUtilities.m35dp(12.0f), ColorUtils.setAlphaComponent(-1, 40), ColorUtils.setAlphaComponent(-1, 100)));
        this.closeLayout.addView(imageView, LayoutHelper.createFrame(24, 24, 17));
        this.closeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                PremiumFeatureBottomSheet.this.lambda$new$0(view);
            }
        });
        frameLayout.addView(this.content, LayoutHelper.createLinear(-1, -2, 1, 0, 16, 0, 0));
        ViewPager viewPager = new ViewPager(getContext()) {
            @Override
            public void onMeasure(int i4, int i5) {
                int m35dp = AndroidUtilities.m35dp(100.0f);
                if (getChildCount() > 0) {
                    getChildAt(0).measure(i4, View.MeasureSpec.makeMeasureSpec(0, 0));
                    m35dp = getChildAt(0).getMeasuredHeight();
                }
                super.onMeasure(i4, View.MeasureSpec.makeMeasureSpec(m35dp + PremiumFeatureBottomSheet.this.topGlobalOffset, 1073741824));
            }

            @Override
            public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
                try {
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
                return super.onTouchEvent(motionEvent);
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
        this.viewPager.setCurrentItem(i3);
        frameLayout.addView(this.viewPager, LayoutHelper.createFrame(-1, 100.0f, 0, 0.0f, 18.0f, 0.0f, 0.0f));
        frameLayout.addView(this.closeLayout, LayoutHelper.createFrame(52, 52.0f, 53, 0.0f, 16.0f, 0.0f, 0.0f));
        final BottomPagesView bottomPagesView = new BottomPagesView(getContext(), this.viewPager, this.premiumFeatures.size());
        this.viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            float progress;
            int selectedPosition;
            int toPosition;

            @Override
            public void onPageScrollStateChanged(int i4) {
            }

            @Override
            public void onPageScrolled(int i4, float f, int i5) {
                bottomPagesView.setPageOffset(i4, f);
                this.selectedPosition = i4;
                this.toPosition = i5 > 0 ? i4 + 1 : i4 - 1;
                this.progress = f;
                checkPage();
            }

            @Override
            public void onPageSelected(int i4) {
                checkPage();
            }

            private void checkPage() {
                float measuredWidth;
                int i4 = 0;
                while (true) {
                    float f = 0.0f;
                    if (i4 >= PremiumFeatureBottomSheet.this.viewPager.getChildCount()) {
                        break;
                    }
                    ViewPage viewPage = (ViewPage) PremiumFeatureBottomSheet.this.viewPager.getChildAt(i4);
                    if (!PremiumFeatureBottomSheet.this.enterAnimationIsRunning || !(viewPage.topView instanceof PremiumAppIconsPreviewView)) {
                        int i5 = viewPage.position;
                        if (i5 == this.selectedPosition) {
                            PagerHeaderView pagerHeaderView = viewPage.topHeader;
                            measuredWidth = (-viewPage.getMeasuredWidth()) * this.progress;
                            pagerHeaderView.setOffset(measuredWidth);
                        } else if (i5 == this.toPosition) {
                            PagerHeaderView pagerHeaderView2 = viewPage.topHeader;
                            measuredWidth = ((-viewPage.getMeasuredWidth()) * this.progress) + viewPage.getMeasuredWidth();
                            pagerHeaderView2.setOffset(measuredWidth);
                        } else {
                            viewPage.topHeader.setOffset(viewPage.getMeasuredWidth());
                        }
                        f = measuredWidth;
                    }
                    if (viewPage.topView instanceof PremiumAppIconsPreviewView) {
                        viewPage.setTranslationX(-f);
                        viewPage.title.setTranslationX(f);
                        viewPage.description.setTranslationX(f);
                    }
                    i4++;
                }
                PremiumFeatureBottomSheet premiumFeatureBottomSheet = PremiumFeatureBottomSheet.this;
                premiumFeatureBottomSheet.containerViewsProgress = this.progress;
                int i6 = this.toPosition;
                int i7 = this.selectedPosition;
                premiumFeatureBottomSheet.containerViewsForward = i6 > i7;
                if (i7 >= 0 && i7 < premiumFeatureBottomSheet.premiumFeatures.size() && PremiumFeatureBottomSheet.this.premiumFeatures.get(this.selectedPosition).type == 0) {
                    PremiumFeatureBottomSheet.this.progressToFullscreenView = 1.0f - this.progress;
                } else {
                    int i8 = this.toPosition;
                    if (i8 >= 0 && i8 < PremiumFeatureBottomSheet.this.premiumFeatures.size() && PremiumFeatureBottomSheet.this.premiumFeatures.get(this.toPosition).type == 0) {
                        PremiumFeatureBottomSheet.this.progressToFullscreenView = this.progress;
                    } else {
                        PremiumFeatureBottomSheet.this.progressToFullscreenView = 0.0f;
                    }
                }
                PremiumFeatureBottomSheet premiumFeatureBottomSheet2 = PremiumFeatureBottomSheet.this;
                int i9 = (int) ((1.0f - premiumFeatureBottomSheet2.progressToFullscreenView) * 255.0f);
                if (i9 != premiumFeatureBottomSheet2.gradientAlpha) {
                    PremiumFeatureBottomSheet.this.gradientAlpha = i9;
                    PremiumFeatureBottomSheet.this.content.invalidate();
                    PremiumFeatureBottomSheet.this.checkTopOffset();
                }
            }
        });
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.addView(frameLayout);
        linearLayout.setOrientation(1);
        bottomPagesView.setColor("chats_unreadCounterMuted", "chats_actionBackground");
        if (!z) {
            linearLayout.addView(bottomPagesView, LayoutHelper.createLinear(this.premiumFeatures.size() * 11, 5, 1, 0, 0, 0, 10));
        }
        PremiumButtonView premiumButtonView = new PremiumButtonView(getContext(), true);
        this.premiumButtonView = premiumButtonView;
        premiumButtonView.buttonLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                PremiumFeatureBottomSheet.this.lambda$new$1(baseFragment, z, premiumFeatureData, view);
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
        this.buttonContainer.setBackgroundColor(getThemedColor("dialogBackground"));
        linearLayout.addView(this.buttonContainer, LayoutHelper.createLinear(-1, 68, 80));
        if (UserConfig.getInstance(i).isPremium()) {
            this.premiumButtonView.setOverlayText(LocaleController.getString("OK", C1072R.string.OK), false, false);
        }
        final ScrollView scrollView = new ScrollView(getContext());
        scrollView.addView(linearLayout);
        setCustomView(scrollView);
        MediaDataController.getInstance(i).preloadPremiumPreviewStickers();
        setButtonText();
        this.customViewGravity = 83;
        final Drawable mutate = ContextCompat.getDrawable(getContext(), C1072R.C1073drawable.header_shadow).mutate();
        FrameLayout frameLayout3 = new FrameLayout(getContext()) {
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
                drawable.setBounds(0, (premiumFeatureBottomSheet.topCurrentOffset - ((BottomSheet) premiumFeatureBottomSheet).backgroundPaddingTop) + AndroidUtilities.m35dp(2.0f), getMeasuredWidth(), getMeasuredHeight());
                ((BottomSheet) PremiumFeatureBottomSheet.this).shadowDrawable.draw(canvas);
                super.dispatchDraw(canvas);
                C1133ActionBar c1133ActionBar = PremiumFeatureBottomSheet.this.actionBar;
                if (c1133ActionBar == null || c1133ActionBar.getVisibility() != 0 || PremiumFeatureBottomSheet.this.actionBar.getAlpha() == 0.0f) {
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
                    canvas.clipRect(0, PremiumFeatureBottomSheet.this.topCurrentOffset + AndroidUtilities.m35dp(2.0f), getMeasuredWidth(), getMeasuredHeight());
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
                    if (y < (premiumFeatureBottomSheet.topCurrentOffset - ((BottomSheet) premiumFeatureBottomSheet).backgroundPaddingTop) + AndroidUtilities.m35dp(2.0f)) {
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

    public void lambda$new$1(BaseFragment baseFragment, boolean z, PremiumPreviewFragment.PremiumFeatureData premiumFeatureData, View view) {
        if (baseFragment instanceof ChatActivity) {
            ChatActivity chatActivity = (ChatActivity) baseFragment;
            chatActivity.closeMenu();
            ChatAttachAlert chatAttachAlert = chatActivity.chatAttachAlert;
            if (chatAttachAlert != null) {
                chatAttachAlert.dismiss(true);
            }
        }
        if (baseFragment != null && baseFragment.getVisibleDialog() != null) {
            baseFragment.getVisibleDialog().dismiss();
        }
        if ((z || this.forceAbout) && baseFragment != null) {
            baseFragment.presentFragment(new PremiumPreviewFragment(PremiumPreviewFragment.featureTypeToServerString(premiumFeatureData.type)));
        } else {
            PremiumPreviewFragment.buyPremium(baseFragment, this.selectedTier, PremiumPreviewFragment.featureTypeToServerString(premiumFeatureData.type));
        }
        dismiss();
    }

    public void lambda$new$2(View view) {
        dismiss();
    }

    public PremiumFeatureBottomSheet setForceAbout() {
        this.forceAbout = true;
        this.premiumButtonView.clearOverlayText();
        setButtonText();
        return this;
    }

    private void setButtonText() {
        if (this.forceAbout) {
            this.premiumButtonView.buttonTextView.setText(LocaleController.getString(C1072R.string.AboutTelegramPremium));
        } else if (this.onlySelectedType) {
            int i = this.startType;
            if (i == 4) {
                this.premiumButtonView.buttonTextView.setText(LocaleController.getString(C1072R.string.UnlockPremiumReactions));
                this.premiumButtonView.setIcon(C1072R.raw.unlock_icon);
            } else if (i == 3 || i == 2 || i == 9 || i == 8) {
                this.premiumButtonView.buttonTextView.setText(LocaleController.getString(C1072R.string.AboutTelegramPremium));
            } else if (i == 10) {
                this.premiumButtonView.buttonTextView.setText(LocaleController.getString(C1072R.string.UnlockPremiumIcons));
                this.premiumButtonView.setIcon(C1072R.raw.unlock_icon);
            }
        } else {
            this.premiumButtonView.buttonTextView.setText(PremiumPreviewFragment.getPremiumButtonText(this.currentAccount, this.selectedTier));
        }
    }

    @Override
    public void show() {
        super.show();
        NotificationCenter.getGlobalInstance().postNotificationName(NotificationCenter.stopAllHeavyOperations, 16);
    }

    @Override
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.billingProductDetailsUpdated);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.premiumPromoUpdated);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
        C1133ActionBar c1133ActionBar = new C1133ActionBar(getContext()) {
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
        this.actionBar = c1133ActionBar;
        c1133ActionBar.setBackgroundColor(getThemedColor("dialogBackground"));
        this.actionBar.setTitleColor(getThemedColor("windowBackgroundWhiteBlackText"));
        this.actionBar.setItemsBackgroundColor(getThemedColor("actionBarActionModeDefaultSelector"), false);
        this.actionBar.setItemsColor(getThemedColor("actionBarActionModeDefaultIcon"), false);
        this.actionBar.setCastShadows(true);
        this.actionBar.setBackButtonImage(C1072R.C1073drawable.ic_ab_back);
        this.actionBar.setTitle(LocaleController.getString("DoubledLimits", C1072R.string.DoubledLimits));
        this.actionBar.setActionBarMenuOnItemClick(new C1133ActionBar.ActionBarMenuOnItemClick() {
            @Override
            public void onItemClick(int i) {
                if (i == -1) {
                    PremiumFeatureBottomSheet.this.dismiss();
                }
            }
        });
        this.containerView.addView(this.actionBar, LayoutHelper.createFrame(-1, -2.0f, 0, 0.0f, -this.backgroundPaddingTop, 0.0f, 0.0f));
        AndroidUtilities.updateViewVisibilityAnimated(this.actionBar, false, 1.0f, false);
    }

    @Override
    public void dismiss() {
        super.dismiss();
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.billingProductDetailsUpdated);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.premiumPromoUpdated);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
        NotificationCenter.getGlobalInstance().postNotificationName(NotificationCenter.startAllHeavyOperations, 16);
    }

    @Override
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == NotificationCenter.billingProductDetailsUpdated || i == NotificationCenter.premiumPromoUpdated) {
            setButtonText();
        } else if (i == NotificationCenter.currentUserPremiumStatusChanged) {
            if (UserConfig.getInstance(this.currentAccount).isPremium()) {
                this.premiumButtonView.setOverlayText(LocaleController.getString("OK", C1072R.string.OK), false, true);
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
            PremiumFeatureBottomSheet.this = r10;
            setOrientation(1);
            View viewForPosition = r10.getViewForPosition(context, i);
            this.topView = viewForPosition;
            addView(viewForPosition);
            this.topHeader = (PagerHeaderView) this.topView;
            TextView textView = new TextView(context);
            this.title = textView;
            textView.setGravity(1);
            this.title.setTextColor(Theme.getColor("dialogTextBlack"));
            this.title.setTextSize(1, 20.0f);
            this.title.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
            addView(this.title, LayoutHelper.createFrame(-1, -2.0f, 0, 21.0f, 20.0f, 21.0f, 0.0f));
            TextView textView2 = new TextView(context);
            this.description = textView2;
            textView2.setGravity(1);
            this.description.setTextSize(1, 15.0f);
            this.description.setTextColor(Theme.getColor("dialogTextBlack"));
            if (!r10.onlySelectedType) {
                this.description.setLines(2);
            }
            addView(this.description, LayoutHelper.createFrame(-1, -2.0f, 0, 21.0f, 10.0f, 21.0f, 16.0f));
            setClipChildren(false);
        }

        @Override
        protected void onMeasure(int i, int i2) {
            this.title.setVisibility(0);
            View view = this.topView;
            if (view instanceof DoubleLimitsPageView) {
                ((DoubleLimitsPageView) view).setTopOffset(PremiumFeatureBottomSheet.this.topGlobalOffset);
            }
            ViewGroup.LayoutParams layoutParams = this.topView.getLayoutParams();
            PremiumFeatureBottomSheet premiumFeatureBottomSheet = PremiumFeatureBottomSheet.this;
            layoutParams.height = premiumFeatureBottomSheet.contentHeight;
            this.description.setVisibility(((BottomSheet) premiumFeatureBottomSheet).isPortrait ? 0 : 8);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.title.getLayoutParams();
            if (((BottomSheet) PremiumFeatureBottomSheet.this).isPortrait) {
                marginLayoutParams.topMargin = AndroidUtilities.m35dp(20.0f);
                marginLayoutParams.bottomMargin = 0;
            } else {
                marginLayoutParams.topMargin = AndroidUtilities.m35dp(10.0f);
                marginLayoutParams.bottomMargin = AndroidUtilities.m35dp(10.0f);
            }
            ((ViewGroup.MarginLayoutParams) this.topView.getLayoutParams()).bottomMargin = 0;
            super.onMeasure(i, i2);
            if (this.topViewOnFullHeight) {
                this.topView.getLayoutParams().height = getMeasuredHeight() - AndroidUtilities.m35dp(16.0f);
                ((ViewGroup.MarginLayoutParams) this.topView.getLayoutParams()).bottomMargin = AndroidUtilities.m35dp(16.0f);
                this.title.setVisibility(8);
                this.description.setVisibility(8);
                super.onMeasure(i, i2);
            }
        }

        @Override
        protected boolean drawChild(Canvas canvas, View view, long j) {
            if (view == this.topView) {
                boolean z = view instanceof DoubleLimitsPageView;
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
            if (premiumFeatureData.type != 0) {
                if (PremiumFeatureBottomSheet.this.onlySelectedType) {
                    if (PremiumFeatureBottomSheet.this.startType != 4) {
                        if (PremiumFeatureBottomSheet.this.startType != 3) {
                            if (PremiumFeatureBottomSheet.this.startType != 10) {
                                if (PremiumFeatureBottomSheet.this.startType != 2) {
                                    if (PremiumFeatureBottomSheet.this.startType != 9) {
                                        if (PremiumFeatureBottomSheet.this.startType == 8) {
                                            this.title.setText(LocaleController.getString(C1072R.string.PremiumPreviewVoiceToText));
                                            this.description.setText(LocaleController.getString(C1072R.string.PremiumPreviewVoiceToTextDescription2));
                                        }
                                    } else {
                                        this.title.setText(LocaleController.getString(C1072R.string.PremiumPreviewAdvancedChatManagement));
                                        this.description.setText(LocaleController.getString(C1072R.string.PremiumPreviewAdvancedChatManagementDescription2));
                                    }
                                } else {
                                    this.title.setText(LocaleController.getString(C1072R.string.PremiumPreviewDownloadSpeed));
                                    this.description.setText(LocaleController.getString(C1072R.string.PremiumPreviewDownloadSpeedDescription2));
                                }
                            } else {
                                this.title.setText(LocaleController.getString("PremiumPreviewAppIcon", C1072R.string.PremiumPreviewAppIcon));
                                this.description.setText(LocaleController.getString("PremiumPreviewAppIconDescription2", C1072R.string.PremiumPreviewAppIconDescription2));
                            }
                        } else {
                            this.title.setText(LocaleController.getString("PremiumPreviewNoAds", C1072R.string.PremiumPreviewNoAds));
                            this.description.setText(LocaleController.getString("PremiumPreviewNoAdsDescription2", C1072R.string.PremiumPreviewNoAdsDescription2));
                        }
                    } else {
                        this.title.setText(LocaleController.getString("AdditionalReactions", C1072R.string.AdditionalReactions));
                        this.description.setText(LocaleController.getString("AdditionalReactionsDescription", C1072R.string.AdditionalReactionsDescription));
                    }
                    this.topViewOnFullHeight = false;
                } else {
                    this.title.setText(premiumFeatureData.title);
                    this.description.setText(premiumFeatureData.description);
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
            DoubleLimitsPageView doubleLimitsPageView = new DoubleLimitsPageView(context);
            doubleLimitsPageView.recyclerListView.setOnScrollListener(new RecyclerView.OnScrollListener() {
                @Override
                public void onScrolled(RecyclerView recyclerView, int i3, int i4) {
                    super.onScrolled(recyclerView, i3, i4);
                    PremiumFeatureBottomSheet.this.checkTopOffset();
                }
            });
            return doubleLimitsPageView;
        } else if (i2 == 5) {
            return new PremiumStickersPreviewRecycler(this, context, this.currentAccount) {
                @Override
                public void setOffset(float f) {
                    setAutoPlayEnabled(f == 0.0f);
                    super.setOffset(f);
                }
            };
        } else {
            if (i2 == 10) {
                return new PremiumAppIconsPreviewView(context);
            }
            return new VideoScreenPreview(context, this.svgIcon, this.currentAccount, premiumFeatureData.type);
        }
    }

    @Override
    public boolean onCustomOpenAnimation() {
        if (this.viewPager.getChildCount() > 0) {
            ViewPage viewPage = (ViewPage) this.viewPager.getChildAt(0);
            View view = viewPage.topView;
            if (view instanceof PremiumAppIconsPreviewView) {
                final PremiumAppIconsPreviewView premiumAppIconsPreviewView = (PremiumAppIconsPreviewView) view;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(viewPage.getMeasuredWidth(), 0.0f);
                premiumAppIconsPreviewView.setOffset(viewPage.getMeasuredWidth());
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
        int i;
        int i2;
        int i3 = 0;
        while (true) {
            if (i3 >= this.viewPager.getChildCount()) {
                i = -1;
                break;
            } else if (((ViewPage) this.viewPager.getChildAt(i3)).topView instanceof DoubleLimitsPageView) {
                View findViewByPosition = ((DoubleLimitsPageView) ((ViewPage) this.viewPager.getChildAt(i3)).topView).layoutManager.findViewByPosition(0);
                if (findViewByPosition == null || (i = findViewByPosition.getTop()) < 0) {
                    i = 0;
                }
            } else {
                i3++;
            }
        }
        if (i >= 0) {
            float f = this.progressToFullscreenView;
            i2 = (int) ((i * f) + (this.topGlobalOffset * (1.0f - f)));
        } else {
            i2 = this.topGlobalOffset;
        }
        this.closeLayout.setAlpha(1.0f - this.progressToFullscreenView);
        if (this.progressToFullscreenView == 1.0f) {
            this.closeLayout.setVisibility(4);
        } else {
            this.closeLayout.setVisibility(0);
        }
        FrameLayout frameLayout = this.content;
        frameLayout.setTranslationX(frameLayout.getMeasuredWidth() * this.progressToFullscreenView);
        if (i2 != this.topCurrentOffset) {
            this.topCurrentOffset = i2;
            for (int i4 = 0; i4 < this.viewPager.getChildCount(); i4++) {
                if (!((ViewPage) this.viewPager.getChildAt(i4)).topViewOnFullHeight) {
                    this.viewPager.getChildAt(i4).setTranslationY(this.topCurrentOffset);
                }
            }
            this.content.setTranslationY(this.topCurrentOffset);
            this.closeLayout.setTranslationY(this.topCurrentOffset);
            this.containerView.invalidate();
            AndroidUtilities.updateViewVisibilityAnimated(this.actionBar, this.topCurrentOffset < AndroidUtilities.m35dp(30.0f), 1.0f, true);
        }
    }

    public void updateStatusBar() {
        C1133ActionBar c1133ActionBar = this.actionBar;
        if (c1133ActionBar != null && c1133ActionBar.getTag() != null) {
            AndroidUtilities.setLightStatusBar(getWindow(), isLightStatusBar());
        } else if (this.baseFragment != null) {
            AndroidUtilities.setLightStatusBar(getWindow(), this.baseFragment.isLightStatusBar());
        }
    }

    private boolean isLightStatusBar() {
        return ColorUtils.calculateLuminance(Theme.getColor("dialogBackground")) > 0.699999988079071d;
    }
}
