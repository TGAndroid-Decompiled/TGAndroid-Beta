package org.telegram.ui.Wallet;

import android.animation.ValueAnimator;
public final class l4 implements ValueAnimator.AnimatorUpdateListener {
    public final int f34838a;
    public final b6 f34839b;

    public l4(b6 b6Var, int i10) {
        this.f34838a = i10;
        this.f34839b = b6Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f34838a) {
            case 0:
                b6 b6Var = this.f34839b;
                b6Var.getClass();
                b6Var.L0(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                b6 b6Var2 = this.f34839b;
                b6Var2.getClass();
                b6Var2.H0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                b6Var2.S0();
                return;
        }
    }
}
