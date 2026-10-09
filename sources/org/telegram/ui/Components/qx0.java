package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class qx0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f30298a;
    public final tx0 f30299b;

    public qx0(tx0 tx0Var, int i10) {
        this.f30298a = i10;
        this.f30299b = tx0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f30298a) {
            case 0:
                tx0 tx0Var = this.f30299b;
                tx0Var.getClass();
                tx0Var.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                tx0Var.invalidate();
                return;
            case 1:
                tx0 tx0Var2 = this.f30299b;
                tx0Var2.getClass();
                tx0Var2.m(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                tx0 tx0Var3 = this.f30299b;
                tx0Var3.getClass();
                tx0Var3.f31303y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                tx0Var3.invalidate();
                return;
        }
    }
}
