package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class rs0 extends AnimatorListenerAdapter {
    public final int f30840a;
    public final zu0 f30841b;

    public rs0(zu0 zu0Var, int i10) {
        this.f30840a = i10;
        this.f30841b = zu0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f30840a) {
            case 0:
                this.f30841b.I0 = null;
                return;
            default:
                zu0 zu0Var = this.f30841b;
                org.telegram.ui.ActionBar.w0 w0Var = zu0Var.f33986k0;
                rt0[] rt0VarArr = zu0Var.f33980h0;
                zu0Var.f33969c1 = null;
                int i10 = 4;
                if (zu0Var.f33977f1) {
                    rt0VarArr[1].setVisibility(8);
                    if (w0Var != null && !zu0Var.D()) {
                        if (zu0Var.v0()) {
                            i10 = 8;
                        }
                        w0Var.setVisibility(i10);
                        zu0Var.f33988l0 = 0.0f;
                    } else {
                        zu0Var.f33988l0 = zu0Var.b0(0.0f);
                        zu0Var.s1(0.0f);
                    }
                    zu0Var.q1(false);
                    zu0Var.f34007u0 = 0;
                } else {
                    rt0 rt0Var = rt0VarArr[0];
                    rt0VarArr[0] = rt0VarArr[1];
                    rt0VarArr[1] = rt0Var;
                    rt0Var.setVisibility(8);
                    if (w0Var != null && zu0Var.f34007u0 == 2) {
                        if (zu0Var.v0()) {
                            i10 = 8;
                        }
                        w0Var.setVisibility(i10);
                    }
                    zu0Var.f34007u0 = 0;
                    zu0Var.Z0(1.0f, rt0VarArr[0].C);
                    zu0Var.L0();
                    zu0Var.f1();
                }
                zu0Var.f33971d1 = false;
                zu0Var.f34010v1 = false;
                zu0Var.f34008u1 = false;
                zu0Var.N0(false);
                zu0Var.D.setEnabled(true);
                zu0Var.F0.setEnabled(true);
                return;
        }
    }
}
