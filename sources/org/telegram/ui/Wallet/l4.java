package org.telegram.ui.Wallet;

import android.animation.ValueAnimator;
public final class l4 implements ValueAnimator.AnimatorUpdateListener {
    public final int f42790a;
    public final z5 f42791b;

    public l4(z5 z5Var, int i7) {
        this.f42790a = i7;
        this.f42791b = z5Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f42790a) {
            case 0:
                z5 z5Var = this.f42791b;
                z5Var.getClass();
                z5Var.N0(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                z5 z5Var2 = this.f42791b;
                z5Var2.getClass();
                z5Var2.H0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                z5Var2.U0();
                return;
        }
    }
}
