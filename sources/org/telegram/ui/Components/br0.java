package org.telegram.ui.Components;

import android.content.Context;

public final class br0 extends zs0 {
    public final hu0 I;

    public br0(hu0 hu0Var, Context context) {
        super(context);
        this.I = hu0Var;
    }

    @Override
    public final void setTranslationX(float f10) {
        zs0 zs0Var;
        super.setTranslationX(f10);
        hu0 hu0Var = this.I;
        zs0[] zs0VarArr = hu0Var.f29122g0;
        if (hu0Var.f29113c1 && (zs0Var = zs0VarArr[0]) == this) {
            float fAbs = Math.abs(zs0Var.getTranslationX()) / zs0VarArr[0].getMeasuredWidth();
            hu0Var.Z0(fAbs, zs0VarArr[1].B);
            if (hu0Var.D()) {
                int i10 = hu0Var.f29149t0;
                if (i10 == 2) {
                    hu0Var.f29130k0 = 1.0f - fAbs;
                } else if (i10 == 1) {
                    hu0Var.f29130k0 = fAbs;
                }
                hu0Var.s1(fAbs);
                float fA0 = hu0Var.a0(fAbs);
                hu0Var.f29132l0 = fA0;
                hu0Var.f29135n0.setVisibility((fA0 == 0.0f || !hu0Var.D() || hu0Var.q0()) ? 4 : 0);
            } else {
                hu0Var.f29130k0 = 0.0f;
            }
            hu0Var.q1(false);
        }
        hu0Var.I();
        hu0Var.K();
        hu0Var.o0();
    }
}
