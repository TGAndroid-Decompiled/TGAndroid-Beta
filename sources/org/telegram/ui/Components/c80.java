package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class c80 extends AnimatorListenerAdapter {
    public final int f25221a;
    public final d80 f25222b;

    public c80(d80 d80Var, int i10) {
        this.f25221a = i10;
        this.f25222b = d80Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f25221a) {
            case 0:
                d80 d80Var = this.f25222b;
                d80Var.f25596e.f25943d0 = null;
                d80Var.requestLayout();
                return;
            default:
                d80 d80Var2 = this.f25222b;
                d80Var2.f25596e.f25943d0 = null;
                d80Var2.f25593a = false;
                return;
        }
    }
}
