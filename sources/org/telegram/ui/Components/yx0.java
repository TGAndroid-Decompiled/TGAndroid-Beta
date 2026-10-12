package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class yx0 extends AnimatorListenerAdapter {
    public final int f33223a;
    public final zx0 f33224b;

    public yx0(zx0 zx0Var, int i10) {
        this.f33223a = i10;
        this.f33224b = zx0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f33223a) {
            case 0:
                zx0 zx0Var = this.f33224b;
                zx0Var.f33520y = 1.0f;
                zx0Var.invalidate();
                zx0Var.G = null;
                return;
            case 1:
                zx0 zx0Var2 = this.f33224b;
                zx0Var2.m(((Float) zx0Var2.v.getAnimatedValue()).floatValue());
                zx0Var2.v = null;
                return;
            default:
                super.onAnimationEnd(animator);
                this.f33224b.F = null;
                return;
        }
    }
}
