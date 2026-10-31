package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class xr0 extends AnimatorListenerAdapter {
    public final int f32540a;
    public final zt0 f32541b;

    public xr0(zt0 zt0Var, int i10) {
        this.f32540a = i10;
        this.f32541b = zt0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f32540a) {
            case 0:
                this.f32541b.N0 = null;
                return;
            default:
                zt0 zt0Var = this.f32541b;
                org.telegram.ui.ActionBar.t0 t0Var = zt0Var.f33216p0;
                ss0[] ss0VarArr = zt0Var.m0;
                zt0Var.f33194h1 = null;
                int i10 = 4;
                if (zt0Var.f33203k1) {
                    ss0VarArr[1].setVisibility(8);
                    if (t0Var != null && !zt0Var.H()) {
                        if (zt0Var.E0()) {
                            i10 = 8;
                        }
                        zt0Var.setSearchItemVisibility(i10);
                        zt0Var.f33219q0 = 0.0f;
                    } else {
                        zt0Var.f33219q0 = zt0Var.j0(0.0f);
                        zt0Var.H1(0.0f);
                    }
                    zt0Var.D1(false);
                    zt0Var.f33244z0 = 0;
                } else {
                    ss0 ss0Var = ss0VarArr[0];
                    ss0VarArr[0] = ss0VarArr[1];
                    ss0VarArr[1] = ss0Var;
                    ss0Var.setVisibility(8);
                    if (t0Var != null && zt0Var.f33244z0 == 2) {
                        if (zt0Var.E0()) {
                            i10 = 8;
                        }
                        zt0Var.setSearchItemVisibility(i10);
                    }
                    zt0Var.f33244z0 = 0;
                    zt0Var.g1(1.0f, ss0VarArr[0].E);
                    zt0Var.T0();
                    zt0Var.p1();
                }
                zt0Var.f33197i1 = false;
                zt0Var.A1 = false;
                zt0Var.f33245z1 = false;
                zt0Var.setHeaderEnabled(true);
                zt0Var.K0.setEnabled(true);
                return;
        }
    }
}
