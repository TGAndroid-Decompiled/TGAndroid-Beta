package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class rg0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f30051a;
    public final ug0 f30052b;

    public rg0(ug0 ug0Var, int i10) {
        this.f30051a = i10;
        this.f30052b = ug0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f30051a) {
            case 0:
                ug0 ug0Var = this.f30052b;
                ug0Var.getClass();
                ug0Var.f30916b = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ug0Var.c(true);
                return;
            default:
                ug0 ug0Var2 = this.f30052b;
                ug0Var2.getClass();
                ug0Var2.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ug0Var2.c(true);
                return;
        }
    }
}
