package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class j51 extends AnimatorListenerAdapter {
    public final int f40463a;
    public final l51 f40464b;

    public j51(l51 l51Var, int i10) {
        this.f40463a = i10;
        this.f40464b = l51Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f40463a) {
            case 0:
                super.onAnimationEnd(animator);
                this.f40464b.I = null;
                return;
            case 1:
                super.onAnimationEnd(animator);
                this.f40464b.I = null;
                return;
            default:
                super.onAnimationEnd(animator);
                l51 l51Var = this.f40464b;
                l51Var.N = 0.0f;
                l51Var.I = null;
                l51Var.M = false;
                l51Var.d(true, false);
                return;
        }
    }
}
