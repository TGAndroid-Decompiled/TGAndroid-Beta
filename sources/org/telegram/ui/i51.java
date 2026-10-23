package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class i51 extends AnimatorListenerAdapter {
    public final int f38074a;
    public final k51 f38075b;

    public i51(k51 k51Var, int i10) {
        this.f38074a = i10;
        this.f38075b = k51Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f38074a) {
            case 0:
                super.onAnimationEnd(animator);
                this.f38075b.I = null;
                return;
            case 1:
                super.onAnimationEnd(animator);
                this.f38075b.I = null;
                return;
            default:
                super.onAnimationEnd(animator);
                k51 k51Var = this.f38075b;
                k51Var.N = 0.0f;
                k51Var.I = null;
                k51Var.M = false;
                k51Var.d(true, false);
                return;
        }
    }
}
