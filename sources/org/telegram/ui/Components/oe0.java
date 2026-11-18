package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class oe0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f38073a;
    public final qe0 f38074b;

    public oe0(qe0 qe0Var, int i7) {
        this.f38073a = i7;
        this.f38074b = qe0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f38073a) {
            case 0:
                qe0 qe0Var = this.f38074b;
                qe0Var.getClass();
                qe0Var.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                qe0Var.invalidate();
                return;
            default:
                qe0 qe0Var2 = this.f38074b;
                qe0Var2.getClass();
                qe0Var2.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                qe0Var2.invalidate();
                return;
        }
    }
}
