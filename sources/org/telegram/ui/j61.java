package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class j61 extends AnimatorListenerAdapter {
    public final int f37588a;
    public final l61 f37589b;

    public j61(l61 l61Var, int i10) {
        this.f37588a = i10;
        this.f37589b = l61Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f37588a) {
            case 0:
                super.onAnimationEnd(animator);
                this.f37589b.I = null;
                return;
            case 1:
                super.onAnimationEnd(animator);
                this.f37589b.I = null;
                return;
            default:
                super.onAnimationEnd(animator);
                l61 l61Var = this.f37589b;
                l61Var.N = 0.0f;
                l61Var.I = null;
                l61Var.M = false;
                l61Var.d(true, false);
                return;
        }
    }
}
