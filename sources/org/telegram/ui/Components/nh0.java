package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class nh0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f28801a;
    public final qh0 f28802b;

    public nh0(qh0 qh0Var, int i10) {
        this.f28801a = i10;
        this.f28802b = qh0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f28801a) {
            case 0:
                qh0 qh0Var = this.f28802b;
                qh0Var.getClass();
                qh0Var.f29596b = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                qh0Var.c(true);
                return;
            default:
                qh0 qh0Var2 = this.f28802b;
                qh0Var2.getClass();
                qh0Var2.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                qh0Var2.c(true);
                return;
        }
    }
}
