package org.telegram.ui.Components;

import android.content.Context;
import android.widget.ImageView;
public final class aq0 extends ur0 {
    public final zs0 P;

    public aq0(zs0 zs0Var, Context context) {
        super(context);
        this.P = zs0Var;
    }

    @Override
    public final void setTranslationX(float f10) {
        ur0 ur0Var;
        int i7;
        float translationX = getTranslationX();
        super.setTranslationX(f10);
        zs0 zs0Var = this.P;
        ur0[] ur0VarArr = zs0Var.m0;
        if (ur0VarArr[0] == this) {
            float f11 = translationX - f10;
            oi.q qVar = zs0Var.f41080g2;
            if (qVar != null) {
                float f12 = zs0Var.f41083h2 + f11;
                zs0Var.f41083h2 = f12;
                int i10 = (int) f12;
                if (i10 != 0) {
                    zs0Var.f41083h2 = f12 - i10;
                    qVar.h(i10, 0);
                }
            }
        }
        if (zs0Var.f41085i1 && (ur0Var = ur0VarArr[0]) == this) {
            float abs = Math.abs(ur0Var.getTranslationX()) / ur0VarArr[0].getMeasuredWidth();
            zs0Var.l1(abs, ur0VarArr[1].E);
            if (zs0Var.I()) {
                int i11 = zs0Var.f41131z0;
                if (i11 == 2) {
                    zs0Var.f41106q0 = 1.0f - abs;
                } else if (i11 == 1) {
                    zs0Var.f41106q0 = abs;
                }
                zs0Var.M1(abs);
                float k02 = zs0Var.k0(abs);
                zs0Var.f41110r0 = k02;
                ImageView imageView = zs0Var.f41116t0;
                if (k02 != 0.0f && zs0Var.I() && !zs0Var.A0()) {
                    i7 = 0;
                } else {
                    i7 = 4;
                }
                imageView.setVisibility(i7);
            } else {
                zs0Var.f41106q0 = 0.0f;
            }
            zs0Var.I1(false);
        }
        zs0Var.S();
        zs0Var.U();
    }
}
