package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
public final class t2 implements ValueAnimator.AnimatorUpdateListener {
    public final int f30521a;
    public final u2 f30522b;

    public t2(u2 u2Var, int i10) {
        this.f30521a = i10;
        this.f30522b = u2Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f30521a) {
            case 0:
                u2 u2Var = this.f30522b;
                u2Var.getClass();
                u2Var.Q = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u2Var.a(u2Var.R, u2Var.S);
                return;
            default:
                u2 u2Var2 = this.f30522b;
                u2Var2.getClass();
                u2Var2.W = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u2Var2.invalidate();
                return;
        }
    }
}
