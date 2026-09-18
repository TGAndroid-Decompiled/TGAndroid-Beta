package org.telegram.ui.Components;

import android.content.Context;
import android.widget.ImageView;
public final class vr0 extends st0 {
    public final zu0 M;

    public vr0(zu0 zu0Var, Context context) {
        super(context);
        this.M = zu0Var;
    }

    @Override
    public final void setTranslationX(float f7) {
        st0 st0Var;
        int i10;
        super.setTranslationX(f7);
        zu0 zu0Var = this.M;
        st0[] st0VarArr = zu0Var.f30635k0;
        if (zu0Var.f30628g1 && (st0Var = st0VarArr[0]) == this) {
            float abs = Math.abs(st0Var.getTranslationX()) / st0VarArr[0].getMeasuredWidth();
            zu0Var.Z0(abs, st0VarArr[1].F);
            if (zu0Var.D()) {
                int i11 = zu0Var.f30664x0;
                if (i11 == 2) {
                    zu0Var.f30642o0 = 1.0f - abs;
                } else if (i11 == 1) {
                    zu0Var.f30642o0 = abs;
                }
                zu0Var.s1(abs);
                float a02 = zu0Var.a0(abs);
                zu0Var.f30644p0 = a02;
                ImageView imageView = zu0Var.f30649r0;
                if (a02 != 0.0f && zu0Var.D() && !zu0Var.q0()) {
                    i10 = 0;
                } else {
                    i10 = 4;
                }
                imageView.setVisibility(i10);
            } else {
                zu0Var.f30642o0 = 0.0f;
            }
            zu0Var.q1(false);
        }
        zu0Var.I();
        zu0Var.K();
        zu0Var.o0();
    }
}
