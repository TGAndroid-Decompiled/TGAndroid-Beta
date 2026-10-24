package org.telegram.ui;

import android.animation.ValueAnimator;
public final class q9 implements ValueAnimator.AnimatorUpdateListener {
    public final int f40740a;
    public final w9 f40741b;

    public q9(w9 w9Var, int i10) {
        this.f40740a = i10;
        this.f40741b = w9Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f40740a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w9 w9Var = this.f40741b;
                w9Var.Y = floatValue;
                w9Var.f42950b.setAlpha(1.0f - floatValue);
                if (w9Var.W == 3) {
                    w9Var.f42952c.setAlpha(1.0f - w9Var.Y);
                }
                w9Var.f42960s.setAlpha(1.0f - w9Var.Y);
                w9Var.f42961w = (w9Var.Y * 0.25f) + 0.5f;
                w9Var.fragmentView.invalidate();
                return;
            default:
                this.f40741b.f42960s.invalidate();
                return;
        }
    }
}
