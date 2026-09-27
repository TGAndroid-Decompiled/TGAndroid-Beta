package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class et0 extends AnimatorListenerAdapter {
    public final int f24120a;
    public final lv0 f24121b;

    public et0(lv0 lv0Var, int i10) {
        this.f24120a = i10;
        this.f24121b = lv0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f24120a) {
            case 0:
                this.f24121b.L0 = null;
                return;
            default:
                lv0 lv0Var = this.f24121b;
                org.telegram.ui.ActionBar.w0 w0Var = lv0Var.f26193n0;
                eu0[] eu0VarArr = lv0Var.f26188k0;
                lv0Var.f26179f1 = null;
                int i10 = 4;
                if (lv0Var.f26185i1) {
                    eu0VarArr[1].setVisibility(8);
                    if (w0Var != null && !lv0Var.D()) {
                        if (lv0Var.v0()) {
                            i10 = 8;
                        }
                        w0Var.setVisibility(i10);
                        lv0Var.f26195o0 = 0.0f;
                    } else {
                        lv0Var.f26195o0 = lv0Var.b0(0.0f);
                        lv0Var.s1(0.0f);
                    }
                    lv0Var.q1(false);
                    lv0Var.f26217x0 = 0;
                } else {
                    eu0 eu0Var = eu0VarArr[0];
                    eu0VarArr[0] = eu0VarArr[1];
                    eu0VarArr[1] = eu0Var;
                    eu0Var.setVisibility(8);
                    if (w0Var != null && lv0Var.f26217x0 == 2) {
                        if (lv0Var.v0()) {
                            i10 = 8;
                        }
                        w0Var.setVisibility(i10);
                    }
                    lv0Var.f26217x0 = 0;
                    lv0Var.Z0(1.0f, eu0VarArr[0].F);
                    lv0Var.L0();
                    lv0Var.f1();
                }
                lv0Var.f26181g1 = false;
                lv0Var.f26221y1 = false;
                lv0Var.f26218x1 = false;
                lv0Var.N0(false);
                lv0Var.G.setEnabled(true);
                lv0Var.I0.setEnabled(true);
                return;
        }
    }
}
