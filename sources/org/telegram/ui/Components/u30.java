package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class u30 extends AnimatorListenerAdapter {
    public final int f28695a;
    public final w30 f28696b;

    public u30(w30 w30Var, int i10) {
        this.f28695a = i10;
        this.f28696b = w30Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f28695a) {
            case 0:
                w30 w30Var = this.f28696b;
                if (w30Var.f29879b0 == animator) {
                    w30Var.f29879b0 = null;
                    w30Var.b();
                    return;
                }
                return;
            default:
                w30 w30Var2 = this.f28696b;
                if (w30Var2.f29877a0 == animator) {
                    w30Var2.f29877a0 = null;
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f28695a) {
            case 1:
                v30 v30Var = this.f28696b.W;
                if (v30Var != null) {
                    ((org.telegram.ui.ns0) v30Var).f35969a.f31223e0.requestLayout();
                    return;
                }
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
