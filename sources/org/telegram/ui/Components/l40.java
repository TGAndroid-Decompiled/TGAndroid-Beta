package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class l40 extends AnimatorListenerAdapter {
    public final int f28155a;
    public final n40 f28156b;

    public l40(n40 n40Var, int i10) {
        this.f28155a = i10;
        this.f28156b = n40Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f28155a) {
            case 0:
                n40 n40Var = this.f28156b;
                if (n40Var.f28970b0 == animator) {
                    n40Var.f28970b0 = null;
                    n40Var.b();
                    return;
                }
                return;
            default:
                n40 n40Var2 = this.f28156b;
                if (n40Var2.f28968a0 == animator) {
                    n40Var2.f28968a0 = null;
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f28155a) {
            case 1:
                m40 m40Var = this.f28156b.W;
                if (m40Var != null) {
                    ((org.telegram.ui.vs0) m40Var).f43021a.f33942e0.requestLayout();
                    return;
                }
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
