package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class oe1 extends AnimatorListenerAdapter {
    public final int f36200a;
    public final se1 f36201b;

    public oe1(se1 se1Var, int i10) {
        this.f36200a = i10;
        this.f36201b = se1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f36200a) {
            case 0:
                se1 se1Var = this.f36201b;
                se1Var.v = 0;
                se1Var.f37372n.setVisibility(8);
                return;
            case 1:
                this.f36201b.v = 0;
                return;
            default:
                this.f36201b.F.setVisibility(8);
                return;
        }
    }
}
