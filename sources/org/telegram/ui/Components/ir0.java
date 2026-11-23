package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class ir0 extends AnimatorListenerAdapter {
    public final int f36262a;
    public final jt0 f36263b;

    public ir0(jt0 jt0Var, int i7) {
        this.f36262a = i7;
        this.f36263b = jt0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f36262a) {
            case 0:
                this.f36263b.O0 = null;
                return;
            default:
                jt0 jt0Var = this.f36263b;
                org.telegram.ui.ActionBar.q0 q0Var = jt0Var.f36613q0;
                ds0[] ds0VarArr = jt0Var.f36605n0;
                jt0Var.f36592i1 = null;
                int i7 = 4;
                if (jt0Var.l1) {
                    ds0VarArr[1].setVisibility(8);
                    if (q0Var != null && !jt0Var.I()) {
                        if (jt0Var.I0()) {
                            i7 = 8;
                        }
                        jt0Var.setSearchItemVisibility(i7);
                        jt0Var.f36617r0 = 0.0f;
                    } else {
                        jt0Var.f36617r0 = jt0Var.l0(0.0f);
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
                jt0Var.f36595j1 = false;
                jt0Var.B1 = false;
                jt0Var.A1 = false;
                jt0Var.setHeaderEnabled(true);
                jt0Var.L0.setEnabled(true);
                return;
        }
    }
}
