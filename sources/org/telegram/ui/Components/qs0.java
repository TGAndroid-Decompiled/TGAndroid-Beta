package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class qs0 extends AnimatorListenerAdapter {
    public final int f30514a;
    public final yu0 f30515b;

    public qs0(yu0 yu0Var, int i10) {
        this.f30514a = i10;
        this.f30515b = yu0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f30514a) {
            case 0:
                this.f30515b.I0 = null;
                return;
            default:
                yu0 yu0Var = this.f30515b;
                org.telegram.ui.ActionBar.w0 w0Var = yu0Var.f33631k0;
                qt0[] qt0VarArr = yu0Var.f33625h0;
                yu0Var.f33614c1 = null;
                int i10 = 4;
                if (yu0Var.f33622f1) {
                    qt0VarArr[1].setVisibility(8);
                    if (w0Var != null && !yu0Var.D()) {
                        if (yu0Var.v0()) {
                            i10 = 8;
                        }
                        w0Var.setVisibility(i10);
                        yu0Var.f33633l0 = 0.0f;
                    } else {
                        yu0Var.f33633l0 = yu0Var.b0(0.0f);
                        yu0Var.s1(0.0f);
                    }
                    yu0Var.q1(false);
                    yu0Var.f33652u0 = 0;
                } else {
                    qt0 qt0Var = qt0VarArr[0];
                    qt0VarArr[0] = qt0VarArr[1];
                    qt0VarArr[1] = qt0Var;
                    qt0Var.setVisibility(8);
                    if (w0Var != null && yu0Var.f33652u0 == 2) {
                        if (yu0Var.v0()) {
                            i10 = 8;
                        }
                        w0Var.setVisibility(i10);
                    }
                    yu0Var.f33652u0 = 0;
                    yu0Var.Z0(1.0f, qt0VarArr[0].C);
                    yu0Var.L0();
                    yu0Var.f1();
                }
                yu0Var.f33616d1 = false;
                yu0Var.f33655v1 = false;
                yu0Var.f33653u1 = false;
                yu0Var.N0(false);
                yu0Var.D.setEnabled(true);
                yu0Var.F0.setEnabled(true);
                return;
        }
    }
}
