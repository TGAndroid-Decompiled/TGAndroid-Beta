package org.telegram.ui.Components;

import android.content.Context;
import android.widget.ImageView;
public final class zp0 extends rr0 {
    public final ws0 Q;

    public zp0(ws0 ws0Var, Context context) {
        super(context);
        this.Q = ws0Var;
    }

    @Override
    public final void setTranslationX(float f10) {
        rr0 rr0Var;
        int i3;
        float translationX = getTranslationX();
        super.setTranslationX(f10);
        ws0 ws0Var = this.Q;
        rr0[] rr0VarArr = ws0Var.f40108n0;
        if (rr0VarArr[0] == this) {
            float f11 = translationX - f10;
            pi.q qVar = ws0Var.f40094h2;
            if (qVar != null) {
                float f12 = ws0Var.f40097i2 + f11;
                ws0Var.f40097i2 = f12;
                int i10 = (int) f12;
                if (i10 != 0) {
                    ws0Var.f40097i2 = f12 - i10;
                    qVar.h(i10, 0);
                }
            }
        }
        if (ws0Var.f40099j1 && (rr0Var = rr0VarArr[0]) == this) {
            float abs = Math.abs(rr0Var.getTranslationX()) / rr0VarArr[0].getMeasuredWidth();
            ws0Var.j1(abs, rr0VarArr[1].F);
            if (ws0Var.I()) {
                int i11 = ws0Var.A0;
                if (i11 == 2) {
                    ws0Var.f40121r0 = 1.0f - abs;
                } else if (i11 == 1) {
                    ws0Var.f40121r0 = abs;
                }
                ws0Var.K1(abs);
                float k02 = ws0Var.k0(abs);
                ws0Var.f40125s0 = k02;
                ImageView imageView = ws0Var.f40130u0;
                if (k02 != 0.0f && ws0Var.I() && !ws0Var.A0()) {
                    i3 = 0;
                } else {
                    i3 = 4;
                }
                imageView.setVisibility(i3);
            } else {
                ws0Var.f40121r0 = 0.0f;
            }
            ws0Var.G1(false);
        }
        ws0Var.S();
        ws0Var.U();
    }
}
