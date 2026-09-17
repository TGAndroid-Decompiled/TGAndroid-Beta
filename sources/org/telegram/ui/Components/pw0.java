package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class pw0 extends AnimatorListenerAdapter {
    public final int f29508a;
    public final qw0 f29509b;

    public pw0(qw0 qw0Var, int i10) {
        this.f29508a = i10;
        this.f29509b = qw0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f29508a) {
            case 0:
                qw0 qw0Var = this.f29509b;
                qw0Var.f29832y = 1.0f;
                qw0Var.invalidate();
                qw0Var.G = null;
                return;
            case 1:
                qw0 qw0Var2 = this.f29509b;
                qw0Var2.m(((Float) qw0Var2.v.getAnimatedValue()).floatValue());
                qw0Var2.v = null;
                return;
            default:
                super.onAnimationEnd(animator);
                this.f29509b.F = null;
                return;
        }
    }
}
