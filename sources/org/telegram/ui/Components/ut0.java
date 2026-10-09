package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class ut0 extends AnimatorListenerAdapter {
    public final int f31615a;
    public final bw0 f31616b;

    public ut0(bw0 bw0Var, int i10) {
        this.f31615a = i10;
        this.f31616b = bw0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f31615a) {
            case 0:
                this.f31616b.L0 = null;
                return;
            default:
                bw0 bw0Var = this.f31616b;
                org.telegram.ui.ActionBar.v0 v0Var = bw0Var.f25147n0;
                uu0[] uu0VarArr = bw0Var.f25142k0;
                bw0Var.f25133f1 = null;
                int i10 = 4;
                if (bw0Var.f25139i1) {
                    uu0VarArr[1].setVisibility(8);
                    if (v0Var != null && !bw0Var.D()) {
                        if (bw0Var.v0()) {
                            i10 = 8;
                        }
                        v0Var.setVisibility(i10);
                        bw0Var.f25149o0 = 0.0f;
                    } else {
                        bw0Var.f25149o0 = bw0Var.b0(0.0f);
                        bw0Var.s1(0.0f);
                    }
                    bw0Var.q1(false);
                    bw0Var.f25171x0 = 0;
                } else {
                    uu0 uu0Var = uu0VarArr[0];
                    uu0VarArr[0] = uu0VarArr[1];
                    uu0VarArr[1] = uu0Var;
                    uu0Var.setVisibility(8);
                    if (v0Var != null && bw0Var.f25171x0 == 2) {
                        if (bw0Var.v0()) {
                            i10 = 8;
                        }
                        v0Var.setVisibility(i10);
                    }
                    bw0Var.f25171x0 = 0;
                    bw0Var.Z0(1.0f, uu0VarArr[0].F);
                    bw0Var.L0();
                    bw0Var.f1();
                }
                bw0Var.f25135g1 = false;
                bw0Var.f25175y1 = false;
                bw0Var.f25172x1 = false;
                bw0Var.N0(false);
                bw0Var.G.setEnabled(true);
                bw0Var.I0.setEnabled(true);
                return;
        }
    }
}
