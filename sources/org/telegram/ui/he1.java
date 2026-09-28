package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class he1 extends AnimatorListenerAdapter {
    public final int f34206a;
    public final le1 f34207b;

    public he1(le1 le1Var, int i10) {
        this.f34206a = i10;
        this.f34207b = le1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f34206a) {
            case 0:
                le1 le1Var = this.f34207b;
                le1Var.v = 0;
                le1Var.f35344n.setVisibility(8);
                return;
            case 1:
                this.f34207b.v = 0;
                return;
            default:
                this.f34207b.F.setVisibility(8);
                return;
        }
    }
}
