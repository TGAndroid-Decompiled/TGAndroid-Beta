package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
public final class b2 implements ValueAnimator.AnimatorUpdateListener {
    public final int f39239a;
    public final c2 f39240b;

    public b2(c2 c2Var, int i3) {
        this.f39239a = i3;
        this.f39240b = c2Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f39239a) {
            case 0:
                c2 c2Var = this.f39240b;
                c2Var.getClass();
                c2Var.R = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c2Var.a(c2Var.S, c2Var.T);
                return;
            default:
                c2 c2Var2 = this.f39240b;
                c2Var2.getClass();
                c2Var2.f39273a0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c2Var2.invalidate();
                return;
        }
    }
}
