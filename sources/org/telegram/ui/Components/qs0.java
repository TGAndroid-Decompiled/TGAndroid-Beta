package org.telegram.ui.Components;

import android.content.Context;
import android.widget.ImageView;
public final class qs0 extends nu0 {
    public final uv0 M;

    public qs0(uv0 uv0Var, Context context) {
        super(context);
        this.M = uv0Var;
    }

    @Override
    public final void setTranslationX(float f7) {
        nu0 nu0Var;
        int i10;
        super.setTranslationX(f7);
        uv0 uv0Var = this.M;
        nu0[] nu0VarArr = uv0Var.f31051k0;
        if (uv0Var.f31044g1 && (nu0Var = nu0VarArr[0]) == this) {
            float abs = Math.abs(nu0Var.getTranslationX()) / nu0VarArr[0].getMeasuredWidth();
            uv0Var.b1(abs, nu0VarArr[1].F);
            if (uv0Var.D()) {
                int i11 = uv0Var.f31080x0;
                if (i11 == 2) {
                    uv0Var.f31058o0 = 1.0f - abs;
                } else if (i11 == 1) {
                    uv0Var.f31058o0 = abs;
                }
                uv0Var.v1(abs);
                float a02 = uv0Var.a0(abs);
                uv0Var.f31060p0 = a02;
                ImageView imageView = uv0Var.f31065r0;
                if (a02 != 0.0f && uv0Var.D() && !uv0Var.r0()) {
                    i10 = 0;
                } else {
                    i10 = 4;
                }
                imageView.setVisibility(i10);
            } else {
                uv0Var.f31058o0 = 0.0f;
            }
            uv0Var.s1(false);
        }
        uv0Var.I();
        uv0Var.K();
        uv0Var.p0();
    }
}
