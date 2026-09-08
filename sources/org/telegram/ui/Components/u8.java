package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class u8 extends AnimatorListenerAdapter {
    public final int f30857a;
    public final f9 f30858b;

    public u8(f9 f9Var, int i10) {
        this.f30857a = i10;
        this.f30858b = f9Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        switch (this.f30857a) {
            case 0:
                super.onAnimationEnd(animator);
                this.f30858b.f25997f = false;
                return;
            default:
                f9 f9Var = this.f30858b;
                if (f9Var.F) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                f9Var.i0(f7, false);
                f9Var.F = false;
                return;
        }
    }
}
