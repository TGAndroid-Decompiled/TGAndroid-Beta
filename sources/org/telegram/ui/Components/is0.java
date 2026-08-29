package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class is0 extends AnimatorListenerAdapter {
    public final int f29461a;
    public final qu0 f29462b;

    public is0(qu0 qu0Var, int i10) {
        this.f29461a = i10;
        this.f29462b = qu0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f29461a) {
            case 0:
                this.f29462b.H0 = null;
                return;
            default:
                qu0 qu0Var = this.f29462b;
                org.telegram.ui.ActionBar.w0 w0Var = qu0Var.f32076j0;
                it0[] it0VarArr = qu0Var.f32070g0;
                qu0Var.f32058b1 = null;
                int i10 = 4;
                if (qu0Var.f32066e1) {
                    it0VarArr[1].setVisibility(8);
                    if (w0Var != null && !qu0Var.D()) {
                        if (qu0Var.v0()) {
                            i10 = 8;
                        }
                        w0Var.setVisibility(i10);
                        qu0Var.f32078k0 = 0.0f;
                    } else {
                        qu0Var.f32078k0 = qu0Var.b0(0.0f);
                        qu0Var.s1(0.0f);
                    }
                    qu0Var.q1(false);
                    qu0Var.f32097t0 = 0;
                } else {
                    it0 it0Var = it0VarArr[0];
                    it0VarArr[0] = it0VarArr[1];
                    it0VarArr[1] = it0Var;
                    it0Var.setVisibility(8);
                    if (w0Var != null && qu0Var.f32097t0 == 2) {
                        if (qu0Var.v0()) {
                            i10 = 8;
                        }
                        w0Var.setVisibility(i10);
                    }
                    qu0Var.f32097t0 = 0;
                    qu0Var.Z0(1.0f, it0VarArr[0].B);
                    qu0Var.L0();
                    qu0Var.f1();
                }
                qu0Var.f32061c1 = false;
                qu0Var.f32100u1 = false;
                qu0Var.f32098t1 = false;
                qu0Var.N0(false);
                qu0Var.C.setEnabled(true);
                qu0Var.E0.setEnabled(true);
                return;
        }
    }
}
