package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class wv0 extends AnimatorListenerAdapter {
    public final int f32327a;
    public final xv0 f32328b;

    public wv0(xv0 xv0Var, int i10) {
        this.f32327a = i10;
        this.f32328b = xv0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f32327a) {
            case 0:
                xv0 xv0Var = this.f32328b;
                xv0Var.D = 1.0f;
                xv0Var.invalidate();
                xv0Var.G = null;
                return;
            case 1:
                xv0 xv0Var2 = this.f32328b;
                xv0Var2.m(((Float) xv0Var2.f32642w.getAnimatedValue()).floatValue());
                xv0Var2.f32642w = null;
                return;
            default:
                super.onAnimationEnd(animator);
                this.f32328b.F = null;
                return;
        }
    }
}
