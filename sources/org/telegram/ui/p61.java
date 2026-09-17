package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class p61 extends AnimatorListenerAdapter {
    public final int f36542a;
    public final r61 f36543b;

    public p61(r61 r61Var, int i10) {
        this.f36542a = i10;
        this.f36543b = r61Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f36542a) {
            case 0:
                super.onAnimationEnd(animator);
                this.f36543b.I = null;
                return;
            case 1:
                super.onAnimationEnd(animator);
                this.f36543b.I = null;
                return;
            default:
                super.onAnimationEnd(animator);
                r61 r61Var = this.f36543b;
                r61Var.N = 0.0f;
                r61Var.I = null;
                r61Var.M = false;
                r61Var.d(true, false);
                return;
        }
    }
}
