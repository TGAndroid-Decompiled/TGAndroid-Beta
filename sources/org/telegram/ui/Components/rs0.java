package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class rs0 extends AnimatorListenerAdapter {
    public final int f27719a;
    public final yu0 f27720b;

    public rs0(yu0 yu0Var, int i10) {
        this.f27719a = i10;
        this.f27720b = yu0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f27719a) {
            case 0:
                this.f27720b.L0 = null;
                return;
            default:
                yu0 yu0Var = this.f27720b;
                org.telegram.ui.ActionBar.v0 v0Var = yu0Var.f30431n0;
                rt0[] rt0VarArr = yu0Var.f30426k0;
                yu0Var.f30417f1 = null;
                int i10 = 4;
                if (yu0Var.f30423i1) {
                    rt0VarArr[1].setVisibility(8);
                    if (v0Var != null && !yu0Var.D()) {
                        if (yu0Var.v0()) {
                            i10 = 8;
                        }
                        v0Var.setVisibility(i10);
                        yu0Var.f30433o0 = 0.0f;
                    } else {
                        yu0Var.f30433o0 = yu0Var.b0(0.0f);
                        yu0Var.s1(0.0f);
                    }
                    yu0Var.q1(false);
                    yu0Var.f30455x0 = 0;
                } else {
                    rt0 rt0Var = rt0VarArr[0];
                    rt0VarArr[0] = rt0VarArr[1];
                    rt0VarArr[1] = rt0Var;
                    rt0Var.setVisibility(8);
                    if (v0Var != null && yu0Var.f30455x0 == 2) {
                        if (yu0Var.v0()) {
                            i10 = 8;
                        }
                        v0Var.setVisibility(i10);
                    }
                    yu0Var.f30455x0 = 0;
                    yu0Var.Z0(1.0f, rt0VarArr[0].F);
                    yu0Var.L0();
                    yu0Var.f1();
                }
                yu0Var.f30419g1 = false;
                yu0Var.f30459y1 = false;
                yu0Var.f30456x1 = false;
                yu0Var.N0(false);
                yu0Var.G.setEnabled(true);
                yu0Var.I0.setEnabled(true);
                return;
        }
    }
}
