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
import java.util.WeakHashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.p6;
import org.telegram.ui.Components.r6;
import org.telegram.ui.Components.wc;
import org.telegram.ui.Components.wr;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.kb0;
public class h3 extends Dialog implements l2 {
    private static final boolean AVOID_SYSTEM_CUTOUT_FULLSCREEN = false;
    public static final int f17768a = 0;
    private boolean allowCustomAnimation;
    protected boolean allowNestedScroll;
    private boolean applyBottomPadding;
    private boolean applyTopPadding;
    public p2 attachedFragment;
    protected g3 backDrawable;
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
    public final f3 container;
    protected ViewGroup containerView;
    protected int currentAccount;
    private float currentPanTranslationY;
    protected AnimatorSet currentSheetAnimation;
    protected int currentSheetAnimationType;
    private View customView;
    protected int customViewGravity;
    protected b3 delegate;
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
    private ArrayList<a3> itemViews;
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
    protected f6 resourcesProvider;
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
    private xf.m0 windowVisibilityManager;

    public h3(Context context, f6 f6Var, boolean z10, boolean z11) {
        this(z11 ? 2 : 1, context, f6Var, z10);
    }

    public static int access$1012(h3 h3Var, int i10) {
        int i11 = h3Var.bottomInset + i10;
        h3Var.bottomInset = i11;
        return i11;
    }

    public static int access$1020(h3 h3Var, int i10) {
        int i11 = h3Var.bottomInset - i10;
        h3Var.bottomInset = i11;
        return i11;
    }

    public static int access$1400(h3 h3Var) {
        WindowInsets windowInsets;
        int i10;
        int i11;
        int i12;
        if (h3Var.calcMandatoryInsets && (windowInsets = h3Var.lastInsets) != null) {
            Insets systemGestureInsets = windowInsets.getSystemGestureInsets();
            if (!h3Var.keyboardVisible && h3Var.drawNavigationBar && systemGestureInsets != null) {
                i10 = systemGestureInsets.left;
                if (i10 == 0) {
                    i12 = systemGestureInsets.right;
                    if (i12 == 0) {
                        return 0;
                    }
                }
                i11 = systemGestureInsets.bottom;
                return i11;
            }
            return 0;
        }
        return 0;
    }

    public static int access$1510(h3 h3Var) {
        int i10 = h3Var.layoutCount;
        h3Var.layoutCount = i10 - 1;
        return i10;
    }

    public static boolean access$2102(h3 h3Var, boolean z10) {
        h3Var.multipleLinesTitle = z10;
        return z10;
    }

    public static View access$2202(h3 h3Var, View view) {
        h3Var.customView = view;
        return view;
    }

    public static void access$2400(h3 h3Var) {
        int i10;
        long j3;
        if (!h3Var.dismissed) {
            h3Var.containerView.setVisibility(0);
            if (!h3Var.onCustomOpenAnimation()) {
                if (h3Var.useHardwareLayer) {
                    h3Var.container.setLayerType(2, null);
                }
                if (h3Var.transitionFromRight) {
                    h3Var.containerView.setTranslationX(AndroidUtilities.dp(48.0f));
                    h3Var.containerView.setAlpha(0.0f);
                    h3Var.containerView.setTranslationY(0.0f);
                } else {
                    h3Var.containerView.setTranslationY(Math.max(0, Math.min(AndroidUtilities.navigationBarHeight, h3Var.getBottomInset())) + AndroidUtilities.dp(10.0f) + h3Var.getContainerViewHeight() + h3Var.keyboardHeight);
                }
                h3Var.onContainerViewTranslation();
                h3Var.currentSheetAnimationType = 1;
                ValueAnimator valueAnimator = h3Var.navigationBarAnimation;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(h3Var.navigationBarAlpha, 1.0f);
                h3Var.navigationBarAnimation = ofFloat;
                ofFloat.addUpdateListener(new r2(h3Var, 1));
                h3Var.currentSheetAnimation = new AnimatorSet();
                ArrayList<Animator> arrayList = new ArrayList<>();
                arrayList.add(ObjectAnimator.ofFloat(h3Var.containerView, View.TRANSLATION_X, 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(h3Var.containerView, View.ALPHA, 1.0f));
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(h3Var.containerView, View.TRANSLATION_Y, 0.0f);
                ofFloat2.addUpdateListener(new r2(h3Var, 6));
                arrayList.add(ofFloat2);
                g3 g3Var = h3Var.backDrawable;
                p6 p6Var = r6.d;
                if (h3Var.dimBehind) {
                    i10 = h3Var.dimBehindAlpha;
                } else {
                    i10 = 0;
                }
                arrayList.add(ObjectAnimator.ofInt(g3Var, p6Var, i10));
                arrayList.add(h3Var.navigationBarAnimation);
                h3Var.appendOpenAnimator(true, arrayList);
                h3Var.currentSheetAnimation.playTogether(arrayList);
                if (h3Var.transitionFromRight) {
                    h3Var.currentSheetAnimation.setDuration(250L);
                    h3Var.currentSheetAnimation.setInterpolator(wr.f28819f);
                } else {
                    h3Var.currentSheetAnimation.setDuration(h3Var.openDuration);
                    h3Var.currentSheetAnimation.setInterpolator(h3Var.openInterpolator);
                }
                AnimatorSet animatorSet = h3Var.currentSheetAnimation;
                if (h3Var.waitingKeyboard) {
                    j3 = 0;
                } else {
                    j3 = 20;
                }
                animatorSet.setStartDelay(j3);
                h3Var.currentSheetAnimation.setInterpolator(h3Var.openInterpolator);
                h3Var.notificationsLocker.lock();
                h3Var.currentSheetAnimation.addListener(new y2(h3Var, 0));
                if (h3Var.pauseAllHeavyOperations) {
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
                }
                h3Var.currentSheetAnimation.start();
            }
        }
    }

    public static DialogInterface.OnClickListener access$2802(h3 h3Var, DialogInterface.OnClickListener onClickListener) {
        h3Var.onClickListener = onClickListener;
        return onClickListener;
    }

    public static CharSequence[] access$3002(h3 h3Var, CharSequence[] charSequenceArr) {
        h3Var.items = charSequenceArr;
        return charSequenceArr;
    }

    public static int[] access$3102(h3 h3Var, int[] iArr) {
        h3Var.itemIcons = iArr;
        return iArr;
    }

    public static CharSequence access$3202(h3 h3Var, CharSequence charSequence) {
        h3Var.title = charSequence;
        return charSequence;
    }

    public static boolean access$3302(h3 h3Var, boolean z10) {
        h3Var.bigTitle = z10;
        return z10;
    }

    public static Integer access$3402(h3 h3Var, Integer num) {
        h3Var.selectedPos = num;
        return num;
    }

    public static int access$3502(h3 h3Var, int i10) {
        h3Var.cellType = i10;
        return i10;
    }

    public static boolean access$3702(h3 h3Var, boolean z10) {
        h3Var.applyTopPadding = z10;
        return z10;
    }

    public static boolean access$3802(h3 h3Var, boolean z10) {
        h3Var.applyBottomPadding = z10;
        return z10;
    }

    public static Runnable access$3900(h3 h3Var) {
        return h3Var.dismissRunnable;
    }

    public static WindowInsets h(h3 h3Var, WindowInsets windowInsets) {
        h3Var.processLegacyContainerInsets(windowInsets);
        if (Build.VERSION.SDK_INT >= 30) {
            return WindowInsets.CONSUMED;
        }
        return windowInsets.consumeSystemWindowInsets();
    }

    public static void i(h3 h3Var, ValueAnimator valueAnimator) {
        int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        h3Var.setItemColor(h3Var.selectedPos.intValue(), intValue, intValue);
    }

    public static void j(h3 h3Var, ValueAnimator valueAnimator) {
        h3Var.hideSystemVerticalInsetsProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        h3Var.container.requestLayout();
        h3Var.containerView.requestLayout();
    }

    @Override
    public boolean attachedToParent() {
        f3 f3Var = this.container;
        if (f3Var != null && f3Var.isAttachedToWindow()) {
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.h3.dismiss():void");
    }

    public void dismissInternal() {
        p2 p2Var = this.attachedFragment;
        if (p2Var != null) {
            p2Var.removeSheet(this);
            AndroidUtilities.removeFromParent(this.container);
            return;
        }
        try {
            super.dismiss();
        } catch (Exception e) {
            FileLog.e((Throwable) e, false);
        }
    }

    public void dismissWithButtonClick(int i10) {
        long j3;
        if (!this.dismissed) {
            this.dismissed = true;
            cancelSheetAnimation();
            this.currentSheetAnimationType = 2;
            this.currentSheetAnimation = new AnimatorSet();
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.containerView, View.TRANSLATION_Y, Math.max(0, Math.min(AndroidUtilities.navigationBarHeight, getBottomInset())) + AndroidUtilities.dp(10.0f) + getContainerViewHeight() + this.keyboardHeight);
            ofFloat.addUpdateListener(new r2(this, 2));
            this.currentSheetAnimation.playTogether(ofFloat, ObjectAnimator.ofInt(this.backDrawable, r6.d, 0));
            AnimatorSet animatorSet = this.currentSheetAnimation;
            if (this.cellType == 4) {
                j3 = 330;
            } else {
                j3 = 180;
            }
            animatorSet.setDuration(j3);
            this.currentSheetAnimation.setInterpolator(wr.f28820g);
            this.currentSheetAnimation.addListener(new z2(this, i10, 0));
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
            this.currentSheetAnimation.start();
            if (this.cellType == 4 && this.selectedPos != null) {
                int currentTextColor = getItemViews().get(this.selectedPos.intValue()).getTextView().getCurrentTextColor();
                int currentTextColor2 = getItemViews().get(i10).getTextView().getCurrentTextColor();
                ValueAnimator ofArgb = ValueAnimator.ofArgb(currentTextColor, currentTextColor2);
                ofArgb.addUpdateListener(new r2(this, 7));
                ofArgb.setDuration(130L);
                wr wrVar = wr.f28819f;
                ofArgb.setInterpolator(wrVar);
                ofArgb.start();
                ValueAnimator ofArgb2 = ValueAnimator.ofArgb(currentTextColor2, currentTextColor);
                ofArgb2.addUpdateListener(new s2(this, i10, 0));
                ofArgb2.setDuration(130L);
                ofArgb2.setInterpolator(wrVar);
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
        fixNavigationBar(getThemedColor(j6.f17872a7));
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

    public int getBottomSheetWidth(boolean z10, int i10, int i11) {
        if (z10) {
            return i10;
        }
        return (int) Math.max(i10 * 0.8f, Math.min(AndroidUtilities.dp(480.0f), i10));
    }

    @Override
    public wc getBulletinFactory() {
        return new wc(this.topBulletinContainer, this.resourcesProvider);
    }

    public f3 getContainer() {
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

    public ArrayList<a3> getItemViews() {
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
    public int getNavigationBarColor(int i10) {
        float f7;
        ViewGroup viewGroup;
        if (attachedToParent() && (viewGroup = this.containerView) != null) {
            if (this.transitionFromRight) {
                f7 = viewGroup.getAlpha();
            } else {
                int dp = AndroidUtilities.dp(10.0f) + getContainerViewHeight() + this.keyboardHeight;
                int i11 = 0;
                if (this.scrollNavBar) {
                    i11 = Math.max(0, Math.min(AndroidUtilities.navigationBarHeight, getBottomInset()));
                }
                f7 = Utilities.clamp01(1.0f - (this.containerView.getTranslationY() / (dp + i11)));
            }
        } else {
            f7 = 0.0f;
        }
        return i0.a.d(f7, i10, this.navBarColor);
    }

    public f6 getResourcesProvider() {
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

    public ArrayList<l6> getThemeDescriptions() {
        return null;
    }

    public int getThemedColor(int i10) {
        return j6.v0(i10, this.resourcesProvider);
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

    public boolean isTouchOutside(float f7, float f10) {
        FrameLayout frameLayout = this.topBulletinContainer;
        if (frameLayout != null && frameLayout.getChildCount() > 0) {
            View childAt = this.topBulletinContainer.getChildAt(0);
            if (f10 >= childAt.getY() + this.topBulletinContainer.getY()) {
                if (f10 <= childAt.getY() + this.topBulletinContainer.getY() + childAt.getHeight()) {
                    if (f7 >= childAt.getX() + this.topBulletinContainer.getX()) {
                        if (f7 <= childAt.getX() + this.topBulletinContainer.getX() + childAt.getWidth()) {
                            return false;
                        }
                    }
                }
            }
        }
        if (f10 >= this.containerView.getTop() && f7 >= this.containerView.getLeft() && f7 <= this.containerView.getRight()) {
            return false;
        }
        return true;
    }

    public final void k() {
        Window window;
        int i10;
        int i11;
        float f7;
        float f10;
        float f11;
        int i12;
        int i13;
        p2 p2Var = this.attachedFragment;
        if (p2Var != null) {
            p2Var.addSheet(this);
            if (this.attachedFragment.getLayoutContainer() != null) {
                if (((InputMethodManager) getContext().getSystemService("input_method")).hideSoftInputFromWindow(this.attachedFragment.getLayoutContainer().getWindowToken(), 2)) {
                    AndroidUtilities.runOnUIThread(new q2(this, 1), 80L);
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
        if (this.useLightStatusBar && Build.VERSION.SDK_INT >= 23 && j6.w0(null, j6.f18201s8, true) == -1) {
            this.container.setSystemUiVisibility(this.container.getSystemUiVisibility() | 8192);
        }
        if (this.useLightNavBar && Build.VERSION.SDK_INT >= 26) {
            AndroidUtilities.setLightNavigationBar((Dialog) this, false);
        }
        if (this.containerView == null) {
            v2 v2Var = new v2(this, getContext(), 0);
            this.containerView = v2Var;
            v2Var.setBackgroundDrawable(this.shadowDrawable);
            ViewGroup viewGroup = this.containerView;
            int i14 = this.backgroundPaddingLeft;
            if (this.applyTopPadding) {
                i12 = AndroidUtilities.dp(8.0f);
            } else {
                i12 = 0;
            }
            int i15 = (i12 + this.backgroundPaddingTop) - 1;
            int i16 = this.backgroundPaddingLeft;
            if (this.applyBottomPadding) {
                i13 = AndroidUtilities.dp(8.0f);
            } else {
                i13 = 0;
            }
            viewGroup.setPadding(i14, i15, i16, i13);
        }
        this.containerView.setVisibility(4);
        this.container.addView(this.containerView, 0, w7.a6.e(-1, -2, 80));
        if (this.topBulletinContainer == null) {
            FrameLayout frameLayout = new FrameLayout(getContext());
            this.topBulletinContainer = frameLayout;
            f3 f3Var = this.container;
            f3Var.addView(frameLayout, f3Var.indexOfChild(this.containerView) + 1, w7.a6.e(-1, -2, 80));
        }
        if (this.title != null) {
            w2 w2Var = new w2(this, getContext());
            this.titleView = w2Var;
            w2Var.setText(this.title);
            if (this.bigTitle) {
                this.titleView.setTextColor(getThemedColor(j6.f18034j5));
                this.titleView.setTextSize(1, 20.0f);
                this.titleView.setTypeface(AndroidUtilities.bold());
                TextView textView = this.titleView;
                int dp = AndroidUtilities.dp(21.0f);
                if (this.multipleLinesTitle) {
                    f11 = 14.0f;
                } else {
                    f11 = 6.0f;
                }
                textView.setPadding(dp, AndroidUtilities.dp(f11), AndroidUtilities.dp(21.0f), AndroidUtilities.dp(8.0f));
            } else {
                this.titleView.setTextColor(getThemedColor(j6.f18161q5));
                this.titleView.setTextSize(1, 16.0f);
                TextView textView2 = this.titleView;
                int dp2 = AndroidUtilities.dp(16.0f);
                if (this.multipleLinesTitle) {
                    f7 = 8.0f;
                } else {
                    f7 = 0.0f;
                }
                textView2.setPadding(dp2, AndroidUtilities.dp(f7), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f));
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
            i10 = 48;
            if (this.multipleLinesTitle) {
                f10 = -2.0f;
            } else {
                f10 = 48;
            }
            viewGroup2.addView(textView3, w7.a6.c(f10, -1));
            this.titleView.setOnTouchListener(new ai.h(1));
        } else {
            i10 = 0;
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
                float f12 = i10;
                this.containerView.addView(this.customView, w7.a6.d(-1, -2.0f, this.customViewGravity, 0.0f, f12, 0.0f, 0.0f));
                ((ViewGroup.MarginLayoutParams) this.customView.getLayoutParams()).topMargin = AndroidUtilities.dp(f12) + (-this.backgroundPaddingTop);
            } else {
                this.containerView.addView(this.customView, w7.a6.d(-1, -2.0f, this.customViewGravity, 0.0f, i10, 0.0f, 0.0f));
            }
        } else if (this.items != null) {
            int i17 = 0;
            while (true) {
                CharSequence[] charSequenceArr = this.items;
                if (i17 >= charSequenceArr.length) {
                    break;
                }
                if (charSequenceArr[i17] != null) {
                    a3 a3Var = new a3(getContext(), this.cellType, this.resourcesProvider);
                    CharSequence charSequence = this.items[i17];
                    int[] iArr = this.itemIcons;
                    if (iArr != null) {
                        i11 = iArr[i17];
                    } else {
                        i11 = 0;
                    }
                    a3Var.a(charSequence, i11, null, this.bigTitle);
                    this.containerView.addView(a3Var, w7.a6.d(-1, 48.0f, 51, 0.0f, i10, 0.0f, 0.0f));
                    i10 += 48;
                    a3Var.setTag(Integer.valueOf(i17));
                    a3Var.setOnClickListener(new x(this, 2));
                    this.itemViews.add(a3Var);
                }
                i17++;
            }
        }
        if (this.attachedFragment == null && window != null) {
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.width = -1;
            attributes.gravity = 51;
            attributes.dimAmount = 0.0f;
            int i18 = attributes.flags & (-3);
            attributes.flags = i18;
            if (this.focusable) {
                attributes.softInputMode = this.focusableSoftInputMode;
            } else {
                attributes.flags = i18 | 131072;
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

    public void makeAttached(p2 p2Var) {
        if (!AndroidUtilities.isTablet()) {
            if (p2Var == null || !p2Var.isSupportEdgeToEdge()) {
                this.attachedFragment = p2Var;
                g3 g3Var = this.backDrawable;
                if (g3Var != null) {
                    g3Var.f17733a.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_OVER));
                }
            }
        }
    }

    public xf.l0 obtainWindowVisibilityController() {
        if (this.windowVisibilityManager == null) {
            this.windowVisibilityManager = new xf.m0(getWindow());
        }
        xf.m0 m0Var = this.windowVisibilityManager;
        m0Var.getClass();
        return new kb0(m0Var);
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

    public void onContainerTranslationYChanged(float f7) {
        f3 f3Var = this.container;
        if (f3Var != null) {
            f3Var.invalidate();
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

    public boolean onCustomLayout(View view, int i10, int i11, int i12, int i13) {
        return false;
    }

    public boolean onCustomMeasure(View view, int i10, int i11) {
        return false;
    }

    public boolean onCustomOpenAnimation() {
        return false;
    }

    public void onDismissWithTouchOutside() {
        dismiss();
    }

    public boolean onScrollUp(float f7) {
        return false;
    }

    public void onSmoothContainerViewLayout(float f7) {
        f3 f3Var = this.container;
        if (f3Var != null) {
            f3Var.invalidate();
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

    public void setBackgroundColor(int i10) {
        this.shadowDrawable.setColorFilter(i10, PorterDuff.Mode.MULTIPLY);
        if (this.internalBackgroundColor != i10) {
            this.internalBackgroundColor = i10;
            f3 f3Var = this.container;
            if (f3Var != null) {
                int measuredHeight = f3Var.getMeasuredHeight();
                f3 f3Var2 = this.container;
                f3Var.invalidate(0, measuredHeight - f3Var2.f17711w, f3Var2.getMeasuredWidth(), this.container.getMeasuredHeight());
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

    public void setCurrentPanTranslationY(float f7) {
        this.currentPanTranslationY = f7;
        this.container.invalidate();
    }

    public void setCustomView(View view) {
        this.customView = view;
    }

    public void setDelegate(b3 b3Var) {
        this.delegate = b3Var;
    }

    public h3 setDimBehind(boolean z10) {
        this.dimBehind = z10;
        return this;
    }

    public void setDimBehindAlpha(int i10) {
        this.dimBehindAlpha = i10;
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
        float f7;
        float f10 = this.hideSystemVerticalInsetsProgress;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        ValueAnimator duration = ValueAnimator.ofFloat(f10, f7).setDuration(180L);
        duration.setInterpolator(wr.f28819f);
        duration.addUpdateListener(new r2(this, 5));
        duration.start();
    }

    public void setImageReceiverNumLevel(int i10, int i11) {
        this.playingImagesLayerNum = i10;
        this.openedLayerNum = i11;
    }

    public void setItemColor(int i10, int i11, int i12) {
        if (i10 >= 0 && i10 < this.itemViews.size()) {
            a3 a3Var = this.itemViews.get(i10);
            a3Var.f17537a.setTextColor(i11);
            a3Var.f17538b.setColorFilter(new PorterDuffColorFilter(i12, PorterDuff.Mode.MULTIPLY));
        }
    }

    public void setItemText(int i10, CharSequence charSequence) {
        if (i10 >= 0 && i10 < this.itemViews.size()) {
            this.itemViews.get(i10).f17537a.setText(charSequence);
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
            setOnHideListener(new t1(runnable, 1));
        }
    }

    public void setOnHideListener(DialogInterface.OnDismissListener onDismissListener) {
        this.onHideListener = onDismissListener;
    }

    public void setOpenNoDelay(boolean z10) {
        this.openNoDelay = z10;
    }

    public void setOverlayNavBarColor(int i10) {
        this.overlayDrawNavBarColor = i10;
        f3 f3Var = this.container;
        if (f3Var != null) {
            f3Var.invalidate();
        }
        boolean z10 = false;
        if (this.attachedFragment != null) {
            LaunchActivity.G1.H(true, true, true);
            View windowView = getWindowView();
            if (AndroidUtilities.computePerceivedBrightness(getNavigationBarColor(getThemedColor(j6.f17872a7))) >= 0.721f) {
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

    public void setTitleColor(int i10) {
        TextView textView = this.titleView;
        if (textView == null) {
            return;
        }
        textView.setTextColor(i10);
    }

    public void setUseLightStatusBar(boolean z10) {
        int i10;
        this.useLightStatusBar = z10;
        if (Build.VERSION.SDK_INT >= 23) {
            int w02 = j6.w0(null, j6.f18201s8, true);
            int systemUiVisibility = this.container.getSystemUiVisibility();
            if (this.useLightStatusBar && w02 == -1) {
                i10 = systemUiVisibility | 8192;
            } else {
                i10 = systemUiVisibility & (-8193);
            }
            this.container.setSystemUiVisibility(i10);
        }
        if (this.attachedFragment != null) {
            LaunchActivity.G1.H(true, true, true);
        }
    }

    public boolean shouldOverlayCameraViewOverNavBar() {
        return false;
    }

    @Override
    public void show() {
        long j3;
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
        int i10 = 0;
        this.dismissed = false;
        cancelSheetAnimation();
        this.containerView.measure(View.MeasureSpec.makeMeasureSpec((this.backgroundPaddingLeft * 2) + AndroidUtilities.displaySize.x, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.y, Integer.MIN_VALUE));
        if (this.showWithoutAnimation) {
            g3 g3Var = this.backDrawable;
            if (this.dimBehind) {
                i10 = this.dimBehindAlpha;
            }
            g3Var.setAlpha(i10);
            this.containerView.setTranslationY(0.0f);
            onContainerViewTranslation();
            return;
        }
        this.backDrawable.setAlpha(0);
        this.layoutCount = 2;
        ViewGroup viewGroup = this.containerView;
        float measuredHeight = ((1.0f - this.hideSystemVerticalInsetsProgress) * AndroidUtilities.statusBarHeight) + viewGroup.getMeasuredHeight();
        if (this.scrollNavBar) {
            i10 = Math.max(0, Math.min(AndroidUtilities.navigationBarHeight, getBottomInset()));
        }
        viewGroup.setTranslationY(measuredHeight + i10);
        onContainerViewTranslation();
        if (this.openNoDelay) {
            j3 = 0;
        } else {
            j3 = 150;
        }
        if (this.waitingKeyboard) {
            j3 = 500;
        }
        x2 x2Var = new x2(this, 0);
        this.startAnimationRunnable = x2Var;
        AndroidUtilities.runOnUIThread(x2Var, j3);
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

    public h3(Context context, boolean z10) {
        this(1, context, (f6) null, z10);
    }

    public void fixNavigationBar(int i10) {
        this.drawNavigationBar = !this.occupyNavigationBar;
        this.drawDoubleNavigationBar = true;
        this.scrollNavBar = true;
        this.navBarColorKey = -1;
        this.navBarColor = i10;
        setOverlayNavBarColor(i10);
    }

    @Override
    public void setOnDismissListener(DialogInterface.OnDismissListener onDismissListener) {
        super.setOnDismissListener(onDismissListener);
    }

    public void setTitle(CharSequence charSequence, boolean z10) {
        this.title = charSequence;
        this.bigTitle = z10;
    }

    public h3(int i10, Context context, f6 f6Var, boolean z10) {
        super(context, R.style.TransparentDialog);
        this.currentAccount = UserConfig.selectedAccount;
        this.useHardwareLayer = true;
        this.backDrawable = new g3();
        this.useLightStatusBar = true;
        int i11 = j6.f17998h5;
        this.behindKeyboardColorKey = i11;
        this.canDismissWithSwipe = true;
        this.canDismissWithTouchOutside = true;
        this.allowCustomAnimation = true;
        this.statusBarHeight = AndroidUtilities.statusBarHeight;
        this.openDuration = 400;
        this.openInterpolator = wr.h;
        this.focusableSoftInputMode = 16;
        this.dimBehind = true;
        this.dimBehindAlpha = 51;
        this.allowNestedScroll = true;
        this.applyTopPadding = true;
        this.applyBottomPadding = true;
        this.itemViews = new ArrayList<>();
        this.dismissRunnable = new q2(this, 2);
        this.navigationBarAlpha = 0.0f;
        this.navBarColorKey = j6.f17872a7;
        this.pauseAllHeavyOperations = true;
        this.notificationsLocker = new AnimationNotificationsLocker();
        this.useBackgroundTopPadding = true;
        this.customViewGravity = 51;
        this.smoothContainerViewLayoutUntil = -1L;
        this.resourcesProvider = f6Var;
        if (i10 == 3) {
            AndroidUtilities.enableEdgeToEdge(getWindow());
            this.drawNavigationBar = false;
            this.doNotOverlayNavigationBar = false;
            this.drawDoubleNavigationBar = false;
        }
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 30) {
            getWindow().addFlags(-2147483392);
            if (i10 != 1) {
                this.focusableSoftInputMode = 48;
            }
        } else {
            getWindow().addFlags(-2147417856);
        }
        this.touchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
        Rect rect = new Rect();
        Drawable mutate = context.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        this.shadowDrawable = mutate;
        int themedColor = getThemedColor(i11);
        this.internalBackgroundColor = themedColor;
        mutate.setColorFilter(new PorterDuffColorFilter(themedColor, PorterDuff.Mode.MULTIPLY));
        this.shadowDrawable.getPadding(rect);
        this.backgroundPaddingLeft = rect.left;
        this.backgroundPaddingTop = rect.top;
        u2 u2Var = new u2(this, getContext());
        this.container = u2Var;
        u2Var.setClipChildren(false);
        u2Var.setClipToPadding(false);
        u2Var.setBackground(this.backDrawable);
        this.focusable = z10;
        if (i10 == 1) {
            u2Var.setFitsSystemWindows(true);
            u2Var.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() {
                @Override
                public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                    return h3.h(h3.this, windowInsets);
                }
            });
        }
        if (i12 >= 30) {
            u2Var.setSystemUiVisibility(1792);
        } else {
            u2Var.setSystemUiVisibility(1280);
        }
        this.backDrawable.setAlpha(0);
        if (i10 == 3) {
            o oVar = new o(this, 6);
            WeakHashMap weakHashMap = r0.i0.f41062a;
            r0.a0.j(u2Var, oVar);
        }
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

    public void onScrollUpBegin(float f7) {
    }

    public void onScrollUpEnd(float f7) {
    }

    public void onSwipeStarts() {
    }

    @Override
    public void setKeyboardHeightFromParent(int i10) {
    }

    public void setLastVisible(boolean z10) {
    }

    public void appendOpenAnimator(boolean z10, ArrayList<Animator> arrayList) {
    }

    public r0.l1 onApplyWindowInsetsToRoot(View view, r0.l1 l1Var) {
        return l1Var;
    }

    @Override
    public void dismiss(boolean z10) {
        dismiss();
    }

    public void onContainerLayout(int i10, int i11, int i12, int i13) {
    }
}
