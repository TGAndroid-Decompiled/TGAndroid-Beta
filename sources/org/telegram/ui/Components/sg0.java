package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class sg0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f30491a;
    public final ug0 f30492b;

    public sg0(ug0 ug0Var, int i10) {
        this.f30491a = i10;
        this.f30492b = ug0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f30491a) {
            case 0:
                ug0 ug0Var = this.f30492b;
                ug0Var.getClass();
                ug0Var.f31162y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ug0Var.invalidate();
                return;
            default:
                ug0 ug0Var2 = this.f30492b;
                ug0Var2.getClass();
                ug0Var2.f31162y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ug0Var2.invalidate();
                return;
        }
    }
}
