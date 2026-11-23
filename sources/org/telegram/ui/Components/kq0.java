package org.telegram.ui.Components;

import android.content.Context;
import android.widget.ImageView;
public final class kq0 extends ds0 {
    public final jt0 Q;

    public kq0(jt0 jt0Var, Context context) {
        super(context);
        this.Q = jt0Var;
    }

    @Override
    public final void setTranslationX(float f10) {
        ds0 ds0Var;
        int i7;
        float translationX = getTranslationX();
        super.setTranslationX(f10);
        jt0 jt0Var = this.Q;
        ds0[] ds0VarArr = jt0Var.f36651n0;
        if (ds0VarArr[0] == this) {
            float f11 = translationX - f10;
            ri.q qVar = jt0Var.f36636h2;
            if (qVar != null) {
                float f12 = jt0Var.f36639i2 + f11;
                jt0Var.f36639i2 = f12;
                int i10 = (int) f12;
                if (i10 != 0) {
                    jt0Var.f36639i2 = f12 - i10;
                    qVar.h(i10, 0);
                }
            }
        }
        if (jt0Var.f36641j1 && (ds0Var = ds0VarArr[0]) == this) {
            float abs = Math.abs(ds0Var.getTranslationX()) / ds0VarArr[0].getMeasuredWidth();
            jt0Var.l1(abs, ds0VarArr[1].F);
            if (jt0Var.I()) {
                int i11 = jt0Var.A0;
                if (i11 == 2) {
                    jt0Var.f36663r0 = 1.0f - abs;
                } else if (i11 == 1) {
                    jt0Var.f36663r0 = abs;
                }
                jt0Var.M1(abs);
                float k02 = jt0Var.k0(abs);
                jt0Var.f36667s0 = k02;
                ImageView imageView = jt0Var.f36672u0;
                if (k02 != 0.0f && jt0Var.I() && !jt0Var.A0()) {
                    i7 = 0;
                } else {
                    i7 = 4;
                }
                imageView.setVisibility(i7);
            } else {
                jt0Var.f36663r0 = 0.0f;
            }
            jt0Var.I1(false);
        }
        jt0Var.S();
        jt0Var.U();
    }
}
