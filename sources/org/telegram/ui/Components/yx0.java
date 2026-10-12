package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class yx0 extends AnimatorListenerAdapter {
    public final int f33217a;
    public final zx0 f33218b;

    public yx0(zx0 zx0Var, int i10) {
        this.f33217a = i10;
        this.f33218b = zx0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f33217a) {
            case 0:
                zx0 zx0Var = this.f33218b;
                zx0Var.f33518y = 1.0f;
                zx0Var.invalidate();
                zx0Var.G = null;
                return;
            case 1:
                zx0 zx0Var2 = this.f33218b;
                zx0Var2.m(((Float) zx0Var2.v.getAnimatedValue()).floatValue());
                zx0Var2.v = null;
                return;
            default:
                super.onAnimationEnd(animator);
                this.f33218b.F = null;
                return;
        }
    }
}
