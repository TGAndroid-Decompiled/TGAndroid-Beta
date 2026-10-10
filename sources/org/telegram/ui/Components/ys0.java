package org.telegram.ui.Components;

import android.content.Context;
import android.widget.ImageView;
public final class ys0 extends vu0 {
    public final cw0 M;

    public ys0(cw0 cw0Var, Context context) {
        super(context);
        this.M = cw0Var;
    }

    @Override
    public final void setTranslationX(float f7) {
        vu0 vu0Var;
        int i10;
        super.setTranslationX(f7);
        cw0 cw0Var = this.M;
        vu0[] vu0VarArr = cw0Var.f25450k0;
        if (cw0Var.f25443g1 && (vu0Var = vu0VarArr[0]) == this) {
            float abs = Math.abs(vu0Var.getTranslationX()) / vu0VarArr[0].getMeasuredWidth();
            cw0Var.Z0(abs, vu0VarArr[1].F);
            if (cw0Var.D()) {
                int i11 = cw0Var.f25479x0;
                if (i11 == 2) {
                    cw0Var.f25457o0 = 1.0f - abs;
                } else if (i11 == 1) {
                    cw0Var.f25457o0 = abs;
                }
                cw0Var.s1(abs);
                float a02 = cw0Var.a0(abs);
                cw0Var.f25459p0 = a02;
                ImageView imageView = cw0Var.f25464r0;
                if (a02 != 0.0f && cw0Var.D() && !cw0Var.q0()) {
                    i10 = 0;
                } else {
                    i10 = 4;
                }
                imageView.setVisibility(i10);
            } else {
                cw0Var.f25457o0 = 0.0f;
            }
            cw0Var.q1(false);
        }
        cw0Var.I();
        cw0Var.K();
        cw0Var.o0();
    }
}
