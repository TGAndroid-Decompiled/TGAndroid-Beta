package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class s8 extends AnimatorListenerAdapter {
    public final int f28074a;
    public final d9 f28075b;

    public s8(d9 d9Var, int i10) {
        this.f28074a = i10;
        this.f28075b = d9Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        switch (this.f28074a) {
            case 0:
                super.onAnimationEnd(animator);
                this.f28075b.f23525f = false;
                return;
            default:
                d9 d9Var = this.f28075b;
                if (d9Var.F) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                d9Var.i0(f7, false);
                d9Var.F = false;
                return;
        }
    }
}
