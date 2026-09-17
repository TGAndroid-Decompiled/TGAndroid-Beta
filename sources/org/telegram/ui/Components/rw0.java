package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class rw0 extends AnimatorListenerAdapter {
    public final int f27708a;
    public final sw0 f27709b;

    public rw0(sw0 sw0Var, int i10) {
        this.f27708a = i10;
        this.f27709b = sw0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f27708a) {
            case 0:
                sw0 sw0Var = this.f27709b;
                sw0Var.f27941y = 1.0f;
                sw0Var.invalidate();
                sw0Var.G = null;
                return;
            case 1:
                sw0 sw0Var2 = this.f27709b;
                sw0Var2.m(((Float) sw0Var2.v.getAnimatedValue()).floatValue());
                sw0Var2.v = null;
                return;
            default:
                super.onAnimationEnd(animator);
                this.f27709b.F = null;
                return;
        }
    }
}
