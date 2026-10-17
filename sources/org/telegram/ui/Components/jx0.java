package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class jx0 extends AnimatorListenerAdapter {
    public final int f27642a;
    public final kx0 f27643b;

    public jx0(kx0 kx0Var, int i10) {
        this.f27642a = i10;
        this.f27643b = kx0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f27642a) {
            case 0:
                kx0 kx0Var = this.f27643b;
                kx0Var.f28020y = 1.0f;
                kx0Var.invalidate();
                kx0Var.G = null;
                return;
            case 1:
                kx0 kx0Var2 = this.f27643b;
                kx0Var2.m(((Float) kx0Var2.v.getAnimatedValue()).floatValue());
                kx0Var2.v = null;
                return;
            default:
                super.onAnimationEnd(animator);
                this.f27643b.F = null;
                return;
        }
    }
}
