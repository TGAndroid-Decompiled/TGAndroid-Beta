package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class qe1 extends AnimatorListenerAdapter {
    public final int f36918a;
    public final ue1 f36919b;

    public qe1(ue1 ue1Var, int i10) {
        this.f36918a = i10;
        this.f36919b = ue1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f36918a) {
            case 0:
                ue1 ue1Var = this.f36919b;
                ue1Var.v = 0;
                ue1Var.f38074n.setVisibility(8);
                return;
            case 1:
                this.f36919b.v = 0;
                return;
            default:
                this.f36919b.F.setVisibility(8);
                return;
        }
    }
}
