package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class u20 extends AnimatorListenerAdapter {
    public final int f40245a;
    public final w20 f40246b;

    public u20(w20 w20Var, int i7) {
        this.f40245a = i7;
        this.f40246b = w20Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f40245a) {
            case 0:
                w20 w20Var = this.f40246b;
                if (w20Var.f41485c0 == animator) {
                    w20Var.f41485c0 = null;
                    w20Var.b();
                    return;
                }
                return;
            default:
                w20 w20Var2 = this.f40246b;
                if (w20Var2.f41483b0 == animator) {
                    w20Var2.f41483b0 = null;
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f40245a) {
            case 1:
                v20 v20Var = this.f40246b.f41481a0;
                if (v20Var != null) {
                    ((org.telegram.ui.to0) v20Var).f52439a.f43334f0.requestLayout();
                    return;
                }
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
