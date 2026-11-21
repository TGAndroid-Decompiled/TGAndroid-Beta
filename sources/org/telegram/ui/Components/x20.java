package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class x20 extends AnimatorListenerAdapter {
    public final int f41961a;
    public final z20 f41962b;

    public x20(z20 z20Var, int i7) {
        this.f41961a = i7;
        this.f41962b = z20Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f41961a) {
            case 0:
                z20 z20Var = this.f41962b;
                if (z20Var.f42641c0 == animator) {
                    z20Var.f42641c0 = null;
                    z20Var.b();
                    return;
                }
                return;
            default:
                z20 z20Var2 = this.f41962b;
                if (z20Var2.f42639b0 == animator) {
                    z20Var2.f42639b0 = null;
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f41961a) {
            case 1:
                y20 y20Var = this.f41962b.f42637a0;
                if (y20Var != null) {
                    ((org.telegram.ui.uo0) y20Var).f52611a.f43249f0.requestLayout();
                    return;
                }
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
