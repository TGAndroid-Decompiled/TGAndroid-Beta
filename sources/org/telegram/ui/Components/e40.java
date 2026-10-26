package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class e40 extends AnimatorListenerAdapter {
    public final int f27722a;
    public final g40 f27723b;

    public e40(g40 g40Var, int i10) {
        this.f27722a = i10;
        this.f27723b = g40Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f27722a) {
            case 0:
                g40 g40Var = this.f27723b;
                if (g40Var.f28407b0 == animator) {
                    g40Var.f28407b0 = null;
                    g40Var.b();
                    return;
                }
                return;
            default:
                g40 g40Var2 = this.f27723b;
                if (g40Var2.f28405a0 == animator) {
                    g40Var2.f28405a0 = null;
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f27722a) {
            case 1:
                f40 f40Var = this.f27723b.W;
                if (f40Var != null) {
                    ((org.telegram.ui.is0) f40Var).f40349a.f35646e0.requestLayout();
                    return;
                }
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
