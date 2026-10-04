package org.telegram.ui;

import android.animation.ValueAnimator;
public final class q9 implements ValueAnimator.AnimatorUpdateListener {
    public final int f39644a;
    public final w9 f39645b;

    public q9(w9 w9Var, int i10) {
        this.f39644a = i10;
        this.f39645b = w9Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f39644a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w9 w9Var = this.f39645b;
                w9Var.X = floatValue;
                w9Var.f41960a.setAlpha(1.0f - floatValue);
                if (w9Var.V == 3) {
                    w9Var.f41962b.setAlpha(1.0f - w9Var.X);
                }
                w9Var.f41971r.setAlpha(1.0f - w9Var.X);
                w9Var.v = (w9Var.X * 0.25f) + 0.5f;
                w9Var.fragmentView.invalidate();
                return;
            default:
                this.f39645b.f41971r.invalidate();
                return;
        }
    }
}
