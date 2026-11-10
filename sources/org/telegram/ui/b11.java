package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class b11 extends AnimatorListenerAdapter {
    public final int f43900a;
    public final d11 f43901b;

    public b11(d11 d11Var, int i7) {
        this.f43900a = i7;
        this.f43901b = d11Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f43900a) {
            case 0:
                super.onAnimationEnd(animator);
                this.f43901b.I = null;
                return;
            case 1:
                super.onAnimationEnd(animator);
                this.f43901b.I = null;
                return;
            default:
                super.onAnimationEnd(animator);
                d11 d11Var = this.f43901b;
                d11Var.N = 0.0f;
                d11Var.I = null;
                d11Var.M = false;
                d11Var.d(true, false);
                return;
        }
    }
}
