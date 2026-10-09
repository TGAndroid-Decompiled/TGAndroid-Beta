package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class qe1 extends AnimatorListenerAdapter {
    public final int f41097a;
    public final ue1 f41098b;

    public qe1(ue1 ue1Var, int i10) {
        this.f41097a = i10;
        this.f41098b = ue1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f41097a) {
            case 0:
                ue1 ue1Var = this.f41098b;
                ue1Var.v = 0;
                ue1Var.f42417n.setVisibility(8);
                return;
            case 1:
                this.f41098b.v = 0;
                return;
            default:
                this.f41098b.F.setVisibility(8);
                return;
        }
    }
}
