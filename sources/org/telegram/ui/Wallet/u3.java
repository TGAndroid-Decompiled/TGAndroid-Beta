package org.telegram.ui.Wallet;

import android.animation.ValueAnimator;
public final class u3 implements ValueAnimator.AnimatorUpdateListener {
    public final int f35290a;
    public final o5 f35291b;

    public u3(o5 o5Var, int i10) {
        this.f35290a = i10;
        this.f35291b = o5Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f35290a) {
            case 0:
                o5 o5Var = this.f35291b;
                o5Var.getClass();
                o5Var.H0(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                o5 o5Var2 = this.f35291b;
                o5Var2.getClass();
                o5Var2.G0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o5Var2.O0();
                return;
        }
    }
}
