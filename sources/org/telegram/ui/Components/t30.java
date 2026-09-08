package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class t30 extends AnimatorListenerAdapter {
    public final int f30551a;
    public final v30 f30552b;

    public t30(v30 v30Var, int i10) {
        this.f30551a = i10;
        this.f30552b = v30Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f30551a) {
            case 0:
                v30 v30Var = this.f30552b;
                if (v30Var.f31102b0 == animator) {
                    v30Var.f31102b0 = null;
                    v30Var.b();
                    return;
                }
                return;
            default:
                v30 v30Var2 = this.f30552b;
                if (v30Var2.f31100a0 == animator) {
                    v30Var2.f31100a0 = null;
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f30551a) {
            case 1:
                u30 u30Var = this.f30552b.W;
                if (u30Var != null) {
                    ((org.telegram.ui.us0) u30Var).f41242a.f33576e0.requestLayout();
                    return;
                }
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
