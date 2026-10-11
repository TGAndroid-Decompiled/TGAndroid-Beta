package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class wt0 extends AnimatorListenerAdapter {
    public final int f32736a;
    public final dw0 f32737b;

    public wt0(dw0 dw0Var, int i10) {
        this.f32736a = i10;
        this.f32737b = dw0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f32736a) {
            case 0:
                this.f32737b.L0 = null;
                return;
            default:
                dw0 dw0Var = this.f32737b;
                org.telegram.ui.ActionBar.u0 u0Var = dw0Var.f25716n0;
                wu0[] wu0VarArr = dw0Var.f25711k0;
                dw0Var.f25702f1 = null;
                int i10 = 4;
                if (dw0Var.f25708i1) {
                    wu0VarArr[1].setVisibility(8);
                    if (u0Var != null && !dw0Var.D()) {
                        if (dw0Var.v0()) {
                            i10 = 8;
                        }
                        u0Var.setVisibility(i10);
                        dw0Var.f25718o0 = 0.0f;
                    } else {
                        dw0Var.f25718o0 = dw0Var.b0(0.0f);
                        dw0Var.s1(0.0f);
                    }
                    dw0Var.q1(false);
                    dw0Var.f25740x0 = 0;
                } else {
                    wu0 wu0Var = wu0VarArr[0];
                    wu0VarArr[0] = wu0VarArr[1];
                    wu0VarArr[1] = wu0Var;
                    wu0Var.setVisibility(8);
                    if (u0Var != null && dw0Var.f25740x0 == 2) {
                        if (dw0Var.v0()) {
                            i10 = 8;
                        }
                        u0Var.setVisibility(i10);
                    }
                    dw0Var.f25740x0 = 0;
                    dw0Var.Z0(1.0f, wu0VarArr[0].F);
                    dw0Var.L0();
                    dw0Var.f1();
                }
                dw0Var.f25704g1 = false;
                dw0Var.f25744y1 = false;
                dw0Var.f25741x1 = false;
                dw0Var.N0(false);
                dw0Var.G.setEnabled(true);
                dw0Var.I0.setEnabled(true);
                return;
        }
    }
}
