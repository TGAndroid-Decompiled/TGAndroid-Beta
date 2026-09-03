package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class rw0 extends AnimatorListenerAdapter {
    public final int f30915a;
    public final sw0 f30916b;

    public rw0(sw0 sw0Var, int i10) {
        this.f30915a = i10;
        this.f30916b = sw0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f30915a) {
            case 0:
                sw0 sw0Var = this.f30916b;
                sw0Var.f31195y = 1.0f;
                sw0Var.invalidate();
                sw0Var.D = null;
                return;
            case 1:
                sw0 sw0Var2 = this.f30916b;
                sw0Var2.m(((Float) sw0Var2.v.getAnimatedValue()).floatValue());
                sw0Var2.v = null;
                return;
            default:
                super.onAnimationEnd(animator);
                this.f30916b.C = null;
                return;
        }
    }
}
