package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class tx0 extends AnimatorListenerAdapter {
    public final int f31272a;
    public final ux0 f31273b;

    public tx0(ux0 ux0Var, int i10) {
        this.f31272a = i10;
        this.f31273b = ux0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f31272a) {
            case 0:
                ux0 ux0Var = this.f31273b;
                ux0Var.f31662y = 1.0f;
                ux0Var.invalidate();
                ux0Var.G = null;
                return;
            case 1:
                ux0 ux0Var2 = this.f31273b;
                ux0Var2.m(((Float) ux0Var2.v.getAnimatedValue()).floatValue());
                ux0Var2.v = null;
                return;
            default:
                super.onAnimationEnd(animator);
                this.f31273b.F = null;
                return;
        }
    }
}
