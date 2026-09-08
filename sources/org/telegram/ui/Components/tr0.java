package org.telegram.ui.Components;

import android.content.Context;
import android.widget.ImageView;
public final class tr0 extends qt0 {
    public final xu0 M;

    public tr0(xu0 xu0Var, Context context) {
        super(context);
        this.M = xu0Var;
    }

    @Override
    public final void setTranslationX(float f7) {
        qt0 qt0Var;
        int i10;
        super.setTranslationX(f7);
        xu0 xu0Var = this.M;
        qt0[] qt0VarArr = xu0Var.f32729k0;
        if (xu0Var.f32722g1 && (qt0Var = qt0VarArr[0]) == this) {
            float abs = Math.abs(qt0Var.getTranslationX()) / qt0VarArr[0].getMeasuredWidth();
            xu0Var.Z0(abs, qt0VarArr[1].F);
            if (xu0Var.D()) {
                int i11 = xu0Var.f32758x0;
                if (i11 == 2) {
                    xu0Var.f32736o0 = 1.0f - abs;
                } else if (i11 == 1) {
                    xu0Var.f32736o0 = abs;
                }
                xu0Var.s1(abs);
                float a02 = xu0Var.a0(abs);
                xu0Var.f32738p0 = a02;
                ImageView imageView = xu0Var.f32743r0;
                if (a02 != 0.0f && xu0Var.D() && !xu0Var.q0()) {
                    i10 = 0;
                } else {
                    i10 = 4;
                }
                imageView.setVisibility(i10);
            } else {
                xu0Var.f32736o0 = 0.0f;
            }
            xu0Var.q1(false);
        }
        xu0Var.I();
        xu0Var.K();
        xu0Var.o0();
    }
}
