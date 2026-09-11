package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class pe1 extends AnimatorListenerAdapter {
    public final int f39494a;
    public final te1 f39495b;

    public pe1(te1 te1Var, int i10) {
        this.f39494a = i10;
        this.f39495b = te1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f39494a) {
            case 0:
                te1 te1Var = this.f39495b;
                te1Var.v = 0;
                te1Var.f40733n.setVisibility(8);
                return;
            case 1:
                this.f39495b.v = 0;
                return;
            default:
                this.f39495b.F.setVisibility(8);
                return;
        }
    }
}
