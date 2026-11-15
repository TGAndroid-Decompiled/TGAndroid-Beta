package org.telegram.ui.Components;

import android.content.Context;
import android.widget.ImageView;
public final class aq0 extends tr0 {
    public final ys0 Q;

    public aq0(ys0 ys0Var, Context context) {
        super(context);
        this.Q = ys0Var;
    }

    @Override
    public final void setTranslationX(float f10) {
        tr0 tr0Var;
        int i7;
        float translationX = getTranslationX();
        super.setTranslationX(f10);
        ys0 ys0Var = this.Q;
        tr0[] tr0VarArr = ys0Var.f42117n0;
        if (tr0VarArr[0] == this) {
            float f11 = translationX - f10;
            ri.q qVar = ys0Var.f42102h2;
            if (qVar != null) {
                float f12 = ys0Var.f42105i2 + f11;
                ys0Var.f42105i2 = f12;
                int i10 = (int) f12;
                if (i10 != 0) {
                    ys0Var.f42105i2 = f12 - i10;
                    qVar.h(i10, 0);
                }
            }
        }
        if (ys0Var.f42107j1 && (tr0Var = tr0VarArr[0]) == this) {
            float abs = Math.abs(tr0Var.getTranslationX()) / tr0VarArr[0].getMeasuredWidth();
            ys0Var.l1(abs, tr0VarArr[1].F);
            if (ys0Var.I()) {
                int i11 = ys0Var.A0;
                if (i11 == 2) {
                    ys0Var.f42129r0 = 1.0f - abs;
                } else if (i11 == 1) {
                    ys0Var.f42129r0 = abs;
                }
                ys0Var.M1(abs);
                float k02 = ys0Var.k0(abs);
                ys0Var.f42133s0 = k02;
                ImageView imageView = ys0Var.f42138u0;
                if (k02 != 0.0f && ys0Var.I() && !ys0Var.A0()) {
                    i7 = 0;
                } else {
                    i7 = 4;
                }
                imageView.setVisibility(i7);
            } else {
                ys0Var.f42129r0 = 0.0f;
            }
            ys0Var.I1(false);
        }
        ys0Var.S();
        ys0Var.U();
    }
}
