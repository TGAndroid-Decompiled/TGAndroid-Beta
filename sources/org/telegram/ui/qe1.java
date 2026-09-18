package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class qe1 extends AnimatorListenerAdapter {
    public final int f36912a;
    public final ue1 f36913b;

    public qe1(ue1 ue1Var, int i10) {
        this.f36912a = i10;
        this.f36913b = ue1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f36912a) {
            case 0:
                ue1 ue1Var = this.f36913b;
                ue1Var.v = 0;
                ue1Var.f38061n.setVisibility(8);
                return;
            case 1:
                this.f36913b.v = 0;
                return;
            default:
                this.f36913b.F.setVisibility(8);
                return;
        }
    }
}
