package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class e51 extends AnimatorListenerAdapter {
    public final int f36553a;
    public final g51 f36554b;

    public e51(g51 g51Var, int i10) {
        this.f36553a = i10;
        this.f36554b = g51Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f36553a) {
            case 0:
                super.onAnimationEnd(animator);
                this.f36554b.I = null;
                return;
            case 1:
                super.onAnimationEnd(animator);
                this.f36554b.I = null;
                return;
            default:
                super.onAnimationEnd(animator);
                g51 g51Var = this.f36554b;
                g51Var.N = 0.0f;
                g51Var.I = null;
                g51Var.M = false;
                g51Var.d(true, false);
                return;
        }
    }
}
