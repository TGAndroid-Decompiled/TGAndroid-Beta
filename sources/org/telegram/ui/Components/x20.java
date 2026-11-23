package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class x20 extends AnimatorListenerAdapter {
    public final int f41953a;
    public final z20 f41954b;

    public x20(z20 z20Var, int i7) {
        this.f41953a = i7;
        this.f41954b = z20Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f41953a) {
            case 0:
                z20 z20Var = this.f41954b;
                if (z20Var.f42644c0 == animator) {
                    z20Var.f42644c0 = null;
                    z20Var.b();
                    return;
                }
                return;
            default:
                z20 z20Var2 = this.f41954b;
                if (z20Var2.f42642b0 == animator) {
                    z20Var2.f42642b0 = null;
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f41953a) {
            case 1:
                y20 y20Var = this.f41954b.f42640a0;
                if (y20Var != null) {
                    ((org.telegram.ui.uo0) y20Var).f52615a.f43253f0.requestLayout();
                    return;
                }
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
