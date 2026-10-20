package org.telegram.ui.Wallet;

import android.animation.ValueAnimator;
public final class v3 implements ValueAnimator.AnimatorUpdateListener {
    public final int f35016a;
    public final o5 f35017b;

    public v3(o5 o5Var, int i10) {
        this.f35016a = i10;
        this.f35017b = o5Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f35016a) {
            case 0:
                o5 o5Var = this.f35017b;
                o5Var.getClass();
                o5Var.H0(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                o5 o5Var2 = this.f35017b;
                o5Var2.getClass();
                o5Var2.G0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o5Var2.N0();
                return;
        }
    }
}
