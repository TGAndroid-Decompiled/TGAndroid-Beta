package org.telegram.ui.Components;

import android.content.Context;
import android.widget.ImageView;
public final class ps0 extends mu0 {
    public final tv0 M;

    public ps0(tv0 tv0Var, Context context) {
        super(context);
        this.M = tv0Var;
    }

    @Override
    public final void setTranslationX(float f7) {
        mu0 mu0Var;
        int i10;
        super.setTranslationX(f7);
        tv0 tv0Var = this.M;
        mu0[] mu0VarArr = tv0Var.f30710k0;
        if (tv0Var.f30703g1 && (mu0Var = mu0VarArr[0]) == this) {
            float abs = Math.abs(mu0Var.getTranslationX()) / mu0VarArr[0].getMeasuredWidth();
            tv0Var.b1(abs, mu0VarArr[1].F);
            if (tv0Var.D()) {
                int i11 = tv0Var.f30739x0;
                if (i11 == 2) {
                    tv0Var.f30717o0 = 1.0f - abs;
                } else if (i11 == 1) {
                    tv0Var.f30717o0 = abs;
                }
                tv0Var.v1(abs);
                float a02 = tv0Var.a0(abs);
                tv0Var.f30719p0 = a02;
                ImageView imageView = tv0Var.f30724r0;
                if (a02 != 0.0f && tv0Var.D() && !tv0Var.r0()) {
                    i10 = 0;
                } else {
                    i10 = 4;
                }
                imageView.setVisibility(i10);
            } else {
                tv0Var.f30717o0 = 0.0f;
            }
            tv0Var.s1(false);
        }
        tv0Var.I();
        tv0Var.K();
        tv0Var.p0();
    }
}
