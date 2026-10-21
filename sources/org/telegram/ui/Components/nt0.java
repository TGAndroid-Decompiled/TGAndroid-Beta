package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class nt0 extends AnimatorListenerAdapter {
    public final int f28873a;
    public final uv0 f28874b;

    public nt0(uv0 uv0Var, int i10) {
        this.f28873a = i10;
        this.f28874b = uv0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f28873a) {
            case 0:
                this.f28874b.L0 = null;
                return;
            default:
                uv0 uv0Var = this.f28874b;
                org.telegram.ui.ActionBar.u0 u0Var = uv0Var.f31052n0;
                nu0[] nu0VarArr = uv0Var.f31047k0;
                uv0Var.f31038f1 = null;
                int i10 = 4;
                if (uv0Var.f31044i1) {
                    nu0VarArr[1].setVisibility(8);
                    if (u0Var != null && !uv0Var.D()) {
                        if (uv0Var.x0()) {
                            i10 = 8;
                        }
                        u0Var.setVisibility(i10);
                        uv0Var.f31054o0 = 0.0f;
                    } else {
                        uv0Var.f31054o0 = uv0Var.b0(0.0f);
                        uv0Var.v1(0.0f);
                    }
                    uv0Var.s1(false);
                    uv0Var.f31076x0 = 0;
                } else {
                    nu0 nu0Var = nu0VarArr[0];
                    nu0VarArr[0] = nu0VarArr[1];
                    nu0VarArr[1] = nu0Var;
                    nu0Var.setVisibility(8);
                    if (u0Var != null && uv0Var.f31076x0 == 2) {
                        if (uv0Var.x0()) {
                            i10 = 8;
                        }
                        u0Var.setVisibility(i10);
                    }
                    uv0Var.f31076x0 = 0;
                    uv0Var.b1(1.0f, nu0VarArr[0].F);
                    uv0Var.N0();
                    uv0Var.h1();
                }
                uv0Var.f31040g1 = false;
                uv0Var.f31080y1 = false;
                uv0Var.f31077x1 = false;
                uv0Var.P0(false);
                uv0Var.G.setEnabled(true);
                uv0Var.I0.setEnabled(true);
                return;
        }
    }
}
