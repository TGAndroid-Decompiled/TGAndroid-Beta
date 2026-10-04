package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class j61 extends AnimatorListenerAdapter {
    public final int f37593a;
    public final l61 f37594b;

    public j61(l61 l61Var, int i10) {
        this.f37593a = i10;
        this.f37594b = l61Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f37593a) {
            case 0:
                super.onAnimationEnd(animator);
                this.f37594b.I = null;
                return;
            case 1:
                super.onAnimationEnd(animator);
                this.f37594b.I = null;
                return;
            default:
                super.onAnimationEnd(animator);
                l61 l61Var = this.f37594b;
                l61Var.N = 0.0f;
                l61Var.I = null;
                l61Var.M = false;
                l61Var.d(true, false);
                return;
        }
    }
}
