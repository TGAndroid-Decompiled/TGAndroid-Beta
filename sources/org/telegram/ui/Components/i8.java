package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class i8 extends AnimatorListenerAdapter {
    public final int f34518a;
    public final t8 f34519b;

    public i8(t8 t8Var, int i7) {
        this.f34518a = i7;
        this.f34519b = t8Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f10;
        switch (this.f34518a) {
            case 0:
                super.onAnimationEnd(animator);
                this.f34519b.f38281f = false;
                return;
            default:
                t8 t8Var = this.f34519b;
                if (t8Var.F) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                t8Var.n0(false, f10);
                t8Var.F = false;
                return;
        }
    }
}
