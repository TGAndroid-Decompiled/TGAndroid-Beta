package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class t30 extends AnimatorListenerAdapter {
    public final int f28045a;
    public final v30 f28046b;

    public t30(v30 v30Var, int i10) {
        this.f28045a = i10;
        this.f28046b = v30Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f28045a) {
            case 0:
                v30 v30Var = this.f28046b;
                if (v30Var.f28579b0 == animator) {
                    v30Var.f28579b0 = null;
                    v30Var.b();
                    return;
                }
                return;
            default:
                v30 v30Var2 = this.f28046b;
                if (v30Var2.f28577a0 == animator) {
                    v30Var2.f28577a0 = null;
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f28045a) {
            case 1:
                u30 u30Var = this.f28046b.W;
                if (u30Var != null) {
                    ((org.telegram.ui.vs0) u30Var).f38679a.f30936e0.requestLayout();
                    return;
                }
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
