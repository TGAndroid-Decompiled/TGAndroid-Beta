package org.telegram.ui.Components;

import android.content.Context;
import android.widget.ImageView;
public final class at0 extends tu0 {
    public final aw0 P;

    public at0(aw0 aw0Var, Context context) {
        super(context);
        this.P = aw0Var;
    }

    @Override
    public final void setTranslationX(float f7) {
        tu0 tu0Var;
        int i10;
        float translationX = getTranslationX();
        super.setTranslationX(f7);
        aw0 aw0Var = this.P;
        tu0[] tu0VarArr = aw0Var.m0;
        if (tu0VarArr[0] == this) {
            float f10 = translationX - f7;
            oi.q qVar = aw0Var.f26657g2;
            if (qVar != null) {
                float f11 = aw0Var.f26660h2 + f10;
                aw0Var.f26660h2 = f11;
                int i11 = (int) f11;
                if (i11 != 0) {
                    aw0Var.f26660h2 = f11 - i11;
                    qVar.h(i11, 0);
                }
            }
        }
        if (aw0Var.f26662i1 && (tu0Var = tu0VarArr[0]) == this) {
            float abs = Math.abs(tu0Var.getTranslationX()) / tu0VarArr[0].getMeasuredWidth();
            aw0Var.f1(abs, tu0VarArr[1].E);
            if (aw0Var.G()) {
                int i12 = aw0Var.f26706z0;
                if (i12 == 2) {
                    aw0Var.f26683q0 = 1.0f - abs;
                } else if (i12 == 1) {
                    aw0Var.f26683q0 = abs;
                }
                aw0Var.G1(abs);
                float h02 = aw0Var.h0(abs);
                aw0Var.f26686r0 = h02;
                ImageView imageView = aw0Var.f26691t0;
                if (h02 != 0.0f && aw0Var.G() && !aw0Var.x0()) {
                    i10 = 0;
                } else {
                    i10 = 4;
                }
                imageView.setVisibility(i10);
            } else {
                aw0Var.f26683q0 = 0.0f;
            }
            aw0Var.C1(false);
        }
        aw0Var.P();
        aw0Var.R();
    }
}
