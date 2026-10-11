package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class rx0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f30661a;
    public final ux0 f30662b;

    public rx0(ux0 ux0Var, int i10) {
        this.f30661a = i10;
        this.f30662b = ux0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f30661a) {
            case 0:
                ux0 ux0Var = this.f30662b;
                ux0Var.getClass();
                ux0Var.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ux0Var.invalidate();
                return;
            case 1:
                ux0 ux0Var2 = this.f30662b;
                ux0Var2.getClass();
                ux0Var2.m(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                ux0 ux0Var3 = this.f30662b;
                ux0Var3.getClass();
                ux0Var3.f31744y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ux0Var3.invalidate();
                return;
        }
    }
}
