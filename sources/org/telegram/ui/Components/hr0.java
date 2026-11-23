package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class hr0 extends AnimatorListenerAdapter {
    public final int f35800a;
    public final it0 f35801b;

    public hr0(it0 it0Var, int i7) {
        this.f35800a = i7;
        this.f35801b = it0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f35800a) {
            case 0:
                this.f35801b.O0 = null;
                return;
            default:
                it0 it0Var = this.f35801b;
                org.telegram.ui.ActionBar.q0 q0Var = it0Var.f36141q0;
                ds0[] ds0VarArr = it0Var.f36133n0;
                it0Var.f36120i1 = null;
                int i7 = 4;
                if (it0Var.l1) {
                    ds0VarArr[1].setVisibility(8);
                    if (q0Var != null && !it0Var.I()) {
                        if (it0Var.I0()) {
                            i7 = 8;
                        }
                        it0Var.setSearchItemVisibility(i7);
                        it0Var.f36145r0 = 0.0f;
                    } else {
                        it0Var.f36145r0 = it0Var.l0(0.0f);
                        it0Var.M1(0.0f);
                    }
                    it0Var.I1(false);
                    it0Var.A0 = 0;
                } else {
                    ds0 ds0Var = ds0VarArr[0];
                    ds0VarArr[0] = ds0VarArr[1];
                    ds0VarArr[1] = ds0Var;
                    ds0Var.setVisibility(8);
                    if (q0Var != null && it0Var.A0 == 2) {
                        if (it0Var.I0()) {
                            i7 = 8;
                        }
                        it0Var.setSearchItemVisibility(i7);
                    }
                    it0Var.A0 = 0;
                    it0Var.l1(1.0f, ds0VarArr[0].F);
                    it0Var.Y0();
                    it0Var.u1();
                }
                it0Var.f36123j1 = false;
                it0Var.B1 = false;
                it0Var.A1 = false;
                it0Var.setHeaderEnabled(true);
                it0Var.L0.setEnabled(true);
                return;
        }
    }
}
