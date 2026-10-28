package org.telegram.ui.Components;

import android.content.Context;
import android.widget.ImageView;
public final class bt0 extends uu0 {
    public final bw0 P;

    public bt0(bw0 bw0Var, Context context) {
        super(context);
        this.P = bw0Var;
    }

    @Override
    public final void setTranslationX(float f7) {
        uu0 uu0Var;
        int i10;
        float translationX = getTranslationX();
        super.setTranslationX(f7);
        bw0 bw0Var = this.P;
        uu0[] uu0VarArr = bw0Var.m0;
        if (uu0VarArr[0] == this) {
            float f10 = translationX - f7;
            oi.q qVar = bw0Var.f26947g2;
            if (qVar != null) {
                float f11 = bw0Var.f26950h2 + f10;
                bw0Var.f26950h2 = f11;
                int i11 = (int) f11;
                if (i11 != 0) {
                    bw0Var.f26950h2 = f11 - i11;
                    qVar.h(i11, 0);
                }
            }
        }
        if (bw0Var.f26952i1 && (uu0Var = uu0VarArr[0]) == this) {
            float abs = Math.abs(uu0Var.getTranslationX()) / uu0VarArr[0].getMeasuredWidth();
            bw0Var.f1(abs, uu0VarArr[1].E);
            if (bw0Var.G()) {
                int i12 = bw0Var.f26996z0;
                if (i12 == 2) {
                    bw0Var.f26973q0 = 1.0f - abs;
                } else if (i12 == 1) {
                    bw0Var.f26973q0 = abs;
                }
                bw0Var.G1(abs);
                float h02 = bw0Var.h0(abs);
                bw0Var.f26976r0 = h02;
                ImageView imageView = bw0Var.f26981t0;
                if (h02 != 0.0f && bw0Var.G() && !bw0Var.x0()) {
                    i10 = 0;
                } else {
                    i10 = 4;
                }
                imageView.setVisibility(i10);
            } else {
                bw0Var.f26973q0 = 0.0f;
            }
            bw0Var.C1(false);
        }
        bw0Var.P();
        bw0Var.R();
    }
}
