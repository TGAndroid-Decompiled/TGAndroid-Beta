package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class dg0 extends AnimatorListenerAdapter {
    public final int f23580a;
    public final eg0 f23581b;

    public dg0(eg0 eg0Var, int i10) {
        this.f23580a = i10;
        this.f23581b = eg0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f23580a) {
            case 0:
                eg0 eg0Var = this.f23581b;
                eg0Var.h = false;
                eg0Var.f23869a = eg0Var.f23871c;
                eg0Var.invalidate();
                int i10 = eg0Var.J;
                if (i10 >= 0) {
                    eg0Var.b(i10);
                    eg0Var.J = -1;
                    return;
                }
                return;
            default:
                eg0 eg0Var2 = this.f23581b;
                eg0Var2.f23873n = false;
                eg0Var2.h = false;
                eg0Var2.invalidate();
                int i11 = eg0Var2.J;
                if (i11 >= 0) {
                    eg0Var2.b(i11);
                    eg0Var2.J = -1;
                }
                eg0Var2.a();
                return;
        }
    }
}
