package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class j51 extends AnimatorListenerAdapter {
    public final int f40466a;
    public final l51 f40467b;

    public j51(l51 l51Var, int i10) {
        this.f40466a = i10;
        this.f40467b = l51Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f40466a) {
            case 0:
                super.onAnimationEnd(animator);
                this.f40467b.I = null;
                return;
            case 1:
                super.onAnimationEnd(animator);
                this.f40467b.I = null;
                return;
            default:
                super.onAnimationEnd(animator);
                l51 l51Var = this.f40467b;
                l51Var.N = 0.0f;
                l51Var.I = null;
                l51Var.M = false;
                l51Var.d(true, false);
                return;
        }
    }
}
