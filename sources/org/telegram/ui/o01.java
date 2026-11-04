package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class o01 extends AnimatorListenerAdapter {
    public final int f48164a;
    public final q01 f48165b;

    public o01(q01 q01Var, int i3) {
        this.f48164a = i3;
        this.f48165b = q01Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f48164a) {
            case 0:
                super.onAnimationEnd(animator);
                this.f48165b.J = null;
                return;
            case 1:
                super.onAnimationEnd(animator);
                this.f48165b.J = null;
                return;
            default:
                super.onAnimationEnd(animator);
                q01 q01Var = this.f48165b;
                q01Var.O = 0.0f;
                q01Var.J = null;
                q01Var.N = false;
                q01Var.d(true, false);
                return;
        }
    }
}
