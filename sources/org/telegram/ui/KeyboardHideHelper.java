package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Insets;
import android.os.Build;
import android.os.CancellationSignal;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.WindowInsetsAnimationControlListener;
import android.view.WindowInsetsAnimationController;
import android.view.animation.LinearInterpolator;
import androidx.core.math.MathUtils;
import org.telegram.ui.ActionBar.AdjustPanLayoutHelper;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.RecyclerListView;

public class KeyboardHideHelper {
    public static boolean ENABLED = false;
    private int bottomNavBarSize;
    private View enterView;
    private float fromY;
    private WindowInsetsAnimationController insetsController;
    private int keyboardSize;
    private float lastDifferentT;
    private float lastT;
    private AdjustPanLayoutHelper panLayoutHelper;
    private float rawT;
    private float t;
    private VelocityTracker tracker;
    private View view;
    private boolean isKeyboard = false;
    private boolean movingKeyboard = false;
    private boolean exactlyMovingKeyboard = false;
    private boolean endingMovingKeyboard = false;
    private boolean startedOutsideView = false;
    private boolean startedAtBottom = false;

    public class AnonymousClass2 extends AnimatorListenerAdapter {
        final boolean val$end;
        final float val$endT;
        final AdjustPanLayoutHelper val$panLayoutHelper;
        final View val$view;

        public AnonymousClass2(boolean z, float f, AdjustPanLayoutHelper adjustPanLayoutHelper, View view) {
            this.val$end = z;
            this.val$endT = f;
            this.val$panLayoutHelper = adjustPanLayoutHelper;
            this.val$view = view;
        }

        public void lambda$onAnimationEnd$0(AdjustPanLayoutHelper adjustPanLayoutHelper) {
            adjustPanLayoutHelper.setEnabled(true);
            KeyboardHideHelper.this.endingMovingKeyboard = false;
        }

        @Override
        public void onAnimationEnd(Animator animator) {
            if (KeyboardHideHelper.this.insetsController != null && KeyboardHideHelper.this.isKeyboard) {
                KeyboardHideHelper.this.insetsController.finish(!this.val$end);
            }
            KeyboardHideHelper.this.update(1.0f, false);
            KeyboardHideHelper.this.rawT = this.val$endT;
            this.val$panLayoutHelper.OnTransitionEnd();
            this.val$view.post(new PhotoViewer$44$$ExternalSyntheticLambda0(24, this, this.val$panLayoutHelper));
        }
    }

    public void lambda$onTouch$0(ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.t = fFloatValue;
        update(fFloatValue, true);
    }

    public void update(float f, boolean z) {
        WindowInsetsAnimationController windowInsetsAnimationController;
        if (!this.isKeyboard) {
            this.panLayoutHelper.OnPanTranslationUpdate((1.0f - f) * this.keyboardSize, f, true);
            return;
        }
        float f2 = 1.0f - f;
        float fMax = Math.max(((this.keyboardSize * f2) - this.bottomNavBarSize) - 1.0f, 0.0f);
        this.panLayoutHelper.OnPanTranslationUpdate(fMax, f, true);
        ((View) ((View) this.view.getParent()).getParent()).setTranslationY(-fMax);
        if (!z || (windowInsetsAnimationController = this.insetsController) == null || Build.VERSION.SDK_INT < 30) {
            return;
        }
        windowInsetsAnimationController.setInsetsAndAlpha(Insets.of(0, 0, 0, (int) (this.keyboardSize * f2)), 1.0f, f);
    }

    public boolean disableScrolling() {
        if (ENABLED) {
            return (this.movingKeyboard || this.endingMovingKeyboard) && this.rawT >= 0.0f;
        }
        return false;
    }

    public boolean onTouch(AdjustPanLayoutHelper adjustPanLayoutHelper, View view, RecyclerListView recyclerListView, ChatActivityEnterView chatActivityEnterView, ChatActivity chatActivity, MotionEvent motionEvent) {
        RecyclerListView recyclerListView2;
        if (ENABLED) {
            this.panLayoutHelper = adjustPanLayoutHelper;
            this.view = view;
            this.enterView = chatActivityEnterView;
            if (view != null && chatActivityEnterView != null && Build.VERSION.SDK_INT >= 30) {
                boolean z = view.getRootWindowInsets().getInsets(8).bottom > 0;
                if (this.movingKeyboard || z || this.endingMovingKeyboard) {
                    boolean z2 = motionEvent.getY() >= ((float) chatActivityEnterView.getTop());
                    if (motionEvent.getAction() == 0) {
                        this.startedOutsideView = !z2;
                        recyclerListView2 = recyclerListView;
                        this.startedAtBottom = !recyclerListView2.canScrollVertically(1);
                    } else {
                        recyclerListView2 = recyclerListView;
                    }
                    if (!this.movingKeyboard && z2 && this.startedOutsideView && motionEvent.getAction() == 2) {
                        this.movingKeyboard = true;
                        boolean zIsPopupShowing = chatActivityEnterView.isPopupShowing();
                        this.isKeyboard = !zIsPopupShowing;
                        this.keyboardSize = !zIsPopupShowing ? view.getRootWindowInsets().getInsets(8).bottom : chatActivityEnterView.getEmojiPadding();
                        this.bottomNavBarSize = view.getRootWindowInsets().getInsets(2).bottom;
                        view.getWindowInsetsController().controlWindowInsetsAnimation(8, -1L, new LinearInterpolator(), new CancellationSignal(), new WindowInsetsAnimationControlListener() {
                            @Override
                            public void onCancelled(WindowInsetsAnimationController windowInsetsAnimationController) {
                                KeyboardHideHelper.this.insetsController = null;
                            }

                            @Override
                            public void onFinished(WindowInsetsAnimationController windowInsetsAnimationController) {
                                KeyboardHideHelper.this.insetsController = null;
                            }

                            @Override
                            public void onReady(WindowInsetsAnimationController windowInsetsAnimationController, int i) {
                                KeyboardHideHelper.this.insetsController = windowInsetsAnimationController;
                            }
                        });
                        this.fromY = motionEvent.getRawY();
                        this.exactlyMovingKeyboard = false;
                        adjustPanLayoutHelper.setEnabled(false);
                        update(0.0f, false);
                        recyclerListView2.stopScroll();
                        this.lastDifferentT = 0.0f;
                        this.lastT = 0.0f;
                        this.rawT = 0.0f;
                        this.t = 0.0f;
                        adjustPanLayoutHelper.OnTransitionStart(true, view.getHeight());
                        if (this.tracker == null) {
                            this.tracker = VelocityTracker.obtain();
                        }
                        this.tracker.clear();
                    }
                    if (this.movingKeyboard) {
                        this.tracker.addMovement(motionEvent);
                        float rawY = (motionEvent.getRawY() - this.fromY) / this.keyboardSize;
                        this.rawT = rawY;
                        this.t = MathUtils.clamp(rawY, 0.0f, 1.0f);
                        if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                            update(this.t, true);
                            float f = this.lastT;
                            float f2 = this.t;
                            if (f != f2) {
                                this.lastDifferentT = f;
                            }
                            this.lastT = f2;
                            return true;
                        }
                        this.movingKeyboard = false;
                        this.exactlyMovingKeyboard = false;
                        this.endingMovingKeyboard = true;
                        this.tracker.computeCurrentVelocity(1000);
                        float f3 = this.t;
                        boolean z3 = (f3 > 0.15f && f3 >= this.lastDifferentT) || f3 > 0.8f;
                        float f4 = z3 ? 1.0f : 0.0f;
                        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f3, f4);
                        valueAnimatorOfFloat.addUpdateListener(new QrActivity$$ExternalSyntheticLambda8(this, 9));
                        boolean z4 = z3;
                        valueAnimatorOfFloat.addListener(new AnonymousClass2(z4, f4, adjustPanLayoutHelper, view));
                        valueAnimatorOfFloat.setInterpolator(CubicBezierInterpolator.EASE_OUT);
                        valueAnimatorOfFloat.setDuration(200L);
                        valueAnimatorOfFloat.start();
                        if (z4 && this.startedAtBottom && chatActivity != null) {
                            chatActivity.scrollToLastMessage(true, false);
                        }
                        this.startedOutsideView = false;
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
