package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class h61 extends AnimatorListenerAdapter {
    public final int f34134a;
    public final j61 f34135b;

    public h61(j61 j61Var, int i10) {
        this.f34134a = i10;
        this.f34135b = j61Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f34134a) {
            case 0:
                super.onAnimationEnd(animator);
                this.f34135b.I = null;
                return;
            case 1:
                super.onAnimationEnd(animator);
                this.f34135b.I = null;
                return;
            default:
                super.onAnimationEnd(animator);
                j61 j61Var = this.f34135b;
                j61Var.N = 0.0f;
                j61Var.I = null;
                j61Var.M = false;
                j61Var.d(true, false);
                return;
        }
    }
}
