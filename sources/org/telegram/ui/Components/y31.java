package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class y31 implements ValueAnimator.AnimatorUpdateListener {
    public final int f34956a;
    public final a41 f34957b;

    public y31(a41 a41Var, int i10) {
        this.f34956a = i10;
        this.f34957b = a41Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f34956a) {
            case 0:
                di.h3 h3Var = this.f34957b.f26430f;
                h3Var.setScaleX(Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                h3Var.setScaleY(Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                h3Var.invalidate();
                return;
            default:
                a41 a41Var = this.f34957b;
                a41Var.getClass();
                a41Var.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                a41Var.h();
                return;
        }
    }
}
