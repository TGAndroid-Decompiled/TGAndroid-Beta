package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
public final class u2 implements ValueAnimator.AnimatorUpdateListener {
    public final int f29957a;
    public final v2 f29958b;

    public u2(v2 v2Var, int i10) {
        this.f29957a = i10;
        this.f29958b = v2Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f29957a) {
            case 0:
                v2 v2Var = this.f29958b;
                v2Var.getClass();
                v2Var.N = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                v2Var.a(v2Var.O, v2Var.P);
                return;
            default:
                v2 v2Var2 = this.f29958b;
                v2Var2.getClass();
                v2Var2.T = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                v2Var2.invalidate();
                return;
        }
    }
}
