package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.OvershootInterpolator;

public class ButtonBounce {
    private Runnable additionalInvalidate;
    private ValueAnimator animator;
    private final float durationPressMultiplier;
    private final float durationReleaseMultiplier;
    private boolean isPressed;
    private final float overshoot;
    private float pressedT;
    private long releaseDelay;
    private View view;

    public ButtonBounce(View view) {
        this(view, 1.0f, 5.0f);
    }

    public ButtonBounce(View view, float f, float f2) {
        this.releaseDelay = 0L;
        this.view = view;
        this.durationReleaseMultiplier = f;
        this.durationPressMultiplier = f;
        this.overshoot = f2;
    }

    public ButtonBounce(View view, float f, float f2, float f3) {
        this.releaseDelay = 0L;
        this.view = view;
        this.durationPressMultiplier = f;
        this.durationReleaseMultiplier = f2;
        this.overshoot = f3;
    }

    public void lambda$setPressed$0(ValueAnimator valueAnimator) {
        this.pressedT = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        invalidate();
    }

    public float getScale(float f) {
        return (1.0f - f) + (f * (1.0f - this.pressedT));
    }

    public View getView() {
        return this.view;
    }

    public void invalidate() {
        View view = this.view;
        if (view != null) {
            view.invalidate();
        }
        Runnable runnable = this.additionalInvalidate;
        if (runnable != null) {
            runnable.run();
        }
    }

    public boolean isPressed() {
        return this.isPressed;
    }

    public void setAdditionalInvalidate(Runnable runnable) {
        this.additionalInvalidate = runnable;
    }

    public void setPressed(final boolean z) {
        ValueAnimator valueAnimator;
        long j;
        if (this.isPressed != z) {
            this.isPressed = z;
            ValueAnimator valueAnimator2 = this.animator;
            this.animator = null;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.pressedT, z ? 1.0f : 0.0f);
            this.animator = ofFloat;
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                    ButtonBounce.this.lambda$setPressed$0(valueAnimator3);
                }
            });
            this.animator.addListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationEnd(Animator animator) {
                    if (animator == ButtonBounce.this.animator) {
                        ButtonBounce.this.animator = null;
                        ButtonBounce.this.pressedT = z ? 1.0f : 0.0f;
                        ButtonBounce.this.invalidate();
                    }
                }
            });
            if (this.isPressed) {
                this.animator.setInterpolator(CubicBezierInterpolator.DEFAULT);
                this.animator.setDuration(this.durationPressMultiplier * 60.0f);
                valueAnimator = this.animator;
                j = 0;
            } else {
                this.animator.setInterpolator(new OvershootInterpolator(this.overshoot));
                this.animator.setDuration(this.durationReleaseMultiplier * 350.0f);
                valueAnimator = this.animator;
                j = this.releaseDelay;
            }
            valueAnimator.setStartDelay(j);
            this.animator.start();
        }
    }

    public ButtonBounce setReleaseDelay(long j) {
        this.releaseDelay = j;
        return this;
    }

    public void setView(View view) {
        this.view = view;
    }
}
