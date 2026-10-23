package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class qt0 extends AnimatorListenerAdapter {
    public final int f29987a;
    public final xv0 f29988b;

    public qt0(xv0 xv0Var, int i10) {
        this.f29987a = i10;
        this.f29988b = xv0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f29987a) {
            case 0:
                this.f29988b.L0 = null;
                return;
            default:
                xv0 xv0Var = this.f29988b;
                org.telegram.ui.ActionBar.u0 u0Var = xv0Var.f32692n0;
                qu0[] qu0VarArr = xv0Var.f32687k0;
                xv0Var.f32677f1 = null;
                int i10 = 4;
                if (xv0Var.f32684i1) {
                    qu0VarArr[1].setVisibility(8);
                    if (u0Var != null && !xv0Var.E()) {
                        if (xv0Var.y0()) {
                            i10 = 8;
                        }
                        u0Var.setVisibility(i10);
                        xv0Var.f32694o0 = 0.0f;
                    } else {
                        xv0Var.f32694o0 = xv0Var.c0(0.0f);
                        xv0Var.x1(0.0f);
                    }
                    xv0Var.u1(false);
                    xv0Var.f32716x0 = 0;
                } else {
                    qu0 qu0Var = qu0VarArr[0];
                    qu0VarArr[0] = qu0VarArr[1];
                    qu0VarArr[1] = qu0Var;
                    qu0Var.setVisibility(8);
                    if (u0Var != null && xv0Var.f32716x0 == 2) {
                        if (xv0Var.y0()) {
                            i10 = 8;
                        }
                        u0Var.setVisibility(i10);
                    }
                    xv0Var.f32716x0 = 0;
                    xv0Var.c1(1.0f, qu0VarArr[0].F);
                    xv0Var.O0();
                    xv0Var.i1();
                }
                xv0Var.f32680g1 = false;
                xv0Var.f32720y1 = false;
                xv0Var.f32717x1 = false;
                xv0Var.Q0(false);
                xv0Var.G.setEnabled(true);
                xv0Var.I0.setEnabled(true);
                return;
        }
    }
}
