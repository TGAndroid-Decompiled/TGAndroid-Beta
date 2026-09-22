package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class pe1 extends AnimatorListenerAdapter {
    public final int f36555a;
    public final te1 f36556b;

    public pe1(te1 te1Var, int i10) {
        this.f36555a = i10;
        this.f36556b = te1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f36555a) {
            case 0:
                te1 te1Var = this.f36556b;
                te1Var.v = 0;
                te1Var.f37652n.setVisibility(8);
                return;
            case 1:
                this.f36556b.v = 0;
                return;
            default:
                this.f36556b.F.setVisibility(8);
                return;
        }
    }
}
