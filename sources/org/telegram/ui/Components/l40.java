package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class l40 extends AnimatorListenerAdapter {
    public final int f28192a;
    public final n40 f28193b;

    public l40(n40 n40Var, int i10) {
        this.f28192a = i10;
        this.f28193b = n40Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f28192a) {
            case 0:
                n40 n40Var = this.f28193b;
                if (n40Var.f29010b0 == animator) {
                    n40Var.f29010b0 = null;
                    n40Var.b();
                    return;
                }
                return;
            default:
                n40 n40Var2 = this.f28193b;
                if (n40Var2.f29008a0 == animator) {
                    n40Var2.f29008a0 = null;
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f28192a) {
            case 1:
                m40 m40Var = this.f28193b.W;
                if (m40Var != null) {
                    ((org.telegram.ui.us0) m40Var).f42797a.f33966e0.requestLayout();
                    return;
                }
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
