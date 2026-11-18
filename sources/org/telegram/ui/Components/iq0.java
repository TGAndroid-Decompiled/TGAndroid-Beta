package org.telegram.ui.Components;

import android.content.Context;
import android.widget.ImageView;
public final class iq0 extends bs0 {
    public final gt0 Q;

    public iq0(gt0 gt0Var, Context context) {
        super(context);
        this.Q = gt0Var;
    }

    @Override
    public final void setTranslationX(float f10) {
        bs0 bs0Var;
        int i7;
        float translationX = getTranslationX();
        super.setTranslationX(f10);
        gt0 gt0Var = this.Q;
        bs0[] bs0VarArr = gt0Var.f35609n0;
        if (bs0VarArr[0] == this) {
            float f11 = translationX - f10;
            ri.q qVar = gt0Var.f35594h2;
            if (qVar != null) {
                float f12 = gt0Var.f35597i2 + f11;
                gt0Var.f35597i2 = f12;
                int i10 = (int) f12;
                if (i10 != 0) {
                    gt0Var.f35597i2 = f12 - i10;
                    qVar.h(i10, 0);
                }
            }
        }
        if (gt0Var.f35599j1 && (bs0Var = bs0VarArr[0]) == this) {
            float abs = Math.abs(bs0Var.getTranslationX()) / bs0VarArr[0].getMeasuredWidth();
            gt0Var.l1(abs, bs0VarArr[1].F);
            if (gt0Var.I()) {
                int i11 = gt0Var.A0;
                if (i11 == 2) {
                    gt0Var.f35621r0 = 1.0f - abs;
                } else if (i11 == 1) {
                    gt0Var.f35621r0 = abs;
                }
                gt0Var.M1(abs);
                float k02 = gt0Var.k0(abs);
                gt0Var.f35625s0 = k02;
                ImageView imageView = gt0Var.f35630u0;
                if (k02 != 0.0f && gt0Var.I() && !gt0Var.A0()) {
                    i7 = 0;
                } else {
                    i7 = 4;
                }
                imageView.setVisibility(i7);
            } else {
                gt0Var.f35621r0 = 0.0f;
            }
            gt0Var.I1(false);
        }
        gt0Var.S();
        gt0Var.U();
    }
}
