package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class xq0 extends AnimatorListenerAdapter {
    public final int f40390a;
    public final ys0 f40391b;

    public xq0(ys0 ys0Var, int i7) {
        this.f40390a = i7;
        this.f40391b = ys0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f40390a) {
            case 0:
                this.f40391b.N0 = null;
                return;
            default:
                ys0 ys0Var = this.f40391b;
                org.telegram.ui.ActionBar.r0 r0Var = ys0Var.f40695p0;
                tr0[] tr0VarArr = ys0Var.m0;
                ys0Var.f40674h1 = null;
                int i7 = 4;
                if (ys0Var.f40683k1) {
                    tr0VarArr[1].setVisibility(8);
                    if (r0Var != null && !ys0Var.I()) {
                        if (ys0Var.I0()) {
                            i7 = 8;
                        }
                        ys0Var.setSearchItemVisibility(i7);
                        ys0Var.f40698q0 = 0.0f;
                    } else {
                        ys0Var.f40698q0 = ys0Var.l0(0.0f);
                        ys0Var.M1(0.0f);
                    }
                    ys0Var.I1(false);
                    ys0Var.f40723z0 = 0;
                } else {
                    tr0 tr0Var = tr0VarArr[0];
                    tr0VarArr[0] = tr0VarArr[1];
                    tr0VarArr[1] = tr0Var;
                    tr0Var.setVisibility(8);
                    if (r0Var != null && ys0Var.f40723z0 == 2) {
                        if (ys0Var.I0()) {
                            i7 = 8;
                        }
                        ys0Var.setSearchItemVisibility(i7);
                    }
                    ys0Var.f40723z0 = 0;
                    ys0Var.l1(1.0f, tr0VarArr[0].E);
                    ys0Var.Y0();
                    ys0Var.u1();
                }
                ys0Var.f40677i1 = false;
                ys0Var.A1 = false;
                ys0Var.f40724z1 = false;
                ys0Var.setHeaderEnabled(true);
                ys0Var.K0.setEnabled(true);
                return;
        }
    }
}
