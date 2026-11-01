package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class yr0 extends AnimatorListenerAdapter {
    public final int f32896a;
    public final au0 f32897b;

    public yr0(au0 au0Var, int i10) {
        this.f32896a = i10;
        this.f32897b = au0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f32896a) {
            case 0:
                this.f32897b.N0 = null;
                return;
            default:
                au0 au0Var = this.f32897b;
                org.telegram.ui.ActionBar.t0 t0Var = au0Var.f24544p0;
                ts0[] ts0VarArr = au0Var.m0;
                au0Var.f24522h1 = null;
                int i10 = 4;
                if (au0Var.f24531k1) {
                    ts0VarArr[1].setVisibility(8);
                    if (t0Var != null && !au0Var.H()) {
                        if (au0Var.F0()) {
                            i10 = 8;
                        }
                        au0Var.setSearchItemVisibility(i10);
                        au0Var.f24547q0 = 0.0f;
                    } else {
                        au0Var.f24547q0 = au0Var.k0(0.0f);
                        au0Var.I1(0.0f);
                    }
                    au0Var.E1(false);
                    au0Var.f24572z0 = 0;
                } else {
                    ts0 ts0Var = ts0VarArr[0];
                    ts0VarArr[0] = ts0VarArr[1];
                    ts0VarArr[1] = ts0Var;
                    ts0Var.setVisibility(8);
                    if (t0Var != null && au0Var.f24572z0 == 2) {
                        if (au0Var.F0()) {
                            i10 = 8;
                        }
                        au0Var.setSearchItemVisibility(i10);
                    }
                    au0Var.f24572z0 = 0;
                    au0Var.h1(1.0f, ts0VarArr[0].E);
                    au0Var.U0();
                    au0Var.q1();
                }
                au0Var.f24525i1 = false;
                au0Var.A1 = false;
                au0Var.f24573z1 = false;
                au0Var.setHeaderEnabled(true);
                au0Var.K0.setEnabled(true);
                return;
        }
    }
}
