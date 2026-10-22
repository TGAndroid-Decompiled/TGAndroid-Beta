package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class nh0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f28800a;
    public final qh0 f28801b;

    public nh0(qh0 qh0Var, int i10) {
        this.f28800a = i10;
        this.f28801b = qh0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f28800a) {
            case 0:
                qh0 qh0Var = this.f28801b;
                qh0Var.getClass();
                qh0Var.f29595b = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                qh0Var.c(true);
                return;
            default:
                qh0 qh0Var2 = this.f28801b;
                qh0Var2.getClass();
                qh0Var2.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                qh0Var2.c(true);
                return;
        }
    }
}
