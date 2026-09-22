package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class t30 extends AnimatorListenerAdapter {
    public final int f28385a;
    public final v30 f28386b;

    public t30(v30 v30Var, int i10) {
        this.f28385a = i10;
        this.f28386b = v30Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f28385a) {
            case 0:
                v30 v30Var = this.f28386b;
                if (v30Var.f28959b0 == animator) {
                    v30Var.f28959b0 = null;
                    v30Var.b();
                    return;
                }
                return;
            default:
                v30 v30Var2 = this.f28386b;
                if (v30Var2.f28957a0 == animator) {
                    v30Var2.f28957a0 = null;
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f28385a) {
            case 1:
                u30 u30Var = this.f28386b.W;
                if (u30Var != null) {
                    ((org.telegram.ui.vs0) u30Var).f38617a.f31242e0.requestLayout();
                    return;
                }
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
