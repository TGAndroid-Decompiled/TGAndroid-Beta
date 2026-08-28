package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class i51 extends AnimatorListenerAdapter {
    public final int f39019a;
    public final k51 f39020b;

    public i51(k51 k51Var, int i9) {
        this.f39019a = i9;
        this.f39020b = k51Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f39019a) {
            case 0:
                super.onAnimationEnd(animator);
                this.f39020b.E = null;
                return;
            case 1:
                super.onAnimationEnd(animator);
                this.f39020b.E = null;
                return;
            default:
                super.onAnimationEnd(animator);
                k51 k51Var = this.f39020b;
                k51Var.J = 0.0f;
                k51Var.E = null;
                k51Var.I = false;
                k51Var.d(true, false);
                return;
        }
    }
}
