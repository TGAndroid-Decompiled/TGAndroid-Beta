package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class cg0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f27479a;
    public final fg0 f27480b;

    public cg0(fg0 fg0Var, int i9) {
        this.f27479a = i9;
        this.f27480b = fg0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f27479a) {
            case 0:
                fg0 fg0Var = this.f27480b;
                fg0Var.getClass();
                fg0Var.f28417b = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                fg0Var.c(true);
                return;
            default:
                fg0 fg0Var2 = this.f27480b;
                fg0Var2.getClass();
                fg0Var2.A = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                fg0Var2.c(true);
                return;
        }
    }
}
