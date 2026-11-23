package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class x20 extends AnimatorListenerAdapter {
    public final int f41910a;
    public final z20 f41911b;

    public x20(z20 z20Var, int i7) {
        this.f41910a = i7;
        this.f41911b = z20Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f41910a) {
            case 0:
                z20 z20Var = this.f41911b;
                if (z20Var.f42602c0 == animator) {
                    z20Var.f42602c0 = null;
                    z20Var.b();
                    return;
                }
                return;
            default:
                z20 z20Var2 = this.f41911b;
                if (z20Var2.f42600b0 == animator) {
                    z20Var2.f42600b0 = null;
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f41910a) {
            case 1:
                y20 y20Var = this.f41911b.f42598a0;
                if (y20Var != null) {
                    ((org.telegram.ui.vo0) y20Var).f52842a.f43218f0.requestLayout();
                    return;
                }
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
