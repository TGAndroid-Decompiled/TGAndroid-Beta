package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class uu0 extends AnimatorListenerAdapter {
    public final int f38807a;
    public final vu0 f38808b;

    public uu0(vu0 vu0Var, int i7) {
        this.f38807a = i7;
        this.f38808b = vu0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f38807a) {
            case 0:
                vu0 vu0Var = this.f38808b;
                vu0Var.D = 1.0f;
                vu0Var.invalidate();
                vu0Var.G = null;
                return;
            case 1:
                vu0 vu0Var2 = this.f38808b;
                vu0Var2.m(((Float) vu0Var2.f39807w.getAnimatedValue()).floatValue());
                vu0Var2.f39807w = null;
                return;
            default:
                super.onAnimationEnd(animator);
                this.f38808b.F = null;
                return;
        }
    }
}
