package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
public final class t2 implements ValueAnimator.AnimatorUpdateListener {
    public final int f28467a;
    public final u2 f28468b;

    public t2(u2 u2Var, int i10) {
        this.f28467a = i10;
        this.f28468b = u2Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f28467a) {
            case 0:
                u2 u2Var = this.f28468b;
                u2Var.getClass();
                u2Var.Q = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u2Var.a(u2Var.R, u2Var.S);
                return;
            default:
                u2 u2Var2 = this.f28468b;
                u2Var2.getClass();
                u2Var2.W = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u2Var2.invalidate();
                return;
        }
    }
}
