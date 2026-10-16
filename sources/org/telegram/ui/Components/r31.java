package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class r31 implements ValueAnimator.AnimatorUpdateListener {
    public final int f28421a;
    public final t31 f28422b;

    public r31(t31 t31Var, int i10) {
        this.f28421a = i10;
        this.f28422b = t31Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f28421a) {
            case 0:
                bi.d4 d4Var = this.f28422b.f28962f;
                d4Var.setScaleX(Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                d4Var.setScaleY(Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                d4Var.invalidate();
                return;
            default:
                t31 t31Var = this.f28422b;
                t31Var.getClass();
                t31Var.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t31Var.h();
                return;
        }
    }
}
