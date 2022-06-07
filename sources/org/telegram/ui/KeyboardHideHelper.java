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
import androidx.core.view.WindowInsetsCompat;
import org.telegram.ui.ActionBar.AdjustPanLayoutHelper;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.KeyboardHideHelper;

public class KeyboardHideHelper {
    public static boolean ENABLED = false;
    private int bottomNavBarSize;
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
    private boolean endingMovingKeyboard = false;
    private boolean startedOutsideView = false;
    private boolean startedAtBottom = false;

    public boolean onTouch(AdjustPanLayoutHelper adjustPanLayoutHelper, View view, RecyclerListView recyclerListView, ChatActivityEnterView chatActivityEnterView, ChatActivity chatActivity, MotionEvent motionEvent) {
        int i;
        if (!ENABLED) {
            return false;
        }
        this.panLayoutHelper = adjustPanLayoutHelper;
        this.view = view;
        if (!(view == null || chatActivityEnterView == null || Build.VERSION.SDK_INT < 30)) {
            boolean z = view.getRootWindowInsets().getInsets(WindowInsetsCompat.Type.ime()).bottom > 0;
            if (!this.movingKeyboard && !z && !this.endingMovingKeyboard) {
                return false;
            }
            boolean z2 = motionEvent.getY() >= ((float) chatActivityEnterView.getTop());
            if (motionEvent.getAction() == 0) {
                this.startedOutsideView = !z2;
                this.startedAtBottom = !recyclerListView.canScrollVertically(1);
            }
            float f = 0.0f;
            if (!this.movingKeyboard && z2 && this.startedOutsideView && motionEvent.getAction() == 2) {
                this.movingKeyboard = true;
                boolean z3 = !chatActivityEnterView.isPopupShowing();
                this.isKeyboard = z3;
                if (z3) {
                    i = view.getRootWindowInsets().getInsets(WindowInsetsCompat.Type.ime()).bottom;
                } else {
                    i = chatActivityEnterView.getEmojiPadding();
                }
                this.keyboardSize = i;
                this.bottomNavBarSize = view.getRootWindowInsets().getInsets(WindowInsetsCompat.Type.navigationBars()).bottom;
                view.getWindowInsetsController().controlWindowInsetsAnimation(WindowInsetsCompat.Type.ime(), -1L, new LinearInterpolator(), new CancellationSignal(), new WindowInsetsAnimationControlListener() {
                    @Override
                    public void onReady(WindowInsetsAnimationController windowInsetsAnimationController, int i2) {
                        KeyboardHideHelper.this.insetsController = windowInsetsAnimationController;
                    }

                    @Override
                    public void onFinished(WindowInsetsAnimationController windowInsetsAnimationController) {
                        KeyboardHideHelper.this.insetsController = null;
                    }

                    @Override
                    public void onCancelled(WindowInsetsAnimationController windowInsetsAnimationController) {
                        KeyboardHideHelper.this.insetsController = null;
                    }
                });
                this.fromY = motionEvent.getRawY();
                adjustPanLayoutHelper.setEnabled(false);
                update(0.0f, false);
                recyclerListView.stopScroll();
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
                if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    this.movingKeyboard = false;
                    this.endingMovingKeyboard = true;
                    this.tracker.computeCurrentVelocity(1000);
                    float f2 = this.t;
                    boolean z4 = (f2 > 0.15f && f2 >= this.lastDifferentT) || f2 > 0.8f;
                    if (z4) {
                        f = 1.0f;
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f2, f);
                    ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            KeyboardHideHelper.this.lambda$onTouch$0(valueAnimator);
                        }
                    });
                    ofFloat.addListener(new AnonymousClass2(z4, f, adjustPanLayoutHelper, view));
                    ofFloat.setInterpolator(CubicBezierInterpolator.EASE_OUT);
                    ofFloat.setDuration(200L);
                    ofFloat.start();
                    if (z4 && this.startedAtBottom && chatActivity != null) {
                        chatActivity.scrollToLastMessage(true);
                    }
                    this.startedOutsideView = false;
                    return true;
                }
                update(this.t, true);
                float f3 = this.lastT;
                float f4 = this.t;
                if (f3 != f4) {
                    this.lastDifferentT = f3;
                }
                this.lastT = f4;
                return true;
            }
        }
        return false;
    }

    public void lambda$onTouch$0(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.t = floatValue;
        update(floatValue, true);
    }

    public class AnonymousClass2 extends AnimatorListenerAdapter {
        final boolean val$end;
        final float val$endT;
        final AdjustPanLayoutHelper val$panLayoutHelper;
        final View val$view;

        AnonymousClass2(boolean z, float f, AdjustPanLayoutHelper adjustPanLayoutHelper, View view) {
            this.val$end = z;
            this.val$endT = f;
            this.val$panLayoutHelper = adjustPanLayoutHelper;
            this.val$view = view;
        }

        @Override
        public void onAnimationEnd(Animator animator) {
            if (KeyboardHideHelper.this.insetsController != null && KeyboardHideHelper.this.isKeyboard) {
                KeyboardHideHelper.this.insetsController.finish(!this.val$end);
            }
            KeyboardHideHelper.this.update(1.0f, false);
            KeyboardHideHelper.this.rawT = this.val$endT;
            this.val$panLayoutHelper.OnTransitionEnd();
            View view = this.val$view;
            final AdjustPanLayoutHelper adjustPanLayoutHelper = this.val$panLayoutHelper;
            view.post(new Runnable() {
                @Override
                public final void run() {
                    KeyboardHideHelper.AnonymousClass2.this.lambda$onAnimationEnd$0(adjustPanLayoutHelper);
                }
            });
        }

        public void lambda$onAnimationEnd$0(AdjustPanLayoutHelper adjustPanLayoutHelper) {
            adjustPanLayoutHelper.setEnabled(true);
            KeyboardHideHelper.this.endingMovingKeyboard = false;
        }
    }

    public boolean disableScrolling() {
        return ENABLED && (this.movingKeyboard || this.endingMovingKeyboard) && this.rawT >= 0.0f;
    }

    public void update(float f, boolean z) {
        WindowInsetsAnimationController windowInsetsAnimationController;
        if (this.isKeyboard) {
            float f2 = 1.0f - f;
            float max = Math.max(((this.keyboardSize * f2) - this.bottomNavBarSize) - 1.0f, 0.0f);
            this.panLayoutHelper.OnPanTranslationUpdate(max, f, true);
            ((View) ((View) this.view.getParent()).getParent()).setTranslationY(-max);
            if (z && (windowInsetsAnimationController = this.insetsController) != null && Build.VERSION.SDK_INT >= 30) {
                windowInsetsAnimationController.setInsetsAndAlpha(Insets.of(0, 0, 0, (int) (this.keyboardSize * f2)), 1.0f, f);
                return;
            }
            return;
        }
        this.panLayoutHelper.OnPanTranslationUpdate((1.0f - f) * this.keyboardSize, f, true);
    }
}
