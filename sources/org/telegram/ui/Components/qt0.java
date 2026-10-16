package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class qt0 extends AnimatorListenerAdapter {
    public final int f28358a;
    public final xv0 f28359b;

    public qt0(xv0 xv0Var, int i10) {
        this.f28358a = i10;
        this.f28359b = xv0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f28358a) {
            case 0:
                this.f28359b.L0 = null;
                return;
            default:
                xv0 xv0Var = this.f28359b;
                org.telegram.ui.ActionBar.u0 u0Var = xv0Var.f31050n0;
                qu0[] qu0VarArr = xv0Var.f31045k0;
                xv0Var.f31036f1 = null;
                int i10 = 4;
                if (xv0Var.f31042i1) {
                    qu0VarArr[1].setVisibility(8);
                    if (u0Var != null && !xv0Var.D()) {
                        if (xv0Var.w0()) {
                            i10 = 8;
                        }
                        u0Var.setVisibility(i10);
                        xv0Var.f31052o0 = 0.0f;
                    } else {
                        xv0Var.f31052o0 = xv0Var.b0(0.0f);
                        xv0Var.t1(0.0f);
                    }
                    xv0Var.r1(false);
                    xv0Var.f31074x0 = 0;
                } else {
                    qu0 qu0Var = qu0VarArr[0];
                    qu0VarArr[0] = qu0VarArr[1];
                    qu0VarArr[1] = qu0Var;
                    qu0Var.setVisibility(8);
                    if (u0Var != null && xv0Var.f31074x0 == 2) {
                        if (xv0Var.w0()) {
                            i10 = 8;
                        }
                        u0Var.setVisibility(i10);
                    }
                    xv0Var.f31074x0 = 0;
                    xv0Var.a1(1.0f, qu0VarArr[0].F);
                    xv0Var.M0();
                    xv0Var.g1();
                }
                xv0Var.f31038g1 = false;
                xv0Var.f31078y1 = false;
                xv0Var.f31075x1 = false;
                xv0Var.O0(false);
                xv0Var.G.setEnabled(true);
                xv0Var.I0.setEnabled(true);
                return;
        }
    }
}
