package org.telegram.ui.Components;

import android.content.Context;
import android.widget.ImageView;
public final class zs0 extends wu0 {
    public final dw0 M;

    public zs0(dw0 dw0Var, Context context) {
        super(context);
        this.M = dw0Var;
    }

    @Override
    public final void setTranslationX(float f7) {
        wu0 wu0Var;
        int i10;
        super.setTranslationX(f7);
        dw0 dw0Var = this.M;
        wu0[] wu0VarArr = dw0Var.f25711k0;
        if (dw0Var.f25704g1 && (wu0Var = wu0VarArr[0]) == this) {
            float abs = Math.abs(wu0Var.getTranslationX()) / wu0VarArr[0].getMeasuredWidth();
            dw0Var.Z0(abs, wu0VarArr[1].F);
            if (dw0Var.D()) {
                int i11 = dw0Var.f25740x0;
                if (i11 == 2) {
                    dw0Var.f25718o0 = 1.0f - abs;
                } else if (i11 == 1) {
                    dw0Var.f25718o0 = abs;
                }
                dw0Var.s1(abs);
                float a02 = dw0Var.a0(abs);
                dw0Var.f25720p0 = a02;
                ImageView imageView = dw0Var.f25725r0;
                if (a02 != 0.0f && dw0Var.D() && !dw0Var.q0()) {
                    i10 = 0;
                } else {
                    i10 = 4;
                }
                imageView.setVisibility(i10);
            } else {
                dw0Var.f25718o0 = 0.0f;
            }
            dw0Var.q1(false);
        }
        dw0Var.I();
        dw0Var.K();
        dw0Var.o0();
    }
}
