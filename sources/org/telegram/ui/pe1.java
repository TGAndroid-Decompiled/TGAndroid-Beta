package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class pe1 extends AnimatorListenerAdapter {
    public final int f39495a;
    public final te1 f39496b;

    public pe1(te1 te1Var, int i10) {
        this.f39495a = i10;
        this.f39496b = te1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f39495a) {
            case 0:
                te1 te1Var = this.f39496b;
                te1Var.v = 0;
                te1Var.f40734n.setVisibility(8);
                return;
            case 1:
                this.f39496b.v = 0;
                return;
            default:
                this.f39496b.F.setVisibility(8);
                return;
        }
    }
}
