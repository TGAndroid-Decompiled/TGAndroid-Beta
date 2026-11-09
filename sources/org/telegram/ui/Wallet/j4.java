package org.telegram.ui.Wallet;

import android.animation.ValueAnimator;
public final class j4 implements ValueAnimator.AnimatorUpdateListener {
    public final int f42625a;
    public final w5 f42626b;

    public j4(w5 w5Var, int i7) {
        this.f42625a = i7;
        this.f42626b = w5Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f42625a) {
            case 0:
                w5 w5Var = this.f42626b;
                w5Var.getClass();
                w5Var.M0(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                w5 w5Var2 = this.f42626b;
                w5Var2.getClass();
                w5Var2.H0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w5Var2.T0();
                return;
        }
    }
}
