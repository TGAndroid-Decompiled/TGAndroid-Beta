package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class ve0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f40390a;
    public final ye0 f40391b;

    public ve0(ye0 ye0Var, int i7) {
        this.f40390a = i7;
        this.f40391b = ye0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f40390a) {
            case 0:
                ye0 ye0Var = this.f40391b;
                ye0Var.getClass();
                ye0Var.f41982b = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ye0Var.c(true);
                return;
            default:
                ye0 ye0Var2 = this.f40391b;
                ye0Var2.getClass();
                ye0Var2.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ye0Var2.c(true);
                return;
        }
    }
}
