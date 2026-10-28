package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class v8 extends AnimatorListenerAdapter {
    public final int f33604a;
    public final g9 f33605b;

    public v8(g9 g9Var, int i10) {
        this.f33604a = i10;
        this.f33605b = g9Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        switch (this.f33604a) {
            case 0:
                super.onAnimationEnd(animator);
                this.f33605b.f28476f = false;
                return;
            default:
                g9 g9Var = this.f33605b;
                if (g9Var.F) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                g9Var.j0(f7, false);
                g9Var.F = false;
                return;
        }
    }
}
