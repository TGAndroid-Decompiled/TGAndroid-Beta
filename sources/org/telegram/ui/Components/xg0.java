package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class xg0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f30674a;
    public final ah0 f30675b;

    public xg0(ah0 ah0Var, int i10) {
        this.f30674a = i10;
        this.f30675b = ah0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f30674a) {
            case 0:
                ah0 ah0Var = this.f30675b;
                ah0Var.getClass();
                ah0Var.f23394b = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ah0Var.c(true);
                return;
            default:
                ah0 ah0Var2 = this.f30675b;
                ah0Var2.getClass();
                ah0Var2.B = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ah0Var2.c(true);
                return;
        }
    }
}
