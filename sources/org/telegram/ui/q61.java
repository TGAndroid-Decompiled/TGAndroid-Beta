package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class q61 extends AnimatorListenerAdapter {
    public final int f36804a;
    public final s61 f36805b;

    public q61(s61 s61Var, int i10) {
        this.f36804a = i10;
        this.f36805b = s61Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f36804a) {
            case 0:
                super.onAnimationEnd(animator);
                this.f36805b.I = null;
                return;
            case 1:
                super.onAnimationEnd(animator);
                this.f36805b.I = null;
                return;
            default:
                super.onAnimationEnd(animator);
                s61 s61Var = this.f36805b;
                s61Var.N = 0.0f;
                s61Var.I = null;
                s61Var.M = false;
                s61Var.d(true, false);
                return;
        }
    }
}
