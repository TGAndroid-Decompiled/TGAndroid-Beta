package org.telegram.ui.Components;

import android.content.Context;
import android.widget.ImageView;
public final class ls0 extends iu0 {
    public final pv0 M;

    public ls0(pv0 pv0Var, Context context) {
        super(context);
        this.M = pv0Var;
    }

    @Override
    public final void setTranslationX(float f7) {
        iu0 iu0Var;
        int i10;
        super.setTranslationX(f7);
        pv0 pv0Var = this.M;
        iu0[] iu0VarArr = pv0Var.f29776k0;
        if (pv0Var.f29769g1 && (iu0Var = iu0VarArr[0]) == this) {
            float abs = Math.abs(iu0Var.getTranslationX()) / iu0VarArr[0].getMeasuredWidth();
            pv0Var.Z0(abs, iu0VarArr[1].F);
            if (pv0Var.D()) {
                int i11 = pv0Var.f29805x0;
                if (i11 == 2) {
                    pv0Var.f29783o0 = 1.0f - abs;
                } else if (i11 == 1) {
                    pv0Var.f29783o0 = abs;
                }
                pv0Var.s1(abs);
                float a02 = pv0Var.a0(abs);
                pv0Var.f29785p0 = a02;
                ImageView imageView = pv0Var.f29790r0;
                if (a02 != 0.0f && pv0Var.D() && !pv0Var.q0()) {
                    i10 = 0;
                } else {
                    i10 = 4;
                }
                imageView.setVisibility(i10);
            } else {
                pv0Var.f29783o0 = 0.0f;
            }
            pv0Var.q1(false);
        }
        pv0Var.I();
        pv0Var.K();
        pv0Var.o0();
    }
}
