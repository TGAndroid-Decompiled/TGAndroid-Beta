package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class xt0 extends AnimatorListenerAdapter {
    public final int f34816a;
    public final aw0 f34817b;

    public xt0(aw0 aw0Var, int i10) {
        this.f34816a = i10;
        this.f34817b = aw0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f34816a) {
            case 0:
                this.f34817b.N0 = null;
                return;
            default:
                aw0 aw0Var = this.f34817b;
                org.telegram.ui.ActionBar.w0 w0Var = aw0Var.f26681p0;
                tu0[] tu0VarArr = aw0Var.m0;
                aw0Var.f26659h1 = null;
                int i10 = 4;
                if (aw0Var.f26668k1) {
                    tu0VarArr[1].setVisibility(8);
                    if (w0Var != null && !aw0Var.G()) {
                        if (aw0Var.D0()) {
                            i10 = 8;
                        }
                        aw0Var.setSearchItemVisibility(i10);
                        aw0Var.f26683q0 = 0.0f;
                    } else {
                        aw0Var.f26683q0 = aw0Var.i0(0.0f);
                        aw0Var.G1(0.0f);
                    }
                    aw0Var.C1(false);
                    aw0Var.f26706z0 = 0;
                } else {
                    tu0 tu0Var = tu0VarArr[0];
                    tu0VarArr[0] = tu0VarArr[1];
                    tu0VarArr[1] = tu0Var;
                    tu0Var.setVisibility(8);
                    if (w0Var != null && aw0Var.f26706z0 == 2) {
                        if (aw0Var.D0()) {
                            i10 = 8;
                        }
                        aw0Var.setSearchItemVisibility(i10);
                    }
                    aw0Var.f26706z0 = 0;
                    aw0Var.f1(1.0f, tu0VarArr[0].E);
                    aw0Var.S0();
                    aw0Var.o1();
                }
                aw0Var.f26662i1 = false;
                aw0Var.A1 = false;
                aw0Var.f26707z1 = false;
                aw0Var.setHeaderEnabled(true);
                aw0Var.K0.setEnabled(true);
                return;
        }
    }
}
