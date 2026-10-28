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
import android.graphics.drawable.DrawableWrapper;
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
import java.util.HashSet;
import java.util.WeakHashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.kb1;
import org.telegram.ui.Components.wc;
import org.telegram.ui.LaunchActivity;
public class k3 extends Dialog implements n2 {
    private static final boolean AVOID_SYSTEM_CUTOUT_FULLSCREEN = false;
    public static final int f22807a = 0;
    private boolean allowCustomAnimation;
    protected boolean allowNestedScroll;
    private boolean applyBottomPadding;
    private boolean applyTopPadding;
    public r2 attachedFragment;
    protected j3 backDrawable;
    private int backgroundColorKey;
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
    public final h3 container;
    protected ViewGroup containerView;
    protected int currentAccount;
    private float currentPanTranslationY;
    protected AnimatorSet currentSheetAnimation;
    protected int currentSheetAnimationType;
    private View customView;
    protected int customViewGravity;
    protected d3 delegate;
    protected boolean dimBehind;
    protected int dimBehindAlpha;
    private boolean disableScroll;
    private Runnable dismissRunnable;
    private boolean dismissed;
    private boolean dispatchingThemeColors;
    public boolean doNotOverlayNavigationBar;
    public boolean drawDoubleNavigationBar;
    public boolean drawNavigationBar;
    private int fixedNavBarColorKey;
    private boolean focusable;
    private int focusableSoftInputMode;
    private boolean forceKeyboardOnDismiss;
    private boolean fullHeight;
    protected boolean fullWidth;
    protected final oi.q glassEngine;
    private float hideSystemVerticalInsetsProgress;
    private int internalBackgroundColor;
    protected boolean isFullscreen;
    protected boolean isPortrait;
    private int[] itemIcons;
    private ArrayList<c3> itemViews;
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
    protected u6 resourcesProvider;
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
    private PorterDuffColorFilter themedBackgroundFilter;
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
    private ag.c1 windowVisibilityManager;

    public k3(Context context, u6 u6Var, boolean z10, boolean z11) {
        this(z11 ? 2 : 1, context, u6Var, z10);
    }

    public static void access$000(k3 k3Var) {
        int themedColor;
        boolean z10;
        Drawable drawable;
        int themedColor2;
        if (k3Var.backgroundColorKey >= 0 && (drawable = k3Var.shadowDrawable) != null && k3Var.themedBackgroundFilter != null && drawable.getColorFilter() == k3Var.themedBackgroundFilter && (themedColor2 = k3Var.getThemedColor(k3Var.backgroundColorKey)) != k3Var.internalBackgroundColor) {
            Drawable drawable2 = k3Var.shadowDrawable;
            PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(themedColor2, PorterDuff.Mode.MULTIPLY);
            k3Var.themedBackgroundFilter = porterDuffColorFilter;
            drawable2.setColorFilter(porterDuffColorFilter);
            k3Var.internalBackgroundColor = themedColor2;
            h3 h3Var = k3Var.container;
            if (h3Var != null) {
                h3Var.invalidate();
            }
            ViewGroup viewGroup = k3Var.containerView;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
        int i10 = k3Var.fixedNavBarColorKey;
        if (i10 >= 0 && k3Var.navBarColorKey < 0 && k3Var.overlayDrawNavBarColor == k3Var.navBarColor && (themedColor = k3Var.getThemedColor(i10)) != k3Var.navBarColor) {
            k3Var.navBarColor = themedColor;
            k3Var.overlayDrawNavBarColor = themedColor;
            h3 h3Var2 = k3Var.container;
            if (h3Var2 != null) {
                h3Var2.invalidate();
            }
            if (AndroidUtilities.computePerceivedBrightness(themedColor) > 0.721d) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (k3Var.attachedFragment != null) {
                AndroidUtilities.setLightNavigationBar(k3Var.getWindowView(), z10);
                return;
            }
            AndroidUtilities.setNavigationBarColor((Dialog) k3Var, themedColor, false);
            AndroidUtilities.setLightNavigationBar(k3Var, z10);
        }
    }

    public static int access$1112(k3 k3Var, int i10) {
        int i11 = k3Var.bottomInset + i10;
        k3Var.bottomInset = i11;
        return i11;
    }

    public static int access$1120(k3 k3Var, int i10) {
        int i11 = k3Var.bottomInset - i10;
        k3Var.bottomInset = i11;
        return i11;
    }

    public static int access$1500(k3 k3Var) {
        WindowInsets windowInsets;
        int i10;
        int i11;
        int i12;
        if (k3Var.calcMandatoryInsets && (windowInsets = k3Var.lastInsets) != null) {
            Insets systemGestureInsets = windowInsets.getSystemGestureInsets();
            if (!k3Var.keyboardVisible && k3Var.drawNavigationBar && systemGestureInsets != null) {
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

    public static int access$1610(k3 k3Var) {
        int i10 = k3Var.layoutCount;
        k3Var.layoutCount = i10 - 1;
        return i10;
    }

    public static View access$2302(k3 k3Var, View view) {
        k3Var.customView = view;
        return view;
    }

    public static void access$2500(k3 k3Var) {
        int i10;
        long j10;
        if (!k3Var.dismissed) {
            k3Var.containerView.setVisibility(0);
            if (!k3Var.onCustomOpenAnimation()) {
                if (k3Var.useHardwareLayer) {
                    k3Var.container.setLayerType(2, null);
                }
                if (k3Var.transitionFromRight) {
                    k3Var.containerView.setTranslationX(AndroidUtilities.dp(48.0f));
                    k3Var.containerView.setAlpha(0.0f);
                    k3Var.containerView.setTranslationY(0.0f);
                } else {
                    k3Var.containerView.setTranslationY(Math.max(0, Math.min(AndroidUtilities.navigationBarHeight, k3Var.getBottomInset())) + AndroidUtilities.dp(10.0f) + k3Var.getContainerViewHeight() + k3Var.keyboardHeight);
                }
                k3Var.onContainerViewTranslation();
                k3Var.currentSheetAnimationType = 1;
                ValueAnimator valueAnimator = k3Var.navigationBarAnimation;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(k3Var.navigationBarAlpha, 1.0f);
                k3Var.navigationBarAnimation = ofFloat;
                ofFloat.addUpdateListener(new t2(k3Var, 1));
                k3Var.currentSheetAnimation = new AnimatorSet();
                ArrayList<Animator> arrayList = new ArrayList<>();
                arrayList.add(ObjectAnimator.ofFloat(k3Var.containerView, View.TRANSLATION_X, 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(k3Var.containerView, View.ALPHA, 1.0f));
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(k3Var.containerView, View.TRANSLATION_Y, 0.0f);
                ofFloat2.addUpdateListener(new t2(k3Var, 6));
                arrayList.add(ofFloat2);
                j3 j3Var = k3Var.backDrawable;
                org.telegram.ui.Components.t6 t6Var = org.telegram.ui.Components.v6.d;
                if (k3Var.dimBehind) {
                    i10 = k3Var.dimBehindAlpha;
                } else {
                    i10 = 0;
                }
                arrayList.add(ObjectAnimator.ofInt(j3Var, t6Var, i10));
                arrayList.add(k3Var.navigationBarAnimation);
                k3Var.appendOpenAnimator(true, arrayList);
                k3Var.currentSheetAnimation.playTogether(arrayList);
                if (k3Var.transitionFromRight) {
                    k3Var.currentSheetAnimation.setDuration(250L);
                    k3Var.currentSheetAnimation.setInterpolator(ds.f27530f);
                } else {
                    k3Var.currentSheetAnimation.setDuration(k3Var.openDuration);
                    k3Var.currentSheetAnimation.setInterpolator(k3Var.openInterpolator);
                }
                AnimatorSet animatorSet = k3Var.currentSheetAnimation;
                if (k3Var.waitingKeyboard) {
                    j10 = 0;
                } else {
                    j10 = 20;
                }
                animatorSet.setStartDelay(j10);
                k3Var.currentSheetAnimation.setInterpolator(k3Var.openInterpolator);
                k3Var.notificationsLocker.lock();
                k3Var.currentSheetAnimation.addListener(new a3(k3Var, 0));
                if (k3Var.pauseAllHeavyOperations) {
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
                }
                k3Var.currentSheetAnimation.start();
            }
        }
    }

    public static DialogInterface.OnClickListener access$2902(k3 k3Var, DialogInterface.OnClickListener onClickListener) {
        k3Var.onClickListener = onClickListener;
        return onClickListener;
    }

    public static CharSequence[] access$3102(k3 k3Var, CharSequence[] charSequenceArr) {
        k3Var.items = charSequenceArr;
        return charSequenceArr;
    }

    public static int[] access$3202(k3 k3Var, int[] iArr) {
        k3Var.itemIcons = iArr;
        return iArr;
    }

    public static CharSequence access$3302(k3 k3Var, CharSequence charSequence) {
        k3Var.title = charSequence;
        return charSequence;
    }

    public static boolean access$3402(k3 k3Var, boolean z10) {
        k3Var.bigTitle = z10;
        return z10;
    }

    public static Integer access$3502(k3 k3Var, Integer num) {
        k3Var.selectedPos = num;
        return num;
    }

    public static int access$3602(k3 k3Var, int i10) {
        k3Var.cellType = i10;
        return i10;
    }

    public static boolean access$3802(k3 k3Var, boolean z10) {
        k3Var.applyTopPadding = z10;
        return z10;
    }

    public static boolean access$3902(k3 k3Var, boolean z10) {
        k3Var.applyBottomPadding = z10;
        return z10;
    }

    public static Runnable access$4000(k3 k3Var) {
        return k3Var.dismissRunnable;
    }

    public static WindowInsets h(k3 k3Var, WindowInsets windowInsets) {
        k3Var.processLegacyContainerInsets(windowInsets);
        if (Build.VERSION.SDK_INT >= 30) {
            return WindowInsets.CONSUMED;
        }
        return windowInsets.consumeSystemWindowInsets();
    }

    public static void i(k3 k3Var, ValueAnimator valueAnimator) {
        int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        k3Var.setItemColor(k3Var.selectedPos.intValue(), intValue, intValue);
    }

    public static void j(k3 k3Var, ValueAnimator valueAnimator) {
        k3Var.hideSystemVerticalInsetsProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        k3Var.container.requestLayout();
        k3Var.containerView.requestLayout();
    }

    @Override
    public boolean attachedToParent() {
        h3 h3Var = this.container;
        if (h3Var != null && h3Var.isAttachedToWindow()) {
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.k3.dismiss():void");
    }

    public void dismissInternal() {
        r2 r2Var = this.attachedFragment;
        if (r2Var != null) {
            r2Var.removeSheet(this);
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
        long j10;
        if (!this.dismissed) {
            this.dismissed = true;
            cancelSheetAnimation();
            this.currentSheetAnimationType = 2;
            this.currentSheetAnimation = new AnimatorSet();
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.containerView, View.TRANSLATION_Y, Math.max(0, Math.min(AndroidUtilities.navigationBarHeight, getBottomInset())) + AndroidUtilities.dp(10.0f) + getContainerViewHeight() + this.keyboardHeight);
            ofFloat.addUpdateListener(new t2(this, 2));
            this.currentSheetAnimation.playTogether(ofFloat, ObjectAnimator.ofInt(this.backDrawable, org.telegram.ui.Components.v6.d, 0));
            AnimatorSet animatorSet = this.currentSheetAnimation;
            if (this.cellType == 4) {
                j10 = 330;
            } else {
                j10 = 180;
            }
            animatorSet.setDuration(j10);
            this.currentSheetAnimation.setInterpolator(ds.f27531g);
            this.currentSheetAnimation.addListener(new b3(this, i10, 0));
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
            this.currentSheetAnimation.start();
            if (this.cellType == 4 && this.selectedPos != null) {
                int currentTextColor = getItemViews().get(this.selectedPos.intValue()).getTextView().getCurrentTextColor();
                int currentTextColor2 = getItemViews().get(i10).getTextView().getCurrentTextColor();
                ValueAnimator ofArgb = ValueAnimator.ofArgb(currentTextColor, currentTextColor2);
                ofArgb.addUpdateListener(new t2(this, 7));
                ofArgb.setDuration(130L);
                ds dsVar = ds.f27530f;
                ofArgb.setInterpolator(dsVar);
                ofArgb.start();
                ValueAnimator ofArgb2 = ValueAnimator.ofArgb(currentTextColor2, currentTextColor);
                ofArgb2.addUpdateListener(new u2(this, i10, 0));
                ofArgb2.setDuration(130L);
                ofArgb2.setInterpolator(dsVar);
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
        fixNavigationBarKey(y6.f23300a7);
    }

    public void fixNavigationBarKey(int i10) {
        fixNavigationBar(getThemedColor(i10));
        this.fixedNavBarColorKey = i10;
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

    public wc getBulletinFactory() {
        return new wc(this.topBulletinContainer, this.resourcesProvider);
    }

    public h3 getContainer() {
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

    public ArrayList<c3> getItemViews() {
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
        return i0.a.f(f7, i10, this.navBarColor);
    }

    public u6 getResourcesProvider() {
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

    public ArrayList<h7> getThemeDescriptions() {
        return null;
    }

    public int getThemedColor(int i10) {
        return y6.w0(i10, this.resourcesProvider);
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
        r2 r2Var = this.attachedFragment;
        if (r2Var != null) {
            r2Var.addSheet(this);
            if (this.attachedFragment.getLayoutContainer() != null) {
                if (((InputMethodManager) getContext().getSystemService("input_method")).hideSoftInputFromWindow(this.attachedFragment.getLayoutContainer().getWindowToken(), 2)) {
                    AndroidUtilities.runOnUIThread(new s2(this, 1), 80L);
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
        if (this.useLightStatusBar && y6.x0(null, y6.f23637s8, true) == -1) {
            this.container.setSystemUiVisibility(this.container.getSystemUiVisibility() | 8192);
        }
        if (this.useLightNavBar && Build.VERSION.SDK_INT >= 26) {
            AndroidUtilities.setLightNavigationBar((Dialog) this, false);
        }
        if (this.containerView == null) {
            x2 x2Var = new x2(this, getContext(), 0);
            this.containerView = x2Var;
            x2Var.setBackgroundDrawable(this.shadowDrawable);
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
        this.container.addView(this.containerView, 0, kb1.i(-1, -2, 80));
        if (this.topBulletinContainer == null) {
            FrameLayout frameLayout = new FrameLayout(getContext());
            this.topBulletinContainer = frameLayout;
            h3 h3Var = this.container;
            h3Var.addView(frameLayout, h3Var.indexOfChild(this.containerView) + 1, kb1.i(-1, -2, 80));
        }
        if (this.title != null) {
            y2 y2Var = new y2(this, getContext());
            this.titleView = y2Var;
            y2Var.setText(this.title);
            if (this.bigTitle) {
                f7.V(this.titleView, y6.f23465j5, this.resourcesProvider);
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
                f7.V(this.titleView, y6.q5, this.resourcesProvider);
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
            viewGroup2.addView(textView3, kb1.g(f10, -1));
            this.titleView.setOnTouchListener(new ei.d(1));
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
                this.containerView.addView(this.customView, kb1.h(-1, -2.0f, this.customViewGravity, 0.0f, f12, 0.0f, 0.0f));
                ((ViewGroup.MarginLayoutParams) this.customView.getLayoutParams()).topMargin = AndroidUtilities.dp(f12) + (-this.backgroundPaddingTop);
            } else {
                this.containerView.addView(this.customView, kb1.h(-1, -2.0f, this.customViewGravity, 0.0f, i10, 0.0f, 0.0f));
            }
        } else if (this.items != null) {
            int i17 = 0;
            while (true) {
                CharSequence[] charSequenceArr = this.items;
                if (i17 >= charSequenceArr.length) {
                    break;
                }
                if (charSequenceArr[i17] != null) {
                    c3 c3Var = new c3(getContext(), this.cellType, this.resourcesProvider);
                    CharSequence charSequence = this.items[i17];
                    int[] iArr = this.itemIcons;
                    if (iArr != null) {
                        i11 = iArr[i17];
                    } else {
                        i11 = 0;
                    }
                    c3Var.a(charSequence, i11, null, this.bigTitle);
                    this.containerView.addView(c3Var, kb1.h(-1, 48.0f, 51, 0.0f, i10, 0.0f, 0.0f));
                    i10 += 48;
                    c3Var.setTag(Integer.valueOf(i17));
                    c3Var.setOnClickListener(new x(this, 2));
                    this.itemViews.add(c3Var);
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
            AndroidUtilities.applyEdgeToEdgeLayoutParams(attributes);
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

    public void makeAttached(r2 r2Var) {
        if (!AndroidUtilities.isTablet()) {
            if (r2Var == null || !r2Var.isSupportEdgeToEdge()) {
                this.attachedFragment = r2Var;
                j3 j3Var = this.backDrawable;
                if (j3Var != null) {
                    j3Var.f22741a.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_OVER));
                }
            }
        }
    }

    public ag.a1 obtainWindowVisibilityController() {
        if (this.windowVisibilityManager == null) {
            this.windowVisibilityManager = new ag.c1(getWindow());
        }
        ag.c1 c1Var = this.windowVisibilityManager;
        c1Var.getClass();
        return new ag.b1(c1Var, 0);
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
        h3 h3Var = this.container;
        if (h3Var != null) {
            h3Var.invalidate();
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
        h3 h3Var = this.container;
        if (h3Var != null) {
            h3Var.invalidate();
        }
    }

    @Override
    public void onStart() {
        super.onStart();
    }

    public void onThemeColorsChanged() {
        if ((this instanceof p6) && !this.dispatchingThemeColors) {
            this.dispatchingThemeColors = true;
            try {
                ((p6) this).updateColors();
            } catch (Exception e) {
                FileLog.e(e);
            } finally {
                this.dispatchingThemeColors = false;
            }
        }
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
            h3 h3Var = this.container;
            if (h3Var != null) {
                int measuredHeight = h3Var.getMeasuredHeight();
                h3 h3Var2 = this.container;
                h3Var.invalidate(0, measuredHeight - h3Var2.f22680w, h3Var2.getMeasuredWidth(), this.container.getMeasuredHeight());
            }
        }
    }

    public void setBackgroundColorKey(int i10) {
        setBackgroundColor(getThemedColor(i10));
        Drawable drawable = this.shadowDrawable;
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(this.internalBackgroundColor, PorterDuff.Mode.MULTIPLY);
        this.themedBackgroundFilter = porterDuffColorFilter;
        drawable.setColorFilter(porterDuffColorFilter);
        this.backgroundColorKey = i10;
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

    public void setDelegate(d3 d3Var) {
        this.delegate = d3Var;
    }

    public k3 setDimBehind(boolean z10) {
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
        duration.setInterpolator(ds.f27530f);
        duration.addUpdateListener(new t2(this, 5));
        duration.start();
    }

    public void setImageReceiverNumLevel(int i10, int i11) {
        this.playingImagesLayerNum = i10;
        this.openedLayerNum = i11;
    }

    public void setItemColor(int i10, int i11, int i12) {
        if (i10 >= 0 && i10 < this.itemViews.size()) {
            c3 c3Var = this.itemViews.get(i10);
            c3Var.f22499a.setTextColor(i11);
            c3Var.f22500b.setColorFilter(new PorterDuffColorFilter(i12, PorterDuff.Mode.MULTIPLY));
        }
    }

    public void setItemText(int i10, CharSequence charSequence) {
        if (i10 >= 0 && i10 < this.itemViews.size()) {
            this.itemViews.get(i10).f22499a.setText(charSequence);
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

    public void setOverlayNavBarColor(int i10) {
        this.overlayDrawNavBarColor = i10;
        h3 h3Var = this.container;
        if (h3Var != null) {
            h3Var.invalidate();
        }
        boolean z10 = false;
        if (this.attachedFragment != null) {
            LaunchActivity.I1.H(true, true, true);
            View windowView = getWindowView();
            if (AndroidUtilities.computePerceivedBrightness(getNavigationBarColor(getThemedColor(y6.f23300a7))) >= 0.721f) {
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
        int x02 = y6.x0(null, y6.f23637s8, true);
        int systemUiVisibility = this.container.getSystemUiVisibility();
        if (this.useLightStatusBar && x02 == -1) {
            i10 = systemUiVisibility | 8192;
        } else {
            i10 = systemUiVisibility & (-8193);
        }
        this.container.setSystemUiVisibility(i10);
        if (this.attachedFragment != null) {
            LaunchActivity.I1.H(true, true, true);
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
        int i10 = 0;
        this.dismissed = false;
        cancelSheetAnimation();
        this.containerView.measure(View.MeasureSpec.makeMeasureSpec((this.backgroundPaddingLeft * 2) + AndroidUtilities.displaySize.x, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.y, Integer.MIN_VALUE));
        if (this.showWithoutAnimation) {
            j3 j3Var = this.backDrawable;
            if (this.dimBehind) {
                i10 = this.dimBehindAlpha;
            }
            j3Var.setAlpha(i10);
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
            j10 = 0;
        } else {
            j10 = 150;
        }
        if (this.waitingKeyboard) {
            j10 = 500;
        }
        z2 z2Var = new z2(this, 0);
        this.startAnimationRunnable = z2Var;
        AndroidUtilities.runOnUIThread(z2Var, j10);
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

    public k3(Context context, boolean z10) {
        this(1, context, (u6) null, z10);
    }

    public void fixNavigationBar(int i10) {
        this.drawNavigationBar = !this.occupyNavigationBar;
        this.drawDoubleNavigationBar = true;
        this.scrollNavBar = true;
        this.navBarColorKey = -1;
        this.fixedNavBarColorKey = -1;
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

    public k3(int i10, Context context, u6 u6Var, boolean z10) {
        super(context, R.style.TransparentDialog);
        this.currentAccount = UserConfig.selectedAccount;
        this.useHardwareLayer = true;
        this.backDrawable = new j3();
        this.useLightStatusBar = true;
        int i11 = y6.f23428h5;
        this.behindKeyboardColorKey = i11;
        this.canDismissWithSwipe = true;
        this.canDismissWithTouchOutside = true;
        this.allowCustomAnimation = true;
        this.statusBarHeight = AndroidUtilities.statusBarHeight;
        this.openDuration = 400;
        this.openInterpolator = ds.h;
        this.focusableSoftInputMode = 16;
        this.dimBehind = true;
        this.dimBehindAlpha = 51;
        this.allowNestedScroll = true;
        this.applyTopPadding = true;
        this.applyBottomPadding = true;
        this.itemViews = new ArrayList<>();
        this.dismissRunnable = new s2(this, 2);
        this.navigationBarAlpha = 0.0f;
        this.navBarColorKey = y6.f23300a7;
        this.pauseAllHeavyOperations = true;
        this.notificationsLocker = new AnimationNotificationsLocker();
        this.useBackgroundTopPadding = true;
        this.customViewGravity = 51;
        this.glassEngine = new oi.q();
        this.fixedNavBarColorKey = -1;
        this.backgroundColorKey = i11;
        this.smoothContainerViewLayoutUntil = -1L;
        this.resourcesProvider = u6Var;
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
        DrawableWrapper drawableWrapper = new DrawableWrapper(context.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate());
        this.shadowDrawable = drawableWrapper;
        int themedColor = getThemedColor(i11);
        this.internalBackgroundColor = themedColor;
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(themedColor, PorterDuff.Mode.MULTIPLY);
        this.themedBackgroundFilter = porterDuffColorFilter;
        drawableWrapper.setColorFilter(porterDuffColorFilter);
        this.shadowDrawable.getPadding(rect);
        this.backgroundPaddingLeft = rect.left;
        this.backgroundPaddingTop = rect.top;
        w2 w2Var = new w2(this, getContext());
        this.container = w2Var;
        w2Var.setClipChildren(false);
        w2Var.setClipToPadding(false);
        w2Var.setBackground(this.backDrawable);
        this.focusable = z10;
        if (i10 == 1) {
            w2Var.setFitsSystemWindows(true);
            w2Var.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() {
                @Override
                public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                    return k3.h(k3.this, windowInsets);
                }
            });
        }
        if (i12 >= 30) {
            w2Var.setSystemUiVisibility(1792);
        } else {
            w2Var.setSystemUiVisibility(1280);
        }
        this.backDrawable.setAlpha(0);
        if (i10 == 3) {
            p pVar = new p(this, 5);
            WeakHashMap weakHashMap = r0.i0.f47143a;
            r0.a0.i(w2Var, pVar);
        }
    }

    public void onContainerViewTranslation() {
    }

    public void onDismissAnimationStart() {
    }

    public void onInsetsChanged() {
    }

    public void onOpenAnimationEnd() {
    }

    public void onSwipeStarts() {
    }

    public void addThemeColorKeys(HashSet<Integer> hashSet) {
    }

    public void mainContainerDispatchDraw(Canvas canvas) {
    }

    public void onConfigurationChanged(Configuration configuration) {
    }

    public void onContainerDraw(Canvas canvas) {
    }

    public void onScrollUpBegin(float f7) {
    }

    public void onScrollUpEnd(float f7) {
    }

    @Override
    public void setKeyboardHeightFromParent(int i10) {
    }

    public void setLastVisible(boolean z10) {
    }

    public void appendOpenAnimator(boolean z10, ArrayList<Animator> arrayList) {
    }

    public r0.k1 onApplyWindowInsetsToRoot(View view, r0.k1 k1Var) {
        return k1Var;
    }

    @Override
    public void dismiss(boolean z10) {
        dismiss();
    }

    public void onContainerLayout(int i10, int i11, int i12, int i13) {
    }
}
