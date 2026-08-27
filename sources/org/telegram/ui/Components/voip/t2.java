package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;

public final class t2 implements ValueAnimator.AnimatorUpdateListener {

    public final int f33909a;

    public final u2 f33910b;

    public t2(u2 u2Var, int i10) {
        this.f33909a = i10;
        this.f33910b = u2Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f33909a) {
            case 0:
                u2 u2Var = this.f33910b;
                u2Var.getClass();
                u2Var.M = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u2Var.a(u2Var.N, u2Var.O);
                break;
            default:
                u2 u2Var2 = this.f33910b;
                u2Var2.getClass();
                u2Var2.S = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u2Var2.invalidate();
                break;
        }
    }
}
