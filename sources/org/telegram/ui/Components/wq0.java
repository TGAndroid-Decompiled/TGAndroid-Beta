package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class wq0 extends AnimatorListenerAdapter {
    public final int f40031a;
    public final xs0 f40032b;

    public wq0(xs0 xs0Var, int i7) {
        this.f40031a = i7;
        this.f40032b = xs0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f40031a) {
            case 0:
                this.f40032b.N0 = null;
                return;
            default:
                xs0 xs0Var = this.f40032b;
                org.telegram.ui.ActionBar.r0 r0Var = xs0Var.f40437p0;
                sr0[] sr0VarArr = xs0Var.m0;
                xs0Var.f40416h1 = null;
                int i7 = 4;
                if (xs0Var.f40425k1) {
                    sr0VarArr[1].setVisibility(8);
                    if (r0Var != null && !xs0Var.I()) {
                        if (xs0Var.H0()) {
                            i7 = 8;
                        }
                        xs0Var.setSearchItemVisibility(i7);
                        xs0Var.f40440q0 = 0.0f;
                    } else {
                        xs0Var.f40440q0 = xs0Var.l0(0.0f);
                        xs0Var.K1(0.0f);
                    }
                    xs0Var.G1(false);
                    xs0Var.f40465z0 = 0;
                } else {
                    sr0 sr0Var = sr0VarArr[0];
                    sr0VarArr[0] = sr0VarArr[1];
                    sr0VarArr[1] = sr0Var;
                    sr0Var.setVisibility(8);
                    if (r0Var != null && xs0Var.f40465z0 == 2) {
                        if (xs0Var.H0()) {
                            i7 = 8;
                        }
                        xs0Var.setSearchItemVisibility(i7);
                    }
                    xs0Var.f40465z0 = 0;
                    xs0Var.j1(1.0f, sr0VarArr[0].E);
                    xs0Var.W0();
                    xs0Var.s1();
                }
                xs0Var.f40419i1 = false;
                xs0Var.A1 = false;
                xs0Var.f40466z1 = false;
                xs0Var.setHeaderEnabled(true);
                xs0Var.K0.setEnabled(true);
                return;
        }
    }
}
