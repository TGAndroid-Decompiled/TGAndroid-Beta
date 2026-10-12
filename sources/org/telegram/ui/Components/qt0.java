package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class qt0 extends AnimatorListenerAdapter {
    public final int f28672a;
    public final xv0 f28673b;

    public qt0(xv0 xv0Var, int i10) {
        this.f28672a = i10;
        this.f28673b = xv0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f28672a) {
            case 0:
                this.f28673b.L0 = null;
                return;
            default:
                xv0 xv0Var = this.f28673b;
                org.telegram.ui.ActionBar.u0 u0Var = xv0Var.f31369n0;
                qu0[] qu0VarArr = xv0Var.f31364k0;
                xv0Var.f31355f1 = null;
                int i10 = 4;
                if (xv0Var.f31361i1) {
                    qu0VarArr[1].setVisibility(8);
                    if (u0Var != null && !xv0Var.D()) {
                        if (xv0Var.v0()) {
                            i10 = 8;
                        }
                        u0Var.setVisibility(i10);
                        xv0Var.f31371o0 = 0.0f;
                    } else {
                        xv0Var.f31371o0 = xv0Var.b0(0.0f);
                        xv0Var.s1(0.0f);
                    }
                    xv0Var.q1(false);
                    xv0Var.f31393x0 = 0;
                } else {
                    qu0 qu0Var = qu0VarArr[0];
                    qu0VarArr[0] = qu0VarArr[1];
                    qu0VarArr[1] = qu0Var;
                    qu0Var.setVisibility(8);
                    if (u0Var != null && xv0Var.f31393x0 == 2) {
                        if (xv0Var.v0()) {
                            i10 = 8;
                        }
                        u0Var.setVisibility(i10);
                    }
                    xv0Var.f31393x0 = 0;
                    xv0Var.Z0(1.0f, qu0VarArr[0].F);
                    xv0Var.L0();
                    xv0Var.f1();
                }
                xv0Var.f31357g1 = false;
                xv0Var.f31397y1 = false;
                xv0Var.f31394x1 = false;
                xv0Var.N0(false);
                xv0Var.G.setEnabled(true);
                xv0Var.I0.setEnabled(true);
                return;
        }
    }
}
