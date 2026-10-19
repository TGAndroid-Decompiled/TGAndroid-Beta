package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class kx0 extends AnimatorListenerAdapter {
    public final int f28022a;
    public final lx0 f28023b;

    public kx0(lx0 lx0Var, int i10) {
        this.f28022a = i10;
        this.f28023b = lx0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f28022a) {
            case 0:
                lx0 lx0Var = this.f28023b;
                lx0Var.f28330y = 1.0f;
                lx0Var.invalidate();
                lx0Var.G = null;
                return;
            case 1:
                lx0 lx0Var2 = this.f28023b;
                lx0Var2.m(((Float) lx0Var2.v.getAnimatedValue()).floatValue());
                lx0Var2.v = null;
                return;
            default:
                super.onAnimationEnd(animator);
                this.f28023b.F = null;
                return;
        }
    }
}
