package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class aj0 extends AnimatorListenerAdapter {
    public final int f24407a;
    public final nj0 f24408b;

    public aj0(nj0 nj0Var, int i10) {
        this.f24407a = i10;
        this.f24408b = nj0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f24407a) {
            case 0:
                super.onAnimationEnd(animator);
                this.f24408b.L0.e();
                return;
            default:
                super.onAnimationEnd(animator);
                nj0 nj0Var = this.f24408b;
                nj0Var.Q = null;
                nj0Var.f28886n0 = 0.0f;
                nj0Var.f28884l0 = null;
                nj0Var.invalidate();
                return;
        }
    }
}
