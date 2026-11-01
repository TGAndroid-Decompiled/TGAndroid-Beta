package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
public final class b2 implements ValueAnimator.AnimatorUpdateListener {
    public final int f31393a;
    public final c2 f31394b;

    public b2(c2 c2Var, int i10) {
        this.f31393a = i10;
        this.f31394b = c2Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f31393a) {
            case 0:
                c2 c2Var = this.f31394b;
                c2Var.getClass();
                c2Var.Q = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c2Var.a(c2Var.R, c2Var.S);
                return;
            default:
                c2 c2Var2 = this.f31394b;
                c2Var2.getClass();
                c2Var2.W = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c2Var2.invalidate();
                return;
        }
    }
}
