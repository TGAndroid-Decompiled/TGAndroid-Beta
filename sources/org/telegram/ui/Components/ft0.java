package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class ft0 extends AnimatorListenerAdapter {
    public final int f24347a;
    public final mv0 f24348b;

    public ft0(mv0 mv0Var, int i10) {
        this.f24347a = i10;
        this.f24348b = mv0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f24347a) {
            case 0:
                this.f24348b.L0 = null;
                return;
            default:
                mv0 mv0Var = this.f24348b;
                org.telegram.ui.ActionBar.u0 u0Var = mv0Var.f26430n0;
                fu0[] fu0VarArr = mv0Var.f26425k0;
                mv0Var.f26416f1 = null;
                int i10 = 4;
                if (mv0Var.f26422i1) {
                    fu0VarArr[1].setVisibility(8);
                    if (u0Var != null && !mv0Var.D()) {
                        if (mv0Var.v0()) {
                            i10 = 8;
                        }
                        u0Var.setVisibility(i10);
                        mv0Var.f26432o0 = 0.0f;
                    } else {
                        mv0Var.f26432o0 = mv0Var.b0(0.0f);
                        mv0Var.s1(0.0f);
                    }
                    mv0Var.q1(false);
                    mv0Var.f26454x0 = 0;
                } else {
                    fu0 fu0Var = fu0VarArr[0];
                    fu0VarArr[0] = fu0VarArr[1];
                    fu0VarArr[1] = fu0Var;
                    fu0Var.setVisibility(8);
                    if (u0Var != null && mv0Var.f26454x0 == 2) {
                        if (mv0Var.v0()) {
                            i10 = 8;
                        }
                        u0Var.setVisibility(i10);
                    }
                    mv0Var.f26454x0 = 0;
                    mv0Var.Z0(1.0f, fu0VarArr[0].F);
                    mv0Var.L0();
                    mv0Var.f1();
                }
                mv0Var.f26418g1 = false;
                mv0Var.f26458y1 = false;
                mv0Var.f26455x1 = false;
                mv0Var.N0(false);
                mv0Var.G.setEnabled(true);
                mv0Var.I0.setEnabled(true);
                return;
        }
    }
}
