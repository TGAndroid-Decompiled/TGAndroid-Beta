package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
public final class t2 implements ValueAnimator.AnimatorUpdateListener {
    public final int f33859a;
    public final u2 f33860b;

    public t2(u2 u2Var, int i9) {
        this.f33859a = i9;
        this.f33860b = u2Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f33859a) {
            case 0:
                u2 u2Var = this.f33860b;
                u2Var.getClass();
                u2Var.M = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u2Var.a(u2Var.N, u2Var.O);
                return;
            default:
                u2 u2Var2 = this.f33860b;
                u2Var2.getClass();
                u2Var2.S = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u2Var2.invalidate();
                return;
        }
    }
}
