package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class he1 extends AnimatorListenerAdapter {
    public final int f34192a;
    public final le1 f34193b;

    public he1(le1 le1Var, int i10) {
        this.f34192a = i10;
        this.f34193b = le1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f34192a) {
            case 0:
                le1 le1Var = this.f34193b;
                le1Var.v = 0;
                le1Var.f35311n.setVisibility(8);
                return;
            case 1:
                this.f34193b.v = 0;
                return;
            default:
                this.f34193b.F.setVisibility(8);
                return;
        }
    }
}
