package org.telegram.ui.Components;

import android.content.Context;
import android.widget.ImageView;
public final class zp0 extends sr0 {
    public final xs0 P;

    public zp0(xs0 xs0Var, Context context) {
        super(context);
        this.P = xs0Var;
    }

    @Override
    public final void setTranslationX(float f10) {
        sr0 sr0Var;
        int i7;
        float translationX = getTranslationX();
        super.setTranslationX(f10);
        xs0 xs0Var = this.P;
        sr0[] sr0VarArr = xs0Var.m0;
        if (sr0VarArr[0] == this) {
            float f11 = translationX - f10;
            oi.q qVar = xs0Var.f40377g2;
            if (qVar != null) {
                float f12 = xs0Var.f40380h2 + f11;
                xs0Var.f40380h2 = f12;
                int i10 = (int) f12;
                if (i10 != 0) {
                    xs0Var.f40380h2 = f12 - i10;
                    qVar.h(i10, 0);
                }
            }
        }
        if (xs0Var.f40382i1 && (sr0Var = sr0VarArr[0]) == this) {
            float abs = Math.abs(sr0Var.getTranslationX()) / sr0VarArr[0].getMeasuredWidth();
            xs0Var.j1(abs, sr0VarArr[1].E);
            if (xs0Var.I()) {
                int i11 = xs0Var.f40428z0;
                if (i11 == 2) {
                    xs0Var.f40403q0 = 1.0f - abs;
                } else if (i11 == 1) {
                    xs0Var.f40403q0 = abs;
                }
                xs0Var.K1(abs);
                float k02 = xs0Var.k0(abs);
                xs0Var.f40407r0 = k02;
                ImageView imageView = xs0Var.f40413t0;
                if (k02 != 0.0f && xs0Var.I() && !xs0Var.A0()) {
                    i7 = 0;
                } else {
                    i7 = 4;
                }
                imageView.setVisibility(i7);
            } else {
                xs0Var.f40403q0 = 0.0f;
            }
            xs0Var.G1(false);
        }
        xs0Var.S();
        xs0Var.U();
    }
}
