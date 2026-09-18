package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class t8 extends AnimatorListenerAdapter {
    public final int f28345a;
    public final e9 f28346b;

    public t8(e9 e9Var, int i10) {
        this.f28345a = i10;
        this.f28346b = e9Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        switch (this.f28345a) {
            case 0:
                super.onAnimationEnd(animator);
                this.f28346b.f23816f = false;
                return;
            default:
                e9 e9Var = this.f28346b;
                if (e9Var.F) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                e9Var.i0(f7, false);
                e9Var.F = false;
                return;
        }
    }
}
