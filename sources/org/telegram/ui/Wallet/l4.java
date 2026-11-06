package org.telegram.ui.Wallet;

import android.animation.ValueAnimator;
public final class l4 implements ValueAnimator.AnimatorUpdateListener {
    public final int f42736a;
    public final y5 f42737b;

    public l4(y5 y5Var, int i7) {
        this.f42736a = i7;
        this.f42737b = y5Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f42736a) {
            case 0:
                y5 y5Var = this.f42737b;
                y5Var.getClass();
                y5Var.M0(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                y5 y5Var2 = this.f42737b;
                y5Var2.getClass();
                y5Var2.H0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                y5Var2.T0();
                return;
        }
    }
}
