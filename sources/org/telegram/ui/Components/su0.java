package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class su0 extends AnimatorListenerAdapter {
    public final int f38126a;
    public final tu0 f38127b;

    public su0(tu0 tu0Var, int i7) {
        this.f38126a = i7;
        this.f38127b = tu0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f38126a) {
            case 0:
                tu0 tu0Var = this.f38127b;
                tu0Var.D = 1.0f;
                tu0Var.invalidate();
                tu0Var.G = null;
                return;
            case 1:
                tu0 tu0Var2 = this.f38127b;
                tu0Var2.m(((Float) tu0Var2.f38407w.getAnimatedValue()).floatValue());
                tu0Var2.f38407w = null;
                return;
            default:
                super.onAnimationEnd(animator);
                this.f38127b.F = null;
                return;
        }
    }
}
