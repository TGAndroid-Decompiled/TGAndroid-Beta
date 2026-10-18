package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class hx0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f26963a;
    public final kx0 f26964b;

    public hx0(kx0 kx0Var, int i10) {
        this.f26963a = i10;
        this.f26964b = kx0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f26963a) {
            case 0:
                kx0 kx0Var = this.f26964b;
                kx0Var.getClass();
                kx0Var.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kx0Var.invalidate();
                return;
            case 1:
                kx0 kx0Var2 = this.f26964b;
                kx0Var2.getClass();
                kx0Var2.m(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                kx0 kx0Var3 = this.f26964b;
                kx0Var3.getClass();
                kx0Var3.f28020y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kx0Var3.invalidate();
                return;
        }
    }
}
