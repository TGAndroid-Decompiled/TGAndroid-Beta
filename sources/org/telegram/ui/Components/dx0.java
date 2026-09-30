package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class dx0 extends AnimatorListenerAdapter {
    public final int f23776a;
    public final ex0 f23777b;

    public dx0(ex0 ex0Var, int i10) {
        this.f23776a = i10;
        this.f23777b = ex0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f23776a) {
            case 0:
                ex0 ex0Var = this.f23777b;
                ex0Var.f24072y = 1.0f;
                ex0Var.invalidate();
                ex0Var.G = null;
                return;
            case 1:
                ex0 ex0Var2 = this.f23777b;
                ex0Var2.m(((Float) ex0Var2.v.getAnimatedValue()).floatValue());
                ex0Var2.v = null;
                return;
            default:
                super.onAnimationEnd(animator);
                this.f23777b.F = null;
                return;
        }
    }
}
