package org.telegram.ui.Components;

import android.content.Context;
import android.widget.ImageView;
public final class fs0 extends cu0 {
    public final jv0 M;

    public fs0(jv0 jv0Var, Context context) {
        super(context);
        this.M = jv0Var;
    }

    @Override
    public final void setTranslationX(float f7) {
        cu0 cu0Var;
        int i10;
        super.setTranslationX(f7);
        jv0 jv0Var = this.M;
        cu0[] cu0VarArr = jv0Var.f25504k0;
        if (jv0Var.f25497g1 && (cu0Var = cu0VarArr[0]) == this) {
            float abs = Math.abs(cu0Var.getTranslationX()) / cu0VarArr[0].getMeasuredWidth();
            jv0Var.Z0(abs, cu0VarArr[1].F);
            if (jv0Var.D()) {
                int i11 = jv0Var.f25533x0;
                if (i11 == 2) {
                    jv0Var.f25511o0 = 1.0f - abs;
                } else if (i11 == 1) {
                    jv0Var.f25511o0 = abs;
                }
                jv0Var.s1(abs);
                float a02 = jv0Var.a0(abs);
                jv0Var.f25513p0 = a02;
                ImageView imageView = jv0Var.f25518r0;
                if (a02 != 0.0f && jv0Var.D() && !jv0Var.q0()) {
                    i10 = 0;
                } else {
                    i10 = 4;
                }
                imageView.setVisibility(i10);
            } else {
                jv0Var.f25511o0 = 0.0f;
            }
            jv0Var.q1(false);
        }
        jv0Var.I();
        jv0Var.K();
        jv0Var.o0();
    }
}
