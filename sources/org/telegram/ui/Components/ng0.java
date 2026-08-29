package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class ng0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f30981a;
    public final qg0 f30982b;

    public ng0(qg0 qg0Var, int i10) {
        this.f30981a = i10;
        this.f30982b = qg0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f30981a) {
            case 0:
                qg0 qg0Var = this.f30982b;
                qg0Var.getClass();
                qg0Var.f31942b = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                qg0Var.c(true);
                return;
            default:
                qg0 qg0Var2 = this.f30982b;
                qg0Var2.getClass();
                qg0Var2.A = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                qg0Var2.c(true);
                return;
        }
    }
}
