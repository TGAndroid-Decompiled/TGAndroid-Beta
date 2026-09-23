package org.telegram.ui.Components;

import android.content.Context;
import android.widget.ImageView;
public final class ur0 extends rt0 {
    public final yu0 M;

    public ur0(yu0 yu0Var, Context context) {
        super(context);
        this.M = yu0Var;
    }

    @Override
    public final void setTranslationX(float f7) {
        rt0 rt0Var;
        int i10;
        super.setTranslationX(f7);
        yu0 yu0Var = this.M;
        rt0[] rt0VarArr = yu0Var.f30426k0;
        if (yu0Var.f30419g1 && (rt0Var = rt0VarArr[0]) == this) {
            float abs = Math.abs(rt0Var.getTranslationX()) / rt0VarArr[0].getMeasuredWidth();
            yu0Var.Z0(abs, rt0VarArr[1].F);
            if (yu0Var.D()) {
                int i11 = yu0Var.f30455x0;
                if (i11 == 2) {
                    yu0Var.f30433o0 = 1.0f - abs;
                } else if (i11 == 1) {
                    yu0Var.f30433o0 = abs;
                }
                yu0Var.s1(abs);
                float a02 = yu0Var.a0(abs);
                yu0Var.f30435p0 = a02;
                ImageView imageView = yu0Var.f30440r0;
                if (a02 != 0.0f && yu0Var.D() && !yu0Var.q0()) {
                    i10 = 0;
                } else {
                    i10 = 4;
                }
                imageView.setVisibility(i10);
            } else {
                yu0Var.f30433o0 = 0.0f;
            }
            yu0Var.q1(false);
        }
        yu0Var.I();
        yu0Var.K();
        yu0Var.o0();
    }
}
