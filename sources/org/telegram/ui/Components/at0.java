package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class at0 extends AnimatorListenerAdapter {
    public final int f21585a;
    public final iv0 f21586b;

    public at0(iv0 iv0Var, int i10) {
        this.f21585a = i10;
        this.f21586b = iv0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f21585a) {
            case 0:
                this.f21586b.L0 = null;
                return;
            default:
                iv0 iv0Var = this.f21586b;
                org.telegram.ui.ActionBar.w0 w0Var = iv0Var.f24112n0;
                au0[] au0VarArr = iv0Var.f24107k0;
                iv0Var.f24098f1 = null;
                int i10 = 4;
                if (iv0Var.f24104i1) {
                    au0VarArr[1].setVisibility(8);
                    if (w0Var != null && !iv0Var.D()) {
                        if (iv0Var.v0()) {
                            i10 = 8;
                        }
                        w0Var.setVisibility(i10);
                        iv0Var.f24114o0 = 0.0f;
                    } else {
                        iv0Var.f24114o0 = iv0Var.b0(0.0f);
                        iv0Var.s1(0.0f);
                    }
                    iv0Var.q1(false);
                    iv0Var.f24136x0 = 0;
                } else {
                    au0 au0Var = au0VarArr[0];
                    au0VarArr[0] = au0VarArr[1];
                    au0VarArr[1] = au0Var;
                    au0Var.setVisibility(8);
                    if (w0Var != null && iv0Var.f24136x0 == 2) {
                        if (iv0Var.v0()) {
                            i10 = 8;
                        }
                        w0Var.setVisibility(i10);
                    }
                    iv0Var.f24136x0 = 0;
                    iv0Var.Z0(1.0f, au0VarArr[0].F);
                    iv0Var.L0();
                    iv0Var.f1();
                }
                iv0Var.f24100g1 = false;
                iv0Var.f24140y1 = false;
                iv0Var.f24137x1 = false;
                iv0Var.N0(false);
                iv0Var.G.setEnabled(true);
                iv0Var.I0.setEnabled(true);
                return;
        }
    }
}
