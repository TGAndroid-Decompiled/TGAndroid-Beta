package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class vt0 extends AnimatorListenerAdapter {
    public final int f32509a;
    public final cw0 f32510b;

    public vt0(cw0 cw0Var, int i10) {
        this.f32509a = i10;
        this.f32510b = cw0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f32509a) {
            case 0:
                this.f32510b.L0 = null;
                return;
            default:
                cw0 cw0Var = this.f32510b;
                org.telegram.ui.ActionBar.v0 v0Var = cw0Var.f25455n0;
                vu0[] vu0VarArr = cw0Var.f25450k0;
                cw0Var.f25441f1 = null;
                int i10 = 4;
                if (cw0Var.f25447i1) {
                    vu0VarArr[1].setVisibility(8);
                    if (v0Var != null && !cw0Var.D()) {
                        if (cw0Var.v0()) {
                            i10 = 8;
                        }
                        v0Var.setVisibility(i10);
                        cw0Var.f25457o0 = 0.0f;
                    } else {
                        cw0Var.f25457o0 = cw0Var.b0(0.0f);
                        cw0Var.s1(0.0f);
                    }
                    cw0Var.q1(false);
                    cw0Var.f25479x0 = 0;
                } else {
                    vu0 vu0Var = vu0VarArr[0];
                    vu0VarArr[0] = vu0VarArr[1];
                    vu0VarArr[1] = vu0Var;
                    vu0Var.setVisibility(8);
                    if (v0Var != null && cw0Var.f25479x0 == 2) {
                        if (cw0Var.v0()) {
                            i10 = 8;
                        }
                        v0Var.setVisibility(i10);
                    }
                    cw0Var.f25479x0 = 0;
                    cw0Var.Z0(1.0f, vu0VarArr[0].F);
                    cw0Var.L0();
                    cw0Var.f1();
                }
                cw0Var.f25443g1 = false;
                cw0Var.f25483y1 = false;
                cw0Var.f25480x1 = false;
                cw0Var.N0(false);
                cw0Var.G.setEnabled(true);
                cw0Var.I0.setEnabled(true);
                return;
        }
    }
}
