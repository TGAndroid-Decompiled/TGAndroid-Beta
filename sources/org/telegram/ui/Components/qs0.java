package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class qs0 extends AnimatorListenerAdapter {
    public final int f28232a;
    public final yu0 f28233b;

    public qs0(yu0 yu0Var, int i10) {
        this.f28232a = i10;
        this.f28233b = yu0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f28232a) {
            case 0:
                this.f28233b.I0 = null;
                return;
            default:
                yu0 yu0Var = this.f28233b;
                org.telegram.ui.ActionBar.w0 w0Var = yu0Var.f31126k0;
                qt0[] qt0VarArr = yu0Var.f31120h0;
                yu0Var.f31110c1 = null;
                int i10 = 4;
                if (yu0Var.f31117f1) {
                    qt0VarArr[1].setVisibility(8);
                    if (w0Var != null && !yu0Var.D()) {
                        if (yu0Var.v0()) {
                            i10 = 8;
                        }
                        w0Var.setVisibility(i10);
                        yu0Var.f31128l0 = 0.0f;
                    } else {
                        yu0Var.f31128l0 = yu0Var.b0(0.0f);
                        yu0Var.s1(0.0f);
                    }
                    yu0Var.q1(false);
                    yu0Var.f31147u0 = 0;
                } else {
                    qt0 qt0Var = qt0VarArr[0];
                    qt0VarArr[0] = qt0VarArr[1];
                    qt0VarArr[1] = qt0Var;
                    qt0Var.setVisibility(8);
                    if (w0Var != null && yu0Var.f31147u0 == 2) {
                        if (yu0Var.v0()) {
                            i10 = 8;
                        }
                        w0Var.setVisibility(i10);
                    }
                    yu0Var.f31147u0 = 0;
                    yu0Var.Z0(1.0f, qt0VarArr[0].C);
                    yu0Var.L0();
                    yu0Var.f1();
                }
                yu0Var.f31112d1 = false;
                yu0Var.f31150v1 = false;
                yu0Var.f31148u1 = false;
                yu0Var.N0(false);
                yu0Var.D.setEnabled(true);
                yu0Var.F0.setEnabled(true);
                return;
        }
    }
}
