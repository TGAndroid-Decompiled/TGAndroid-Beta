package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class v8 extends AnimatorListenerAdapter {
    public final int f31827a;
    public final g9 f31828b;

    public v8(g9 g9Var, int i10) {
        this.f31827a = i10;
        this.f31828b = g9Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        switch (this.f31827a) {
            case 0:
                super.onAnimationEnd(animator);
                this.f31828b.f26693f = false;
                return;
            default:
                g9 g9Var = this.f31828b;
                if (g9Var.F) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                g9Var.i0(f7, false);
                g9Var.F = false;
                return;
        }
    }
}
