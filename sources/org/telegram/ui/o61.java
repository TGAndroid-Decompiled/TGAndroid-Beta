package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class o61 extends AnimatorListenerAdapter {
    public final int f36119a;
    public final q61 f36120b;

    public o61(q61 q61Var, int i10) {
        this.f36119a = i10;
        this.f36120b = q61Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f36119a) {
            case 0:
                super.onAnimationEnd(animator);
                this.f36120b.I = null;
                return;
            case 1:
                super.onAnimationEnd(animator);
                this.f36120b.I = null;
                return;
            default:
                super.onAnimationEnd(animator);
                q61 q61Var = this.f36120b;
                q61Var.N = 0.0f;
                q61Var.I = null;
                q61Var.M = false;
                q61Var.d(true, false);
                return;
        }
    }
}
