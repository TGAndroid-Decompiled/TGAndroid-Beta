package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class pe1 extends AnimatorListenerAdapter {
    public final int f39521a;
    public final te1 f39522b;

    public pe1(te1 te1Var, int i10) {
        this.f39521a = i10;
        this.f39522b = te1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f39521a) {
            case 0:
                te1 te1Var = this.f39522b;
                te1Var.v = 0;
                te1Var.f40760n.setVisibility(8);
                return;
            case 1:
                this.f39522b.v = 0;
                return;
            default:
                this.f39522b.F.setVisibility(8);
                return;
        }
    }
}
