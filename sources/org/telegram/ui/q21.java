package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class q21 extends AnimatorListenerAdapter {
    public final int f40845a;
    public final s21 f40846b;

    public q21(s21 s21Var, int i10) {
        this.f40845a = i10;
        this.f40846b = s21Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f40845a) {
            case 0:
                super.onAnimationEnd(animator);
                this.f40846b.I = null;
                return;
            case 1:
                super.onAnimationEnd(animator);
                this.f40846b.I = null;
                return;
            default:
                super.onAnimationEnd(animator);
                s21 s21Var = this.f40846b;
                s21Var.N = 0.0f;
                s21Var.I = null;
                s21Var.M = false;
                s21Var.d(true, false);
                return;
        }
    }
}
