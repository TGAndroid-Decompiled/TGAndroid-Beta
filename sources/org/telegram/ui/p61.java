package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class p61 extends AnimatorListenerAdapter {
    public final int f36547a;
    public final r61 f36548b;

    public p61(r61 r61Var, int i10) {
        this.f36547a = i10;
        this.f36548b = r61Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f36547a) {
            case 0:
                super.onAnimationEnd(animator);
                this.f36548b.I = null;
                return;
            case 1:
                super.onAnimationEnd(animator);
                this.f36548b.I = null;
                return;
            default:
                super.onAnimationEnd(animator);
                r61 r61Var = this.f36548b;
                r61Var.N = 0.0f;
                r61Var.I = null;
                r61Var.M = false;
                r61Var.d(true, false);
                return;
        }
    }
}
