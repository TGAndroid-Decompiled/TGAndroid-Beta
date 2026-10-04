package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class lx0 extends AnimatorListenerAdapter {
    public final int f28477a;
    public final mx0 f28478b;

    public lx0(mx0 mx0Var, int i10) {
        this.f28477a = i10;
        this.f28478b = mx0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f28477a) {
            case 0:
                mx0 mx0Var = this.f28478b;
                mx0Var.f28753y = 1.0f;
                mx0Var.invalidate();
                mx0Var.G = null;
                return;
            case 1:
                mx0 mx0Var2 = this.f28478b;
                mx0Var2.m(((Float) mx0Var2.v.getAnimatedValue()).floatValue());
                mx0Var2.v = null;
                return;
            default:
                super.onAnimationEnd(animator);
                this.f28478b.F = null;
                return;
        }
    }
}
