package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class et0 extends AnimatorListenerAdapter {
    public final int f24060a;
    public final lv0 f24061b;

    public et0(lv0 lv0Var, int i10) {
        this.f24060a = i10;
        this.f24061b = lv0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f24060a) {
            case 0:
                this.f24061b.L0 = null;
                return;
            default:
                lv0 lv0Var = this.f24061b;
                org.telegram.ui.ActionBar.u0 u0Var = lv0Var.f26140n0;
                eu0[] eu0VarArr = lv0Var.f26135k0;
                lv0Var.f26126f1 = null;
                int i10 = 4;
                if (lv0Var.f26132i1) {
                    eu0VarArr[1].setVisibility(8);
                    if (u0Var != null && !lv0Var.D()) {
                        if (lv0Var.v0()) {
                            i10 = 8;
                        }
                        u0Var.setVisibility(i10);
                        lv0Var.f26142o0 = 0.0f;
                    } else {
                        lv0Var.f26142o0 = lv0Var.b0(0.0f);
                        lv0Var.s1(0.0f);
                    }
                    lv0Var.q1(false);
                    lv0Var.f26164x0 = 0;
                } else {
                    eu0 eu0Var = eu0VarArr[0];
                    eu0VarArr[0] = eu0VarArr[1];
                    eu0VarArr[1] = eu0Var;
                    eu0Var.setVisibility(8);
                    if (u0Var != null && lv0Var.f26164x0 == 2) {
                        if (lv0Var.v0()) {
                            i10 = 8;
                        }
                        u0Var.setVisibility(i10);
                    }
                    lv0Var.f26164x0 = 0;
                    lv0Var.Z0(1.0f, eu0VarArr[0].F);
                    lv0Var.L0();
                    lv0Var.f1();
                }
                lv0Var.f26128g1 = false;
                lv0Var.f26168y1 = false;
                lv0Var.f26165x1 = false;
                lv0Var.N0(false);
                lv0Var.G.setEnabled(true);
                lv0Var.I0.setEnabled(true);
                return;
        }
    }
}
