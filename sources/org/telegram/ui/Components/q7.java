package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class q7 extends AnimatorListenerAdapter {
    public final int f30295a;
    public final c8 f30296b;

    public q7(c8 c8Var, int i10) {
        this.f30295a = i10;
        this.f30296b = c8Var;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f30295a) {
            case 2:
                this.f30296b.f25861z0 = null;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f30295a) {
            case 0:
                this.f30296b.f25840j0 = false;
                return;
            case 1:
                c8 c8Var = this.f30296b;
                c8Var.f25836f0.setVisibility(4);
                c8Var.f25837g0.setImageBitmap(null);
                c8Var.f25840j0 = false;
                return;
            default:
                return;
        }
    }

    private final void a(Animator animator) {
    }
}
