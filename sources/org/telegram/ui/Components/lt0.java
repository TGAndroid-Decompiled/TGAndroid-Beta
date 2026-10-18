package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class lt0 extends AnimatorListenerAdapter {
    public final int f28331a;
    public final sv0 f28332b;

    public lt0(sv0 sv0Var, int i10) {
        this.f28331a = i10;
        this.f28332b = sv0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f28331a) {
            case 0:
                this.f28332b.L0 = null;
                return;
            default:
                sv0 sv0Var = this.f28332b;
                org.telegram.ui.ActionBar.u0 u0Var = sv0Var.f30376n0;
                lu0[] lu0VarArr = sv0Var.f30371k0;
                sv0Var.f30362f1 = null;
                int i10 = 4;
                if (sv0Var.f30368i1) {
                    lu0VarArr[1].setVisibility(8);
                    if (u0Var != null && !sv0Var.D()) {
                        if (sv0Var.x0()) {
                            i10 = 8;
                        }
                        u0Var.setVisibility(i10);
                        sv0Var.f30378o0 = 0.0f;
                    } else {
                        sv0Var.f30378o0 = sv0Var.b0(0.0f);
                        sv0Var.v1(0.0f);
                    }
                    sv0Var.s1(false);
                    sv0Var.f30400x0 = 0;
                } else {
                    lu0 lu0Var = lu0VarArr[0];
                    lu0VarArr[0] = lu0VarArr[1];
                    lu0VarArr[1] = lu0Var;
                    lu0Var.setVisibility(8);
                    if (u0Var != null && sv0Var.f30400x0 == 2) {
                        if (sv0Var.x0()) {
                            i10 = 8;
                        }
                        u0Var.setVisibility(i10);
                    }
                    sv0Var.f30400x0 = 0;
                    sv0Var.b1(1.0f, lu0VarArr[0].F);
                    sv0Var.N0();
                    sv0Var.h1();
                }
                sv0Var.f30364g1 = false;
                sv0Var.f30404y1 = false;
                sv0Var.f30401x1 = false;
                sv0Var.P0(false);
                sv0Var.G.setEnabled(true);
                sv0Var.I0.setEnabled(true);
                return;
        }
    }
}
