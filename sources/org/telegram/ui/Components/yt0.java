package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class yt0 extends AnimatorListenerAdapter {
    public final int f35164a;
    public final bw0 f35165b;

    public yt0(bw0 bw0Var, int i10) {
        this.f35164a = i10;
        this.f35165b = bw0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f35164a) {
            case 0:
                this.f35165b.N0 = null;
                return;
            default:
                bw0 bw0Var = this.f35165b;
                org.telegram.ui.ActionBar.w0 w0Var = bw0Var.f26971p0;
                uu0[] uu0VarArr = bw0Var.m0;
                bw0Var.f26949h1 = null;
                int i10 = 4;
                if (bw0Var.f26958k1) {
                    uu0VarArr[1].setVisibility(8);
                    if (w0Var != null && !bw0Var.G()) {
                        if (bw0Var.D0()) {
                            i10 = 8;
                        }
                        bw0Var.setSearchItemVisibility(i10);
                        bw0Var.f26973q0 = 0.0f;
                    } else {
                        bw0Var.f26973q0 = bw0Var.i0(0.0f);
                        bw0Var.G1(0.0f);
                    }
                    bw0Var.C1(false);
                    bw0Var.f26996z0 = 0;
                } else {
                    uu0 uu0Var = uu0VarArr[0];
                    uu0VarArr[0] = uu0VarArr[1];
                    uu0VarArr[1] = uu0Var;
                    uu0Var.setVisibility(8);
                    if (w0Var != null && bw0Var.f26996z0 == 2) {
                        if (bw0Var.D0()) {
                            i10 = 8;
                        }
                        bw0Var.setSearchItemVisibility(i10);
                    }
                    bw0Var.f26996z0 = 0;
                    bw0Var.f1(1.0f, uu0VarArr[0].E);
                    bw0Var.S0();
                    bw0Var.o1();
                }
                bw0Var.f26952i1 = false;
                bw0Var.A1 = false;
                bw0Var.f26997z1 = false;
                bw0Var.setHeaderEnabled(true);
                bw0Var.K0.setEnabled(true);
                return;
        }
    }
}
