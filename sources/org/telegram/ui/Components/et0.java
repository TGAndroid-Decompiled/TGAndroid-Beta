package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class et0 extends AnimatorListenerAdapter {
    public final int f24061a;
    public final lv0 f24062b;

    public et0(lv0 lv0Var, int i10) {
        this.f24061a = i10;
        this.f24062b = lv0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f24061a) {
            case 0:
                this.f24062b.L0 = null;
                return;
            default:
                lv0 lv0Var = this.f24062b;
                org.telegram.ui.ActionBar.u0 u0Var = lv0Var.f26141n0;
                eu0[] eu0VarArr = lv0Var.f26136k0;
                lv0Var.f26127f1 = null;
                int i10 = 4;
                if (lv0Var.f26133i1) {
                    eu0VarArr[1].setVisibility(8);
                    if (u0Var != null && !lv0Var.D()) {
                        if (lv0Var.v0()) {
                            i10 = 8;
                        }
                        u0Var.setVisibility(i10);
                        lv0Var.f26143o0 = 0.0f;
                    } else {
                        lv0Var.f26143o0 = lv0Var.b0(0.0f);
                        lv0Var.s1(0.0f);
                    }
                    lv0Var.q1(false);
                    lv0Var.f26165x0 = 0;
                } else {
                    eu0 eu0Var = eu0VarArr[0];
                    eu0VarArr[0] = eu0VarArr[1];
                    eu0VarArr[1] = eu0Var;
                    eu0Var.setVisibility(8);
                    if (u0Var != null && lv0Var.f26165x0 == 2) {
                        if (lv0Var.v0()) {
                            i10 = 8;
                        }
                        u0Var.setVisibility(i10);
                    }
                    lv0Var.f26165x0 = 0;
                    lv0Var.Z0(1.0f, eu0VarArr[0].F);
                    lv0Var.L0();
                    lv0Var.f1();
                }
                lv0Var.f26129g1 = false;
                lv0Var.f26169y1 = false;
                lv0Var.f26166x1 = false;
                lv0Var.N0(false);
                lv0Var.G.setEnabled(true);
                lv0Var.I0.setEnabled(true);
                return;
        }
    }
}
