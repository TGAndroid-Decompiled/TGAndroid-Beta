package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class vt0 extends AnimatorListenerAdapter {
    public final int f32546a;
    public final cw0 f32547b;

    public vt0(cw0 cw0Var, int i10) {
        this.f32546a = i10;
        this.f32547b = cw0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f32546a) {
            case 0:
                this.f32547b.L0 = null;
                return;
            default:
                cw0 cw0Var = this.f32547b;
                org.telegram.ui.ActionBar.u0 u0Var = cw0Var.f25517n0;
                vu0[] vu0VarArr = cw0Var.f25512k0;
                cw0Var.f25503f1 = null;
                int i10 = 4;
                if (cw0Var.f25509i1) {
                    vu0VarArr[1].setVisibility(8);
                    if (u0Var != null && !cw0Var.D()) {
                        if (cw0Var.v0()) {
                            i10 = 8;
                        }
                        u0Var.setVisibility(i10);
                        cw0Var.f25519o0 = 0.0f;
                    } else {
                        cw0Var.f25519o0 = cw0Var.b0(0.0f);
                        cw0Var.s1(0.0f);
                    }
                    cw0Var.q1(false);
                    cw0Var.f25541x0 = 0;
                } else {
                    vu0 vu0Var = vu0VarArr[0];
                    vu0VarArr[0] = vu0VarArr[1];
                    vu0VarArr[1] = vu0Var;
                    vu0Var.setVisibility(8);
                    if (u0Var != null && cw0Var.f25541x0 == 2) {
                        if (cw0Var.v0()) {
                            i10 = 8;
                        }
                        u0Var.setVisibility(i10);
                    }
                    cw0Var.f25541x0 = 0;
                    cw0Var.Z0(1.0f, vu0VarArr[0].F);
                    cw0Var.L0();
                    cw0Var.f1();
                }
                cw0Var.f25505g1 = false;
                cw0Var.f25545y1 = false;
                cw0Var.f25542x1 = false;
                cw0Var.N0(false);
                cw0Var.G.setEnabled(true);
                cw0Var.I0.setEnabled(true);
                return;
        }
    }
}
