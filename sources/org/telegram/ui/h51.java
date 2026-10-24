package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class h51 extends AnimatorListenerAdapter {
    public final int f37759a;
    public final j51 f37760b;

    public h51(j51 j51Var, int i10) {
        this.f37759a = i10;
        this.f37760b = j51Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f37759a) {
            case 0:
                super.onAnimationEnd(animator);
                this.f37760b.I = null;
                return;
            case 1:
                super.onAnimationEnd(animator);
                this.f37760b.I = null;
                return;
            default:
                super.onAnimationEnd(animator);
                j51 j51Var = this.f37760b;
                j51Var.N = 0.0f;
                j51Var.I = null;
                j51Var.M = false;
                j51Var.d(true, false);
                return;
        }
    }
}
