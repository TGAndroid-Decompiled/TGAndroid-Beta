package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class ir0 extends AnimatorListenerAdapter {
    public final int f36303a;
    public final jt0 f36304b;

    public ir0(jt0 jt0Var, int i7) {
        this.f36303a = i7;
        this.f36304b = jt0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f36303a) {
            case 0:
                this.f36304b.O0 = null;
                return;
            default:
                jt0 jt0Var = this.f36304b;
                org.telegram.ui.ActionBar.q0 q0Var = jt0Var.f36658q0;
                ds0[] ds0VarArr = jt0Var.f36650n0;
                jt0Var.f36637i1 = null;
                int i7 = 4;
                if (jt0Var.l1) {
                    ds0VarArr[1].setVisibility(8);
                    if (q0Var != null && !jt0Var.I()) {
                        if (jt0Var.I0()) {
                            i7 = 8;
                        }
                        jt0Var.setSearchItemVisibility(i7);
                        jt0Var.f36662r0 = 0.0f;
                    } else {
                        jt0Var.f36662r0 = jt0Var.l0(0.0f);
                        jt0Var.M1(0.0f);
                    }
                    jt0Var.I1(false);
                    jt0Var.A0 = 0;
                } else {
                    ds0 ds0Var = ds0VarArr[0];
                    ds0VarArr[0] = ds0VarArr[1];
                    ds0VarArr[1] = ds0Var;
                    ds0Var.setVisibility(8);
                    if (q0Var != null && jt0Var.A0 == 2) {
                        if (jt0Var.I0()) {
                            i7 = 8;
                        }
                        jt0Var.setSearchItemVisibility(i7);
                    }
                    jt0Var.A0 = 0;
                    jt0Var.l1(1.0f, ds0VarArr[0].F);
                    jt0Var.Y0();
                    jt0Var.u1();
                }
                jt0Var.f36640j1 = false;
                jt0Var.B1 = false;
                jt0Var.A1 = false;
                jt0Var.setHeaderEnabled(true);
                jt0Var.L0.setEnabled(true);
                return;
        }
    }
}
