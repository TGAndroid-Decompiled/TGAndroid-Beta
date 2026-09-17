package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class q61 extends AnimatorListenerAdapter {
    public final int f39746a;
    public final s61 f39747b;

    public q61(s61 s61Var, int i10) {
        this.f39746a = i10;
        this.f39747b = s61Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f39746a) {
            case 0:
                super.onAnimationEnd(animator);
                this.f39747b.I = null;
                return;
            case 1:
                super.onAnimationEnd(animator);
                this.f39747b.I = null;
                return;
            default:
                super.onAnimationEnd(animator);
                s61 s61Var = this.f39747b;
                s61Var.N = 0.0f;
                s61Var.I = null;
                s61Var.M = false;
                s61Var.d(true, false);
                return;
        }
    }
}
