package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class m51 extends AnimatorListenerAdapter {
    public final int f41339a;
    public final o51 f41340b;

    public m51(o51 o51Var, int i10) {
        this.f41339a = i10;
        this.f41340b = o51Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f41339a) {
            case 0:
                super.onAnimationEnd(animator);
                this.f41340b.I = null;
                return;
            case 1:
                super.onAnimationEnd(animator);
                this.f41340b.I = null;
                return;
            default:
                super.onAnimationEnd(animator);
                o51 o51Var = this.f41340b;
                o51Var.N = 0.0f;
                o51Var.I = null;
                o51Var.M = false;
                o51Var.d(true, false);
                return;
        }
    }
}
