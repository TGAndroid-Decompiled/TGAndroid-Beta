package org.telegram.ui.Components;

import android.content.Context;
import android.widget.ImageView;
public final class dt0 extends av0 {
    public final hw0 M;

    public dt0(hw0 hw0Var, Context context) {
        super(context);
        this.M = hw0Var;
    }

    @Override
    public final void setTranslationX(float f7) {
        av0 av0Var;
        int i10;
        super.setTranslationX(f7);
        hw0 hw0Var = this.M;
        av0[] av0VarArr = hw0Var.f26948k0;
        if (hw0Var.f26941g1 && (av0Var = av0VarArr[0]) == this) {
            float abs = Math.abs(av0Var.getTranslationX()) / av0VarArr[0].getMeasuredWidth();
            hw0Var.Z0(abs, av0VarArr[1].F);
            if (hw0Var.D()) {
                int i11 = hw0Var.f26977x0;
                if (i11 == 2) {
                    hw0Var.f26955o0 = 1.0f - abs;
                } else if (i11 == 1) {
                    hw0Var.f26955o0 = abs;
                }
                hw0Var.s1(abs);
                float a02 = hw0Var.a0(abs);
                hw0Var.f26957p0 = a02;
                ImageView imageView = hw0Var.f26962r0;
                if (a02 != 0.0f && hw0Var.D() && !hw0Var.q0()) {
                    i10 = 0;
                } else {
                    i10 = 4;
                }
                imageView.setVisibility(i10);
            } else {
                hw0Var.f26955o0 = 0.0f;
            }
            hw0Var.q1(false);
        }
        hw0Var.I();
        hw0Var.K();
        hw0Var.o0();
    }
}
