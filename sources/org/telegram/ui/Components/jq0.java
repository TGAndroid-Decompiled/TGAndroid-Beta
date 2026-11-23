package org.telegram.ui.Components;

import android.content.Context;
import android.widget.ImageView;
public final class jq0 extends ds0 {
    public final it0 Q;

    public jq0(it0 it0Var, Context context) {
        super(context);
        this.Q = it0Var;
    }

    @Override
    public final void setTranslationX(float f10) {
        ds0 ds0Var;
        int i7;
        float translationX = getTranslationX();
        super.setTranslationX(f10);
        it0 it0Var = this.Q;
        ds0[] ds0VarArr = it0Var.f36133n0;
        if (ds0VarArr[0] == this) {
            float f11 = translationX - f10;
            ri.q qVar = it0Var.f36118h2;
            if (qVar != null) {
                float f12 = it0Var.f36121i2 + f11;
                it0Var.f36121i2 = f12;
                int i10 = (int) f12;
                if (i10 != 0) {
                    it0Var.f36121i2 = f12 - i10;
                    qVar.h(i10, 0);
                }
            }
        }
        if (it0Var.f36123j1 && (ds0Var = ds0VarArr[0]) == this) {
            float abs = Math.abs(ds0Var.getTranslationX()) / ds0VarArr[0].getMeasuredWidth();
            it0Var.l1(abs, ds0VarArr[1].F);
            if (it0Var.I()) {
                int i11 = it0Var.A0;
                if (i11 == 2) {
                    it0Var.f36145r0 = 1.0f - abs;
                } else if (i11 == 1) {
                    it0Var.f36145r0 = abs;
                }
                it0Var.M1(abs);
                float k02 = it0Var.k0(abs);
                it0Var.f36149s0 = k02;
                ImageView imageView = it0Var.f36154u0;
                if (k02 != 0.0f && it0Var.I() && !it0Var.A0()) {
                    i7 = 0;
                } else {
                    i7 = 4;
                }
                imageView.setVisibility(i7);
            } else {
                it0Var.f36145r0 = 0.0f;
            }
            it0Var.I1(false);
        }
        it0Var.S();
        it0Var.U();
    }
}
