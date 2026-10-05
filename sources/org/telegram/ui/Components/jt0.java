package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class jt0 extends AnimatorListenerAdapter {
    public final int f27968a;
    public final qv0 f27969b;

    public jt0(qv0 qv0Var, int i10) {
        this.f27968a = i10;
        this.f27969b = qv0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f27968a) {
            case 0:
                this.f27969b.L0 = null;
                return;
            default:
                qv0 qv0Var = this.f27969b;
                org.telegram.ui.ActionBar.v0 v0Var = qv0Var.f30244n0;
                ju0[] ju0VarArr = qv0Var.f30239k0;
                qv0Var.f30230f1 = null;
                int i10 = 4;
                if (qv0Var.f30236i1) {
                    ju0VarArr[1].setVisibility(8);
                    if (v0Var != null && !qv0Var.D()) {
                        if (qv0Var.v0()) {
                            i10 = 8;
                        }
                        v0Var.setVisibility(i10);
                        qv0Var.f30246o0 = 0.0f;
                    } else {
                        qv0Var.f30246o0 = qv0Var.b0(0.0f);
                        qv0Var.s1(0.0f);
                    }
                    qv0Var.q1(false);
                    qv0Var.f30268x0 = 0;
                } else {
                    ju0 ju0Var = ju0VarArr[0];
                    ju0VarArr[0] = ju0VarArr[1];
                    ju0VarArr[1] = ju0Var;
                    ju0Var.setVisibility(8);
                    if (v0Var != null && qv0Var.f30268x0 == 2) {
                        if (qv0Var.v0()) {
                            i10 = 8;
                        }
                        v0Var.setVisibility(i10);
                    }
                    qv0Var.f30268x0 = 0;
                    qv0Var.Z0(1.0f, ju0VarArr[0].F);
                    qv0Var.L0();
                    qv0Var.f1();
                }
                qv0Var.f30232g1 = false;
                qv0Var.f30272y1 = false;
                qv0Var.f30269x1 = false;
                qv0Var.N0(false);
                qv0Var.G.setEnabled(true);
                qv0Var.I0.setEnabled(true);
                return;
        }
    }
}
