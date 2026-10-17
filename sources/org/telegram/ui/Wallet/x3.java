package org.telegram.ui.Wallet;

import android.animation.ValueAnimator;
public final class x3 implements ValueAnimator.AnimatorUpdateListener {
    public final int f35127a;
    public final l5 f35128b;

    public x3(l5 l5Var, int i10) {
        this.f35127a = i10;
        this.f35128b = l5Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f35127a) {
            case 0:
                l5 l5Var = this.f35128b;
                l5Var.getClass();
                l5Var.F0(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                l5 l5Var2 = this.f35128b;
                l5Var2.getClass();
                l5Var2.I0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l5Var2.M0();
                return;
        }
    }
}
