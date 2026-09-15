package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class n61 extends AnimatorListenerAdapter {
    public final int f35892a;
    public final p61 f35893b;

    public n61(p61 p61Var, int i10) {
        this.f35892a = i10;
        this.f35893b = p61Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f35892a) {
            case 0:
                super.onAnimationEnd(animator);
                this.f35893b.I = null;
                return;
            case 1:
                super.onAnimationEnd(animator);
                this.f35893b.I = null;
                return;
            default:
                super.onAnimationEnd(animator);
                p61 p61Var = this.f35893b;
                p61Var.N = 0.0f;
                p61Var.I = null;
                p61Var.M = false;
                p61Var.d(true, false);
                return;
        }
    }
}
