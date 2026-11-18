package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class gr0 extends AnimatorListenerAdapter {
    public final int f35553a;
    public final gt0 f35554b;

    public gr0(gt0 gt0Var, int i7) {
        this.f35553a = i7;
        this.f35554b = gt0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f35553a) {
            case 0:
                this.f35554b.O0 = null;
                return;
            default:
                gt0 gt0Var = this.f35554b;
                org.telegram.ui.ActionBar.r0 r0Var = gt0Var.f35617q0;
                bs0[] bs0VarArr = gt0Var.f35609n0;
                gt0Var.f35596i1 = null;
                int i7 = 4;
                if (gt0Var.l1) {
                    bs0VarArr[1].setVisibility(8);
                    if (r0Var != null && !gt0Var.I()) {
                        if (gt0Var.I0()) {
                            i7 = 8;
                        }
                        gt0Var.setSearchItemVisibility(i7);
                        gt0Var.f35621r0 = 0.0f;
                    } else {
                        gt0Var.f35621r0 = gt0Var.l0(0.0f);
                        gt0Var.M1(0.0f);
                    }
                    gt0Var.I1(false);
                    gt0Var.A0 = 0;
                } else {
                    bs0 bs0Var = bs0VarArr[0];
                    bs0VarArr[0] = bs0VarArr[1];
                    bs0VarArr[1] = bs0Var;
                    bs0Var.setVisibility(8);
                    if (r0Var != null && gt0Var.A0 == 2) {
                        if (gt0Var.I0()) {
                            i7 = 8;
                        }
                        gt0Var.setSearchItemVisibility(i7);
                    }
                    gt0Var.A0 = 0;
                    gt0Var.l1(1.0f, bs0VarArr[0].F);
                    gt0Var.Y0();
                    gt0Var.u1();
                }
                gt0Var.f35599j1 = false;
                gt0Var.B1 = false;
                gt0Var.A1 = false;
                gt0Var.setHeaderEnabled(true);
                gt0Var.L0.setEnabled(true);
                return;
        }
    }
}
