package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class tu0 extends AnimatorListenerAdapter {
    public final int f38401a;
    public final uu0 f38402b;

    public tu0(uu0 uu0Var, int i7) {
        this.f38401a = i7;
        this.f38402b = uu0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f38401a) {
            case 0:
                uu0 uu0Var = this.f38402b;
                uu0Var.D = 1.0f;
                uu0Var.invalidate();
                uu0Var.G = null;
                return;
            case 1:
                uu0 uu0Var2 = this.f38402b;
                uu0Var2.m(((Float) uu0Var2.f38748w.getAnimatedValue()).floatValue());
                uu0Var2.f38748w = null;
                return;
            default:
                super.onAnimationEnd(animator);
                this.f38402b.F = null;
                return;
        }
    }
}
