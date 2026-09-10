package org.telegram.ui.Components;

import android.content.Context;
import android.widget.ImageView;
public final class ds0 extends au0 {
    public final iv0 M;

    public ds0(iv0 iv0Var, Context context) {
        super(context);
        this.M = iv0Var;
    }

    @Override
    public final void setTranslationX(float f7) {
        au0 au0Var;
        int i10;
        super.setTranslationX(f7);
        iv0 iv0Var = this.M;
        au0[] au0VarArr = iv0Var.f24107k0;
        if (iv0Var.f24100g1 && (au0Var = au0VarArr[0]) == this) {
            float abs = Math.abs(au0Var.getTranslationX()) / au0VarArr[0].getMeasuredWidth();
            iv0Var.Z0(abs, au0VarArr[1].F);
            if (iv0Var.D()) {
                int i11 = iv0Var.f24136x0;
                if (i11 == 2) {
                    iv0Var.f24114o0 = 1.0f - abs;
                } else if (i11 == 1) {
                    iv0Var.f24114o0 = abs;
                }
                iv0Var.s1(abs);
                float a02 = iv0Var.a0(abs);
                iv0Var.f24116p0 = a02;
                ImageView imageView = iv0Var.f24121r0;
                if (a02 != 0.0f && iv0Var.D() && !iv0Var.q0()) {
                    i10 = 0;
                } else {
                    i10 = 4;
                }
                imageView.setVisibility(i10);
            } else {
                iv0Var.f24114o0 = 0.0f;
            }
            iv0Var.q1(false);
        }
        iv0Var.I();
        iv0Var.K();
        iv0Var.o0();
    }
}
