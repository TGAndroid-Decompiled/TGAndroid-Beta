package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class qw0 extends AnimatorListenerAdapter {
    public final int f27464a;
    public final rw0 f27465b;

    public qw0(rw0 rw0Var, int i10) {
        this.f27464a = i10;
        this.f27465b = rw0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f27464a) {
            case 0:
                rw0 rw0Var = this.f27465b;
                rw0Var.f27700y = 1.0f;
                rw0Var.invalidate();
                rw0Var.G = null;
                return;
            case 1:
                rw0 rw0Var2 = this.f27465b;
                rw0Var2.m(((Float) rw0Var2.v.getAnimatedValue()).floatValue());
                rw0Var2.v = null;
                return;
            default:
                super.onAnimationEnd(animator);
                this.f27465b.F = null;
                return;
        }
    }
}
