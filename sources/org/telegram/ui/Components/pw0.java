package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class pw0 extends AnimatorListenerAdapter {
    public final int f27171a;
    public final qw0 f27172b;

    public pw0(qw0 qw0Var, int i10) {
        this.f27171a = i10;
        this.f27172b = qw0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f27171a) {
            case 0:
                qw0 qw0Var = this.f27172b;
                qw0Var.f27475y = 1.0f;
                qw0Var.invalidate();
                qw0Var.G = null;
                return;
            case 1:
                qw0 qw0Var2 = this.f27172b;
                qw0Var2.m(((Float) qw0Var2.v.getAnimatedValue()).floatValue());
                qw0Var2.v = null;
                return;
            default:
                super.onAnimationEnd(animator);
                this.f27172b.F = null;
                return;
        }
    }
}
