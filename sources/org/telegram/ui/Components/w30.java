package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class w30 extends AnimatorListenerAdapter {
    public final int f29846a;
    public final y30 f29847b;

    public w30(y30 y30Var, int i10) {
        this.f29846a = i10;
        this.f29847b = y30Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f29846a) {
            case 0:
                y30 y30Var = this.f29847b;
                if (y30Var.f30566b0 == animator) {
                    y30Var.f30566b0 = null;
                    y30Var.b();
                    return;
                }
                return;
            default:
                y30 y30Var2 = this.f29847b;
                if (y30Var2.f30564a0 == animator) {
                    y30Var2.f30564a0 = null;
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f29846a) {
            case 1:
                x30 x30Var = this.f29847b.W;
                if (x30Var != null) {
                    ((org.telegram.ui.qs0) x30Var).f36880a.f31225e0.requestLayout();
                    return;
                }
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
