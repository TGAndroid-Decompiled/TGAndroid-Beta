package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class u30 extends AnimatorListenerAdapter {
    public final int f28399a;
    public final w30 f28400b;

    public u30(w30 w30Var, int i10) {
        this.f28399a = i10;
        this.f28400b = w30Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f28399a) {
            case 0:
                w30 w30Var = this.f28400b;
                if (w30Var.f29498b0 == animator) {
                    w30Var.f29498b0 = null;
                    w30Var.b();
                    return;
                }
                return;
            default:
                w30 w30Var2 = this.f28400b;
                if (w30Var2.f29496a0 == animator) {
                    w30Var2.f29496a0 = null;
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f28399a) {
            case 1:
                v30 v30Var = this.f28400b.W;
                if (v30Var != null) {
                    ((org.telegram.ui.os0) v30Var).f35952a.f30908e0.requestLayout();
                    return;
                }
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
