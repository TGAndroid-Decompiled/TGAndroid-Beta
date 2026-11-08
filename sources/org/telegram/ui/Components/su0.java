package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class su0 extends AnimatorListenerAdapter {
    public final int f38144a;
    public final tu0 f38145b;

    public su0(tu0 tu0Var, int i7) {
        this.f38144a = i7;
        this.f38145b = tu0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f38144a) {
            case 0:
                tu0 tu0Var = this.f38145b;
                tu0Var.D = 1.0f;
                tu0Var.invalidate();
                tu0Var.G = null;
                return;
            case 1:
                tu0 tu0Var2 = this.f38145b;
                tu0Var2.m(((Float) tu0Var2.f38430w.getAnimatedValue()).floatValue());
                tu0Var2.f38430w = null;
                return;
            default:
                super.onAnimationEnd(animator);
                this.f38145b.F = null;
                return;
        }
    }
}
