package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class au0 extends AnimatorListenerAdapter {
    public final int f24491a;
    public final hw0 f24492b;

    public au0(hw0 hw0Var, int i10) {
        this.f24491a = i10;
        this.f24492b = hw0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f24491a) {
            case 0:
                this.f24492b.L0 = null;
                return;
            default:
                hw0 hw0Var = this.f24492b;
                org.telegram.ui.ActionBar.u0 u0Var = hw0Var.f26953n0;
                av0[] av0VarArr = hw0Var.f26948k0;
                hw0Var.f26939f1 = null;
                int i10 = 4;
                if (hw0Var.f26945i1) {
                    av0VarArr[1].setVisibility(8);
                    if (u0Var != null && !hw0Var.D()) {
                        if (hw0Var.v0()) {
                            i10 = 8;
                        }
                        u0Var.setVisibility(i10);
                        hw0Var.f26955o0 = 0.0f;
                    } else {
                        hw0Var.f26955o0 = hw0Var.b0(0.0f);
                        hw0Var.s1(0.0f);
                    }
                    hw0Var.q1(false);
                    hw0Var.f26977x0 = 0;
                } else {
                    av0 av0Var = av0VarArr[0];
                    av0VarArr[0] = av0VarArr[1];
                    av0VarArr[1] = av0Var;
                    av0Var.setVisibility(8);
                    if (u0Var != null && hw0Var.f26977x0 == 2) {
                        if (hw0Var.v0()) {
                            i10 = 8;
                        }
                        u0Var.setVisibility(i10);
                    }
                    hw0Var.f26977x0 = 0;
                    hw0Var.Z0(1.0f, av0VarArr[0].F);
                    hw0Var.L0();
                    hw0Var.f1();
                }
                hw0Var.f26941g1 = false;
                hw0Var.f26981y1 = false;
                hw0Var.f26978x1 = false;
                hw0Var.N0(false);
                hw0Var.G.setEnabled(true);
                hw0Var.I0.setEnabled(true);
                return;
        }
    }
}
