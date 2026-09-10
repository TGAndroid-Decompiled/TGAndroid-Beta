package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class bx0 extends AnimatorListenerAdapter {
    public final int f21917a;
    public final cx0 f21918b;

    public bx0(cx0 cx0Var, int i10) {
        this.f21917a = i10;
        this.f21918b = cx0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f21917a) {
            case 0:
                cx0 cx0Var = this.f21918b;
                cx0Var.f22246y = 1.0f;
                cx0Var.invalidate();
                cx0Var.G = null;
                return;
            case 1:
                cx0 cx0Var2 = this.f21918b;
                cx0Var2.m(((Float) cx0Var2.v.getAnimatedValue()).floatValue());
                cx0Var2.v = null;
                return;
            default:
                super.onAnimationEnd(animator);
                this.f21918b.F = null;
                return;
        }
    }
}
