package org.telegram.ui.Components;

import android.content.Context;
import android.widget.ImageView;
public final class ar0 extends xs0 {
    public final eu0 I;

    public ar0(eu0 eu0Var, Context context) {
        super(context);
        this.I = eu0Var;
    }

    @Override
    public final void setTranslationX(float f10) {
        xs0 xs0Var;
        int i9;
        super.setTranslationX(f10);
        eu0 eu0Var = this.I;
        xs0[] xs0VarArr = eu0Var.f28137g0;
        if (eu0Var.f28128c1 && (xs0Var = xs0VarArr[0]) == this) {
            float abs = Math.abs(xs0Var.getTranslationX()) / xs0VarArr[0].getMeasuredWidth();
            eu0Var.Z0(abs, xs0VarArr[1].B);
            if (eu0Var.D()) {
                int i10 = eu0Var.f28164t0;
                if (i10 == 2) {
                    eu0Var.f28145k0 = 1.0f - abs;
                } else if (i10 == 1) {
                    eu0Var.f28145k0 = abs;
                }
                eu0Var.s1(abs);
                float a02 = eu0Var.a0(abs);
                eu0Var.f28147l0 = a02;
                ImageView imageView = eu0Var.f28150n0;
                if (a02 != 0.0f && eu0Var.D() && !eu0Var.q0()) {
                    i9 = 0;
                } else {
                    i9 = 4;
                }
                imageView.setVisibility(i9);
            } else {
                eu0Var.f28145k0 = 0.0f;
            }
            eu0Var.q1(false);
        }
        eu0Var.I();
        eu0Var.K();
        eu0Var.o0();
    }
}
