package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class t30 extends AnimatorListenerAdapter {
    public final int f28012a;
    public final v30 f28013b;

    public t30(v30 v30Var, int i10) {
        this.f28012a = i10;
        this.f28013b = v30Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f28012a) {
            case 0:
                v30 v30Var = this.f28013b;
                if (v30Var.f28585b0 == animator) {
                    v30Var.f28585b0 = null;
                    v30Var.b();
                    return;
                }
                return;
            default:
                v30 v30Var2 = this.f28013b;
                if (v30Var2.f28583a0 == animator) {
                    v30Var2.f28583a0 = null;
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f28012a) {
            case 1:
                u30 u30Var = this.f28013b.W;
                if (u30Var != null) {
                    ((org.telegram.ui.xs0) u30Var).f39699a.f30954e0.requestLayout();
                    return;
                }
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
