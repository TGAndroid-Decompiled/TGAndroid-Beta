package org.telegram.ui.Components;

import android.content.Context;
import android.widget.ImageView;
public final class ar0 extends ss0 {
    public final zt0 P;

    public ar0(zt0 zt0Var, Context context) {
        super(context);
        this.P = zt0Var;
    }

    @Override
    public final void setTranslationX(float f7) {
        ss0 ss0Var;
        int i10;
        float translationX = getTranslationX();
        super.setTranslationX(f7);
        zt0 zt0Var = this.P;
        ss0[] ss0VarArr = zt0Var.m0;
        if (ss0VarArr[0] == this) {
            float f10 = translationX - f7;
            ei.r rVar = zt0Var.f33192g2;
            if (rVar != null) {
                float f11 = zt0Var.f33195h2 + f10;
                zt0Var.f33195h2 = f11;
                int i11 = (int) f11;
                if (i11 != 0) {
                    zt0Var.f33195h2 = f11 - i11;
                    rVar.h(i11, 0);
                }
            }
        }
        if (zt0Var.f33197i1 && (ss0Var = ss0VarArr[0]) == this) {
            float abs = Math.abs(ss0Var.getTranslationX()) / ss0VarArr[0].getMeasuredWidth();
            zt0Var.g1(abs, ss0VarArr[1].E);
            if (zt0Var.H()) {
                int i12 = zt0Var.f33244z0;
                if (i12 == 2) {
                    zt0Var.f33219q0 = 1.0f - abs;
                } else if (i12 == 1) {
                    zt0Var.f33219q0 = abs;
                }
                zt0Var.H1(abs);
                float i02 = zt0Var.i0(abs);
                zt0Var.f33223r0 = i02;
                ImageView imageView = zt0Var.f33229t0;
                if (i02 != 0.0f && zt0Var.H() && !zt0Var.y0()) {
                    i10 = 0;
                } else {
                    i10 = 4;
                }
                imageView.setVisibility(i10);
            } else {
                zt0Var.f33219q0 = 0.0f;
            }
            zt0Var.D1(false);
        }
        zt0Var.Q();
        zt0Var.S();
    }
}
