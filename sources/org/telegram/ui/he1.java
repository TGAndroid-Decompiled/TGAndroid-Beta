package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class he1 extends AnimatorListenerAdapter {
    public final int f33838a;
    public final le1 f33839b;

    public he1(le1 le1Var, int i10) {
        this.f33838a = i10;
        this.f33839b = le1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f33838a) {
            case 0:
                le1 le1Var = this.f33839b;
                le1Var.v = 0;
                le1Var.f34960n.setVisibility(8);
                return;
            case 1:
                this.f33839b.v = 0;
                return;
            default:
                this.f33839b.F.setVisibility(8);
                return;
        }
    }
}
