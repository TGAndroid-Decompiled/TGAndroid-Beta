package org.telegram.ui.Components;

import android.content.Context;
import android.widget.ImageView;
public final class ur0 extends rt0 {
    public final zu0 J;

    public ur0(zu0 zu0Var, Context context) {
        super(context);
        this.J = zu0Var;
    }

    @Override
    public final void setTranslationX(float f10) {
        rt0 rt0Var;
        int i10;
        super.setTranslationX(f10);
        zu0 zu0Var = this.J;
        rt0[] rt0VarArr = zu0Var.f33980h0;
        if (zu0Var.f33971d1 && (rt0Var = rt0VarArr[0]) == this) {
            float abs = Math.abs(rt0Var.getTranslationX()) / rt0VarArr[0].getMeasuredWidth();
            zu0Var.Z0(abs, rt0VarArr[1].C);
            if (zu0Var.D()) {
                int i11 = zu0Var.f34007u0;
                if (i11 == 2) {
                    zu0Var.f33988l0 = 1.0f - abs;
                } else if (i11 == 1) {
                    zu0Var.f33988l0 = abs;
                }
                zu0Var.s1(abs);
                float a02 = zu0Var.a0(abs);
                zu0Var.m0 = a02;
                ImageView imageView = zu0Var.f33993o0;
                if (a02 != 0.0f && zu0Var.D() && !zu0Var.q0()) {
                    i10 = 0;
                } else {
                    i10 = 4;
                }
                imageView.setVisibility(i10);
            } else {
                zu0Var.f33988l0 = 0.0f;
            }
            zu0Var.q1(false);
        }
        zu0Var.I();
        zu0Var.K();
        zu0Var.o0();
    }
}
