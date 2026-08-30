package org.telegram.ui.Components;

import android.content.Context;
import android.widget.ImageView;
public final class tr0 extends qt0 {
    public final yu0 J;

    public tr0(yu0 yu0Var, Context context) {
        super(context);
        this.J = yu0Var;
    }

    @Override
    public final void setTranslationX(float f10) {
        qt0 qt0Var;
        int i10;
        super.setTranslationX(f10);
        yu0 yu0Var = this.J;
        qt0[] qt0VarArr = yu0Var.f31120h0;
        if (yu0Var.f31112d1 && (qt0Var = qt0VarArr[0]) == this) {
            float abs = Math.abs(qt0Var.getTranslationX()) / qt0VarArr[0].getMeasuredWidth();
            yu0Var.Z0(abs, qt0VarArr[1].C);
            if (yu0Var.D()) {
                int i11 = yu0Var.f31147u0;
                if (i11 == 2) {
                    yu0Var.f31128l0 = 1.0f - abs;
                } else if (i11 == 1) {
                    yu0Var.f31128l0 = abs;
                }
                yu0Var.s1(abs);
                float a02 = yu0Var.a0(abs);
                yu0Var.m0 = a02;
                ImageView imageView = yu0Var.f31133o0;
                if (a02 != 0.0f && yu0Var.D() && !yu0Var.q0()) {
                    i10 = 0;
                } else {
                    i10 = 4;
                }
                imageView.setVisibility(i10);
            } else {
                yu0Var.f31128l0 = 0.0f;
            }
            yu0Var.q1(false);
        }
        yu0Var.I();
        yu0Var.K();
        yu0Var.o0();
    }
}
