package org.telegram.ui.Components;

import android.content.Context;
import android.widget.ImageView;
public final class hs0 extends eu0 {
    public final lv0 M;

    public hs0(lv0 lv0Var, Context context) {
        super(context);
        this.M = lv0Var;
    }

    @Override
    public final void setTranslationX(float f7) {
        eu0 eu0Var;
        int i10;
        super.setTranslationX(f7);
        lv0 lv0Var = this.M;
        eu0[] eu0VarArr = lv0Var.f26210k0;
        if (lv0Var.f26203g1 && (eu0Var = eu0VarArr[0]) == this) {
            float abs = Math.abs(eu0Var.getTranslationX()) / eu0VarArr[0].getMeasuredWidth();
            lv0Var.Z0(abs, eu0VarArr[1].F);
            if (lv0Var.D()) {
                int i11 = lv0Var.f26239x0;
                if (i11 == 2) {
                    lv0Var.f26217o0 = 1.0f - abs;
                } else if (i11 == 1) {
                    lv0Var.f26217o0 = abs;
                }
                lv0Var.s1(abs);
                float a02 = lv0Var.a0(abs);
                lv0Var.f26219p0 = a02;
                ImageView imageView = lv0Var.f26224r0;
                if (a02 != 0.0f && lv0Var.D() && !lv0Var.q0()) {
                    i10 = 0;
                } else {
                    i10 = 4;
                }
                imageView.setVisibility(i10);
            } else {
                lv0Var.f26217o0 = 0.0f;
            }
            lv0Var.q1(false);
        }
        lv0Var.I();
        lv0Var.K();
        lv0Var.o0();
    }
}
