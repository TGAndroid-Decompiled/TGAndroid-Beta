package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class a11 extends AnimatorListenerAdapter {
    public final int f45467a;
    public final c11 f45468b;

    public a11(c11 c11Var, int i7) {
        this.f45467a = i7;
        this.f45468b = c11Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f45467a) {
            case 0:
                super.onAnimationEnd(animator);
                this.f45468b.J = null;
                return;
            case 1:
                super.onAnimationEnd(animator);
                this.f45468b.J = null;
                return;
            default:
                super.onAnimationEnd(animator);
                c11 c11Var = this.f45468b;
                c11Var.O = 0.0f;
                c11Var.J = null;
                c11Var.N = false;
                c11Var.d(true, false);
                return;
        }
    }
}
