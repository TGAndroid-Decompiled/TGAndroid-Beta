package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Insets;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Property;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.Interpolator;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.graphics.ColorUtils;
import androidx.core.view.NestedScrollingParentHelper;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.camera.CameraView;
import org.telegram.messenger.utils.WindowVisibilityManager;
import org.telegram.ui.Components.AnimatedEmojiSpan;
import org.telegram.ui.Components.AnimationProperties;
import org.telegram.ui.Components.Bulletin;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.LaunchActivity;

public class BottomSheet extends Dialog implements BaseFragment.AttachedSheet {
    private static final boolean AVOID_SYSTEM_CUTOUT_FULLSCREEN = false;
    private boolean allowCustomAnimation;
    protected boolean allowNestedScroll;
    private boolean applyBottomPadding;
    private boolean applyTopPadding;
    public BaseFragment attachedFragment;
    protected SheetBackDrawable backDrawable;
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
    public ContainerView container;
    protected ViewGroup containerView;
    protected int currentAccount;
    private float currentPanTranslationY;
    protected AnimatorSet currentSheetAnimation;
    protected int currentSheetAnimationType;
    private View customView;
    protected int customViewGravity;
    protected BottomSheetDelegateInterface delegate;
    protected boolean dimBehind;
    protected int dimBehindAlpha;
    private boolean disableScroll;
    private Runnable dismissRunnable;
    private boolean dismissed;
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
    private ArrayList<BottomSheetCell> itemViews;
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
    protected Theme.ResourcesProvider resourcesProvider;
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
    private WindowVisibilityManager windowVisibilityManager;

    public static class BottomSheetDelegate implements BottomSheetDelegateInterface {
        @Override
        public boolean canDismiss() {
            return true;
        }

        @Override
        public void onOpenAnimationEnd() {
        }
    }

    public interface BottomSheetDelegateInterface {
        boolean canDismiss();

        void onOpenAnimationEnd();
    }

    public static boolean $r8$lambda$Gd4n5DMvY6tsqBn0MFClxifpt3E(View view, MotionEvent motionEvent) {
        return true;
    }

    protected void appendOpenAnimator(boolean z, ArrayList<Animator> arrayList) {
    }

    protected boolean canSwipeToBack(MotionEvent motionEvent) {
        return false;
    }

    protected int getTargetOpenTranslationY() {
        return 0;
    }

    public ArrayList<ThemeDescription> getThemeDescriptions() {
        return null;
    }

    @Override
    public boolean isFullyVisible() {
        return false;
    }

    protected void mainContainerDispatchDraw(Canvas canvas) {
    }

    public void onConfigurationChanged(Configuration configuration) {
    }

    public void onContainerDraw(Canvas canvas) {
    }

    protected void onContainerLayout(int i, int i2, int i3, int i4) {
    }

    protected boolean onContainerTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    public void onContainerViewTranslation() {
    }

    protected boolean onCustomCloseAnimation() {
        return false;
    }

    protected boolean onCustomLayout(View view, int i, int i2, int i3, int i4) {
        return false;
    }

    protected boolean onCustomMeasure(View view, int i, int i2) {
        return false;
    }

    protected boolean onCustomOpenAnimation() {
        return false;
    }

    public void onDismissAnimationStart() {
    }

    protected void onInsetsChanged() {
    }

    public void onOpenAnimationEnd() {
    }

    protected boolean onScrollUp(float f) {
        return false;
    }

    protected void onScrollUpBegin(float f) {
    }

    protected void onScrollUpEnd(float f) {
    }

    protected void onSwipeStarts() {
    }

    @Override
    public void setKeyboardHeightFromParent(int i) {
    }

    public void setLastVisible(boolean z) {
        BaseFragment.AttachedSheet.CC.$default$setLastVisible(this, z);
    }

    protected boolean shouldOverlayCameraViewOverNavBar() {
        return false;
    }

    @Override
    public boolean showDialog(Dialog dialog) {
        return false;
    }

    static int access$1012(BottomSheet bottomSheet, int i) {
        int i2 = bottomSheet.bottomInset + i;
        bottomSheet.bottomInset = i2;
        return i2;
    }

    static int access$1020(BottomSheet bottomSheet, int i) {
        int i2 = bottomSheet.bottomInset - i;
        bottomSheet.bottomInset = i2;
        return i2;
    }

    static int access$1510(BottomSheet bottomSheet) {
        int i = bottomSheet.layoutCount;
        bottomSheet.layoutCount = i - 1;
        return i;
    }

    public static class SheetBackDrawable extends Drawable {
        private final Paint bgPaint;
        public final Rect boundsWithInsets;
        public final Rect insets;

        @Override
        public int getOpacity() {
            return 0;
        }

        public SheetBackDrawable() {
            Paint paint = new Paint(1);
            this.bgPaint = paint;
            this.insets = new Rect();
            this.boundsWithInsets = new Rect();
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
            paint.setColor(-16777216);
        }

        public void setBackgroundInsets(int i, int i2, int i3, int i4) {
            Rect rect = this.insets;
            if (rect.left == i && rect.top == i2 && rect.right == i3 && rect.bottom == i4) {
                return;
            }
            rect.set(i, i2, i3, i4);
            onBoundsChange(getBounds());
            invalidateSelf();
        }

        @Override
        protected void onBoundsChange(Rect rect) {
            super.onBoundsChange(rect);
            this.boundsWithInsets.set(rect);
            this.boundsWithInsets.left += Math.max(0, this.insets.left);
            this.boundsWithInsets.top += Math.max(0, this.insets.top);
            this.boundsWithInsets.right -= Math.max(0, this.insets.right);
            this.boundsWithInsets.bottom -= Math.max(0, this.insets.bottom);
        }

        @Override
        public void draw(Canvas canvas) {
            if (this.boundsWithInsets.isEmpty() || getAlpha() == 0 || AndroidUtilities.makingGlobalBlurBitmap) {
                return;
            }
            canvas.drawRect(this.boundsWithInsets, this.bgPaint);
        }

        @Override
        public void setAlpha(int i) {
            this.bgPaint.setAlpha(i);
            invalidateSelf();
        }

        @Override
        public int getAlpha() {
            return this.bgPaint.getAlpha();
        }

        @Override
        public void setColorFilter(ColorFilter colorFilter) {
            this.bgPaint.setColorFilter(colorFilter);
        }
    }

    public void skipDismissAnimation() {
        this.skipDismissAnimation = true;
    }

    public void setDisableScroll(boolean z) {
        this.disableScroll = z;
    }

    public void transitionFromRight(boolean z) {
        this.transitionFromRight = z;
    }

    public class ContainerView extends FrameLayout {
        private boolean allowedSwipeToBack;
        private Paint backgroundPaint;
        private AnimatorSet currentAnimation;
        private final Paint internalBackgroundPaint;
        private int internalPaddingBottom;
        private boolean keyboardChanged;
        private boolean maybeStartTracking;
        private NestedScrollingParentHelper nestedScrollingParentHelper;
        private Rect rect;
        private boolean startedTracking;
        private int startedTrackingPointerId;
        private int startedTrackingX;
        private int startedTrackingY;
        private float swipeBackX;
        private VelocityTracker velocityTracker;
        private float y;

        @Override
        public boolean hasOverlappingRendering() {
            return false;
        }

        @Override
        public boolean onNestedFling(View view, float f, float f2, boolean z) {
            return false;
        }

        @Override
        public boolean onNestedPreFling(View view, float f, float f2) {
            return false;
        }

        public ContainerView(Context context) {
            super(context);
            this.velocityTracker = null;
            this.startedTrackingPointerId = -1;
            this.maybeStartTracking = false;
            this.startedTracking = false;
            this.currentAnimation = null;
            this.rect = new Rect();
            this.backgroundPaint = new Paint();
            this.y = 0.0f;
            this.swipeBackX = 0.0f;
            this.internalBackgroundPaint = new Paint(1);
            this.nestedScrollingParentHelper = new NestedScrollingParentHelper(this);
            setWillNotDraw(false);
        }

        @Override
        public boolean onStartNestedScroll(View view, View view2, int i) {
            BottomSheet bottomSheet = BottomSheet.this;
            View view3 = bottomSheet.nestedScrollChild;
            if ((view3 != null && view != view3) || bottomSheet.dismissed) {
                return false;
            }
            BottomSheet bottomSheet2 = BottomSheet.this;
            return bottomSheet2.allowNestedScroll && i == 2 && !bottomSheet2.canDismissWithSwipe();
        }

        @Override
        public void onNestedScrollAccepted(View view, View view2, int i) {
            this.nestedScrollingParentHelper.onNestedScrollAccepted(view, view2, i);
            if (BottomSheet.this.dismissed || !BottomSheet.this.allowNestedScroll) {
                return;
            }
            cancelCurrentAnimation();
        }

        @Override
        public void onStopNestedScroll(View view) {
            this.nestedScrollingParentHelper.onStopNestedScroll(view);
            if (BottomSheet.this.dismissed || !BottomSheet.this.allowNestedScroll) {
                return;
            }
            checkDismiss(0.0f, 0.0f);
        }

        @Override
        public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
            if (BottomSheet.this.dismissed || !BottomSheet.this.allowNestedScroll) {
                return;
            }
            cancelCurrentAnimation();
            if (i4 != 0) {
                float translationY = BottomSheet.this.containerView.getTranslationY() - i4;
                if (translationY < 0.0f) {
                    translationY = 0.0f;
                }
                BottomSheet.this.containerView.setTranslationY(translationY);
                BottomSheet.this.onContainerViewTranslation();
                BottomSheet.this.container.invalidate();
            }
        }

        @Override
        public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
            if (BottomSheet.this.dismissed || !BottomSheet.this.allowNestedScroll) {
                return;
            }
            cancelCurrentAnimation();
            float translationY = BottomSheet.this.containerView.getTranslationY();
            if (translationY <= 0.0f || i2 <= 0) {
                return;
            }
            float f = translationY - i2;
            iArr[1] = i2;
            BottomSheet.this.containerView.setTranslationY(f >= 0.0f ? f : 0.0f);
            BottomSheet.this.onContainerViewTranslation();
            BottomSheet.this.container.invalidate();
        }

        @Override
        public int getNestedScrollAxes() {
            return this.nestedScrollingParentHelper.getNestedScrollAxes();
        }

        private void checkDismiss(float f, float f2) {
            float translationY = BottomSheet.this.containerView.getTranslationY();
            if ((translationY >= AndroidUtilities.getPixelsInCM(0.8f, false) || (f2 >= 3500.0f && Math.abs(f2) >= Math.abs(f))) && (f2 >= 0.0f || Math.abs(f2) < 3500.0f)) {
                boolean z = BottomSheet.this.allowCustomAnimation;
                BottomSheet.this.allowCustomAnimation = false;
                BottomSheet.this.useFastDismiss = true;
                BottomSheet.this.dismiss();
                BottomSheet.this.allowCustomAnimation = z;
                return;
            }
            this.maybeStartTracking = false;
            this.currentAnimation = new AnimatorSet();
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    BottomSheet.ContainerView.$r8$lambda$hgcpvNZ8OEoN6lzYksY76P3Wotw(this.f$0, valueAnimator);
                }
            });
            this.currentAnimation.playTogether(ObjectAnimator.ofFloat(BottomSheet.this.containerView, "translationY", 0.0f), valueAnimatorOfFloat);
            this.currentAnimation.setDuration((int) ((Math.max(0.0f, translationY) / AndroidUtilities.getPixelsInCM(0.8f, false)) * 250.0f));
            this.currentAnimation.setInterpolator(CubicBezierInterpolator.DEFAULT);
            this.currentAnimation.addListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationEnd(Animator animator) {
                    if (ContainerView.this.currentAnimation != null && ContainerView.this.currentAnimation.equals(animator)) {
                        ContainerView.this.currentAnimation = null;
                    }
                    NotificationCenter.getGlobalInstance().postNotificationName(NotificationCenter.startAllHeavyOperations, 512);
                }
            });
            NotificationCenter.getGlobalInstance().postNotificationName(NotificationCenter.stopAllHeavyOperations, 512);
            this.currentAnimation.start();
        }

        public static void $r8$lambda$hgcpvNZ8OEoN6lzYksY76P3Wotw(ContainerView containerView, ValueAnimator valueAnimator) {
            ContainerView containerView2 = BottomSheet.this.container;
            if (containerView2 != null) {
                containerView2.invalidate();
            }
            BottomSheet.this.onContainerViewTranslation();
        }

        private void cancelCurrentAnimation() {
            AnimatorSet animatorSet = this.currentAnimation;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.currentAnimation = null;
            }
            BottomSheet.this.onSwipeStarts();
        }

        public boolean processTouchEvent(MotionEvent motionEvent, boolean z) {
            if (BottomSheet.this.dismissed) {
                return false;
            }
            if (BottomSheet.this.onContainerTouchEvent(motionEvent)) {
                return true;
            }
            if (BottomSheet.this.canSwipeToBack(motionEvent) || this.allowedSwipeToBack) {
                if (motionEvent != null && ((motionEvent.getAction() == 0 || motionEvent.getAction() == 2) && !this.startedTracking && !this.maybeStartTracking && motionEvent.getPointerCount() == 1)) {
                    this.allowedSwipeToBack = true;
                    this.startedTrackingX = (int) motionEvent.getX();
                    this.startedTrackingY = (int) motionEvent.getY();
                    this.startedTrackingPointerId = motionEvent.getPointerId(0);
                    this.maybeStartTracking = true;
                    cancelCurrentAnimation();
                } else if (motionEvent != null && motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.startedTrackingPointerId) {
                    float x = motionEvent.getX() - this.startedTrackingX;
                    float y = motionEvent.getY() - this.startedTrackingY;
                    if (this.velocityTracker == null) {
                        this.velocityTracker = VelocityTracker.obtain();
                    }
                    this.velocityTracker.addMovement(motionEvent);
                    if (!BottomSheet.this.disableScroll && this.maybeStartTracking && !this.startedTracking && x > 0.0f && x / 3.0f > Math.abs(y) && Math.abs(x) >= BottomSheet.this.touchSlop) {
                        this.startedTrackingX = (int) motionEvent.getX();
                        this.maybeStartTracking = false;
                        this.startedTracking = true;
                    } else if (this.startedTracking) {
                        float f = this.swipeBackX + x;
                        this.swipeBackX = f;
                        BottomSheet.this.containerView.setTranslationX(Math.max(f, 0.0f));
                        this.startedTrackingX = (int) motionEvent.getX();
                        BottomSheet.this.container.invalidate();
                    }
                } else if (motionEvent == null || (motionEvent.getPointerId(0) == this.startedTrackingPointerId && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6))) {
                    if (this.velocityTracker == null) {
                        this.velocityTracker = VelocityTracker.obtain();
                    }
                    float xVelocity = this.velocityTracker.getXVelocity();
                    float yVelocity = this.velocityTracker.getYVelocity();
                    if (this.swipeBackX < BottomSheet.this.containerView.getMeasuredWidth() / 3.0f && (xVelocity < 3500.0f || xVelocity < yVelocity)) {
                        float fMax = Math.max(this.swipeBackX, 0.0f);
                        this.swipeBackX = fMax;
                        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fMax, 0.0f);
                        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                            @Override
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                BottomSheet.ContainerView.$r8$lambda$L8IYIDy62kswbRVHFwCNUreD2wc(this.f$0, valueAnimator);
                            }
                        });
                        valueAnimatorOfFloat.addListener(new AnimatorListenerAdapter() {
                            @Override
                            public void onAnimationEnd(Animator animator) {
                                ContainerView.this.swipeBackX = 0.0f;
                                BottomSheet.this.containerView.setTranslationX(0.0f);
                                BottomSheet.this.container.invalidate();
                            }
                        });
                        valueAnimatorOfFloat.setInterpolator(CubicBezierInterpolator.DEFAULT);
                        valueAnimatorOfFloat.setDuration(220L);
                        valueAnimatorOfFloat.start();
                    } else {
                        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(this.swipeBackX, getMeasuredWidth());
                        valueAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                            @Override
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                BottomSheet.ContainerView.m1255$r8$lambda$KqhjO90P3O32rWZXuKGonWpjUM(this.f$0, valueAnimator);
                            }
                        });
                        valueAnimatorOfFloat2.addListener(new AnimatorListenerAdapter() {
                            @Override
                            public void onAnimationEnd(Animator animator) {
                                BottomSheet.this.skipDismissAnimation = true;
                                ContainerView containerView = ContainerView.this;
                                BottomSheet.this.containerView.setTranslationX(containerView.getMeasuredWidth());
                                BottomSheet.this.dismiss();
                                BottomSheet.this.container.invalidate();
                            }
                        });
                        CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
                        valueAnimatorOfFloat2.setInterpolator(cubicBezierInterpolator);
                        valueAnimatorOfFloat2.setDuration(320L);
                        valueAnimatorOfFloat2.start();
                        ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(1.0f, 0.0f);
                        valueAnimatorOfFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                            @Override
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                BottomSheet.ContainerView.$r8$lambda$urQ85CXWwpkXPtzMgUYl0f81ank(this.f$0, valueAnimator);
                            }
                        });
                        valueAnimatorOfFloat3.setInterpolator(cubicBezierInterpolator);
                        valueAnimatorOfFloat3.setDuration(320L);
                        valueAnimatorOfFloat3.start();
                    }
                    this.maybeStartTracking = false;
                    this.startedTracking = false;
                    this.startedTrackingPointerId = -1;
                    this.allowedSwipeToBack = false;
                }
            } else if (BottomSheet.this.canDismissWithTouchOutside() && motionEvent != null && ((motionEvent.getAction() == 0 || motionEvent.getAction() == 2) && !this.startedTracking && !this.maybeStartTracking && motionEvent.getPointerCount() == 1)) {
                this.startedTrackingX = (int) motionEvent.getX();
                int y2 = (int) motionEvent.getY();
                this.startedTrackingY = y2;
                if (BottomSheet.this.isTouchOutside(this.startedTrackingX, y2)) {
                    BottomSheet.this.onDismissWithTouchOutside();
                    return true;
                }
                BottomSheet.this.onScrollUpBegin(this.y);
                this.startedTrackingPointerId = motionEvent.getPointerId(0);
                this.maybeStartTracking = true;
                cancelCurrentAnimation();
                VelocityTracker velocityTracker = this.velocityTracker;
                if (velocityTracker != null) {
                    velocityTracker.clear();
                }
            } else if (BottomSheet.this.canDismissWithSwipe() && motionEvent != null && motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.startedTrackingPointerId) {
                if (this.velocityTracker == null) {
                    this.velocityTracker = VelocityTracker.obtain();
                }
                float fAbs = Math.abs((int) (motionEvent.getX() - this.startedTrackingX));
                float y3 = ((int) motionEvent.getY()) - this.startedTrackingY;
                boolean zOnScrollUp = BottomSheet.this.onScrollUp(this.y + y3);
                this.velocityTracker.addMovement(motionEvent);
                if (!BottomSheet.this.disableScroll && this.maybeStartTracking && !this.startedTracking && y3 > 0.0f && y3 / 3.0f > Math.abs(fAbs) && Math.abs(y3) >= BottomSheet.this.touchSlop) {
                    this.startedTrackingY = (int) motionEvent.getY();
                    this.maybeStartTracking = false;
                    this.startedTracking = true;
                    requestDisallowInterceptTouchEvent(true);
                } else if (this.startedTracking) {
                    float f2 = this.y + y3;
                    this.y = f2;
                    if (!zOnScrollUp) {
                        this.y = Math.max(f2, 0.0f);
                    }
                    BottomSheet.this.containerView.setTranslationY(Math.max(this.y, 0.0f));
                    BottomSheet.this.onContainerViewTranslation();
                    this.startedTrackingY = (int) motionEvent.getY();
                    BottomSheet.this.container.invalidate();
                }
            } else if (motionEvent == null || (motionEvent.getPointerId(0) == this.startedTrackingPointerId && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6))) {
                if (this.velocityTracker == null) {
                    this.velocityTracker = VelocityTracker.obtain();
                }
                this.velocityTracker.computeCurrentVelocity(1000);
                BottomSheet.this.onScrollUpEnd(this.y);
                if (this.startedTracking || this.y > 0.0f) {
                    checkDismiss(this.velocityTracker.getXVelocity(), this.velocityTracker.getYVelocity());
                } else {
                    this.maybeStartTracking = false;
                }
                this.startedTracking = false;
                VelocityTracker velocityTracker2 = this.velocityTracker;
                if (velocityTracker2 != null) {
                    velocityTracker2.recycle();
                    this.velocityTracker = null;
                }
                this.startedTrackingPointerId = -1;
            }
            return (!z && this.maybeStartTracking) || this.startedTracking || !(BottomSheet.this.canDismissWithSwipe() || BottomSheet.this.canSwipeToBack(motionEvent));
        }

        public static void $r8$lambda$L8IYIDy62kswbRVHFwCNUreD2wc(ContainerView containerView, ValueAnimator valueAnimator) {
            containerView.getClass();
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            containerView.swipeBackX = fFloatValue;
            BottomSheet.this.containerView.setTranslationX(fFloatValue);
            BottomSheet.this.container.invalidate();
        }

        public static void m1255$r8$lambda$KqhjO90P3O32rWZXuKGonWpjUM(ContainerView containerView, ValueAnimator valueAnimator) {
            containerView.getClass();
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            containerView.swipeBackX = fFloatValue;
            BottomSheet.this.containerView.setTranslationX(fFloatValue);
            BottomSheet.this.container.invalidate();
        }

        public static void $r8$lambda$urQ85CXWwpkXPtzMgUYl0f81ank(ContainerView containerView, ValueAnimator valueAnimator) {
            containerView.getClass();
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            BottomSheet bottomSheet = BottomSheet.this;
            bottomSheet.backDrawable.setAlpha(bottomSheet.dimBehind ? (int) (bottomSheet.dimBehindAlpha * fFloatValue) : 0);
        }

        @Override
        public boolean onTouchEvent(MotionEvent motionEvent) {
            return processTouchEvent(motionEvent, false);
        }

        @Override
        protected void onMeasure(int i, int i2) {
            int bottomInset;
            int iMakeMeasureSpec;
            int size = View.MeasureSpec.getSize(i);
            int size2 = View.MeasureSpec.getSize(i2);
            View rootView = getRootView();
            getWindowVisibleDisplayFrame(this.rect);
            BottomSheet bottomSheet = BottomSheet.this;
            int i3 = bottomSheet.keyboardHeight;
            Rect rect = this.rect;
            if (rect.bottom != 0 && rect.top != 0) {
                int height = (int) ((rootView.getHeight() - (this.rect.top != 0 ? AndroidUtilities.statusBarHeight * (1.0f - BottomSheet.this.hideSystemVerticalInsetsProgress) : 0.0f)) - (AndroidUtilities.getViewInset(rootView) * (1.0f - BottomSheet.this.hideSystemVerticalInsetsProgress)));
                BottomSheet bottomSheet2 = BottomSheet.this;
                Rect rect2 = this.rect;
                bottomSheet2.keyboardHeight = Math.max(0, height - (rect2.bottom - rect2.top));
                if (BottomSheet.this.keyboardHeight < AndroidUtilities.dp(20.0f)) {
                    BottomSheet.this.keyboardHeight = 0;
                } else {
                    BottomSheet bottomSheet3 = BottomSheet.this;
                    bottomSheet3.lastKeyboardHeight = bottomSheet3.keyboardHeight;
                }
                BottomSheet bottomSheet4 = BottomSheet.this;
                BottomSheet.access$1020(bottomSheet4, bottomSheet4.keyboardHeight);
            } else {
                bottomSheet.keyboardHeight = 0;
            }
            BottomSheet bottomSheet5 = BottomSheet.this;
            int i4 = bottomSheet5.keyboardHeight;
            if (i3 != i4) {
                this.keyboardChanged = true;
            }
            bottomSheet5.keyboardVisible = i4 > AndroidUtilities.dp(20.0f);
            if (BottomSheet.this.lastInsets != null) {
                BottomSheet bottomSheet6 = BottomSheet.this;
                bottomSheet6.bottomInset = bottomSheet6.lastInsets.getSystemWindowInsetBottom();
                BottomSheet bottomSheet7 = BottomSheet.this;
                bottomSheet7.leftInset = bottomSheet7.lastInsets.getSystemWindowInsetLeft();
                BottomSheet bottomSheet8 = BottomSheet.this;
                bottomSheet8.rightInset = bottomSheet8.lastInsets.getSystemWindowInsetRight();
                if (Build.VERSION.SDK_INT >= 29) {
                    BottomSheet bottomSheet9 = BottomSheet.this;
                    BottomSheet.access$1012(bottomSheet9, bottomSheet9.getAdditionalMandatoryOffsets());
                }
                BottomSheet bottomSheet10 = BottomSheet.this;
                if (bottomSheet10.keyboardVisible) {
                    Rect rect3 = this.rect;
                    if (rect3.bottom != 0 && rect3.top != 0) {
                        BottomSheet.access$1020(bottomSheet10, bottomSheet10.keyboardHeight);
                    }
                }
                BottomSheet bottomSheet11 = BottomSheet.this;
                if (bottomSheet11.drawNavigationBar || bottomSheet11.occupyNavigationBar || bottomSheet11.occupyNavigationBarWithoutKeyboard) {
                    bottomInset = size2;
                } else {
                    bottomInset = size2 - bottomSheet11.getBottomInset();
                }
            } else {
                bottomInset = size2;
            }
            this.internalPaddingBottom = size2 - bottomInset;
            setMeasuredDimension(size, size2);
            BottomSheet bottomSheet12 = BottomSheet.this;
            bottomSheet12.navigationBarHeight = 0;
            if (bottomSheet12.lastInsets != null) {
                BottomSheet bottomSheet13 = BottomSheet.this;
                if (!bottomSheet13.occupyNavigationBar) {
                    int systemWindowInsetBottom = (int) (bottomSheet13.lastInsets.getSystemWindowInsetBottom() * (1.0f - BottomSheet.this.hideSystemVerticalInsetsProgress));
                    if (Build.VERSION.SDK_INT >= 29) {
                        systemWindowInsetBottom += BottomSheet.this.getAdditionalMandatoryOffsets();
                    }
                    if (!BottomSheet.this.occupyNavigationBarWithoutKeyboard || systemWindowInsetBottom > AndroidUtilities.navigationBarHeight + AndroidUtilities.dp(10.0f)) {
                        size2 -= systemWindowInsetBottom;
                    }
                    BottomSheet.this.navigationBarHeight = Math.min(systemWindowInsetBottom, AndroidUtilities.navigationBarHeight);
                }
            }
            int i5 = size2;
            if (BottomSheet.this.lastInsets != null) {
                size -= BottomSheet.this.getRightInset() + BottomSheet.this.getLeftInset();
            }
            int i6 = size;
            BottomSheet bottomSheet14 = BottomSheet.this;
            bottomSheet14.isPortrait = i6 < i5;
            ViewGroup viewGroup = bottomSheet14.containerView;
            if (viewGroup != null) {
                if (!bottomSheet14.fullWidth) {
                    if (AndroidUtilities.isTablet()) {
                        float fDp = AndroidUtilities.dp(500.0f);
                        Point point = AndroidUtilities.displaySize;
                        iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(((int) Math.min(fDp, Math.min(point.x, point.y) * 0.8f)) + (BottomSheet.this.backgroundPaddingLeft * 2), 1073741824);
                    } else {
                        BottomSheet bottomSheet15 = BottomSheet.this;
                        iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(bottomSheet15.getBottomSheetWidth(bottomSheet15.isPortrait, i6, i5) + (BottomSheet.this.backgroundPaddingLeft * 2), 1073741824);
                    }
                    BottomSheet.this.containerView.measure(iMakeMeasureSpec, View.MeasureSpec.makeMeasureSpec(i5, Integer.MIN_VALUE));
                } else {
                    viewGroup.measure(View.MeasureSpec.makeMeasureSpec((bottomSheet14.backgroundPaddingLeft * 2) + i6, 1073741824), View.MeasureSpec.makeMeasureSpec(i5, Integer.MIN_VALUE));
                }
            }
            int childCount = getChildCount();
            for (int i7 = 0; i7 < childCount; i7++) {
                View childAt = getChildAt(i7);
                if (childAt.getVisibility() != 8) {
                    BottomSheet bottomSheet16 = BottomSheet.this;
                    if (childAt != bottomSheet16.containerView && !bottomSheet16.onCustomMeasure(childAt, i6, i5)) {
                        measureChildWithMargins(childAt, View.MeasureSpec.makeMeasureSpec(i6, 1073741824), 0, View.MeasureSpec.makeMeasureSpec(i5, 1073741824), 0);
                    }
                }
            }
        }

        @Override
        protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
            BottomSheet bottomSheet;
            Runnable runnable;
            int i5;
            int i6;
            int leftInset;
            int i7;
            int i8;
            int i9;
            BottomSheet bottomSheet2;
            ViewGroup viewGroup;
            int top;
            ValueAnimator valueAnimator;
            int leftInset2 = i;
            int i10 = i2;
            int rightInset = i3;
            int i11 = i4 - this.internalPaddingBottom;
            BottomSheet.this.onContainerLayout(leftInset2, i10, rightInset, i11);
            BottomSheet.access$1510(BottomSheet.this);
            ViewGroup viewGroup2 = BottomSheet.this.containerView;
            if (viewGroup2 != null) {
                int measuredHeight = (i11 - i10) - viewGroup2.getMeasuredHeight();
                if (BottomSheet.this.lastInsets != null) {
                    leftInset2 += BottomSheet.this.getLeftInset();
                    rightInset -= BottomSheet.this.getRightInset();
                    BottomSheet bottomSheet3 = BottomSheet.this;
                    if (bottomSheet3.useSmoothKeyboard) {
                        measuredHeight = 0;
                    } else if (!bottomSheet3.occupyNavigationBar) {
                        float f = measuredHeight;
                        float systemWindowInsetBottom = bottomSheet3.lastInsets.getSystemWindowInsetBottom() * (1.0f - BottomSheet.this.hideSystemVerticalInsetsProgress);
                        BottomSheet bottomSheet4 = BottomSheet.this;
                        measuredHeight = (int) (f - (systemWindowInsetBottom - (bottomSheet4.drawNavigationBar ? 0 : bottomSheet4.getBottomInset())));
                        if (Build.VERSION.SDK_INT >= 29) {
                            measuredHeight -= BottomSheet.this.getAdditionalMandatoryOffsets();
                        }
                    }
                }
                int measuredWidth = ((rightInset - leftInset2) - BottomSheet.this.containerView.getMeasuredWidth()) / 2;
                if (BottomSheet.this.lastInsets != null) {
                    measuredWidth += BottomSheet.this.getLeftInset();
                }
                BottomSheet bottomSheet5 = BottomSheet.this;
                if (bottomSheet5.smoothKeyboardAnimationEnabled && bottomSheet5.startAnimationRunnable == null && this.keyboardChanged && !bottomSheet5.dismissed) {
                    BottomSheet bottomSheet6 = BottomSheet.this;
                    boolean z2 = bottomSheet6.smoothKeyboardByBottom;
                    ViewGroup viewGroup3 = bottomSheet6.containerView;
                    if (!z2 ? viewGroup3.getTop() == measuredHeight : viewGroup3.getBottom() == BottomSheet.this.containerView.getMeasuredHeight() + measuredHeight) {
                        bottomSheet2 = BottomSheet.this;
                        viewGroup = bottomSheet2.containerView;
                        if (bottomSheet2.smoothKeyboardByBottom) {
                            top = viewGroup.getBottom() - (BottomSheet.this.containerView.getMeasuredHeight() + measuredHeight);
                        } else {
                            top = viewGroup.getTop() - measuredHeight;
                        }
                        viewGroup.setTranslationY(top);
                        BottomSheet.this.onContainerViewTranslation();
                        BottomSheet bottomSheet7 = BottomSheet.this;
                        bottomSheet7.onSmoothContainerViewLayout(bottomSheet7.containerView.getTranslationY());
                        valueAnimator = BottomSheet.this.keyboardContentAnimator;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                        }
                        BottomSheet bottomSheet8 = BottomSheet.this;
                        bottomSheet8.keyboardContentAnimator = ValueAnimator.ofFloat(bottomSheet8.containerView.getTranslationY(), 0.0f);
                        BottomSheet.this.keyboardContentAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                            @Override
                            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                                BottomSheet.ContainerView.m1256$r8$lambda$lIJgYclHsQx_nyKhuA73QZZUnM(this.f$0, valueAnimator2);
                            }
                        });
                        BottomSheet.this.keyboardContentAnimator.addListener(new AnimatorListenerAdapter() {
                            @Override
                            public void onAnimationEnd(Animator animator) {
                                BottomSheet.this.containerView.setTranslationY(0.0f);
                                BottomSheet.this.onContainerViewTranslation();
                                BottomSheet bottomSheet9 = BottomSheet.this;
                                bottomSheet9.onSmoothContainerViewLayout(bottomSheet9.containerView.getTranslationY());
                                ContainerView.this.invalidate();
                            }
                        });
                        BottomSheet.this.keyboardContentAnimator.setDuration(250L).setInterpolator(AdjustPanLayoutHelper.keyboardInterpolator);
                        BottomSheet.this.keyboardContentAnimator.start();
                        BottomSheet.this.smoothContainerViewLayoutUntil = -1L;
                    } else if (BottomSheet.this.smoothContainerViewLayoutUntil > 0) {
                        bottomSheet2 = BottomSheet.this;
                        viewGroup = bottomSheet2.containerView;
                        if (bottomSheet2.smoothKeyboardByBottom) {
                            top = viewGroup.getBottom() - (BottomSheet.this.containerView.getMeasuredHeight() + measuredHeight);
                        } else {
                            top = viewGroup.getTop() - measuredHeight;
                        }
                        viewGroup.setTranslationY(top);
                        BottomSheet.this.onContainerViewTranslation();
                        BottomSheet bottomSheet9 = BottomSheet.this;
                        bottomSheet9.onSmoothContainerViewLayout(bottomSheet9.containerView.getTranslationY());
                        valueAnimator = BottomSheet.this.keyboardContentAnimator;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                        }
                        BottomSheet bottomSheet10 = BottomSheet.this;
                        bottomSheet10.keyboardContentAnimator = ValueAnimator.ofFloat(bottomSheet10.containerView.getTranslationY(), 0.0f);
                        BottomSheet.this.keyboardContentAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                            @Override
                            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                                BottomSheet.ContainerView.m1256$r8$lambda$lIJgYclHsQx_nyKhuA73QZZUnM(this.f$0, valueAnimator2);
                            }
                        });
                        BottomSheet.this.keyboardContentAnimator.addListener(new AnimatorListenerAdapter() {
                            @Override
                            public void onAnimationEnd(Animator animator) {
                                BottomSheet.this.containerView.setTranslationY(0.0f);
                                BottomSheet.this.onContainerViewTranslation();
                                BottomSheet bottomSheet11 = BottomSheet.this;
                                bottomSheet11.onSmoothContainerViewLayout(bottomSheet11.containerView.getTranslationY());
                                ContainerView.this.invalidate();
                            }
                        });
                        BottomSheet.this.keyboardContentAnimator.setDuration(250L).setInterpolator(AdjustPanLayoutHelper.keyboardInterpolator);
                        BottomSheet.this.keyboardContentAnimator.start();
                        BottomSheet.this.smoothContainerViewLayoutUntil = -1L;
                    }
                } else if (BottomSheet.this.smoothContainerViewLayoutUntil > 0 && System.currentTimeMillis() < BottomSheet.this.smoothContainerViewLayoutUntil) {
                    bottomSheet2 = BottomSheet.this;
                    viewGroup = bottomSheet2.containerView;
                    if (bottomSheet2.smoothKeyboardByBottom) {
                        top = viewGroup.getBottom() - (BottomSheet.this.containerView.getMeasuredHeight() + measuredHeight);
                    } else {
                        top = viewGroup.getTop() - measuredHeight;
                    }
                    viewGroup.setTranslationY(top);
                    BottomSheet.this.onContainerViewTranslation();
                    BottomSheet bottomSheet11 = BottomSheet.this;
                    bottomSheet11.onSmoothContainerViewLayout(bottomSheet11.containerView.getTranslationY());
                    valueAnimator = BottomSheet.this.keyboardContentAnimator;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    BottomSheet bottomSheet12 = BottomSheet.this;
                    bottomSheet12.keyboardContentAnimator = ValueAnimator.ofFloat(bottomSheet12.containerView.getTranslationY(), 0.0f);
                    BottomSheet.this.keyboardContentAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                            BottomSheet.ContainerView.m1256$r8$lambda$lIJgYclHsQx_nyKhuA73QZZUnM(this.f$0, valueAnimator2);
                        }
                    });
                    BottomSheet.this.keyboardContentAnimator.addListener(new AnimatorListenerAdapter() {
                        @Override
                        public void onAnimationEnd(Animator animator) {
                            BottomSheet.this.containerView.setTranslationY(0.0f);
                            BottomSheet.this.onContainerViewTranslation();
                            BottomSheet bottomSheet13 = BottomSheet.this;
                            bottomSheet13.onSmoothContainerViewLayout(bottomSheet13.containerView.getTranslationY());
                            ContainerView.this.invalidate();
                        }
                    });
                    BottomSheet.this.keyboardContentAnimator.setDuration(250L).setInterpolator(AdjustPanLayoutHelper.keyboardInterpolator);
                    BottomSheet.this.keyboardContentAnimator.start();
                    BottomSheet.this.smoothContainerViewLayoutUntil = -1L;
                }
                ViewGroup viewGroup4 = BottomSheet.this.containerView;
                viewGroup4.layout(measuredWidth, measuredHeight, viewGroup4.getMeasuredWidth() + measuredWidth, BottomSheet.this.containerView.getMeasuredHeight() + measuredHeight);
            }
            int i12 = leftInset2;
            int i13 = rightInset;
            int childCount = getChildCount();
            int i14 = 0;
            while (i14 < childCount) {
                View childAt = getChildAt(i14);
                if (childAt.getVisibility() != 8) {
                    BottomSheet bottomSheet13 = BottomSheet.this;
                    if (childAt != bottomSheet13.containerView) {
                        if (!bottomSheet13.onCustomLayout(childAt, i12, i10, i13, i11 - (bottomSheet13.drawNavigationBar ? bottomSheet13.getBottomInset() : 0))) {
                            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                            int measuredWidth2 = childAt.getMeasuredWidth();
                            int measuredHeight2 = childAt.getMeasuredHeight();
                            int i15 = layoutParams.gravity;
                            if (i15 == -1) {
                                i15 = 51;
                            }
                            int i16 = i15 & 112;
                            int i17 = i15 & 7;
                            if (i17 != 1) {
                                if (i17 == 5) {
                                    i5 = i13 - measuredWidth2;
                                    i6 = layoutParams.rightMargin;
                                } else {
                                    leftInset = layoutParams.leftMargin;
                                }
                                if (i16 != 16) {
                                    if (i16 != 80) {
                                        i7 = (i11 - i2) - measuredHeight2;
                                        i8 = layoutParams.bottomMargin;
                                    } else {
                                        i9 = layoutParams.topMargin;
                                    }
                                    if (BottomSheet.this.lastInsets != null) {
                                        leftInset += BottomSheet.this.getLeftInset();
                                    }
                                    childAt.layout(leftInset, i9, measuredWidth2 + leftInset, measuredHeight2 + i9);
                                } else {
                                    i7 = (((i11 - i2) - measuredHeight2) / 2) + layoutParams.topMargin;
                                    i8 = layoutParams.bottomMargin;
                                }
                                i9 = i7 - i8;
                                if (BottomSheet.this.lastInsets != null) {
                                    leftInset += BottomSheet.this.getLeftInset();
                                }
                                childAt.layout(leftInset, i9, measuredWidth2 + leftInset, measuredHeight2 + i9);
                            } else {
                                i5 = (((i13 - i12) - measuredWidth2) / 2) + layoutParams.leftMargin;
                                i6 = layoutParams.rightMargin;
                            }
                            leftInset = i5 - i6;
                            if (i16 != 16) {
                                if (i16 != 80) {
                                    i7 = (i11 - i2) - measuredHeight2;
                                    i8 = layoutParams.bottomMargin;
                                } else {
                                    i9 = layoutParams.topMargin;
                                }
                                if (BottomSheet.this.lastInsets != null) {
                                    leftInset += BottomSheet.this.getLeftInset();
                                }
                                childAt.layout(leftInset, i9, measuredWidth2 + leftInset, measuredHeight2 + i9);
                            } else {
                                i7 = (((i11 - i2) - measuredHeight2) / 2) + layoutParams.topMargin;
                                i8 = layoutParams.bottomMargin;
                            }
                            i9 = i7 - i8;
                            if (BottomSheet.this.lastInsets != null) {
                                leftInset += BottomSheet.this.getLeftInset();
                            }
                            childAt.layout(leftInset, i9, measuredWidth2 + leftInset, measuredHeight2 + i9);
                        }
                    }
                }
                i14++;
                i10 = i2;
            }
            if (BottomSheet.this.layoutCount == 0 && (runnable = (bottomSheet = BottomSheet.this).startAnimationRunnable) != null && !bottomSheet.waitingKeyboard) {
                AndroidUtilities.cancelRunOnUIThread(runnable);
                BottomSheet.this.startAnimationRunnable.run();
                BottomSheet.this.startAnimationRunnable = null;
            }
            BottomSheet bottomSheet14 = BottomSheet.this;
            if (bottomSheet14.waitingKeyboard && bottomSheet14.keyboardVisible) {
                Runnable runnable2 = bottomSheet14.startAnimationRunnable;
                if (runnable2 != null) {
                    AndroidUtilities.cancelRunOnUIThread(runnable2);
                    BottomSheet.this.startAnimationRunnable.run();
                }
                BottomSheet.this.waitingKeyboard = false;
            }
            this.keyboardChanged = false;
        }

        public static void m1256$r8$lambda$lIJgYclHsQx_nyKhuA73QZZUnM(ContainerView containerView, ValueAnimator valueAnimator) {
            BottomSheet.this.containerView.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
            BottomSheet.this.onContainerViewTranslation();
            BottomSheet bottomSheet = BottomSheet.this;
            bottomSheet.onSmoothContainerViewLayout(bottomSheet.containerView.getTranslationY());
            containerView.invalidate();
        }

        @Override
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (BottomSheet.this.canDismissWithSwipe() || BottomSheet.this.canSwipeToBack(motionEvent)) {
                return processTouchEvent(motionEvent, true);
            }
            return super.onInterceptTouchEvent(motionEvent);
        }

        @Override
        public void requestDisallowInterceptTouchEvent(boolean z) {
            if (this.maybeStartTracking && !this.startedTracking) {
                onTouchEvent(null);
            }
            super.requestDisallowInterceptTouchEvent(z);
        }

        @Override
        protected void dispatchDraw(Canvas canvas) {
            BottomSheet bottomSheet = BottomSheet.this;
            if (bottomSheet.containerView != null && this.internalPaddingBottom > 0) {
                this.internalBackgroundPaint.setColor(bottomSheet.internalBackgroundColor);
                canvas.drawRect(0.0f, ((getMeasuredHeight() - this.internalPaddingBottom) + BottomSheet.this.containerView.getTranslationY()) - 1.0f, getMeasuredWidth(), getMeasuredHeight() + BottomSheet.this.containerView.getTranslationY(), this.internalBackgroundPaint);
            }
            int i = Build.VERSION.SDK_INT;
            if (i >= 26) {
                BottomSheet bottomSheet2 = BottomSheet.this;
                int i2 = bottomSheet2.navBarColorKey;
                if (i2 >= 0) {
                    this.backgroundPaint.setColor(bottomSheet2.getThemedColor(i2));
                } else {
                    this.backgroundPaint.setColor(bottomSheet2.navBarColor);
                }
            } else {
                this.backgroundPaint.setColor(-16777216);
            }
            BottomSheet bottomSheet3 = BottomSheet.this;
            if (bottomSheet3.drawDoubleNavigationBar && !bottomSheet3.shouldOverlayCameraViewOverNavBar()) {
                drawNavigationBar(canvas, 1.0f);
            }
            if (this.backgroundPaint.getAlpha() < 255) {
                BottomSheet bottomSheet4 = BottomSheet.this;
                if (bottomSheet4.drawNavigationBar) {
                    float fMax = 0.0f;
                    if (bottomSheet4.scrollNavBar || (i >= 29 && bottomSheet4.getAdditionalMandatoryOffsets() > 0)) {
                        fMax = Math.max(0.0f, BottomSheet.this.getBottomInset() - (BottomSheet.this.containerView.getMeasuredHeight() - BottomSheet.this.containerView.getTranslationY()));
                    }
                    BottomSheet bottomSheet5 = BottomSheet.this;
                    int bottomInset = bottomSheet5.drawNavigationBar ? bottomSheet5.getBottomInset() : 0;
                    canvas.save();
                    canvas.clipRect(BottomSheet.this.containerView.getLeft() + BottomSheet.this.backgroundPaddingLeft, ((getMeasuredHeight() - bottomInset) + fMax) - BottomSheet.this.currentPanTranslationY, BottomSheet.this.containerView.getRight() - BottomSheet.this.backgroundPaddingLeft, fMax + getMeasuredHeight(), Region.Op.DIFFERENCE);
                    super.dispatchDraw(canvas);
                    canvas.restore();
                } else {
                    super.dispatchDraw(canvas);
                }
            } else {
                super.dispatchDraw(canvas);
            }
            if (!BottomSheet.this.shouldOverlayCameraViewOverNavBar()) {
                BottomSheet bottomSheet6 = BottomSheet.this;
                drawNavigationBar(canvas, bottomSheet6.drawDoubleNavigationBar ? bottomSheet6.navigationBarAlpha * 0.7f : 1.0f);
            }
            BottomSheet bottomSheet7 = BottomSheet.this;
            if (bottomSheet7.drawNavigationBar && bottomSheet7.rightInset != 0 && BottomSheet.this.rightInset > BottomSheet.this.leftInset) {
                BottomSheet bottomSheet8 = BottomSheet.this;
                if (bottomSheet8.fullWidth) {
                    Point point = AndroidUtilities.displaySize;
                    if (point.x > point.y) {
                        int right = bottomSheet8.containerView.getRight();
                        BottomSheet bottomSheet9 = BottomSheet.this;
                        canvas.drawRect(right - bottomSheet9.backgroundPaddingLeft, bottomSheet9.containerView.getTranslationY(), BottomSheet.this.containerView.getRight() + BottomSheet.this.rightInset, getMeasuredHeight(), this.backgroundPaint);
                    }
                }
            }
            BottomSheet bottomSheet10 = BottomSheet.this;
            if (bottomSheet10.drawNavigationBar && bottomSheet10.leftInset != 0 && BottomSheet.this.leftInset > BottomSheet.this.rightInset) {
                BottomSheet bottomSheet11 = BottomSheet.this;
                if (bottomSheet11.fullWidth) {
                    Point point2 = AndroidUtilities.displaySize;
                    if (point2.x > point2.y) {
                        canvas.drawRect(0.0f, bottomSheet11.containerView.getTranslationY(), BottomSheet.this.containerView.getLeft() + BottomSheet.this.backgroundPaddingLeft, getMeasuredHeight(), this.backgroundPaint);
                    }
                }
            }
            if (BottomSheet.this.containerView.getY() + BottomSheet.this.containerView.getMeasuredHeight() < getMeasuredHeight()) {
                Paint paint = this.backgroundPaint;
                BottomSheet bottomSheet12 = BottomSheet.this;
                int i3 = bottomSheet12.behindKeyboardColorKey;
                paint.setColor(i3 >= 0 ? bottomSheet12.getThemedColor(i3) : bottomSheet12.behindKeyboardColor);
                int left = BottomSheet.this.containerView.getLeft();
                BottomSheet bottomSheet13 = BottomSheet.this;
                canvas.drawRect(left + bottomSheet13.backgroundPaddingLeft, BottomSheet.this.containerView.getMeasuredHeight() + bottomSheet13.containerView.getY(), BottomSheet.this.containerView.getRight() - BottomSheet.this.backgroundPaddingLeft, getMeasuredHeight(), this.backgroundPaint);
            }
        }

        @Override
        protected boolean drawChild(Canvas canvas, View view, long j) {
            if (view instanceof CameraView) {
                if (BottomSheet.this.shouldOverlayCameraViewOverNavBar()) {
                    drawNavigationBar(canvas, 1.0f);
                }
                return super.drawChild(canvas, view, j);
            }
            return super.drawChild(canvas, view, j);
        }

        @Override
        protected void onDraw(Canvas canvas) {
            boolean z;
            if (this.backgroundPaint.getAlpha() < 255) {
                BottomSheet bottomSheet = BottomSheet.this;
                if (bottomSheet.drawNavigationBar) {
                    float fMax = 0.0f;
                    if (bottomSheet.scrollNavBar || (Build.VERSION.SDK_INT >= 29 && bottomSheet.getAdditionalMandatoryOffsets() > 0)) {
                        fMax = Math.max(0.0f, BottomSheet.this.getBottomInset() - (BottomSheet.this.containerView.getMeasuredHeight() - BottomSheet.this.containerView.getTranslationY()));
                    }
                    BottomSheet bottomSheet2 = BottomSheet.this;
                    int bottomInset = bottomSheet2.drawNavigationBar ? bottomSheet2.getBottomInset() : 0;
                    canvas.save();
                    canvas.clipRect(BottomSheet.this.containerView.getLeft() + BottomSheet.this.backgroundPaddingLeft, ((getMeasuredHeight() - bottomInset) + fMax) - BottomSheet.this.currentPanTranslationY, BottomSheet.this.containerView.getRight() - BottomSheet.this.backgroundPaddingLeft, getMeasuredHeight() + fMax, Region.Op.DIFFERENCE);
                    z = true;
                } else {
                    z = false;
                }
            } else {
                z = false;
            }
            super.onDraw(canvas);
            BottomSheet bottomSheet3 = BottomSheet.this;
            if (bottomSheet3.drawNavigationBar && bottomSheet3.lastInsets != null) {
                BottomSheet bottomSheet4 = BottomSheet.this;
                if (bottomSheet4.keyboardHeight != 0) {
                    Paint paint = this.backgroundPaint;
                    int i = bottomSheet4.behindKeyboardColorKey;
                    paint.setColor(i >= 0 ? bottomSheet4.getThemedColor(i) : bottomSheet4.behindKeyboardColor);
                    float left = BottomSheet.this.containerView.getLeft() + BottomSheet.this.backgroundPaddingLeft;
                    int measuredHeight = getMeasuredHeight();
                    BottomSheet bottomSheet5 = BottomSheet.this;
                    float bottomInset2 = (measuredHeight - bottomSheet5.keyboardHeight) - (bottomSheet5.drawNavigationBar ? bottomSheet5.getBottomInset() : 0);
                    float right = BottomSheet.this.containerView.getRight() - BottomSheet.this.backgroundPaddingLeft;
                    int measuredHeight2 = getMeasuredHeight();
                    BottomSheet bottomSheet6 = BottomSheet.this;
                    canvas.drawRect(left, bottomInset2, right, measuredHeight2 - (bottomSheet6.drawNavigationBar ? bottomSheet6.getBottomInset() : 0), this.backgroundPaint);
                }
            }
            BottomSheet.this.onContainerDraw(canvas);
            if (z) {
                canvas.restore();
            }
        }

        public void drawNavigationBar(Canvas canvas, float f) {
            float fMax;
            int i = Build.VERSION.SDK_INT;
            if (i >= 26) {
                BottomSheet bottomSheet = BottomSheet.this;
                int i2 = bottomSheet.navBarColorKey;
                if (i2 >= 0) {
                    this.backgroundPaint.setColor(bottomSheet.getThemedColor(i2));
                } else {
                    this.backgroundPaint.setColor(bottomSheet.navBarColor);
                }
            } else {
                this.backgroundPaint.setColor(-16777216);
            }
            if (!BottomSheet.this.transitionFromRight || BottomSheet.this.containerView.getVisibility() == 0) {
                BottomSheet bottomSheet2 = BottomSheet.this;
                float f2 = 0.0f;
                if ((!bottomSheet2.drawNavigationBar || bottomSheet2.bottomInset == 0) && BottomSheet.this.currentPanTranslationY == 0.0f) {
                    return;
                }
                BottomSheet bottomSheet3 = BottomSheet.this;
                int bottomInset = bottomSheet3.drawNavigationBar ? bottomSheet3.getBottomInset() : 0;
                BottomSheet bottomSheet4 = BottomSheet.this;
                if (bottomSheet4.scrollNavBar || (i >= 29 && bottomSheet4.getAdditionalMandatoryOffsets() > 0)) {
                    BottomSheet bottomSheet5 = BottomSheet.this;
                    if (bottomSheet5.drawDoubleNavigationBar) {
                        fMax = Math.max(0.0f, Math.min(bottomInset - bottomSheet5.currentPanTranslationY, BottomSheet.this.containerView.getTranslationY()));
                    } else {
                        fMax = Math.max(0.0f, BottomSheet.this.getBottomInset() - (bottomSheet5.containerView.getMeasuredHeight() - BottomSheet.this.containerView.getTranslationY()));
                    }
                } else {
                    fMax = 0.0f;
                }
                int alpha = this.backgroundPaint.getAlpha();
                float alpha2 = BottomSheet.this.transitionFromRight ? BottomSheet.this.containerView.getAlpha() * f : f;
                int x = BottomSheet.this.transitionFromRight ? (int) BottomSheet.this.containerView.getX() : BottomSheet.this.containerView.getLeft();
                if (alpha2 < 1.0f) {
                    this.backgroundPaint.setAlpha((int) (alpha * alpha2));
                }
                canvas.drawRect(BottomSheet.this.backgroundPaddingLeft + x, ((getMeasuredHeight() - bottomInset) + fMax) - BottomSheet.this.currentPanTranslationY, BottomSheet.this.containerView.getRight() - BottomSheet.this.backgroundPaddingLeft, getMeasuredHeight() + fMax, this.backgroundPaint);
                this.backgroundPaint.setAlpha(alpha);
                if (BottomSheet.this.overlayDrawNavBarColor != 0) {
                    this.backgroundPaint.setColor(BottomSheet.this.overlayDrawNavBarColor);
                    int alpha3 = this.backgroundPaint.getAlpha();
                    float navigationBarThirdButtonsFactor = AndroidUtilities.getNavigationBarThirdButtonsFactor(bottomInset);
                    if (alpha2 < 1.0f) {
                        this.backgroundPaint.setAlpha((int) (alpha3 * alpha2 * navigationBarThirdButtonsFactor));
                    } else {
                        f2 = fMax;
                    }
                    if (this.backgroundPaint.getAlpha() > 0) {
                        canvas.drawRect(x + BottomSheet.this.backgroundPaddingLeft, ((getMeasuredHeight() - bottomInset) + f2) - BottomSheet.this.currentPanTranslationY, BottomSheet.this.containerView.getRight() - BottomSheet.this.backgroundPaddingLeft, getMeasuredHeight() + f2, this.backgroundPaint);
                    }
                    this.backgroundPaint.setAlpha(alpha3);
                }
            }
        }
    }

    protected int getBottomSheetWidth(boolean z, int i, int i2) {
        return z ? i : (int) Math.max(i * 0.8f, Math.min(AndroidUtilities.dp(480.0f), i));
    }

    public void setHideSystemVerticalInsets(boolean z) {
        ValueAnimator duration = ValueAnimator.ofFloat(this.hideSystemVerticalInsetsProgress, z ? 1.0f : 0.0f).setDuration(180L);
        duration.setInterpolator(CubicBezierInterpolator.DEFAULT);
        duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                BottomSheet.$r8$lambda$lXO_9TUbhRj9aJNUL4xjQ5QnDzw(this.f$0, valueAnimator);
            }
        });
        duration.start();
    }

    public static void $r8$lambda$lXO_9TUbhRj9aJNUL4xjQ5QnDzw(BottomSheet bottomSheet, ValueAnimator valueAnimator) {
        bottomSheet.getClass();
        bottomSheet.hideSystemVerticalInsetsProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        bottomSheet.container.requestLayout();
        bottomSheet.containerView.requestLayout();
    }

    public int getAdditionalMandatoryOffsets() {
        WindowInsets windowInsets;
        if (this.calcMandatoryInsets && (windowInsets = this.lastInsets) != null) {
            Insets systemGestureInsets = windowInsets.getSystemGestureInsets();
            if (!this.keyboardVisible && this.drawNavigationBar && systemGestureInsets != null && (systemGestureInsets.left != 0 || systemGestureInsets.right != 0)) {
                return systemGestureInsets.bottom;
            }
        }
        return 0;
    }

    public boolean isKeyboardVisible() {
        return this.keyboardVisible;
    }

    public int getSystemBottomInset() {
        WindowInsets windowInsets = this.lastInsets;
        if (windowInsets != null) {
            return windowInsets.getSystemWindowInsetBottom();
        }
        return 0;
    }

    public void setCalcMandatoryInsets(boolean z) {
        this.calcMandatoryInsets = z;
        this.drawNavigationBar = z;
    }

    public static class BottomSheetCell extends FrameLayout {
        private boolean checked;
        int currentType;
        private ImageView imageView;
        private ImageView imageView2;
        public boolean isSelected;
        private final Theme.ResourcesProvider resourcesProvider;
        private AnimatedEmojiSpan.TextViewEmojis textView;

        public BottomSheetCell(Context context, int i) {
            this(context, i, null);
        }

        public BottomSheetCell(Context context, int i, Theme.ResourcesProvider resourcesProvider) {
            super(context);
            this.isSelected = false;
            this.resourcesProvider = resourcesProvider;
            this.currentType = i;
            if (i != Builder.CELL_TYPE_CALL) {
                setBackgroundDrawable(Theme.getSelectorDrawable(false, resourcesProvider));
            }
            ImageView imageView = new ImageView(context);
            this.imageView = imageView;
            ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
            imageView.setScaleType(scaleType);
            this.imageView.setColorFilter(new PorterDuffColorFilter(getThemedColor(Theme.key_dialogIcon), PorterDuff.Mode.MULTIPLY));
            addView(this.imageView, LayoutHelper.createFrame(56, 48, (LocaleController.isRTL ? 5 : 3) | 16));
            ImageView imageView2 = new ImageView(context);
            this.imageView2 = imageView2;
            imageView2.setScaleType(scaleType);
            this.imageView2.setColorFilter(new PorterDuffColorFilter(Theme.getColor(Theme.key_radioBackgroundChecked, resourcesProvider), PorterDuff.Mode.SRC_IN));
            addView(this.imageView2, LayoutHelper.createFrame(56, 48, (LocaleController.isRTL ? 3 : 5) | 16));
            AnimatedEmojiSpan.TextViewEmojis textViewEmojis = new AnimatedEmojiSpan.TextViewEmojis(context);
            this.textView = textViewEmojis;
            textViewEmojis.setLines(1);
            this.textView.setSingleLine(true);
            this.textView.setGravity(1);
            this.textView.setEllipsize(TextUtils.TruncateAt.END);
            if (i == 0 || i == Builder.CELL_TYPE_CALL) {
                this.textView.setTextColor(getThemedColor(Theme.key_dialogTextBlack));
                this.textView.setTextSize(1, 16.0f);
                addView(this.textView, LayoutHelper.createFrame(-2, -2, (LocaleController.isRTL ? 5 : 3) | 16));
                return;
            }
            if (i == 1) {
                this.textView.setGravity(17);
                this.textView.setTextColor(getThemedColor(Theme.key_dialogTextBlack));
                this.textView.setTextSize(1, 14.0f);
                this.textView.setTypeface(AndroidUtilities.bold());
                addView(this.textView, LayoutHelper.createFrame(-1, -1.0f));
                return;
            }
            if (i == 2) {
                this.textView.setGravity(17);
                this.textView.setTextColor(getThemedColor(Theme.key_featuredStickers_buttonText));
                this.textView.setTextSize(1, 14.0f);
                this.textView.setTypeface(AndroidUtilities.bold());
                this.textView.setBackground(Theme.AdaptiveRipple.filledRect(getThemedColor(Theme.key_featuredStickers_addButton), 6.0f));
                addView(this.textView, LayoutHelper.createFrame(-1, -1.0f, 0, 16.0f, 16.0f, 16.0f, 16.0f));
            }
        }

        @Override
        protected void onMeasure(int i, int i2) {
            int i3 = this.currentType;
            int i4 = i3 == 2 ? 80 : 48;
            if (i3 == 0) {
                i = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824);
            }
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(i4), 1073741824));
        }

        public void setTextColor(int i) {
            this.textView.setTextColor(i);
        }

        public void setIconColor(int i) {
            this.imageView.setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.MULTIPLY));
        }

        public void setGravity(int i) {
            this.textView.setGravity(i);
        }

        public void setTextAndIcon(CharSequence charSequence, int i) {
            setTextAndIcon(charSequence, i, null, false);
        }

        public void setTextAndIcon(CharSequence charSequence, Drawable drawable) {
            setTextAndIcon(charSequence, 0, drawable, false);
        }

        public void setTextAndIcon(CharSequence charSequence, int i, Drawable drawable, boolean z) {
            this.textView.setText(charSequence);
            if (i != 0 || drawable != null) {
                if (drawable != null) {
                    this.imageView.setImageDrawable(drawable);
                } else {
                    this.imageView.setImageResource(i);
                }
                this.imageView.setVisibility(0);
                if (z) {
                    this.textView.setPadding(AndroidUtilities.dp(LocaleController.isRTL ? 21.0f : 72.0f), 0, AndroidUtilities.dp(LocaleController.isRTL ? 72.0f : 21.0f), 0);
                    this.imageView.setPadding(LocaleController.isRTL ? 0 : AndroidUtilities.dp(5.0f), 0, LocaleController.isRTL ? AndroidUtilities.dp(5.0f) : 5, 0);
                    return;
                } else {
                    this.textView.setPadding(AndroidUtilities.dp(LocaleController.isRTL ? 16.0f : 72.0f), 0, AndroidUtilities.dp(LocaleController.isRTL ? 72.0f : 16.0f), 0);
                    this.imageView.setPadding(0, 0, 0, 0);
                    return;
                }
            }
            this.imageView.setVisibility(4);
            this.textView.setPadding(AndroidUtilities.dp(z ? 21.0f : 16.0f), 0, AndroidUtilities.dp(z ? 21.0f : 16.0f), 0);
        }

        public void setChecked(boolean z) {
            ImageView imageView = this.imageView2;
            this.checked = z;
            imageView.setImageResource(z ? R.drawable.checkbig : 0);
        }

        public boolean isChecked() {
            return this.checked;
        }

        public AnimatedEmojiSpan.TextViewEmojis getTextView() {
            return this.textView;
        }

        public ImageView getImageView() {
            return this.imageView;
        }

        protected int getThemedColor(int i) {
            return Theme.getColor(i, this.resourcesProvider);
        }

        @Override
        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            if (this.isSelected) {
                accessibilityNodeInfo.setSelected(true);
            }
        }
    }

    public void setAllowNestedScroll(boolean z) {
        this.allowNestedScroll = z;
        if (z) {
            return;
        }
        this.containerView.setTranslationY(0.0f);
        onContainerViewTranslation();
    }

    public BottomSheet(Context context, boolean z) {
        this(context, z, null);
    }

    public BottomSheet(Context context, boolean z, Theme.ResourcesProvider resourcesProvider) {
        this(context, z, false, resourcesProvider);
    }

    public BottomSheet(Context context, boolean z, boolean z2, Theme.ResourcesProvider resourcesProvider) {
        super(context, R.style.TransparentDialog);
        this.currentAccount = UserConfig.selectedAccount;
        this.useHardwareLayer = true;
        this.backDrawable = new SheetBackDrawable();
        this.useLightStatusBar = true;
        int i = Theme.key_dialogBackground;
        this.behindKeyboardColorKey = i;
        this.canDismissWithSwipe = true;
        this.canDismissWithTouchOutside = true;
        this.allowCustomAnimation = true;
        this.statusBarHeight = AndroidUtilities.statusBarHeight;
        this.openDuration = 400;
        this.openInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
        this.focusableSoftInputMode = 16;
        this.dimBehind = true;
        this.dimBehindAlpha = 51;
        this.allowNestedScroll = true;
        this.applyTopPadding = true;
        this.applyBottomPadding = true;
        this.itemViews = new ArrayList<>();
        this.dismissRunnable = new BottomSheet$$ExternalSyntheticLambda7(this);
        this.navigationBarAlpha = 0.0f;
        this.navBarColorKey = Theme.key_windowBackgroundGray;
        this.pauseAllHeavyOperations = true;
        this.notificationsLocker = new AnimationNotificationsLocker();
        this.useBackgroundTopPadding = true;
        this.customViewGravity = 51;
        this.smoothContainerViewLayoutUntil = -1L;
        this.resourcesProvider = resourcesProvider;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 30) {
            getWindow().addFlags(-2147483392);
            if (z2) {
                this.focusableSoftInputMode = 48;
            }
        } else {
            getWindow().addFlags(-2147417856);
        }
        this.touchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
        Rect rect = new Rect();
        Drawable drawableMutate = context.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        this.shadowDrawable = drawableMutate;
        int themedColor = getThemedColor(i);
        this.internalBackgroundColor = themedColor;
        drawableMutate.setColorFilter(new PorterDuffColorFilter(themedColor, PorterDuff.Mode.MULTIPLY));
        this.shadowDrawable.getPadding(rect);
        this.backgroundPaddingLeft = rect.left;
        this.backgroundPaddingTop = rect.top;
        ContainerView containerView = new ContainerView(getContext()) {
            @Override
            public boolean drawChild(Canvas canvas, View view, long j) {
                try {
                    return super.drawChild(canvas, view, j);
                } catch (Exception e) {
                    FileLog.e(e);
                    return true;
                }
            }

            @Override
            protected void dispatchDraw(Canvas canvas) {
                super.dispatchDraw(canvas);
                BottomSheet.this.mainContainerDispatchDraw(canvas);
            }

            @Override
            protected void onConfigurationChanged(Configuration configuration) {
                BottomSheet.this.lastInsets = null;
                BottomSheet.this.container.requestApplyInsets();
            }

            @Override
            protected void onAttachedToWindow() {
                super.onAttachedToWindow();
                Bulletin.addDelegate(this, new Bulletin.Delegate() {
                    @Override
                    public boolean allowLayoutChanges() {
                        return Bulletin.Delegate.CC.$default$allowLayoutChanges(this);
                    }

                    @Override
                    public boolean bottomOffsetAnimated() {
                        return Bulletin.Delegate.CC.$default$bottomOffsetAnimated(this);
                    }

                    @Override
                    public boolean clipWithGradient(int i3) {
                        return Bulletin.Delegate.CC.$default$clipWithGradient(this, i3);
                    }

                    @Override
                    public int getBottomOffset(int i3) {
                        return Bulletin.Delegate.CC.$default$getBottomOffset(this, i3);
                    }

                    @Override
                    public void onBottomOffsetChange(float f) {
                        Bulletin.Delegate.CC.$default$onBottomOffsetChange(this, f);
                    }

                    @Override
                    public void onHide(Bulletin bulletin) {
                        Bulletin.Delegate.CC.$default$onHide(this, bulletin);
                    }

                    @Override
                    public void onShow(Bulletin bulletin) {
                        Bulletin.Delegate.CC.$default$onShow(this, bulletin);
                    }

                    @Override
                    public int getTopOffset(int i3) {
                        return AndroidUtilities.statusBarHeight;
                    }
                });
            }

            @Override
            protected void onDetachedFromWindow() {
                super.onDetachedFromWindow();
                Bulletin.removeDelegate(this);
            }
        };
        this.container = containerView;
        containerView.setClipChildren(false);
        this.container.setClipToPadding(false);
        this.container.setBackground(this.backDrawable);
        this.focusable = z;
        if (!z2) {
            this.container.setFitsSystemWindows(true);
            this.container.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() {
                @Override
                public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                    return BottomSheet.m1249$r8$lambda$WXe1ESgbiA1knipAyW2dQxM(this.f$0, view, windowInsets);
                }
            });
        }
        if (i2 >= 30) {
            this.container.setSystemUiVisibility(1792);
        } else {
            this.container.setSystemUiVisibility(1280);
        }
        this.backDrawable.setAlpha(0);
    }

    public static WindowInsets m1249$r8$lambda$WXe1ESgbiA1knipAyW2dQxM(BottomSheet bottomSheet, View view, WindowInsets windowInsets) {
        bottomSheet.processLegacyContainerInsets(windowInsets);
        if (Build.VERSION.SDK_INT >= 30) {
            return WindowInsets.CONSUMED;
        }
        return windowInsets.consumeSystemWindowInsets();
    }

    protected void processLegacyContainerInsets(WindowInsets windowInsets) {
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

    public void fixNavigationBar() {
        fixNavigationBar(getThemedColor(Theme.key_windowBackgroundGray));
    }

    public void fixNavigationBar(int i) {
        this.drawNavigationBar = !this.occupyNavigationBar;
        this.drawDoubleNavigationBar = true;
        this.scrollNavBar = true;
        this.navBarColorKey = -1;
        this.navBarColor = i;
        setOverlayNavBarColor(i);
    }

    @Override
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        onCreateInternal();
    }

    private void onCreateInternal() {
        Window window;
        int i;
        BaseFragment baseFragment = this.attachedFragment;
        if (baseFragment != null) {
            baseFragment.addSheet(this);
            if (this.attachedFragment.getLayoutContainer() == null) {
                return;
            }
            if (((InputMethodManager) getContext().getSystemService("input_method")).hideSoftInputFromWindow(this.attachedFragment.getLayoutContainer().getWindowToken(), 2)) {
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        BottomSheet.$r8$lambda$TOrQDy1sPrtvqIbvW8cSyyZU2gE(this.f$0);
                    }
                }, 80L);
            } else {
                AndroidUtilities.removeFromParent(this.container);
                this.attachedFragment.getLayoutContainer().addView(this.container);
            }
            window = null;
        } else {
            window = getWindow();
            window.setWindowAnimations(R.style.DialogNoAnimation);
            setContentView(this.container, new ViewGroup.LayoutParams(-1, -1));
        }
        if (this.useLightStatusBar && Build.VERSION.SDK_INT >= 23 && Theme.getColor(Theme.key_actionBarDefault, null, true) == -1) {
            this.container.setSystemUiVisibility(this.container.getSystemUiVisibility() | 8192);
        }
        if (this.useLightNavBar && Build.VERSION.SDK_INT >= 26) {
            AndroidUtilities.setLightNavigationBar((Dialog) this, false);
        }
        if (this.containerView == null) {
            FrameLayout frameLayout = new FrameLayout(getContext()) {
                @Override
                public boolean hasOverlappingRendering() {
                    return false;
                }

                @Override
                public void setTranslationY(float f) {
                    super.setTranslationY(f);
                    BottomSheet bottomSheet = BottomSheet.this;
                    FrameLayout frameLayout2 = bottomSheet.topBulletinContainer;
                    if (frameLayout2 != null) {
                        frameLayout2.setTranslationY((-(bottomSheet.container.getHeight() - BottomSheet.this.containerView.getY())) + BottomSheet.this.backgroundPaddingTop);
                    }
                    BottomSheet.this.onContainerTranslationYChanged(f);
                }
            };
            this.containerView = frameLayout;
            frameLayout.setBackgroundDrawable(this.shadowDrawable);
            this.containerView.setPadding(this.backgroundPaddingLeft, ((this.applyTopPadding ? AndroidUtilities.dp(8.0f) : 0) + this.backgroundPaddingTop) - 1, this.backgroundPaddingLeft, this.applyBottomPadding ? AndroidUtilities.dp(8.0f) : 0);
        }
        this.containerView.setVisibility(4);
        this.container.addView(this.containerView, 0, LayoutHelper.createFrame(-1, -2, 80));
        if (this.topBulletinContainer == null) {
            FrameLayout frameLayout2 = new FrameLayout(getContext());
            this.topBulletinContainer = frameLayout2;
            ContainerView containerView = this.container;
            containerView.addView(frameLayout2, containerView.indexOfChild(this.containerView) + 1, LayoutHelper.createFrame(-1, -2, 80));
        }
        if (this.title != null) {
            TextView textView = new TextView(getContext()) {
                @Override
                protected void onMeasure(int i2, int i3) {
                    super.onMeasure(i2, i3);
                    if (BottomSheet.this.multipleLinesTitle) {
                        int measuredHeight = getMeasuredHeight();
                        if (BottomSheet.this.customView != null) {
                            ((ViewGroup.MarginLayoutParams) BottomSheet.this.customView.getLayoutParams()).topMargin = measuredHeight;
                            return;
                        }
                        if (BottomSheet.this.containerView != null) {
                            for (int i4 = 1; i4 < BottomSheet.this.containerView.getChildCount(); i4++) {
                                View childAt = BottomSheet.this.containerView.getChildAt(i4);
                                if (childAt instanceof BottomSheetCell) {
                                    ((ViewGroup.MarginLayoutParams) childAt.getLayoutParams()).topMargin = measuredHeight;
                                    measuredHeight += AndroidUtilities.dp(48.0f);
                                }
                            }
                        }
                    }
                }
            };
            this.titleView = textView;
            textView.setText(this.title);
            if (this.bigTitle) {
                this.titleView.setTextColor(getThemedColor(Theme.key_dialogTextBlack));
                this.titleView.setTextSize(1, 20.0f);
                this.titleView.setTypeface(AndroidUtilities.bold());
                this.titleView.setPadding(AndroidUtilities.dp(21.0f), AndroidUtilities.dp(this.multipleLinesTitle ? 14.0f : 6.0f), AndroidUtilities.dp(21.0f), AndroidUtilities.dp(8.0f));
            } else {
                this.titleView.setTextColor(getThemedColor(Theme.key_dialogTextGray2));
                this.titleView.setTextSize(1, 16.0f);
                this.titleView.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(this.multipleLinesTitle ? 8.0f : 0.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f));
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
            i = 48;
            this.containerView.addView(this.titleView, LayoutHelper.createFrame(-1, this.multipleLinesTitle ? -2.0f : 48));
            this.titleView.setOnTouchListener(new View.OnTouchListener() {
                @Override
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    return BottomSheet.$r8$lambda$Gd4n5DMvY6tsqBn0MFClxifpt3E(view, motionEvent);
                }
            });
        } else {
            i = 0;
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
                float f = i;
                this.containerView.addView(this.customView, LayoutHelper.createFrame(-1, -2.0f, this.customViewGravity, 0.0f, f, 0.0f, 0.0f));
                ((ViewGroup.MarginLayoutParams) this.customView.getLayoutParams()).topMargin = (-this.backgroundPaddingTop) + AndroidUtilities.dp(f);
            } else {
                this.containerView.addView(this.customView, LayoutHelper.createFrame(-1, -2.0f, this.customViewGravity, 0.0f, i, 0.0f, 0.0f));
            }
        } else if (this.items != null) {
            int i2 = 0;
            while (true) {
                CharSequence[] charSequenceArr = this.items;
                if (i2 >= charSequenceArr.length) {
                    break;
                }
                if (charSequenceArr[i2] != null) {
                    BottomSheetCell bottomSheetCell = new BottomSheetCell(getContext(), this.cellType, this.resourcesProvider);
                    CharSequence charSequence = this.items[i2];
                    int[] iArr = this.itemIcons;
                    bottomSheetCell.setTextAndIcon(charSequence, iArr != null ? iArr[i2] : 0, null, this.bigTitle);
                    this.containerView.addView(bottomSheetCell, LayoutHelper.createFrame(-1, 48.0f, 51, 0.0f, i, 0.0f, 0.0f));
                    i += 48;
                    bottomSheetCell.setTag(Integer.valueOf(i2));
                    bottomSheetCell.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view2) {
                            BottomSheet.m1252$r8$lambda$lOfojPpf0hbl_gHEX5U9BWfF4(this.f$0, view2);
                        }
                    });
                    this.itemViews.add(bottomSheetCell);
                }
                i2++;
            }
        }
        if (this.attachedFragment == null && window != null) {
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.width = -1;
            attributes.gravity = 51;
            attributes.dimAmount = 0.0f;
            int i3 = attributes.flags & (-3);
            attributes.flags = i3;
            if (this.focusable) {
                attributes.softInputMode = this.focusableSoftInputMode;
            } else {
                attributes.flags = i3 | 131072;
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

    public static void $r8$lambda$TOrQDy1sPrtvqIbvW8cSyyZU2gE(BottomSheet bottomSheet) {
        AndroidUtilities.removeFromParent(bottomSheet.container);
        bottomSheet.attachedFragment.getLayoutContainer().addView(bottomSheet.container);
    }

    public static void m1252$r8$lambda$lOfojPpf0hbl_gHEX5U9BWfF4(BottomSheet bottomSheet, View view) {
        bottomSheet.getClass();
        bottomSheet.dismissWithButtonClick(((Integer) view.getTag()).intValue());
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    public void setUseLightStatusBar(boolean z) {
        this.useLightStatusBar = z;
        if (Build.VERSION.SDK_INT >= 23) {
            int color = Theme.getColor(Theme.key_actionBarDefault, null, true);
            int systemUiVisibility = this.container.getSystemUiVisibility();
            this.container.setSystemUiVisibility((this.useLightStatusBar && color == -1) ? systemUiVisibility | 8192 : systemUiVisibility & (-8193));
        }
        if (this.attachedFragment != null) {
            LaunchActivity.instance.checkSystemBarColors(true, true, true);
        }
    }

    @Override
    public boolean isAttachedLightStatusBar() {
        return this.useLightStatusBar;
    }

    public boolean isFocusable() {
        return this.focusable;
    }

    public void setFocusable(boolean z) {
        if (this.focusable == z) {
            return;
        }
        this.focusable = z;
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

    public void setShowWithoutAnimation(boolean z) {
        this.showWithoutAnimation = z;
    }

    public void setBackgroundColor(int i) {
        this.shadowDrawable.setColorFilter(i, PorterDuff.Mode.MULTIPLY);
        if (this.internalBackgroundColor != i) {
            this.internalBackgroundColor = i;
            ContainerView containerView = this.container;
            if (containerView != null) {
                containerView.invalidate(0, containerView.getMeasuredHeight() - this.container.internalPaddingBottom, this.container.getMeasuredWidth(), this.container.getMeasuredHeight());
            }
        }
    }

    @Override
    public void show() {
        if (AndroidUtilities.isSafeToShow(getContext())) {
            if (this.attachedFragment != null) {
                onCreateInternal();
            } else {
                super.show();
            }
            setShowing(true);
            if (this.focusable) {
                getWindow().setSoftInputMode(this.focusableSoftInputMode);
            }
            this.dismissed = false;
            cancelSheetAnimation();
            this.containerView.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.x + (this.backgroundPaddingLeft * 2), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.y, Integer.MIN_VALUE));
            if (this.showWithoutAnimation) {
                this.backDrawable.setAlpha(this.dimBehind ? this.dimBehindAlpha : 0);
                this.containerView.setTranslationY(0.0f);
                onContainerViewTranslation();
                return;
            }
            this.backDrawable.setAlpha(0);
            this.layoutCount = 2;
            ViewGroup viewGroup = this.containerView;
            viewGroup.setTranslationY((AndroidUtilities.statusBarHeight * (1.0f - this.hideSystemVerticalInsetsProgress)) + viewGroup.getMeasuredHeight() + (this.scrollNavBar ? Math.max(0, Math.min(AndroidUtilities.navigationBarHeight, getBottomInset())) : 0));
            onContainerViewTranslation();
            long j = this.openNoDelay ? 0L : 150L;
            if (this.waitingKeyboard) {
                j = 500;
            }
            Runnable runnable = new Runnable() {
                @Override
                public void run() {
                    BottomSheet bottomSheet = BottomSheet.this;
                    if (bottomSheet.startAnimationRunnable != this || bottomSheet.dismissed) {
                        return;
                    }
                    BottomSheet bottomSheet2 = BottomSheet.this;
                    bottomSheet2.startAnimationRunnable = null;
                    bottomSheet2.startOpenAnimation();
                }
            };
            this.startAnimationRunnable = runnable;
            AndroidUtilities.runOnUIThread(runnable, j);
        }
    }

    public Drawable getBackDrawable() {
        return this.backDrawable;
    }

    public int getBackgroundPaddingTop() {
        return this.backgroundPaddingTop;
    }

    protected boolean canDismissWithSwipe() {
        return this.canDismissWithSwipe;
    }

    public void setCanDismissWithSwipe(boolean z) {
        this.canDismissWithSwipe = z;
    }

    public void setCustomView(View view) {
        this.customView = view;
    }

    @Override
    public void setTitle(CharSequence charSequence) {
        setTitle(charSequence, false);
    }

    public void setTitle(CharSequence charSequence, boolean z) {
        this.title = charSequence;
        this.bigTitle = z;
    }

    public void setApplyTopPadding(boolean z) {
        this.applyTopPadding = z;
    }

    public void setApplyBottomPadding(boolean z) {
        this.applyBottomPadding = z;
    }

    protected void onDismissWithTouchOutside() {
        dismiss();
    }

    protected boolean canDismissWithTouchOutside() {
        return this.canDismissWithTouchOutside;
    }

    protected boolean isTouchOutside(float f, float f2) {
        FrameLayout frameLayout = this.topBulletinContainer;
        if (frameLayout != null && frameLayout.getChildCount() > 0) {
            View childAt = this.topBulletinContainer.getChildAt(0);
            if (f2 >= this.topBulletinContainer.getY() + childAt.getY() && f2 <= this.topBulletinContainer.getY() + childAt.getY() + childAt.getHeight() && f >= this.topBulletinContainer.getX() + childAt.getX() && f <= this.topBulletinContainer.getX() + childAt.getX() + childAt.getWidth()) {
                return false;
            }
        }
        return f2 < ((float) this.containerView.getTop()) || f < ((float) this.containerView.getLeft()) || f > ((float) this.containerView.getRight());
    }

    public void setCanDismissWithTouchOutside(boolean z) {
        this.canDismissWithTouchOutside = z;
    }

    public TextView getTitleView() {
        return this.titleView;
    }

    public void onContainerTranslationYChanged(float f) {
        ContainerView containerView = this.container;
        if (containerView != null) {
            containerView.invalidate();
        }
    }

    protected void cancelSheetAnimation() {
        AnimatorSet animatorSet = this.currentSheetAnimation;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.currentSheetAnimation = null;
        }
        this.currentSheetAnimationType = 0;
    }

    public void setOnHideListener(DialogInterface.OnDismissListener onDismissListener) {
        this.onHideListener = onDismissListener;
    }

    public void startOpenAnimation() {
        if (this.dismissed) {
            return;
        }
        this.containerView.setVisibility(0);
        if (onCustomOpenAnimation()) {
            return;
        }
        if (this.useHardwareLayer) {
            this.container.setLayerType(2, null);
        }
        if (this.transitionFromRight) {
            this.containerView.setTranslationX(AndroidUtilities.dp(48.0f));
            this.containerView.setAlpha(0.0f);
            this.containerView.setTranslationY(0.0f);
        } else {
            this.containerView.setTranslationY(getContainerViewHeight() + this.keyboardHeight + AndroidUtilities.dp(10.0f) + Math.max(0, Math.min(AndroidUtilities.navigationBarHeight, getBottomInset())));
        }
        onContainerViewTranslation();
        this.currentSheetAnimationType = 1;
        ValueAnimator valueAnimator = this.navigationBarAnimation;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.navigationBarAlpha, 1.0f);
        this.navigationBarAnimation = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                BottomSheet.$r8$lambda$PyXfXAcSEl9XbmgSfC3lvU075II(this.f$0, valueAnimator2);
            }
        });
        this.currentSheetAnimation = new AnimatorSet();
        ArrayList<Animator> arrayList = new ArrayList<>();
        arrayList.add(ObjectAnimator.ofFloat(this.containerView, (Property<ViewGroup, Float>) View.TRANSLATION_X, 0.0f));
        arrayList.add(ObjectAnimator.ofFloat(this.containerView, (Property<ViewGroup, Float>) View.ALPHA, 1.0f));
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.containerView, (Property<ViewGroup, Float>) View.TRANSLATION_Y, 0.0f);
        objectAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                this.f$0.onContainerViewTranslation();
            }
        });
        arrayList.add(objectAnimatorOfFloat);
        arrayList.add(ObjectAnimator.ofInt(this.backDrawable, (Property<SheetBackDrawable, Integer>) AnimationProperties.COLOR_DRAWABLE_ALPHA, this.dimBehind ? this.dimBehindAlpha : 0));
        arrayList.add(this.navigationBarAnimation);
        appendOpenAnimator(true, arrayList);
        this.currentSheetAnimation.playTogether(arrayList);
        if (this.transitionFromRight) {
            this.currentSheetAnimation.setDuration(250L);
            this.currentSheetAnimation.setInterpolator(CubicBezierInterpolator.DEFAULT);
        } else {
            this.currentSheetAnimation.setDuration(this.openDuration);
            this.currentSheetAnimation.setInterpolator(this.openInterpolator);
        }
        this.currentSheetAnimation.setStartDelay(this.waitingKeyboard ? 0L : 20L);
        this.currentSheetAnimation.setInterpolator(this.openInterpolator);
        this.notificationsLocker.lock();
        this.currentSheetAnimation.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animator) {
                AnimatorSet animatorSet = BottomSheet.this.currentSheetAnimation;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    BottomSheet bottomSheet = BottomSheet.this;
                    bottomSheet.currentSheetAnimation = null;
                    bottomSheet.currentSheetAnimationType = 0;
                    bottomSheet.onOpenAnimationEnd();
                    BottomSheetDelegateInterface bottomSheetDelegateInterface = BottomSheet.this.delegate;
                    if (bottomSheetDelegateInterface != null) {
                        bottomSheetDelegateInterface.onOpenAnimationEnd();
                    }
                    BottomSheet bottomSheet2 = BottomSheet.this;
                    if (bottomSheet2.useHardwareLayer) {
                        bottomSheet2.container.setLayerType(0, null);
                    }
                    BottomSheet bottomSheet3 = BottomSheet.this;
                    if (bottomSheet3.isFullscreen) {
                        WindowManager.LayoutParams attributes = bottomSheet3.getWindow().getAttributes();
                        attributes.flags &= -1025;
                        BottomSheet.this.getWindow().setAttributes(attributes);
                    }
                }
                if (BottomSheet.this.pauseAllHeavyOperations) {
                    NotificationCenter.getGlobalInstance().postNotificationName(NotificationCenter.startAllHeavyOperations, 512);
                }
                BottomSheet.this.notificationsLocker.unlock();
            }

            @Override
            public void onAnimationCancel(Animator animator) {
                AnimatorSet animatorSet = BottomSheet.this.currentSheetAnimation;
                if (animatorSet == null || !animatorSet.equals(animator)) {
                    return;
                }
                BottomSheet bottomSheet = BottomSheet.this;
                bottomSheet.currentSheetAnimation = null;
                bottomSheet.currentSheetAnimationType = 0;
            }
        });
        if (this.pauseAllHeavyOperations) {
            NotificationCenter.getGlobalInstance().postNotificationName(NotificationCenter.stopAllHeavyOperations, 512);
        }
        this.currentSheetAnimation.start();
    }

    public static void $r8$lambda$PyXfXAcSEl9XbmgSfC3lvU075II(BottomSheet bottomSheet, ValueAnimator valueAnimator) {
        bottomSheet.getClass();
        bottomSheet.navigationBarAlpha = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        ContainerView containerView = bottomSheet.container;
        if (containerView != null) {
            containerView.invalidate();
        }
    }

    public void setDelegate(BottomSheetDelegateInterface bottomSheetDelegateInterface) {
        this.delegate = bottomSheetDelegateInterface;
    }

    public ContainerView getContainer() {
        return this.container;
    }

    public ViewGroup getSheetContainer() {
        return this.containerView;
    }

    public int getTag() {
        return this.tag;
    }

    public BottomSheet setDimBehind(boolean z) {
        this.dimBehind = z;
        return this;
    }

    public void setDimBehindAlpha(int i) {
        this.dimBehindAlpha = i;
    }

    public void setItemText(int i, CharSequence charSequence) {
        if (i < 0 || i >= this.itemViews.size()) {
            return;
        }
        this.itemViews.get(i).textView.setText(charSequence);
    }

    public void setItemColor(int i, int i2, int i3) {
        if (i < 0 || i >= this.itemViews.size()) {
            return;
        }
        BottomSheetCell bottomSheetCell = this.itemViews.get(i);
        bottomSheetCell.textView.setTextColor(i2);
        bottomSheetCell.imageView.setColorFilter(new PorterDuffColorFilter(i3, PorterDuff.Mode.MULTIPLY));
    }

    public ArrayList<BottomSheetCell> getItemViews() {
        return this.itemViews;
    }

    public void setItems(CharSequence[] charSequenceArr, int[] iArr, DialogInterface.OnClickListener onClickListener) {
        this.items = charSequenceArr;
        this.itemIcons = iArr;
        this.onClickListener = onClickListener;
    }

    public void setTitleColor(int i) {
        TextView textView = this.titleView;
        if (textView == null) {
            return;
        }
        textView.setTextColor(i);
    }

    public boolean isDismissed() {
        return this.dismissed;
    }

    public void dismissWithButtonClick(final int i) {
        if (this.dismissed) {
            return;
        }
        this.dismissed = true;
        cancelSheetAnimation();
        this.currentSheetAnimationType = 2;
        this.currentSheetAnimation = new AnimatorSet();
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.containerView, (Property<ViewGroup, Float>) View.TRANSLATION_Y, getContainerViewHeight() + this.keyboardHeight + AndroidUtilities.dp(10.0f) + Math.max(0, Math.min(AndroidUtilities.navigationBarHeight, getBottomInset())));
        objectAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f$0.onContainerViewTranslation();
            }
        });
        this.currentSheetAnimation.playTogether(objectAnimatorOfFloat, ObjectAnimator.ofInt(this.backDrawable, (Property<SheetBackDrawable, Integer>) AnimationProperties.COLOR_DRAWABLE_ALPHA, 0));
        this.currentSheetAnimation.setDuration(this.cellType == Builder.CELL_TYPE_CALL ? 330L : 180L);
        this.currentSheetAnimation.setInterpolator(CubicBezierInterpolator.EASE_OUT);
        this.currentSheetAnimation.addListener(new AnonymousClass6(i));
        NotificationCenter.getGlobalInstance().postNotificationName(NotificationCenter.stopAllHeavyOperations, 512);
        this.currentSheetAnimation.start();
        if (this.cellType != Builder.CELL_TYPE_CALL || this.selectedPos == null) {
            return;
        }
        int currentTextColor = getItemViews().get(this.selectedPos.intValue()).getTextView().getCurrentTextColor();
        int currentTextColor2 = getItemViews().get(i).getTextView().getCurrentTextColor();
        ValueAnimator valueAnimatorOfArgb = ValueAnimator.ofArgb(currentTextColor, currentTextColor2);
        valueAnimatorOfArgb.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                BottomSheet.m1251$r8$lambda$gBWPiyu88PCUBLeYPulGyihXU(this.f$0, valueAnimator);
            }
        });
        valueAnimatorOfArgb.setDuration(130L);
        CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.DEFAULT;
        valueAnimatorOfArgb.setInterpolator(cubicBezierInterpolator);
        valueAnimatorOfArgb.start();
        ValueAnimator valueAnimatorOfArgb2 = ValueAnimator.ofArgb(currentTextColor2, currentTextColor);
        valueAnimatorOfArgb2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                BottomSheet.$r8$lambda$byhykbGR3pmT85zOo7UjX7MPcRQ(this.f$0, i, valueAnimator);
            }
        });
        valueAnimatorOfArgb2.setDuration(130L);
        valueAnimatorOfArgb2.setInterpolator(cubicBezierInterpolator);
        valueAnimatorOfArgb2.start();
    }

    class AnonymousClass6 extends AnimatorListenerAdapter {
        final int val$item;

        AnonymousClass6(int i) {
            this.val$item = i;
        }

        @Override
        public void onAnimationEnd(Animator animator) {
            AnimatorSet animatorSet = BottomSheet.this.currentSheetAnimation;
            if (animatorSet != null && animatorSet.equals(animator)) {
                BottomSheet bottomSheet = BottomSheet.this;
                bottomSheet.currentSheetAnimation = null;
                bottomSheet.currentSheetAnimationType = 0;
                if (bottomSheet.onClickListener != null) {
                    BottomSheet.this.onClickListener.onClick(BottomSheet.this, this.val$item);
                }
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        BottomSheet.AnonymousClass6.m1254$r8$lambda$LUF01giuQdIYkxvgC_O7qs_M0Q(this.f$0);
                    }
                });
            }
            NotificationCenter.getGlobalInstance().postNotificationName(NotificationCenter.startAllHeavyOperations, 512);
        }

        public static void m1254$r8$lambda$LUF01giuQdIYkxvgC_O7qs_M0Q(AnonymousClass6 anonymousClass6) {
            if (BottomSheet.this.onHideListener != null) {
                BottomSheet.this.onHideListener.onDismiss(BottomSheet.this);
            }
            try {
                BottomSheet.this.dismissInternal();
            } catch (Exception e) {
                FileLog.e(e);
            }
        }

        @Override
        public void onAnimationCancel(Animator animator) {
            AnimatorSet animatorSet = BottomSheet.this.currentSheetAnimation;
            if (animatorSet == null || !animatorSet.equals(animator)) {
                return;
            }
            BottomSheet bottomSheet = BottomSheet.this;
            bottomSheet.currentSheetAnimation = null;
            bottomSheet.currentSheetAnimationType = 0;
        }
    }

    public static void m1251$r8$lambda$gBWPiyu88PCUBLeYPulGyihXU(BottomSheet bottomSheet, ValueAnimator valueAnimator) {
        bottomSheet.getClass();
        int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        bottomSheet.setItemColor(bottomSheet.selectedPos.intValue(), iIntValue, iIntValue);
    }

    public static void $r8$lambda$byhykbGR3pmT85zOo7UjX7MPcRQ(BottomSheet bottomSheet, int i, ValueAnimator valueAnimator) {
        bottomSheet.getClass();
        int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        bottomSheet.setItemColor(i, iIntValue, iIntValue);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.dismissed) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public int getContainerViewHeight() {
        ViewGroup viewGroup = this.containerView;
        if (viewGroup == null) {
            return 0;
        }
        return viewGroup.getMeasuredHeight();
    }

    public void forceKeyboardOnDismiss() {
        this.forceKeyboardOnDismiss = true;
    }

    @Override
    public View mo1343getWindowView() {
        return this.container;
    }

    @Override
    public boolean isShown() {
        return !this.dismissed;
    }

    @Override
    public void dismiss() {
        long j;
        Bulletin visibleBulletin;
        BottomSheetDelegateInterface bottomSheetDelegateInterface = this.delegate;
        if ((bottomSheetDelegateInterface == null || bottomSheetDelegateInterface.canDismiss()) && !this.dismissed) {
            this.dismissed = true;
            DialogInterface.OnDismissListener onDismissListener = this.onHideListener;
            if (onDismissListener != null) {
                onDismissListener.onDismiss(this);
            }
            cancelSheetAnimation();
            onDismissAnimationStart();
            if (this.skipDismissAnimation) {
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        BottomSheet.$r8$lambda$BlyVouN0nv8fDFL4d5QasuUpbnA(this.f$0);
                    }
                });
            } else {
                if (!this.allowCustomAnimation || !onCustomCloseAnimation()) {
                    AndroidUtilities.hideKeyboard(this.container);
                    this.currentSheetAnimationType = 2;
                    ValueAnimator valueAnimator = this.navigationBarAnimation;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.navigationBarAlpha, 0.0f);
                    this.navigationBarAnimation = valueAnimatorOfFloat;
                    valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                            BottomSheet.$r8$lambda$HcIJwqwHXnPfaTdoef6wqTU0jMo(this.f$0, valueAnimator2);
                        }
                    });
                    this.currentSheetAnimation = new AnimatorSet();
                    ArrayList<Animator> arrayList = new ArrayList<>();
                    ViewGroup viewGroup = this.containerView;
                    if (viewGroup != null) {
                        if (this.transitionFromRight) {
                            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(viewGroup, (Property<ViewGroup, Float>) View.TRANSLATION_X, AndroidUtilities.dp(48.0f));
                            objectAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                                @Override
                                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                                    this.f$0.onContainerViewTranslation();
                                }
                            });
                            arrayList.add(objectAnimatorOfFloat);
                            arrayList.add(ObjectAnimator.ofFloat(this.containerView, (Property<ViewGroup, Float>) View.ALPHA, 0.0f));
                        } else {
                            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(viewGroup, (Property<ViewGroup, Float>) View.TRANSLATION_Y, getContainerViewHeight() + (this.forceKeyboardOnDismiss ? this.lastKeyboardHeight : this.keyboardHeight) + AndroidUtilities.dp(10.0f) + Math.max(0, Math.min(AndroidUtilities.navigationBarHeight, getBottomInset())));
                            objectAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                                @Override
                                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                                    this.f$0.onContainerViewTranslation();
                                }
                            });
                            arrayList.add(objectAnimatorOfFloat2);
                        }
                    }
                    arrayList.add(ObjectAnimator.ofInt(this.backDrawable, (Property<SheetBackDrawable, Integer>) AnimationProperties.COLOR_DRAWABLE_ALPHA, 0));
                    arrayList.add(this.navigationBarAnimation);
                    appendOpenAnimator(false, arrayList);
                    this.currentSheetAnimation.playTogether(arrayList);
                    if (this.transitionFromRight) {
                        this.currentSheetAnimation.setDuration(200L);
                        this.currentSheetAnimation.setInterpolator(CubicBezierInterpolator.DEFAULT);
                        j = 0;
                    } else {
                        j = 250;
                        this.currentSheetAnimation.setDuration(250L);
                        this.currentSheetAnimation.setInterpolator(CubicBezierInterpolator.EASE_OUT);
                    }
                    this.currentSheetAnimation.addListener(new AnonymousClass7());
                    NotificationCenter.getGlobalInstance().postNotificationName(NotificationCenter.stopAllHeavyOperations, 512);
                    this.currentSheetAnimation.start();
                }
                visibleBulletin = Bulletin.getVisibleBulletin();
                if (visibleBulletin != null && visibleBulletin.isShowing() && visibleBulletin.hideAfterBottomSheet) {
                    if (j > 0) {
                        visibleBulletin.hide((long) (j * 0.6f));
                    } else {
                        visibleBulletin.hide();
                    }
                }
                setShowing(false);
            }
            j = 0;
            visibleBulletin = Bulletin.getVisibleBulletin();
            if (visibleBulletin != null) {
                if (j > 0) {
                    visibleBulletin.hide((long) (j * 0.6f));
                } else {
                    visibleBulletin.hide();
                }
            }
            setShowing(false);
        }
    }

    public static void $r8$lambda$BlyVouN0nv8fDFL4d5QasuUpbnA(BottomSheet bottomSheet) {
        bottomSheet.getClass();
        try {
            bottomSheet.dismissInternal();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public static void $r8$lambda$HcIJwqwHXnPfaTdoef6wqTU0jMo(BottomSheet bottomSheet, ValueAnimator valueAnimator) {
        bottomSheet.getClass();
        bottomSheet.navigationBarAlpha = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        ContainerView containerView = bottomSheet.container;
        if (containerView != null) {
            containerView.invalidate();
        }
    }

    class AnonymousClass7 extends AnimatorListenerAdapter {
        AnonymousClass7() {
        }

        @Override
        public void onAnimationEnd(Animator animator) {
            AnimatorSet animatorSet = BottomSheet.this.currentSheetAnimation;
            if (animatorSet != null && animatorSet.equals(animator)) {
                BottomSheet bottomSheet = BottomSheet.this;
                bottomSheet.currentSheetAnimation = null;
                bottomSheet.currentSheetAnimationType = 0;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        BottomSheet.AnonymousClass7.$r8$lambda$bjTjWnFYECp7WFWAMjn14xonuK8(this.f$0);
                    }
                });
            }
            NotificationCenter.getGlobalInstance().postNotificationName(NotificationCenter.startAllHeavyOperations, 512);
        }

        public static void $r8$lambda$bjTjWnFYECp7WFWAMjn14xonuK8(AnonymousClass7 anonymousClass7) {
            anonymousClass7.getClass();
            try {
                BottomSheet.this.dismissInternal();
            } catch (Exception e) {
                FileLog.e(e);
            }
        }

        @Override
        public void onAnimationCancel(Animator animator) {
            AnimatorSet animatorSet = BottomSheet.this.currentSheetAnimation;
            if (animatorSet == null || !animatorSet.equals(animator)) {
                return;
            }
            BottomSheet bottomSheet = BottomSheet.this;
            bottomSheet.currentSheetAnimation = null;
            bottomSheet.currentSheetAnimationType = 0;
        }
    }

    @Override
    public void dismiss(boolean z) {
        dismiss();
    }

    public void release() {
        dismissInternal();
    }

    @Override
    public boolean attachedToParent() {
        ContainerView containerView = this.container;
        return containerView != null && containerView.isAttachedToWindow();
    }

    @Override
    public int getNavigationBarColor(int i) {
        float fClamp01;
        ViewGroup viewGroup;
        if (!attachedToParent() || (viewGroup = this.containerView) == null) {
            fClamp01 = 0.0f;
        } else if (this.transitionFromRight) {
            fClamp01 = viewGroup.getAlpha();
        } else {
            fClamp01 = Utilities.clamp01(1.0f - (this.containerView.getTranslationY() / (((getContainerViewHeight() + this.keyboardHeight) + AndroidUtilities.dp(10.0f)) + (this.scrollNavBar ? Math.max(0, Math.min(AndroidUtilities.navigationBarHeight, getBottomInset())) : 0))));
        }
        return ColorUtils.blendARGB(i, this.navBarColor, fClamp01);
    }

    @Override
    public void setOnDismissListener(final Runnable runnable) {
        if (runnable != null) {
            setOnHideListener(new DialogInterface.OnDismissListener() {
                @Override
                public final void onDismiss(DialogInterface dialogInterface) {
                    runnable.run();
                }
            });
        }
    }

    @Override
    public void setOnDismissListener(DialogInterface.OnDismissListener onDismissListener) {
        super.setOnDismissListener(onDismissListener);
    }

    public int getSheetAnimationType() {
        return this.currentSheetAnimationType;
    }

    public void dismissInternal() {
        BaseFragment baseFragment = this.attachedFragment;
        if (baseFragment != null) {
            baseFragment.removeSheet(this);
            AndroidUtilities.removeFromParent(this.container);
        } else {
            try {
                super.dismiss();
            } catch (Exception e) {
                FileLog.e((Throwable) e, false);
            }
        }
    }

    public static class Builder {
        public static int CELL_TYPE_CALL = 4;
        public BottomSheet bottomSheet;

        public Builder(Context context) {
            this(context, false);
        }

        public Builder(Context context, boolean z) {
            this(context, z, null);
        }

        public Builder(Context context, boolean z, Theme.ResourcesProvider resourcesProvider) {
            BottomSheet bottomSheet = new BottomSheet(context, z, resourcesProvider);
            this.bottomSheet = bottomSheet;
            bottomSheet.fixNavigationBar();
        }

        public Builder(Context context, boolean z, Theme.ResourcesProvider resourcesProvider, int i) {
            BottomSheet bottomSheet = new BottomSheet(context, z, resourcesProvider);
            this.bottomSheet = bottomSheet;
            bottomSheet.setBackgroundColor(i);
            this.bottomSheet.fixNavigationBar(i);
        }

        public Builder setItems(CharSequence[] charSequenceArr, DialogInterface.OnClickListener onClickListener) {
            this.bottomSheet.items = charSequenceArr;
            this.bottomSheet.onClickListener = onClickListener;
            return this;
        }

        public Builder setItems(CharSequence[] charSequenceArr, int[] iArr, DialogInterface.OnClickListener onClickListener) {
            this.bottomSheet.items = charSequenceArr;
            this.bottomSheet.itemIcons = iArr;
            this.bottomSheet.onClickListener = onClickListener;
            return this;
        }

        public Builder setCustomView(View view) {
            this.bottomSheet.customView = view;
            return this;
        }

        public Builder setCustomView(View view, int i) {
            this.bottomSheet.customView = view;
            this.bottomSheet.customViewGravity = i;
            return this;
        }

        public Builder setTitle(CharSequence charSequence) {
            return setTitle(charSequence, false);
        }

        public Builder setTitle(CharSequence charSequence, boolean z) {
            this.bottomSheet.title = charSequence;
            this.bottomSheet.bigTitle = z;
            return this;
        }

        public Builder selectedPos(Integer num) {
            this.bottomSheet.selectedPos = num;
            return this;
        }

        public Builder setCellType(int i) {
            this.bottomSheet.cellType = i;
            return this;
        }

        public Builder setTitleMultipleLines(boolean z) {
            this.bottomSheet.multipleLinesTitle = z;
            return this;
        }

        public BottomSheet create() {
            return this.bottomSheet;
        }

        public BottomSheet setDimBehind(boolean z) {
            BottomSheet bottomSheet = this.bottomSheet;
            bottomSheet.dimBehind = z;
            return bottomSheet;
        }

        public BottomSheet show() {
            this.bottomSheet.show();
            return this.bottomSheet;
        }

        public Builder setDelegate(BottomSheetDelegate bottomSheetDelegate) {
            this.bottomSheet.setDelegate(bottomSheetDelegate);
            return this;
        }

        public Builder setApplyTopPadding(boolean z) {
            this.bottomSheet.applyTopPadding = z;
            return this;
        }

        public Builder setApplyBottomPadding(boolean z) {
            this.bottomSheet.applyBottomPadding = z;
            return this;
        }

        public Runnable getDismissRunnable() {
            return this.bottomSheet.dismissRunnable;
        }

        public Builder setOnPreDismissListener(DialogInterface.OnDismissListener onDismissListener) {
            this.bottomSheet.setOnHideListener(onDismissListener);
            return this;
        }
    }

    public int getLeftInset() {
        WindowInsets windowInsets = this.lastInsets;
        if (windowInsets != null) {
            return (int) (windowInsets.getSystemWindowInsetLeft() * (1.0f - this.hideSystemVerticalInsetsProgress));
        }
        return 0;
    }

    public int getRightInset() {
        WindowInsets windowInsets = this.lastInsets;
        if (windowInsets != null) {
            return (int) (windowInsets.getSystemWindowInsetRight() * (1.0f - this.hideSystemVerticalInsetsProgress));
        }
        return 0;
    }

    public int getStatusBarHeight() {
        return (int) (this.statusBarHeight * (1.0f - this.hideSystemVerticalInsetsProgress));
    }

    public int getBottomInset() {
        return (int) (this.bottomInset * (1.0f - this.hideSystemVerticalInsetsProgress));
    }

    public void setCurrentPanTranslationY(float f) {
        this.currentPanTranslationY = f;
        this.container.invalidate();
    }

    public void setOverlayNavBarColor(int i) {
        this.overlayDrawNavBarColor = i;
        ContainerView containerView = this.container;
        if (containerView != null) {
            containerView.invalidate();
        }
        if (this.attachedFragment != null) {
            LaunchActivity.instance.checkSystemBarColors(true, true, true);
            AndroidUtilities.setLightNavigationBar(mo1343getWindowView(), AndroidUtilities.computePerceivedBrightness(getNavigationBarColor(getThemedColor(Theme.key_windowBackgroundGray))) >= 0.721f);
        } else {
            AndroidUtilities.setNavigationBarColor(this, this.overlayDrawNavBarColor);
            AndroidUtilities.setLightNavigationBar(this, ((double) AndroidUtilities.computePerceivedBrightness(this.overlayDrawNavBarColor)) > 0.721d);
        }
    }

    public ViewGroup getContainerView() {
        return this.containerView;
    }

    public int getCurrentAccount() {
        return this.currentAccount;
    }

    public int getThemedColor(int i) {
        return Theme.getColor(i, this.resourcesProvider);
    }

    public void setOpenNoDelay(boolean z) {
        this.openNoDelay = z;
    }

    public int getBackgroundPaddingLeft() {
        return this.backgroundPaddingLeft;
    }

    private void setShowing(boolean z) {
        if (this.showing == z) {
            return;
        }
        this.showing = z;
        if (this.openedLayerNum > 0) {
            if (z) {
                NotificationCenter.getGlobalInstance().postNotificationName(NotificationCenter.stopAllHeavyOperations, Integer.valueOf(this.openedLayerNum));
            } else {
                NotificationCenter.getGlobalInstance().postNotificationName(NotificationCenter.startAllHeavyOperations, Integer.valueOf(this.openedLayerNum));
            }
        }
    }

    @Override
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    public void setImageReceiverNumLevel(int i, int i2) {
        this.playingImagesLayerNum = i;
        this.openedLayerNum = i2;
    }

    public void smoothContainerViewLayout() {
        this.smoothContainerViewLayoutUntil = System.currentTimeMillis() + 80;
    }

    protected void onSmoothContainerViewLayout(float f) {
        ContainerView containerView = this.container;
        if (containerView != null) {
            containerView.invalidate();
        }
    }

    public void makeAttached(BaseFragment baseFragment) {
        if (AndroidUtilities.isTablet()) {
            return;
        }
        if (baseFragment == null || !baseFragment.isSupportEdgeToEdge()) {
            this.attachedFragment = baseFragment;
            SheetBackDrawable sheetBackDrawable = this.backDrawable;
            if (sheetBackDrawable != null) {
                sheetBackDrawable.bgPaint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_OVER));
            }
        }
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

    public WindowVisibilityManager.Controller obtainWindowVisibilityController() {
        if (this.windowVisibilityManager == null) {
            this.windowVisibilityManager = new WindowVisibilityManager(getWindow());
        }
        return this.windowVisibilityManager.obtainController();
    }

    public Theme.ResourcesProvider getResourcesProvider() {
        return this.resourcesProvider;
    }

    @Override
    public BulletinFactory getBulletinFactory() {
        return BulletinFactory.of(this.topBulletinContainer, this.resourcesProvider);
    }
}
