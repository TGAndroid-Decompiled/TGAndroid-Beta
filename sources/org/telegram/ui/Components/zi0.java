package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class zi0 extends AnimatorListenerAdapter {
    public final int f33072a;
    public final mj0 f33073b;

    public zi0(mj0 mj0Var, int i10) {
        this.f33072a = i10;
        this.f33073b = mj0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f33072a) {
            case 0:
                super.onAnimationEnd(animator);
                this.f33073b.L0.e();
                return;
            default:
                super.onAnimationEnd(animator);
                mj0 mj0Var = this.f33073b;
                mj0Var.Q = null;
                mj0Var.f28525n0 = 0.0f;
                mj0Var.f28523l0 = null;
                mj0Var.invalidate();
                return;
        }
    }
}
