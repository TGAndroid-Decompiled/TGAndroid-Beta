package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class q7 extends AnimatorListenerAdapter {
    public final int f30299a;
    public final c8 f30300b;

    public q7(c8 c8Var, int i10) {
        this.f30299a = i10;
        this.f30300b = c8Var;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f30299a) {
            case 2:
                this.f30300b.f25835z0 = null;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f30299a) {
            case 0:
                this.f30300b.f25814j0 = false;
                return;
            case 1:
                c8 c8Var = this.f30300b;
                c8Var.f25810f0.setVisibility(4);
                c8Var.f25811g0.setImageBitmap(null);
                c8Var.f25814j0 = false;
                return;
            default:
                return;
        }
    }

    private final void a(Animator animator) {
    }
}
