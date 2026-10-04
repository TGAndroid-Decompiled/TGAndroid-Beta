package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class it0 extends AnimatorListenerAdapter {
    public final int f27494a;
    public final pv0 f27495b;

    public it0(pv0 pv0Var, int i10) {
        this.f27494a = i10;
        this.f27495b = pv0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f27494a) {
            case 0:
                this.f27495b.L0 = null;
                return;
            default:
                pv0 pv0Var = this.f27495b;
                org.telegram.ui.ActionBar.v0 v0Var = pv0Var.f29782n0;
                iu0[] iu0VarArr = pv0Var.f29777k0;
                pv0Var.f29768f1 = null;
                int i10 = 4;
                if (pv0Var.f29774i1) {
                    iu0VarArr[1].setVisibility(8);
                    if (v0Var != null && !pv0Var.D()) {
                        if (pv0Var.v0()) {
                            i10 = 8;
                        }
                        v0Var.setVisibility(i10);
                        pv0Var.f29784o0 = 0.0f;
                    } else {
                        pv0Var.f29784o0 = pv0Var.b0(0.0f);
                        pv0Var.s1(0.0f);
                    }
                    pv0Var.q1(false);
                    pv0Var.f29806x0 = 0;
                } else {
                    iu0 iu0Var = iu0VarArr[0];
                    iu0VarArr[0] = iu0VarArr[1];
                    iu0VarArr[1] = iu0Var;
                    iu0Var.setVisibility(8);
                    if (v0Var != null && pv0Var.f29806x0 == 2) {
                        if (pv0Var.v0()) {
                            i10 = 8;
                        }
                        v0Var.setVisibility(i10);
                    }
                    pv0Var.f29806x0 = 0;
                    pv0Var.Z0(1.0f, iu0VarArr[0].F);
                    pv0Var.L0();
                    pv0Var.f1();
                }
                pv0Var.f29770g1 = false;
                pv0Var.f29810y1 = false;
                pv0Var.f29807x1 = false;
                pv0Var.N0(false);
                pv0Var.G.setEnabled(true);
                pv0Var.I0.setEnabled(true);
                return;
        }
    }
}
