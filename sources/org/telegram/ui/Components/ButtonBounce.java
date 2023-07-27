package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.OvershootInterpolator;
public class ButtonBounce {
    private ValueAnimator animator;
    private final float durationMultiplier;
    private boolean isPressed;
    private float pressedT;
    private View view;

    public ButtonBounce(View view) {
        this.view = view;
        this.durationMultiplier = 1.0f;
    }

    public ButtonBounce(View view, float f) {
        this.view = view;
        this.durationMultiplier = f;
    }

    public void setView(View view) {
        this.view = view;
    }

    public void setPressed(final boolean z) {
        if (this.isPressed != z) {
            this.isPressed = z;
            ValueAnimator valueAnimator = this.animator;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            float[] fArr = new float[2];
            fArr[0] = this.pressedT;
            fArr[1] = z ? 1.0f : 0.0f;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
            this.animator = ofFloat;
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    ButtonBounce.this.lambda$setPressed$0(valueAnimator2);
                }
            });
            this.animator.addListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationEnd(Animator animator) {
                    ButtonBounce.this.animator = null;
                    ButtonBounce.this.pressedT = z ? 1.0f : 0.0f;
                    ButtonBounce.this.invalidate();
                }
            });
            if (this.isPressed) {
                this.animator.setInterpolator(CubicBezierInterpolator.DEFAULT);
                this.animator.setDuration(this.durationMultiplier * 60.0f);
            } else {
                this.animator.setInterpolator(new OvershootInterpolator(5.0f));
                this.animator.setDuration(this.durationMultiplier * 350.0f);
            }
            this.animator.start();
        }
    }

    public void lambda$setPressed$0(ValueAnimator valueAnimator) {
        this.pressedT = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        invalidate();
    }

    public float getScale(float f) {
        return (1.0f - f) + (f * (1.0f - this.pressedT));
    }

    public boolean isPressed() {
        return this.isPressed;
    }

    public void invalidate() {
        View view = this.view;
        if (view != null) {
            view.invalidate();
        }
    }
}
