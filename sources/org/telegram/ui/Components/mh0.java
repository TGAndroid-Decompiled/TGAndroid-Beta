package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class mh0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f28522a;
    public final ph0 f28523b;

    public mh0(ph0 ph0Var, int i10) {
        this.f28522a = i10;
        this.f28523b = ph0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f28522a) {
            case 0:
                ph0 ph0Var = this.f28523b;
                ph0Var.getClass();
                ph0Var.f29310b = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ph0Var.c(true);
                return;
            default:
                ph0 ph0Var2 = this.f28523b;
                ph0Var2.getClass();
                ph0Var2.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ph0Var2.c(true);
                return;
        }
    }
}
