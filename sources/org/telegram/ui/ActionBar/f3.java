package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Insets;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.animation.Interpolator;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.k6;
import org.telegram.ui.Components.m6;
import org.telegram.ui.Components.oc;
import org.telegram.ui.LaunchActivity;
public class f3 extends Dialog implements k2 {
    private static final boolean AVOID_SYSTEM_CUTOUT_FULLSCREEN = false;
    public static final int f22932a = 0;
    private boolean allowCustomAnimation;
    protected boolean allowNestedScroll;
    private boolean applyBottomPadding;
    private boolean applyTopPadding;
    public o2 attachedFragment;
    protected e3 backDrawable;
    protected int backgroundPaddingLeft;
    protected int backgroundPaddingTop;
    protected int behindKeyboardColor;
    protected int behindKeyboardColorKey;
    private boolean bigTitle;
    private int bottomInset;
    protected boolean calcMandatoryInsets;
    private boolean canDismissWithSwipe;
    private boolean canDismissWithTouchOutside;
    private int cellType;
    public d3 container;
    protected ViewGroup containerView;
    protected int currentAccount;
    private float currentPanTranslationY;
    protected AnimatorSet currentSheetAnimation;
    protected int currentSheetAnimationType;
    private View customView;
    protected int customViewGravity;
    protected z2 delegate;
    protected boolean dimBehind;
    protected int dimBehindAlpha;
    private boolean disableScroll;
    private Runnable dismissRunnable;
    private boolean dismissed;
    public boolean doNotOverlayNavigationBar;
    public boolean drawDoubleNavigationBar;
    public boolean drawNavigationBar;
    private boolean focusable;
    private int focusableSoftInputMode;
    private boolean forceKeyboardOnDismiss;
    private boolean fullHeight;
    protected boolean fullWidth;
    private float hideSystemVerticalInsetsProgress;
    private int internalBackgroundColor;
    protected boolean isFullscreen;
    protected boolean isPortrait;
    private int[] itemIcons;
    private ArrayList<y2> itemViews;
    private CharSequence[] items;
    public ValueAnimator keyboardContentAnimator;
    protected int keyboardHeight;
    protected boolean keyboardVisible;
    private WindowInsets lastInsets;
    private int lastKeyboardHeight;
    private int layoutCount;
    private int leftInset;
    private boolean multipleLinesTitle;
    protected int navBarColor;
    protected int navBarColorKey;
    protected float navigationBarAlpha;
    protected ValueAnimator navigationBarAnimation;
    protected int navigationBarHeight;
    protected View nestedScrollChild;
    private AnimationNotificationsLocker notificationsLocker;
    public boolean occupyNavigationBar;
    public boolean occupyNavigationBarWithoutKeyboard;
    private DialogInterface.OnClickListener onClickListener;
    private DialogInterface.OnDismissListener onHideListener;
    public int openDuration;
    public Interpolator openInterpolator;
    private boolean openNoDelay;
    protected int openedLayerNum;
    private int overlayDrawNavBarColor;
    public boolean pauseAllHeavyOperations;
    protected int playingImagesLayerNum;
    protected b6 resourcesProvider;
    private int rightInset;
    public boolean scrollNavBar;
    private Integer selectedPos;
    protected Drawable shadowDrawable;
    private boolean showWithoutAnimation;
    boolean showing;
    private boolean skipDismissAnimation;
    private long smoothContainerViewLayoutUntil;
    public boolean smoothKeyboardAnimationEnabled;
    public boolean smoothKeyboardByBottom;
    protected Runnable startAnimationRunnable;
    private int statusBarHeight;
    private int tag;
    private CharSequence title;
    private TextView titleView;
    public FrameLayout topBulletinContainer;
    private int touchSlop;
    private boolean transitionFromRight;
    public boolean useBackgroundTopPadding;
    private boolean useFastDismiss;
    protected boolean useHardwareLayer;
    protected boolean useLightNavBar;
    protected boolean useLightStatusBar;
    protected boolean useSmoothKeyboard;
    protected boolean waitingKeyboard;
    private ff.u0 windowVisibilityManager;

    public f3(Context context, boolean z10) {
        this(context, null, z10, false);
    }

    public static int access$1012(f3 f3Var, int i9) {
        int i10 = f3Var.bottomInset + i9;
        f3Var.bottomInset = i10;
        return i10;
    }

    public static int access$1020(f3 f3Var, int i9) {
        int i10 = f3Var.bottomInset - i9;
        f3Var.bottomInset = i10;
        return i10;
    }

    public static int access$1400(f3 f3Var) {
        WindowInsets windowInsets;
        int i9;
        int i10;
        int i11;
        if (f3Var.calcMandatoryInsets && (windowInsets = f3Var.lastInsets) != null) {
            Insets systemGestureInsets = windowInsets.getSystemGestureInsets();
            if (!f3Var.keyboardVisible && f3Var.drawNavigationBar && systemGestureInsets != null) {
                i9 = systemGestureInsets.left;
                if (i9 == 0) {
                    i11 = systemGestureInsets.right;
                    if (i11 == 0) {
                        return 0;
                    }
                }
                i10 = systemGestureInsets.bottom;
                return i10;
            }
            return 0;
        }
        return 0;
    }

    public static int access$1510(f3 f3Var) {
        int i9 = f3Var.layoutCount;
        f3Var.layoutCount = i9 - 1;
        return i9;
    }

    public static View access$2202(f3 f3Var, View view) {
        f3Var.customView = view;
        return view;
    }

    public static void access$2400(f3 f3Var) {
        int i9;
        long j10;
        if (!f3Var.dismissed) {
            f3Var.containerView.setVisibility(0);
            if (!f3Var.onCustomOpenAnimation()) {
                if (f3Var.useHardwareLayer) {
                    f3Var.container.setLayerType(2, null);
                }
                if (f3Var.transitionFromRight) {
                    f3Var.containerView.setTranslationX(AndroidUtilities.dp(48.0f));
                    f3Var.containerView.setAlpha(0.0f);
                    f3Var.containerView.setTranslationY(0.0f);
                } else {
                    f3Var.containerView.setTranslationY(Math.max(0, Math.min(AndroidUtilities.navigationBarHeight, f3Var.getBottomInset())) + AndroidUtilities.dp(10.0f) + f3Var.getContainerViewHeight() + f3Var.keyboardHeight);
                }
                f3Var.onContainerViewTranslation();
                f3Var.currentSheetAnimationType = 1;
                ValueAnimator valueAnimator = f3Var.navigationBarAnimation;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(f3Var.navigationBarAlpha, 1.0f);
                f3Var.navigationBarAnimation = ofFloat;
                ofFloat.addUpdateListener(new p2(f3Var, 1));
                f3Var.currentSheetAnimation = new AnimatorSet();
                ArrayList<Animator> arrayList = new ArrayList<>();
                arrayList.add(ObjectAnimator.ofFloat(f3Var.containerView, View.TRANSLATION_X, 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(f3Var.containerView, View.ALPHA, 1.0f));
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(f3Var.containerView, View.TRANSLATION_Y, 0.0f);
                ofFloat2.addUpdateListener(new p2(f3Var, 6));
                arrayList.add(ofFloat2);
                e3 e3Var = f3Var.backDrawable;
                k6 k6Var = m6.d;
                if (f3Var.dimBehind) {
                    i9 = f3Var.dimBehindAlpha;
                } else {
                    i9 = 0;
                }
                arrayList.add(ObjectAnimator.ofInt(e3Var, k6Var, i9));
                arrayList.add(f3Var.navigationBarAnimation);
                f3Var.appendOpenAnimator(true, arrayList);
                f3Var.currentSheetAnimation.playTogether(arrayList);
                if (f3Var.transitionFromRight) {
                    f3Var.currentSheetAnimation.setDuration(250L);
                    f3Var.currentSheetAnimation.setInterpolator(gr.f28844f);
                } else {
                    f3Var.currentSheetAnimation.setDuration(f3Var.openDuration);
                    f3Var.currentSheetAnimation.setInterpolator(f3Var.openInterpolator);
                }
                AnimatorSet animatorSet = f3Var.currentSheetAnimation;
                if (f3Var.waitingKeyboard) {
                    j10 = 0;
                } else {
                    j10 = 20;
                }
                animatorSet.setStartDelay(j10);
                f3Var.currentSheetAnimation.setInterpolator(f3Var.openInterpolator);
                f3Var.notificationsLocker.lock();
                f3Var.currentSheetAnimation.addListener(new w2(f3Var, 0));
                if (f3Var.pauseAllHeavyOperations) {
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
                }
                f3Var.currentSheetAnimation.start();
            }
        }
    }

    public static DialogInterface.OnClickListener access$2802(f3 f3Var, DialogInterface.OnClickListener onClickListener) {
        f3Var.onClickListener = onClickListener;
        return onClickListener;
    }

    public static CharSequence[] access$3002(f3 f3Var, CharSequence[] charSequenceArr) {
        f3Var.items = charSequenceArr;
        return charSequenceArr;
    }

    public static int[] access$3102(f3 f3Var, int[] iArr) {
        f3Var.itemIcons = iArr;
        return iArr;
    }

    public static CharSequence access$3202(f3 f3Var, CharSequence charSequence) {
        f3Var.title = charSequence;
        return charSequence;
    }

    public static boolean access$3302(f3 f3Var, boolean z10) {
        f3Var.bigTitle = z10;
        return z10;
    }

    public static Integer access$3402(f3 f3Var, Integer num) {
        f3Var.selectedPos = num;
        return num;
    }

    public static int access$3502(f3 f3Var, int i9) {
        f3Var.cellType = i9;
        return i9;
    }

    public static boolean access$3702(f3 f3Var, boolean z10) {
        f3Var.applyTopPadding = z10;
        return z10;
    }

    public static boolean access$3802(f3 f3Var, boolean z10) {
        f3Var.applyBottomPadding = z10;
        return z10;
    }

    public static Runnable access$3900(f3 f3Var) {
        return f3Var.dismissRunnable;
    }

    public static WindowInsets h(f3 f3Var, WindowInsets windowInsets) {
        f3Var.processLegacyContainerInsets(windowInsets);
        if (Build.VERSION.SDK_INT >= 30) {
            return WindowInsets.CONSUMED;
        }
        return windowInsets.consumeSystemWindowInsets();
    }

    public static void i(f3 f3Var, ValueAnimator valueAnimator) {
        int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        f3Var.setItemColor(f3Var.selectedPos.intValue(), intValue, intValue);
    }

    public static void j(f3 f3Var, ValueAnimator valueAnimator) {
        f3Var.hideSystemVerticalInsetsProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        f3Var.container.requestLayout();
        f3Var.containerView.requestLayout();
    }

    @Override
    public boolean attachedToParent() {
        d3 d3Var = this.container;
        if (d3Var != null && d3Var.isAttachedToWindow()) {
            return true;
        }
        return false;
    }

    public boolean canDismissWithSwipe() {
        return this.canDismissWithSwipe;
    }

    public boolean canDismissWithTouchOutside() {
        return this.canDismissWithTouchOutside;
    }

    public boolean canSwipeToBack(MotionEvent motionEvent) {
        return false;
    }

    public void cancelSheetAnimation() {
        AnimatorSet animatorSet = this.currentSheetAnimation;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.currentSheetAnimation = null;
        }
        this.currentSheetAnimationType = 0;
    }

    @Override
    public void dismiss() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.f3.dismiss():void");
    }

    public void dismissInternal() {
        o2 o2Var = this.attachedFragment;
        if (o2Var != null) {
            o2Var.removeSheet(this);
            AndroidUtilities.removeFromParent(this.container);
            return;
        }
        try {
            super.dismiss();
        } catch (Exception e10) {
            FileLog.e((Throwable) e10, false);
        }
    }

    public void dismissWithButtonClick(int i9) {
        long j10;
        if (!this.dismissed) {
            this.dismissed = true;
            cancelSheetAnimation();
            this.currentSheetAnimationType = 2;
            this.currentSheetAnimation = new AnimatorSet();
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.containerView, View.TRANSLATION_Y, Math.max(0, Math.min(AndroidUtilities.navigationBarHeight, getBottomInset())) + AndroidUtilities.dp(10.0f) + getContainerViewHeight() + this.keyboardHeight);
            ofFloat.addUpdateListener(new p2(this, 2));
            this.currentSheetAnimation.playTogether(ofFloat, ObjectAnimator.ofInt(this.backDrawable, m6.d, 0));
            AnimatorSet animatorSet = this.currentSheetAnimation;
            if (this.cellType == 4) {
                j10 = 330;
            } else {
                j10 = 180;
            }
            animatorSet.setDuration(j10);
            this.currentSheetAnimation.setInterpolator(gr.f28845g);
            this.currentSheetAnimation.addListener(new x2(this, i9, 0));
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
            this.currentSheetAnimation.start();
            if (this.cellType == 4 && this.selectedPos != null) {
                int currentTextColor = getItemViews().get(this.selectedPos.intValue()).getTextView().getCurrentTextColor();
                int currentTextColor2 = getItemViews().get(i9).getTextView().getCurrentTextColor();
                ValueAnimator ofArgb = ValueAnimator.ofArgb(currentTextColor, currentTextColor2);
                ofArgb.addUpdateListener(new p2(this, 7));
                ofArgb.setDuration(130L);
                gr grVar = gr.f28844f;
                ofArgb.setInterpolator(grVar);
                ofArgb.start();
                ValueAnimator ofArgb2 = ValueAnimator.ofArgb(currentTextColor2, currentTextColor);
                ofArgb2.addUpdateListener(new dh.b(this, i9, 1));
                ofArgb2.setDuration(130L);
                ofArgb2.setInterpolator(grVar);
                ofArgb2.start();
            }
        }
    }

    @Override
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.dismissed) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public void fixNavigationBar() {
        fixNavigationBar(getThemedColor(f6.f22947a7));
    }

    public void forceKeyboardOnDismiss() {
        this.forceKeyboardOnDismiss = true;
    }

    public Drawable getBackDrawable() {
        return this.backDrawable;
    }

    public int getBackgroundPaddingLeft() {
        return this.backgroundPaddingLeft;
    }

    public int getBackgroundPaddingTop() {
        return this.backgroundPaddingTop;
    }

    public int getBottomInset() {
        return (int) ((1.0f - this.hideSystemVerticalInsetsProgress) * this.bottomInset);
    }

    public int getBottomSheetWidth(boolean z10, int i9, int i10) {
        if (z10) {
            return i9;
        }
        return (int) Math.max(i9 * 0.8f, Math.min(AndroidUtilities.dp(480.0f), i9));
    }

    public oc getBulletinFactory() {
        return new oc(this.topBulletinContainer, this.resourcesProvider);
    }

    public d3 getContainer() {
        return this.container;
    }

    public ViewGroup getContainerView() {
        return this.containerView;
    }

    public int getContainerViewHeight() {
        ViewGroup viewGroup = this.containerView;
        if (viewGroup == null) {
            return 0;
        }
        return viewGroup.getMeasuredHeight();
    }

    public int getCurrentAccount() {
        return this.currentAccount;
    }

    public ArrayList<y2> getItemViews() {
        return this.itemViews;
    }

    public int getLeftInset() {
        WindowInsets windowInsets = this.lastInsets;
        if (windowInsets != null) {
            return (int) ((1.0f - this.hideSystemVerticalInsetsProgress) * windowInsets.getSystemWindowInsetLeft());
        }
        return 0;
    }

    @Override
    public int getNavigationBarColor(int i9) {
        float f10;
        ViewGroup viewGroup;
        if (attachedToParent() && (viewGroup = this.containerView) != null) {
            if (this.transitionFromRight) {
                f10 = viewGroup.getAlpha();
            } else {
                int dp = AndroidUtilities.dp(10.0f) + getContainerViewHeight() + this.keyboardHeight;
                int i10 = 0;
                if (this.scrollNavBar) {
                    i10 = Math.max(0, Math.min(AndroidUtilities.navigationBarHeight, getBottomInset()));
                }
                f10 = Utilities.clamp01(1.0f - (this.containerView.getTranslationY() / (dp + i10)));
            }
        } else {
            f10 = 0.0f;
        }
        return i0.a.d(f10, i9, this.navBarColor);
    }

    public b6 getResourcesProvider() {
        return this.resourcesProvider;
    }

    public int getRightInset() {
        WindowInsets windowInsets = this.lastInsets;
        if (windowInsets != null) {
            return (int) ((1.0f - this.hideSystemVerticalInsetsProgress) * windowInsets.getSystemWindowInsetRight());
        }
        return 0;
    }

    public int getSheetAnimationType() {
        return this.currentSheetAnimationType;
    }

    public ViewGroup getSheetContainer() {
        return this.containerView;
    }

    public int getStatusBarHeight() {
        return (int) ((1.0f - this.hideSystemVerticalInsetsProgress) * this.statusBarHeight);
    }

    public int getSystemBottomInset() {
        WindowInsets windowInsets = this.lastInsets;
        if (windowInsets != null) {
            return windowInsets.getSystemWindowInsetBottom();
        }
        return 0;
    }

    public int getTag() {
        return this.tag;
    }

    public int getTargetOpenTranslationY() {
        return 0;
    }

    public ArrayList<h6> getThemeDescriptions() {
        return null;
    }

    public int getThemedColor(int i9) {
        return f6.v0(i9, this.resourcesProvider);
    }

    public TextView getTitleView() {
        return this.titleView;
    }

    @Override
    public View getWindowView() {
        return this.container;
    }

    @Override
    public boolean isAttachedLightStatusBar() {
        return this.useLightStatusBar;
    }

    public boolean isDismissed() {
        return this.dismissed;
    }

    public boolean isFocusable() {
        return this.focusable;
    }

    @Override
    public boolean isFullyVisible() {
        return false;
    }

    public boolean isKeyboardVisible() {
        return this.keyboardVisible;
    }

    @Override
    public boolean isShown() {
        return !this.dismissed;
    }

    public boolean isTouchOutside(float f10, float f11) {
        FrameLayout frameLayout = this.topBulletinContainer;
        if (frameLayout != null && frameLayout.getChildCount() > 0) {
            View childAt = this.topBulletinContainer.getChildAt(0);
            if (f11 >= childAt.getY() + this.topBulletinContainer.getY()) {
                if (f11 <= childAt.getY() + this.topBulletinContainer.getY() + childAt.getHeight()) {
                    if (f10 >= childAt.getX() + this.topBulletinContainer.getX()) {
                        if (f10 <= childAt.getX() + this.topBulletinContainer.getX() + childAt.getWidth()) {
                            return false;
                        }
                    }
                }
            }
        }
        if (f11 >= this.containerView.getTop() && f10 >= this.containerView.getLeft() && f10 <= this.containerView.getRight()) {
            return false;
        }
        return true;
    }

    public final void k() {
        Window window;
        int i9;
        int i10;
        float f10;
        float f11;
        float f12;
        int i11;
        int i12;
        o2 o2Var = this.attachedFragment;
        if (o2Var != null) {
            o2Var.addSheet(this);
            if (this.attachedFragment.getLayoutContainer() != null) {
                if (((InputMethodManager) getContext().getSystemService("input_method")).hideSoftInputFromWindow(this.attachedFragment.getLayoutContainer().getWindowToken(), 2)) {
                    AndroidUtilities.runOnUIThread(new q2(this, 0), 80L);
                } else {
                    AndroidUtilities.removeFromParent(this.container);
                    this.attachedFragment.getLayoutContainer().addView(this.container);
                }
                window = null;
            } else {
                return;
            }
        } else {
            window = getWindow();
            window.setWindowAnimations(R.style.DialogNoAnimation);
            setContentView(this.container, new ViewGroup.LayoutParams(-1, -1));
        }
        if (this.useLightStatusBar && Build.VERSION.SDK_INT >= 23 && f6.w0(null, f6.f23269s8, true) == -1) {
            this.container.setSystemUiVisibility(this.container.getSystemUiVisibility() | 8192);
        }
        if (this.useLightNavBar && Build.VERSION.SDK_INT >= 26) {
            AndroidUtilities.setLightNavigationBar((Dialog) this, false);
        }
        if (this.containerView == null) {
            t2 t2Var = new t2(this, getContext(), 0);
            this.containerView = t2Var;
            t2Var.setBackgroundDrawable(this.shadowDrawable);
            ViewGroup viewGroup = this.containerView;
            int i13 = this.backgroundPaddingLeft;
            if (this.applyTopPadding) {
                i11 = AndroidUtilities.dp(8.0f);
            } else {
                i11 = 0;
            }
            int i14 = (i11 + this.backgroundPaddingTop) - 1;
            int i15 = this.backgroundPaddingLeft;
            if (this.applyBottomPadding) {
                i12 = AndroidUtilities.dp(8.0f);
            } else {
                i12 = 0;
            }
            viewGroup.setPadding(i13, i14, i15, i12);
        }
        this.containerView.setVisibility(4);
        this.container.addView(this.containerView, 0, g7.e6.e(-1, -2, 80));
        if (this.topBulletinContainer == null) {
            FrameLayout frameLayout = new FrameLayout(getContext());
            this.topBulletinContainer = frameLayout;
            d3 d3Var = this.container;
            d3Var.addView(frameLayout, d3Var.indexOfChild(this.containerView) + 1, g7.e6.e(-1, -2, 80));
        }
        if (this.title != null) {
            u2 u2Var = new u2(this, getContext());
            this.titleView = u2Var;
            u2Var.setText(this.title);
            if (this.bigTitle) {
                this.titleView.setTextColor(getThemedColor(f6.f23108j5));
                this.titleView.setTextSize(1, 20.0f);
                this.titleView.setTypeface(AndroidUtilities.bold());
                TextView textView = this.titleView;
                int dp = AndroidUtilities.dp(21.0f);
                if (this.multipleLinesTitle) {
                    f12 = 14.0f;
                } else {
                    f12 = 6.0f;
                }
                textView.setPadding(dp, AndroidUtilities.dp(f12), AndroidUtilities.dp(21.0f), AndroidUtilities.dp(8.0f));
            } else {
                this.titleView.setTextColor(getThemedColor(f6.f23228q5));
                this.titleView.setTextSize(1, 16.0f);
                TextView textView2 = this.titleView;
                int dp2 = AndroidUtilities.dp(16.0f);
                if (this.multipleLinesTitle) {
                    f10 = 8.0f;
                } else {
                    f10 = 0.0f;
                }
                textView2.setPadding(dp2, AndroidUtilities.dp(f10), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f));
            }
            if (this.multipleLinesTitle) {
                this.titleView.setSingleLine(false);
                this.titleView.setMaxLines(5);
                this.titleView.setEllipsize(TextUtils.TruncateAt.END);
            } else {
                this.titleView.setLines(1);
                this.titleView.setSingleLine(true);
                this.titleView.setEllipsize(TextUtils.TruncateAt.MIDDLE);
            }
            this.titleView.setGravity(16);
            ViewGroup viewGroup2 = this.containerView;
            TextView textView3 = this.titleView;
            i9 = 48;
            if (this.multipleLinesTitle) {
                f11 = -2.0f;
            } else {
                f11 = 48;
            }
            viewGroup2.addView(textView3, g7.e6.c(f11, -1));
            this.titleView.setOnTouchListener(new jh.d(1));
        } else {
            i9 = 0;
        }
        View view = this.customView;
        if (view != null) {
            if (view.getParent() != null) {
                ((ViewGroup) this.customView.getParent()).removeView(this.customView);
            }
            if (!this.useBackgroundTopPadding) {
                this.containerView.setClipToPadding(false);
                this.containerView.setClipChildren(false);
                this.container.setClipToPadding(false);
                this.container.setClipChildren(false);
                float f13 = i9;
                this.containerView.addView(this.customView, g7.e6.d(-1, -2.0f, this.customViewGravity, 0.0f, f13, 0.0f, 0.0f));
                ((ViewGroup.MarginLayoutParams) this.customView.getLayoutParams()).topMargin = AndroidUtilities.dp(f13) + (-this.backgroundPaddingTop);
            } else {
                this.containerView.addView(this.customView, g7.e6.d(-1, -2.0f, this.customViewGravity, 0.0f, i9, 0.0f, 0.0f));
            }
        } else if (this.items != null) {
            int i16 = 0;
            while (true) {
                CharSequence[] charSequenceArr = this.items;
                if (i16 >= charSequenceArr.length) {
                    break;
                }
                if (charSequenceArr[i16] != null) {
                    y2 y2Var = new y2(getContext(), this.cellType, this.resourcesProvider);
                    CharSequence charSequence = this.items[i16];
                    int[] iArr = this.itemIcons;
                    if (iArr != null) {
                        i10 = iArr[i16];
                    } else {
                        i10 = 0;
                    }
                    y2Var.a(charSequence, i10, null, this.bigTitle);
                    this.containerView.addView(y2Var, g7.e6.d(-1, 48.0f, 51, 0.0f, i9, 0.0f, 0.0f));
                    i9 += 48;
                    y2Var.setTag(Integer.valueOf(i16));
                    y2Var.setOnClickListener(new x(this, 2));
                    this.itemViews.add(y2Var);
                }
                i16++;
            }
        }
        if (this.attachedFragment == null && window != null) {
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.width = -1;
            attributes.gravity = 51;
            attributes.dimAmount = 0.0f;
            int i17 = attributes.flags & (-3);
            attributes.flags = i17;
            if (this.focusable) {
                attributes.softInputMode = this.focusableSoftInputMode;
            } else {
                attributes.flags = i17 | 131072;
            }
            if (this.isFullscreen) {
                attributes.flags |= -2147416832;
                this.container.setSystemUiVisibility(1284);
            }
            attributes.height = -1;
            if (Build.VERSION.SDK_INT >= 28) {
                attributes.layoutInDisplayCutoutMode = 1;
            }
            window.setAttributes(attributes);
        }
    }

    public final void l(boolean z10) {
        if (this.showing != z10) {
            this.showing = z10;
            if (this.openedLayerNum > 0) {
                if (z10) {
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, Integer.valueOf(this.openedLayerNum));
                } else {
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, Integer.valueOf(this.openedLayerNum));
                }
            }
        }
    }

    public void makeAttached(o2 o2Var) {
        if (!AndroidUtilities.isTablet()) {
            if (o2Var == null || !o2Var.isSupportEdgeToEdge()) {
                this.attachedFragment = o2Var;
                e3 e3Var = this.backDrawable;
                if (e3Var != null) {
                    e3Var.f22897a.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_OVER));
                }
            }
        }
    }

    public ff.s0 obtainWindowVisibilityController() {
        if (this.windowVisibilityManager == null) {
            this.windowVisibilityManager = new ff.u0(getWindow());
        }
        ff.u0 u0Var = this.windowVisibilityManager;
        u0Var.getClass();
        return new ff.t0(u0Var);
    }

    @Override
    public boolean onAttachedBackPressed() {
        onBackPressed();
        return true;
    }

    @Override
    public void onBackPressed() {
        if (this.attachedFragment == null) {
            super.onBackPressed();
        } else {
            dismiss();
        }
    }

    public boolean onContainerTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    public void onContainerTranslationYChanged(float f10) {
        d3 d3Var = this.container;
        if (d3Var != null) {
            d3Var.invalidate();
        }
    }

    @Override
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        k();
    }

    public boolean onCustomCloseAnimation() {
        return false;
    }

    public boolean onCustomLayout(View view, int i9, int i10, int i11, int i12) {
        return false;
    }

    public boolean onCustomMeasure(View view, int i9, int i10) {
        return false;
    }

    public boolean onCustomOpenAnimation() {
        return false;
    }

    public void onDismissWithTouchOutside() {
        dismiss();
    }

    public boolean onScrollUp(float f10) {
        return false;
    }

    public void onSmoothContainerViewLayout(float f10) {
        d3 d3Var = this.container;
        if (d3Var != null) {
            d3Var.invalidate();
        }
    }

    @Override
    public void onStart() {
        super.onStart();
    }

    public void processLegacyContainerInsets(WindowInsets windowInsets) {
        if (windowInsets == null) {
            return;
        }
        int systemWindowInsetTop = windowInsets.getSystemWindowInsetTop();
        if ((systemWindowInsetTop != 0 || AndroidUtilities.isInMultiwindow) && this.statusBarHeight != systemWindowInsetTop) {
            this.statusBarHeight = systemWindowInsetTop;
        }
        this.lastInsets = windowInsets;
        this.container.requestLayout();
        onInsetsChanged();
    }

    public void release() {
        dismissInternal();
    }

    public void setAllowNestedScroll(boolean z10) {
        this.allowNestedScroll = z10;
        if (!z10) {
            this.containerView.setTranslationY(0.0f);
            onContainerViewTranslation();
        }
    }

    public void setApplyBottomPadding(boolean z10) {
        this.applyBottomPadding = z10;
    }

    public void setApplyTopPadding(boolean z10) {
        this.applyTopPadding = z10;
    }

    public void setBackgroundColor(int i9) {
        this.shadowDrawable.setColorFilter(i9, PorterDuff.Mode.MULTIPLY);
        if (this.internalBackgroundColor != i9) {
            this.internalBackgroundColor = i9;
            d3 d3Var = this.container;
            if (d3Var != null) {
                int measuredHeight = d3Var.getMeasuredHeight();
                d3 d3Var2 = this.container;
                d3Var.invalidate(0, measuredHeight - d3Var2.f22839w, d3Var2.getMeasuredWidth(), this.container.getMeasuredHeight());
            }
        }
    }

    public void setCalcMandatoryInsets(boolean z10) {
        this.calcMandatoryInsets = z10;
        this.drawNavigationBar = z10;
    }

    public void setCanDismissWithSwipe(boolean z10) {
        this.canDismissWithSwipe = z10;
    }

    public void setCanDismissWithTouchOutside(boolean z10) {
        this.canDismissWithTouchOutside = z10;
    }

    public void setCurrentPanTranslationY(float f10) {
        this.currentPanTranslationY = f10;
        this.container.invalidate();
    }

    public void setCustomView(View view) {
        this.customView = view;
    }

    public void setDelegate(z2 z2Var) {
        this.delegate = z2Var;
    }

    public f3 setDimBehind(boolean z10) {
        this.dimBehind = z10;
        return this;
    }

    public void setDimBehindAlpha(int i9) {
        this.dimBehindAlpha = i9;
    }

    public void setDisableScroll(boolean z10) {
        this.disableScroll = z10;
    }

    public void setFocusable(boolean z10) {
        if (this.focusable == z10) {
            return;
        }
        this.focusable = z10;
        Window window = getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        if (this.focusable) {
            attributes.softInputMode = this.focusableSoftInputMode;
            attributes.flags &= -131073;
        } else {
            attributes.softInputMode = 48;
            attributes.flags |= 131072;
        }
        window.setAttributes(attributes);
    }

    public void setHideSystemVerticalInsets(boolean z10) {
        float f10;
        float f11 = this.hideSystemVerticalInsetsProgress;
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        ValueAnimator duration = ValueAnimator.ofFloat(f11, f10).setDuration(180L);
        duration.setInterpolator(gr.f28844f);
        duration.addUpdateListener(new p2(this, 5));
        duration.start();
    }

    public void setImageReceiverNumLevel(int i9, int i10) {
        this.playingImagesLayerNum = i9;
        this.openedLayerNum = i10;
    }

    public void setItemColor(int i9, int i10, int i11) {
        if (i9 >= 0 && i9 < this.itemViews.size()) {
            y2 y2Var = this.itemViews.get(i9);
            y2Var.f23972a.setTextColor(i10);
            y2Var.f23973b.setColorFilter(new PorterDuffColorFilter(i11, PorterDuff.Mode.MULTIPLY));
        }
    }

    public void setItemText(int i9, CharSequence charSequence) {
        if (i9 >= 0 && i9 < this.itemViews.size()) {
            this.itemViews.get(i9).f23972a.setText(charSequence);
        }
    }

    public void setItems(CharSequence[] charSequenceArr, int[] iArr, DialogInterface.OnClickListener onClickListener) {
        this.items = charSequenceArr;
        this.itemIcons = iArr;
        this.onClickListener = onClickListener;
    }

    @Override
    public void setOnDismissListener(Runnable runnable) {
        if (runnable != null) {
            setOnHideListener(new s1(runnable, 1));
        }
    }

    public void setOnHideListener(DialogInterface.OnDismissListener onDismissListener) {
        this.onHideListener = onDismissListener;
    }

    public void setOpenNoDelay(boolean z10) {
        this.openNoDelay = z10;
    }

    public void setOverlayNavBarColor(int i9) {
        this.overlayDrawNavBarColor = i9;
        d3 d3Var = this.container;
        if (d3Var != null) {
            d3Var.invalidate();
        }
        boolean z10 = false;
        if (this.attachedFragment != null) {
            LaunchActivity.C1.H(true, true, true);
            View windowView = getWindowView();
            if (AndroidUtilities.computePerceivedBrightness(getNavigationBarColor(getThemedColor(f6.f22947a7))) >= 0.721f) {
                z10 = true;
            }
            AndroidUtilities.setLightNavigationBar(windowView, z10);
            return;
        }
        AndroidUtilities.setNavigationBarColor(this, this.overlayDrawNavBarColor);
        if (AndroidUtilities.computePerceivedBrightness(this.overlayDrawNavBarColor) > 0.721d) {
            z10 = true;
        }
        AndroidUtilities.setLightNavigationBar(this, z10);
    }

    public void setShowWithoutAnimation(boolean z10) {
        this.showWithoutAnimation = z10;
    }

    @Override
    public void setTitle(CharSequence charSequence) {
        setTitle(charSequence, false);
    }

    public void setTitleColor(int i9) {
        TextView textView = this.titleView;
        if (textView == null) {
            return;
        }
        textView.setTextColor(i9);
    }

    public void setUseLightStatusBar(boolean z10) {
        int i9;
        this.useLightStatusBar = z10;
        if (Build.VERSION.SDK_INT >= 23) {
            int w02 = f6.w0(null, f6.f23269s8, true);
            int systemUiVisibility = this.container.getSystemUiVisibility();
            if (this.useLightStatusBar && w02 == -1) {
                i9 = systemUiVisibility | 8192;
            } else {
                i9 = systemUiVisibility & (-8193);
            }
            this.container.setSystemUiVisibility(i9);
        }
        if (this.attachedFragment != null) {
            LaunchActivity.C1.H(true, true, true);
        }
    }

    public boolean shouldOverlayCameraViewOverNavBar() {
        return false;
    }

    @Override
    public void show() {
        long j10;
        if (!AndroidUtilities.isSafeToShow(getContext())) {
            return;
        }
        if (this.attachedFragment != null) {
            k();
        } else {
            super.show();
        }
        l(true);
        if (this.focusable) {
            getWindow().setSoftInputMode(this.focusableSoftInputMode);
        }
        int i9 = 0;
        this.dismissed = false;
        cancelSheetAnimation();
        this.containerView.measure(View.MeasureSpec.makeMeasureSpec((this.backgroundPaddingLeft * 2) + AndroidUtilities.displaySize.x, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.y, Integer.MIN_VALUE));
        if (this.showWithoutAnimation) {
            e3 e3Var = this.backDrawable;
            if (this.dimBehind) {
                i9 = this.dimBehindAlpha;
            }
            e3Var.setAlpha(i9);
            this.containerView.setTranslationY(0.0f);
            onContainerViewTranslation();
            return;
        }
        this.backDrawable.setAlpha(0);
        this.layoutCount = 2;
        ViewGroup viewGroup = this.containerView;
        float measuredHeight = ((1.0f - this.hideSystemVerticalInsetsProgress) * AndroidUtilities.statusBarHeight) + viewGroup.getMeasuredHeight();
        if (this.scrollNavBar) {
            i9 = Math.max(0, Math.min(AndroidUtilities.navigationBarHeight, getBottomInset()));
        }
        viewGroup.setTranslationY(measuredHeight + i9);
        onContainerViewTranslation();
        if (this.openNoDelay) {
            j10 = 0;
        } else {
            j10 = 150;
        }
        if (this.waitingKeyboard) {
            j10 = 500;
        }
        v2 v2Var = new v2(this, 0);
        this.startAnimationRunnable = v2Var;
        AndroidUtilities.runOnUIThread(v2Var, j10);
    }

    @Override
    public boolean showDialog(Dialog dialog) {
        return false;
    }

    public void skipDismissAnimation() {
        this.skipDismissAnimation = true;
    }

    public void smoothContainerViewLayout() {
        this.smoothContainerViewLayoutUntil = System.currentTimeMillis() + 80;
    }

    public void transitionFromRight(boolean z10) {
        this.transitionFromRight = z10;
    }

    public f3(Context context, b6 b6Var, boolean z10, boolean z11) {
        super(context, R.style.TransparentDialog);
        this.currentAccount = UserConfig.selectedAccount;
        this.useHardwareLayer = true;
        this.backDrawable = new e3();
        this.useLightStatusBar = true;
        int i9 = f6.f23072h5;
        this.behindKeyboardColorKey = i9;
        this.canDismissWithSwipe = true;
        this.canDismissWithTouchOutside = true;
        this.allowCustomAnimation = true;
        this.statusBarHeight = AndroidUtilities.statusBarHeight;
        this.openDuration = 400;
        this.openInterpolator = gr.h;
        this.focusableSoftInputMode = 16;
        this.dimBehind = true;
        this.dimBehindAlpha = 51;
        this.allowNestedScroll = true;
        this.applyTopPadding = true;
        this.applyBottomPadding = true;
        this.itemViews = new ArrayList<>();
        this.dismissRunnable = new q2(this, 1);
        this.navigationBarAlpha = 0.0f;
        this.navBarColorKey = f6.f22947a7;
        this.pauseAllHeavyOperations = true;
        this.notificationsLocker = new AnimationNotificationsLocker();
        this.useBackgroundTopPadding = true;
        this.customViewGravity = 51;
        this.smoothContainerViewLayoutUntil = -1L;
        this.resourcesProvider = b6Var;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 30) {
            getWindow().addFlags(-2147483392);
            if (z11) {
                this.focusableSoftInputMode = 48;
            }
        } else {
            getWindow().addFlags(-2147417856);
        }
        this.touchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
        Rect rect = new Rect();
        Drawable mutate = context.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        this.shadowDrawable = mutate;
        int themedColor = getThemedColor(i9);
        this.internalBackgroundColor = themedColor;
        mutate.setColorFilter(new PorterDuffColorFilter(themedColor, PorterDuff.Mode.MULTIPLY));
        this.shadowDrawable.getPadding(rect);
        this.backgroundPaddingLeft = rect.left;
        this.backgroundPaddingTop = rect.top;
        s2 s2Var = new s2(this, getContext());
        this.container = s2Var;
        s2Var.setClipChildren(false);
        this.container.setClipToPadding(false);
        this.container.setBackground(this.backDrawable);
        this.focusable = z10;
        if (!z11) {
            this.container.setFitsSystemWindows(true);
            this.container.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() {
                @Override
                public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                    return f3.h(f3.this, windowInsets);
                }
            });
        }
        if (i10 >= 30) {
            this.container.setSystemUiVisibility(1792);
        } else {
            this.container.setSystemUiVisibility(1280);
        }
        this.backDrawable.setAlpha(0);
    }

    public void fixNavigationBar(int i9) {
        this.drawNavigationBar = !this.occupyNavigationBar;
        this.drawDoubleNavigationBar = true;
        this.scrollNavBar = true;
        this.navBarColorKey = -1;
        this.navBarColor = i9;
        setOverlayNavBarColor(i9);
    }

    @Override
    public void setOnDismissListener(DialogInterface.OnDismissListener onDismissListener) {
        super.setOnDismissListener(onDismissListener);
    }

    public void setTitle(CharSequence charSequence, boolean z10) {
        this.title = charSequence;
        this.bigTitle = z10;
    }

    public void mainContainerDispatchDraw(Canvas canvas) {
    }

    public void onConfigurationChanged(Configuration configuration) {
    }

    public void onContainerDraw(Canvas canvas) {
    }

    public void onContainerViewTranslation() {
    }

    public void onDismissAnimationStart() {
    }

    public void onInsetsChanged() {
    }

    public void onOpenAnimationEnd() {
    }

    public void onScrollUpBegin(float f10) {
    }

    public void onScrollUpEnd(float f10) {
    }

    public void onSwipeStarts() {
    }

    @Override
    public void setKeyboardHeightFromParent(int i9) {
    }

    public void setLastVisible(boolean z10) {
    }

    public void appendOpenAnimator(boolean z10, ArrayList<Animator> arrayList) {
    }

    @Override
    public void dismiss(boolean z10) {
        dismiss();
    }

    public void onContainerLayout(int i9, int i10, int i11, int i12) {
    }
}
