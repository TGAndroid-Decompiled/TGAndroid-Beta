package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class a11 extends AnimatorListenerAdapter {
    public final int f43560a;
    public final c11 f43561b;

    public a11(c11 c11Var, int i7) {
        this.f43560a = i7;
        this.f43561b = c11Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f43560a) {
            case 0:
                super.onAnimationEnd(animator);
                this.f43561b.I = null;
                return;
            case 1:
                super.onAnimationEnd(animator);
                this.f43561b.I = null;
                return;
            default:
                super.onAnimationEnd(animator);
                c11 c11Var = this.f43561b;
                c11Var.N = 0.0f;
                c11Var.I = null;
                c11Var.M = false;
                c11Var.d(true, false);
                return;
        }
    }
}
