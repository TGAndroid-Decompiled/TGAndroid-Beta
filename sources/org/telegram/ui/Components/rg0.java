package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class rg0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f30023a;
    public final ug0 f30024b;

    public rg0(ug0 ug0Var, int i10) {
        this.f30023a = i10;
        this.f30024b = ug0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f30023a) {
            case 0:
                ug0 ug0Var = this.f30024b;
                ug0Var.getClass();
                ug0Var.f30888b = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ug0Var.c(true);
                return;
            default:
                ug0 ug0Var2 = this.f30024b;
                ug0Var2.getClass();
                ug0Var2.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ug0Var2.c(true);
                return;
        }
    }
}
