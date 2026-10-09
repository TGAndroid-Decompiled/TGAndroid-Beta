package org.telegram.ui.Components;

import android.content.Context;
import android.widget.ImageView;
public final class xs0 extends uu0 {
    public final bw0 M;

    public xs0(bw0 bw0Var, Context context) {
        super(context);
        this.M = bw0Var;
    }

    @Override
    public final void setTranslationX(float f7) {
        uu0 uu0Var;
        int i10;
        super.setTranslationX(f7);
        bw0 bw0Var = this.M;
        uu0[] uu0VarArr = bw0Var.f25142k0;
        if (bw0Var.f25135g1 && (uu0Var = uu0VarArr[0]) == this) {
            float abs = Math.abs(uu0Var.getTranslationX()) / uu0VarArr[0].getMeasuredWidth();
            bw0Var.Z0(abs, uu0VarArr[1].F);
            if (bw0Var.D()) {
                int i11 = bw0Var.f25171x0;
                if (i11 == 2) {
                    bw0Var.f25149o0 = 1.0f - abs;
                } else if (i11 == 1) {
                    bw0Var.f25149o0 = abs;
                }
                bw0Var.s1(abs);
                float a02 = bw0Var.a0(abs);
                bw0Var.f25151p0 = a02;
                ImageView imageView = bw0Var.f25156r0;
                if (a02 != 0.0f && bw0Var.D() && !bw0Var.q0()) {
                    i10 = 0;
                } else {
                    i10 = 4;
                }
                imageView.setVisibility(i10);
            } else {
                bw0Var.f25149o0 = 0.0f;
            }
            bw0Var.q1(false);
        }
        bw0Var.I();
        bw0Var.K();
        bw0Var.o0();
    }
}
