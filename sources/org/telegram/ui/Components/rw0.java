package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class rw0 extends AnimatorListenerAdapter {
    public final int f27711a;
    public final sw0 f27712b;

    public rw0(sw0 sw0Var, int i10) {
        this.f27711a = i10;
        this.f27712b = sw0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f27711a) {
            case 0:
                sw0 sw0Var = this.f27712b;
                sw0Var.f27944y = 1.0f;
                sw0Var.invalidate();
                sw0Var.G = null;
                return;
            case 1:
                sw0 sw0Var2 = this.f27712b;
                sw0Var2.m(((Float) sw0Var2.v.getAnimatedValue()).floatValue());
                sw0Var2.v = null;
                return;
            default:
                super.onAnimationEnd(animator);
                this.f27712b.F = null;
                return;
        }
    }
}
