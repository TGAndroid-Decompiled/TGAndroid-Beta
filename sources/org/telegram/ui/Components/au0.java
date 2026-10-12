package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class au0 extends AnimatorListenerAdapter {
    public final int f24479a;
    public final hw0 f24480b;

    public au0(hw0 hw0Var, int i10) {
        this.f24479a = i10;
        this.f24480b = hw0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f24479a) {
            case 0:
                this.f24480b.L0 = null;
                return;
            default:
                hw0 hw0Var = this.f24480b;
                org.telegram.ui.ActionBar.u0 u0Var = hw0Var.f26938n0;
                av0[] av0VarArr = hw0Var.f26933k0;
                hw0Var.f26924f1 = null;
                int i10 = 4;
                if (hw0Var.f26930i1) {
                    av0VarArr[1].setVisibility(8);
                    if (u0Var != null && !hw0Var.D()) {
                        if (hw0Var.v0()) {
                            i10 = 8;
                        }
                        u0Var.setVisibility(i10);
                        hw0Var.f26940o0 = 0.0f;
                    } else {
                        hw0Var.f26940o0 = hw0Var.b0(0.0f);
                        hw0Var.s1(0.0f);
                    }
                    hw0Var.q1(false);
                    hw0Var.f26962x0 = 0;
                } else {
                    av0 av0Var = av0VarArr[0];
                    av0VarArr[0] = av0VarArr[1];
                    av0VarArr[1] = av0Var;
                    av0Var.setVisibility(8);
                    if (u0Var != null && hw0Var.f26962x0 == 2) {
                        if (hw0Var.v0()) {
                            i10 = 8;
                        }
                        u0Var.setVisibility(i10);
                    }
                    hw0Var.f26962x0 = 0;
                    hw0Var.Z0(1.0f, av0VarArr[0].F);
                    hw0Var.L0();
                    hw0Var.f1();
                }
                hw0Var.f26926g1 = false;
                hw0Var.f26966y1 = false;
                hw0Var.f26963x1 = false;
                hw0Var.N0(false);
                hw0Var.G.setEnabled(true);
                hw0Var.I0.setEnabled(true);
                return;
        }
    }
}
