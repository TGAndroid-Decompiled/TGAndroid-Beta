package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class k51 extends AnimatorListenerAdapter {
    public final int f39756a;
    public final m51 f39757b;

    public k51(m51 m51Var, int i10) {
        this.f39756a = i10;
        this.f39757b = m51Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f39756a) {
            case 0:
                super.onAnimationEnd(animator);
                this.f39757b.E = null;
                return;
            case 1:
                super.onAnimationEnd(animator);
                this.f39757b.E = null;
                return;
            default:
                super.onAnimationEnd(animator);
                m51 m51Var = this.f39757b;
                m51Var.J = 0.0f;
                m51Var.E = null;
                m51Var.I = false;
                m51Var.d(true, false);
                return;
        }
    }
}
