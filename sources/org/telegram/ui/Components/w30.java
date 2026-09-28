package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class w30 extends AnimatorListenerAdapter {
    public final int f29809a;
    public final y30 f29810b;

    public w30(y30 y30Var, int i10) {
        this.f29809a = i10;
        this.f29810b = y30Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f29809a) {
            case 0:
                y30 y30Var = this.f29810b;
                if (y30Var.f30562b0 == animator) {
                    y30Var.f30562b0 = null;
                    y30Var.b();
                    return;
                }
                return;
            default:
                y30 y30Var2 = this.f29810b;
                if (y30Var2.f30560a0 == animator) {
                    y30Var2.f30560a0 = null;
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f29809a) {
            case 1:
                x30 x30Var = this.f29810b.W;
                if (x30Var != null) {
                    ((org.telegram.ui.ns0) x30Var).f35970a.f31224e0.requestLayout();
                    return;
                }
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
