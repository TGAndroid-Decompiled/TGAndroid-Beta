package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class xr0 extends AnimatorListenerAdapter {
    public final int f34749a;
    public final eu0 f34750b;

    public xr0(eu0 eu0Var, int i9) {
        this.f34749a = i9;
        this.f34750b = eu0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f34749a) {
            case 0:
                this.f34750b.H0 = null;
                return;
            default:
                eu0 eu0Var = this.f34750b;
                org.telegram.ui.ActionBar.w0 w0Var = eu0Var.f28143j0;
                xs0[] xs0VarArr = eu0Var.f28137g0;
                eu0Var.f28125b1 = null;
                int i9 = 4;
                if (eu0Var.f28133e1) {
                    xs0VarArr[1].setVisibility(8);
                    if (w0Var != null && !eu0Var.D()) {
                        if (eu0Var.v0()) {
                            i9 = 8;
                        }
                        w0Var.setVisibility(i9);
                        eu0Var.f28145k0 = 0.0f;
                    } else {
                        eu0Var.f28145k0 = eu0Var.b0(0.0f);
                        eu0Var.s1(0.0f);
                    }
                    eu0Var.q1(false);
                    eu0Var.f28164t0 = 0;
                } else {
                    xs0 xs0Var = xs0VarArr[0];
                    xs0VarArr[0] = xs0VarArr[1];
                    xs0VarArr[1] = xs0Var;
                    xs0Var.setVisibility(8);
                    if (w0Var != null && eu0Var.f28164t0 == 2) {
                        if (eu0Var.v0()) {
                            i9 = 8;
                        }
                        w0Var.setVisibility(i9);
                    }
                    eu0Var.f28164t0 = 0;
                    eu0Var.Z0(1.0f, xs0VarArr[0].B);
                    eu0Var.L0();
                    eu0Var.f1();
                }
                eu0Var.f28128c1 = false;
                eu0Var.f28167u1 = false;
                eu0Var.f28165t1 = false;
                eu0Var.N0(false);
                eu0Var.C.setEnabled(true);
                eu0Var.E0.setEnabled(true);
                return;
        }
    }
}
