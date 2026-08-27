package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

public final class yr0 extends AnimatorListenerAdapter {

    public final int f34955a;

    public final hu0 f34956b;

    public yr0(hu0 hu0Var, int i10) {
        this.f34955a = i10;
        this.f34956b = hu0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f34955a) {
            case 0:
                this.f34956b.H0 = null;
                break;
            default:
                hu0 hu0Var = this.f34956b;
                org.telegram.ui.ActionBar.v0 v0Var = hu0Var.f29128j0;
                zs0[] zs0VarArr = hu0Var.f29122g0;
                hu0Var.f29110b1 = null;
                if (hu0Var.f29118e1) {
                    zs0VarArr[1].setVisibility(8);
                    if (v0Var == null || hu0Var.D()) {
                        hu0Var.f29130k0 = hu0Var.b0(0.0f);
                        hu0Var.s1(0.0f);
                    } else {
                        v0Var.setVisibility(hu0Var.v0() ? 8 : 4);
                        hu0Var.f29130k0 = 0.0f;
                    }
                    hu0Var.q1(false);
                    hu0Var.f29149t0 = 0;
                } else {
                    zs0 zs0Var = zs0VarArr[0];
                    zs0VarArr[0] = zs0VarArr[1];
                    zs0VarArr[1] = zs0Var;
                    zs0Var.setVisibility(8);
                    if (v0Var != null && hu0Var.f29149t0 == 2) {
                        v0Var.setVisibility(hu0Var.v0() ? 8 : 4);
                    }
                    hu0Var.f29149t0 = 0;
                    hu0Var.Z0(1.0f, zs0VarArr[0].B);
                    hu0Var.L0();
                    hu0Var.f1();
                }
                hu0Var.f29113c1 = false;
                hu0Var.f29152u1 = false;
                hu0Var.f29150t1 = false;
                hu0Var.N0(false);
                hu0Var.C.setEnabled(true);
                hu0Var.E0.setEnabled(true);
                break;
        }
    }
}
