package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class qe1 extends AnimatorListenerAdapter {
    public final int f41141a;
    public final ue1 f41142b;

    public qe1(ue1 ue1Var, int i10) {
        this.f41141a = i10;
        this.f41142b = ue1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f41141a) {
            case 0:
                ue1 ue1Var = this.f41142b;
                ue1Var.v = 0;
                ue1Var.f42461n.setVisibility(8);
                return;
            case 1:
                this.f41142b.v = 0;
                return;
            default:
                this.f41142b.F.setVisibility(8);
                return;
        }
    }
}
