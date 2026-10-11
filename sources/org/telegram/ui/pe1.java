package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class pe1 extends AnimatorListenerAdapter {
    public final int f40838a;
    public final te1 f40839b;

    public pe1(te1 te1Var, int i10) {
        this.f40838a = i10;
        this.f40839b = te1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f40838a) {
            case 0:
                te1 te1Var = this.f40839b;
                te1Var.v = 0;
                te1Var.f42172n.setVisibility(8);
                return;
            case 1:
                this.f40839b.v = 0;
                return;
            default:
                this.f40839b.F.setVisibility(8);
                return;
        }
    }
}
