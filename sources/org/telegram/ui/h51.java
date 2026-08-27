package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

public final class h51 extends AnimatorListenerAdapter {

    public final int f38686a;

    public final j51 f38687b;

    public h51(j51 j51Var, int i10) {
        this.f38686a = i10;
        this.f38687b = j51Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f38686a) {
            case 0:
                super.onAnimationEnd(animator);
                this.f38687b.E = null;
                break;
            case 1:
                super.onAnimationEnd(animator);
                this.f38687b.E = null;
                break;
            default:
                super.onAnimationEnd(animator);
                j51 j51Var = this.f38687b;
                j51Var.J = 0.0f;
                j51Var.E = null;
                j51Var.I = false;
                j51Var.d(true, false);
                break;
        }
    }
}
