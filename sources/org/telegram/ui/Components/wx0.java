package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class wx0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f32577a;
    public final zx0 f32578b;

    public wx0(zx0 zx0Var, int i10) {
        this.f32577a = i10;
        this.f32578b = zx0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f32577a) {
            case 0:
                zx0 zx0Var = this.f32578b;
                zx0Var.getClass();
                zx0Var.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                zx0Var.invalidate();
                return;
            case 1:
                zx0 zx0Var2 = this.f32578b;
                zx0Var2.getClass();
                zx0Var2.m(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                zx0 zx0Var3 = this.f32578b;
                zx0Var3.getClass();
                zx0Var3.f33518y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                zx0Var3.invalidate();
                return;
        }
    }
}
