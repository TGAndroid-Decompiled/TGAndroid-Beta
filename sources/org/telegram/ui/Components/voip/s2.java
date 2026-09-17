package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
public final class s2 implements ValueAnimator.AnimatorUpdateListener {
    public final int f31803a;
    public final t2 f31804b;

    public s2(t2 t2Var, int i10) {
        this.f31803a = i10;
        this.f31804b = t2Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f31803a) {
            case 0:
                t2 t2Var = this.f31804b;
                t2Var.getClass();
                t2Var.Q = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t2Var.a(t2Var.R, t2Var.S);
                return;
            default:
                t2 t2Var2 = this.f31804b;
                t2Var2.getClass();
                t2Var2.W = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t2Var2.invalidate();
                return;
        }
    }
}
