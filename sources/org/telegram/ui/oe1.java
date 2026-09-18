package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class oe1 extends AnimatorListenerAdapter {
    public final int f36182a;
    public final se1 f36183b;

    public oe1(se1 se1Var, int i10) {
        this.f36182a = i10;
        this.f36183b = se1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f36182a) {
            case 0:
                se1 se1Var = this.f36183b;
                se1Var.v = 0;
                se1Var.f37269n.setVisibility(8);
                return;
            case 1:
                this.f36183b.v = 0;
                return;
            default:
                this.f36183b.F.setVisibility(8);
                return;
        }
    }
}
