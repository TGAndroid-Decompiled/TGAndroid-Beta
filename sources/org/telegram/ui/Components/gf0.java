package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class gf0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f35410a;
    public final jf0 f35411b;

    public gf0(jf0 jf0Var, int i7) {
        this.f35410a = i7;
        this.f35411b = jf0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f35410a) {
            case 0:
                jf0 jf0Var = this.f35411b;
                jf0Var.getClass();
                jf0Var.f36399b = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                jf0Var.c(true);
                return;
            default:
                jf0 jf0Var2 = this.f35411b;
                jf0Var2.getClass();
                jf0Var2.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                jf0Var2.c(true);
                return;
        }
    }
}
