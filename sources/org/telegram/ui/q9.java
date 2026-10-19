package org.telegram.ui;

import android.animation.ValueAnimator;
public final class q9 implements ValueAnimator.AnimatorUpdateListener {
    public final int f40504a;
    public final w9 f40505b;

    public q9(w9 w9Var, int i10) {
        this.f40504a = i10;
        this.f40505b = w9Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f40504a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w9 w9Var = this.f40505b;
                w9Var.Y = floatValue;
                w9Var.f42496b.setAlpha(1.0f - floatValue);
                if (w9Var.W == 3) {
                    w9Var.f42498c.setAlpha(1.0f - w9Var.Y);
                }
                w9Var.f42506s.setAlpha(1.0f - w9Var.Y);
                w9Var.f42507w = (w9Var.Y * 0.25f) + 0.5f;
                w9Var.fragmentView.invalidate();
                return;
            default:
                this.f40505b.f42506s.invalidate();
                return;
        }
    }
}
