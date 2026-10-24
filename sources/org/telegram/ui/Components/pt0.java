package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class pt0 extends AnimatorListenerAdapter {
    public final int f29668a;
    public final wv0 f29669b;

    public pt0(wv0 wv0Var, int i10) {
        this.f29668a = i10;
        this.f29669b = wv0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f29668a) {
            case 0:
                this.f29669b.L0 = null;
                return;
            default:
                wv0 wv0Var = this.f29669b;
                org.telegram.ui.ActionBar.u0 u0Var = wv0Var.f32391n0;
                pu0[] pu0VarArr = wv0Var.f32386k0;
                wv0Var.f32376f1 = null;
                int i10 = 4;
                if (wv0Var.f32383i1) {
                    pu0VarArr[1].setVisibility(8);
                    if (u0Var != null && !wv0Var.E()) {
                        if (wv0Var.y0()) {
                            i10 = 8;
                        }
                        u0Var.setVisibility(i10);
                        wv0Var.f32393o0 = 0.0f;
                    } else {
                        wv0Var.f32393o0 = wv0Var.c0(0.0f);
                        wv0Var.x1(0.0f);
                    }
                    wv0Var.u1(false);
                    wv0Var.f32415x0 = 0;
                } else {
                    pu0 pu0Var = pu0VarArr[0];
                    pu0VarArr[0] = pu0VarArr[1];
                    pu0VarArr[1] = pu0Var;
                    pu0Var.setVisibility(8);
                    if (u0Var != null && wv0Var.f32415x0 == 2) {
                        if (wv0Var.y0()) {
                            i10 = 8;
                        }
                        u0Var.setVisibility(i10);
                    }
                    wv0Var.f32415x0 = 0;
                    wv0Var.c1(1.0f, pu0VarArr[0].F);
                    wv0Var.O0();
                    wv0Var.i1();
                }
                wv0Var.f32379g1 = false;
                wv0Var.f32419y1 = false;
                wv0Var.f32416x1 = false;
                wv0Var.Q0(false);
                wv0Var.G.setEnabled(true);
                wv0Var.I0.setEnabled(true);
                return;
        }
    }
}
