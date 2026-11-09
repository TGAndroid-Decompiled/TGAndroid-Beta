package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class yq0 extends AnimatorListenerAdapter {
    public final int f40795a;
    public final zs0 f40796b;

    public yq0(zs0 zs0Var, int i7) {
        this.f40795a = i7;
        this.f40796b = zs0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f40795a) {
            case 0:
                this.f40796b.N0 = null;
                return;
            default:
                zs0 zs0Var = this.f40796b;
                org.telegram.ui.ActionBar.r0 r0Var = zs0Var.f41103p0;
                ur0[] ur0VarArr = zs0Var.m0;
                zs0Var.f41082h1 = null;
                int i7 = 4;
                if (zs0Var.f41091k1) {
                    ur0VarArr[1].setVisibility(8);
                    if (r0Var != null && !zs0Var.I()) {
                        if (zs0Var.I0()) {
                            i7 = 8;
                        }
                        zs0Var.setSearchItemVisibility(i7);
                        zs0Var.f41106q0 = 0.0f;
                    } else {
                        zs0Var.f41106q0 = zs0Var.l0(0.0f);
                        zs0Var.M1(0.0f);
                    }
                    zs0Var.I1(false);
                    zs0Var.f41131z0 = 0;
                } else {
                    ur0 ur0Var = ur0VarArr[0];
                    ur0VarArr[0] = ur0VarArr[1];
                    ur0VarArr[1] = ur0Var;
                    ur0Var.setVisibility(8);
                    if (r0Var != null && zs0Var.f41131z0 == 2) {
                        if (zs0Var.I0()) {
                            i7 = 8;
                        }
                        zs0Var.setSearchItemVisibility(i7);
                    }
                    zs0Var.f41131z0 = 0;
                    zs0Var.l1(1.0f, ur0VarArr[0].E);
                    zs0Var.Y0();
                    zs0Var.u1();
                }
                zs0Var.f41085i1 = false;
                zs0Var.A1 = false;
                zs0Var.f41132z1 = false;
                zs0Var.setHeaderEnabled(true);
                zs0Var.K0.setEnabled(true);
                return;
        }
    }
}
