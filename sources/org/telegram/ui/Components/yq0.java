package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class yq0 extends AnimatorListenerAdapter {
    public final int f42062a;
    public final ys0 f42063b;

    public yq0(ys0 ys0Var, int i7) {
        this.f42062a = i7;
        this.f42063b = ys0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f42062a) {
            case 0:
                this.f42063b.O0 = null;
                return;
            default:
                ys0 ys0Var = this.f42063b;
                org.telegram.ui.ActionBar.q0 q0Var = ys0Var.f42125q0;
                tr0[] tr0VarArr = ys0Var.f42117n0;
                ys0Var.f42104i1 = null;
                int i7 = 4;
                if (ys0Var.l1) {
                    tr0VarArr[1].setVisibility(8);
                    if (q0Var != null && !ys0Var.I()) {
                        if (ys0Var.I0()) {
                            i7 = 8;
                        }
                        ys0Var.setSearchItemVisibility(i7);
                        ys0Var.f42129r0 = 0.0f;
                    } else {
                        ys0Var.f42129r0 = ys0Var.l0(0.0f);
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
                ys0Var.f42107j1 = false;
                ys0Var.B1 = false;
                ys0Var.A1 = false;
                ys0Var.setHeaderEnabled(true);
                ys0Var.L0.setEnabled(true);
                return;
        }
    }
}
