package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class su0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f39435a;
    public final vu0 f39436b;

    public su0(vu0 vu0Var, int i7) {
        this.f39435a = i7;
        this.f39436b = vu0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f39435a) {
            case 0:
                vu0 vu0Var = this.f39436b;
                vu0Var.getClass();
                vu0Var.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                vu0Var.invalidate();
                return;
            case 1:
                vu0 vu0Var2 = this.f39436b;
                vu0Var2.getClass();
                vu0Var2.m(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                vu0 vu0Var3 = this.f39436b;
                vu0Var3.getClass();
                vu0Var3.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                vu0Var3.invalidate();
                return;
        }
    }
}
