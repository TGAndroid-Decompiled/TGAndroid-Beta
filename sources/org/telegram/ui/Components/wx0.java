package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class wx0 extends AnimatorListenerAdapter {
    public final int f34600a;
    public final xx0 f34601b;

    public wx0(xx0 xx0Var, int i10) {
        this.f34600a = i10;
        this.f34601b = xx0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f34600a) {
            case 0:
                xx0 xx0Var = this.f34601b;
                xx0Var.f34874y = 1.0f;
                xx0Var.invalidate();
                xx0Var.G = null;
                return;
            case 1:
                xx0 xx0Var2 = this.f34601b;
                xx0Var2.m(((Float) xx0Var2.v.getAnimatedValue()).floatValue());
                xx0Var2.v = null;
                return;
            default:
                super.onAnimationEnd(animator);
                this.f34601b.F = null;
                return;
        }
    }
}
