package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class wq0 extends AnimatorListenerAdapter {
    public final int f40056a;
    public final ws0 f40057b;

    public wq0(ws0 ws0Var, int i3) {
        this.f40056a = i3;
        this.f40057b = ws0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f40056a) {
            case 0:
                this.f40057b.O0 = null;
                return;
            default:
                ws0 ws0Var = this.f40057b;
                org.telegram.ui.ActionBar.q0 q0Var = ws0Var.f40117q0;
                rr0[] rr0VarArr = ws0Var.f40108n0;
                ws0Var.f40096i1 = null;
                int i3 = 4;
                if (ws0Var.f40104l1) {
                    rr0VarArr[1].setVisibility(8);
                    if (q0Var != null && !ws0Var.I()) {
                        if (ws0Var.H0()) {
                            i3 = 8;
                        }
                        ws0Var.setSearchItemVisibility(i3);
                        ws0Var.f40121r0 = 0.0f;
                    } else {
                        ws0Var.f40121r0 = ws0Var.l0(0.0f);
                        ws0Var.K1(0.0f);
                    }
                    ws0Var.G1(false);
                    ws0Var.A0 = 0;
                } else {
                    rr0 rr0Var = rr0VarArr[0];
                    rr0VarArr[0] = rr0VarArr[1];
                    rr0VarArr[1] = rr0Var;
                    rr0Var.setVisibility(8);
                    if (q0Var != null && ws0Var.A0 == 2) {
                        if (ws0Var.H0()) {
                            i3 = 8;
                        }
                        ws0Var.setSearchItemVisibility(i3);
                    }
                    ws0Var.A0 = 0;
                    ws0Var.j1(1.0f, rr0VarArr[0].F);
                    ws0Var.W0();
                    ws0Var.s1();
                }
                ws0Var.f40099j1 = false;
                ws0Var.B1 = false;
                ws0Var.A1 = false;
                ws0Var.setHeaderEnabled(true);
                ws0Var.L0.setEnabled(true);
                return;
        }
    }
}
