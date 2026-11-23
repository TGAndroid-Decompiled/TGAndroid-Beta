package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class a11 extends AnimatorListenerAdapter {
    public final int f45471a;
    public final c11 f45472b;

    public a11(c11 c11Var, int i7) {
        this.f45471a = i7;
        this.f45472b = c11Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f45471a) {
            case 0:
                super.onAnimationEnd(animator);
                this.f45472b.J = null;
                return;
            case 1:
                super.onAnimationEnd(animator);
                this.f45472b.J = null;
                return;
            default:
                super.onAnimationEnd(animator);
                c11 c11Var = this.f45472b;
                c11Var.O = 0.0f;
                c11Var.J = null;
                c11Var.N = false;
                c11Var.d(true, false);
                return;
        }
    }
}
