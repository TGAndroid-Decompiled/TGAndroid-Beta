package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class yq0 extends AnimatorListenerAdapter {
    public final int f42064a;
    public final ys0 f42065b;

    public yq0(ys0 ys0Var, int i7) {
        this.f42064a = i7;
        this.f42065b = ys0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f42064a) {
            case 0:
                this.f42065b.O0 = null;
                return;
            default:
                ys0 ys0Var = this.f42065b;
                org.telegram.ui.ActionBar.q0 q0Var = ys0Var.f42127q0;
                tr0[] tr0VarArr = ys0Var.f42119n0;
                ys0Var.f42106i1 = null;
                int i7 = 4;
                if (ys0Var.l1) {
                    tr0VarArr[1].setVisibility(8);
                    if (q0Var != null && !ys0Var.I()) {
                        if (ys0Var.I0()) {
                            i7 = 8;
                        }
                        ys0Var.setSearchItemVisibility(i7);
                        ys0Var.f42131r0 = 0.0f;
                    } else {
                        ys0Var.f42131r0 = ys0Var.l0(0.0f);
                        ys0Var.M1(0.0f);
                    }
                    ys0Var.I1(false);
                    ys0Var.A0 = 0;
                } else {
                    tr0 tr0Var = tr0VarArr[0];
                    tr0VarArr[0] = tr0VarArr[1];
                    tr0VarArr[1] = tr0Var;
                    tr0Var.setVisibility(8);
                    if (q0Var != null && ys0Var.A0 == 2) {
                        if (ys0Var.I0()) {
                            i7 = 8;
                        }
                        ys0Var.setSearchItemVisibility(i7);
                    }
                    ys0Var.A0 = 0;
                    ys0Var.l1(1.0f, tr0VarArr[0].F);
                    ys0Var.Y0();
                    ys0Var.u1();
                }
                ys0Var.f42109j1 = false;
                ys0Var.B1 = false;
                ys0Var.A1 = false;
                ys0Var.setHeaderEnabled(true);
                ys0Var.L0.setEnabled(true);
                return;
        }
    }
}
