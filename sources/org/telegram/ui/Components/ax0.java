package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class ax0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f22762a;
    public final dx0 f22763b;

    public ax0(dx0 dx0Var, int i10) {
        this.f22762a = i10;
        this.f22763b = dx0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f22762a) {
            case 0:
                dx0 dx0Var = this.f22763b;
                dx0Var.getClass();
                dx0Var.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                dx0Var.invalidate();
                return;
            case 1:
                dx0 dx0Var2 = this.f22763b;
                dx0Var2.getClass();
                dx0Var2.m(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                dx0 dx0Var3 = this.f22763b;
                dx0Var3.getClass();
                dx0Var3.f23750y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                dx0Var3.invalidate();
                return;
        }
    }
}
