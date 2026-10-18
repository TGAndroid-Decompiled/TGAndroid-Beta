package org.telegram.ui.Wallet;

import android.animation.ValueAnimator;
public final class z3 implements ValueAnimator.AnimatorUpdateListener {
    public final int f35174a;
    public final n5 f35175b;

    public z3(n5 n5Var, int i10) {
        this.f35174a = i10;
        this.f35175b = n5Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f35174a) {
            case 0:
                n5 n5Var = this.f35175b;
                n5Var.getClass();
                n5Var.G0(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                n5 n5Var2 = this.f35175b;
                n5Var2.getClass();
                n5Var2.G0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n5Var2.M0();
                return;
        }
    }
}
