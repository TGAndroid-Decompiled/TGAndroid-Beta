package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class u20 extends AnimatorListenerAdapter {
    public final int f40190a;
    public final w20 f40191b;

    public u20(w20 w20Var, int i7) {
        this.f40190a = i7;
        this.f40191b = w20Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f40190a) {
            case 0:
                w20 w20Var = this.f40191b;
                if (w20Var.f41533c0 == animator) {
                    w20Var.f41533c0 = null;
                    w20Var.b();
                    return;
                }
                return;
            default:
                w20 w20Var2 = this.f40191b;
                if (w20Var2.f41531b0 == animator) {
                    w20Var2.f41531b0 = null;
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f40190a) {
            case 1:
                v20 v20Var = this.f40191b.f41529a0;
                if (v20Var != null) {
                    ((org.telegram.ui.uo0) v20Var).f52594a.f43208f0.requestLayout();
                    return;
                }
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
