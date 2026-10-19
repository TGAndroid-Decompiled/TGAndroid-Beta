package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class mt0 extends AnimatorListenerAdapter {
    public final int f28602a;
    public final tv0 f28603b;

    public mt0(tv0 tv0Var, int i10) {
        this.f28602a = i10;
        this.f28603b = tv0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f28602a) {
            case 0:
                this.f28603b.L0 = null;
                return;
            default:
                tv0 tv0Var = this.f28603b;
                org.telegram.ui.ActionBar.u0 u0Var = tv0Var.f30713n0;
                mu0[] mu0VarArr = tv0Var.f30708k0;
                tv0Var.f30699f1 = null;
                int i10 = 4;
                if (tv0Var.f30705i1) {
                    mu0VarArr[1].setVisibility(8);
                    if (u0Var != null && !tv0Var.D()) {
                        if (tv0Var.x0()) {
                            i10 = 8;
                        }
                        u0Var.setVisibility(i10);
                        tv0Var.f30715o0 = 0.0f;
                    } else {
                        tv0Var.f30715o0 = tv0Var.b0(0.0f);
                        tv0Var.v1(0.0f);
                    }
                    tv0Var.s1(false);
                    tv0Var.f30737x0 = 0;
                } else {
                    mu0 mu0Var = mu0VarArr[0];
                    mu0VarArr[0] = mu0VarArr[1];
                    mu0VarArr[1] = mu0Var;
                    mu0Var.setVisibility(8);
                    if (u0Var != null && tv0Var.f30737x0 == 2) {
                        if (tv0Var.x0()) {
                            i10 = 8;
                        }
                        u0Var.setVisibility(i10);
                    }
                    tv0Var.f30737x0 = 0;
                    tv0Var.b1(1.0f, mu0VarArr[0].F);
                    tv0Var.N0();
                    tv0Var.h1();
                }
                tv0Var.f30701g1 = false;
                tv0Var.f30741y1 = false;
                tv0Var.f30738x1 = false;
                tv0Var.P0(false);
                tv0Var.G.setEnabled(true);
                tv0Var.I0.setEnabled(true);
                return;
        }
    }
}
