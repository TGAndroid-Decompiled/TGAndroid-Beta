package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class g61 extends AnimatorListenerAdapter {
    public final int f33473a;
    public final i61 f33474b;

    public g61(i61 i61Var, int i10) {
        this.f33473a = i10;
        this.f33474b = i61Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f33473a) {
            case 0:
                super.onAnimationEnd(animator);
                this.f33474b.I = null;
                return;
            case 1:
                super.onAnimationEnd(animator);
                this.f33474b.I = null;
                return;
            default:
                super.onAnimationEnd(animator);
                i61 i61Var = this.f33474b;
                i61Var.N = 0.0f;
                i61Var.I = null;
                i61Var.M = false;
                i61Var.d(true, false);
                return;
        }
    }
}
