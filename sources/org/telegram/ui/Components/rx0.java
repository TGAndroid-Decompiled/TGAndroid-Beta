package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class rx0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f30602a;
    public final ux0 f30603b;

    public rx0(ux0 ux0Var, int i10) {
        this.f30602a = i10;
        this.f30603b = ux0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f30602a) {
            case 0:
                ux0 ux0Var = this.f30603b;
                ux0Var.getClass();
                ux0Var.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ux0Var.invalidate();
                return;
            case 1:
                ux0 ux0Var2 = this.f30603b;
                ux0Var2.getClass();
                ux0Var2.m(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                ux0 ux0Var3 = this.f30603b;
                ux0Var3.getClass();
                ux0Var3.f31662y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ux0Var3.invalidate();
                return;
        }
    }
}
