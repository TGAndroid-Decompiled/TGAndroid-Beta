package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class sx0 extends AnimatorListenerAdapter {
    public final int f30946a;
    public final tx0 f30947b;

    public sx0(tx0 tx0Var, int i10) {
        this.f30946a = i10;
        this.f30947b = tx0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f30946a) {
            case 0:
                tx0 tx0Var = this.f30947b;
                tx0Var.f31303y = 1.0f;
                tx0Var.invalidate();
                tx0Var.G = null;
                return;
            case 1:
                tx0 tx0Var2 = this.f30947b;
                tx0Var2.m(((Float) tx0Var2.v.getAnimatedValue()).floatValue());
                tx0Var2.v = null;
                return;
            default:
                super.onAnimationEnd(animator);
                this.f30947b.F = null;
                return;
        }
    }
}
