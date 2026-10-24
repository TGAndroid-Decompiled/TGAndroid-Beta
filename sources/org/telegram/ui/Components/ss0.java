package org.telegram.ui.Components;

import android.content.Context;
import android.widget.ImageView;
public final class ss0 extends pu0 {
    public final wv0 M;

    public ss0(wv0 wv0Var, Context context) {
        super(context);
        this.M = wv0Var;
    }

    @Override
    public final void setTranslationX(float f7) {
        pu0 pu0Var;
        int i10;
        super.setTranslationX(f7);
        wv0 wv0Var = this.M;
        pu0[] pu0VarArr = wv0Var.f32386k0;
        if (wv0Var.f32379g1 && (pu0Var = pu0VarArr[0]) == this) {
            float abs = Math.abs(pu0Var.getTranslationX()) / pu0VarArr[0].getMeasuredWidth();
            wv0Var.c1(abs, pu0VarArr[1].F);
            if (wv0Var.E()) {
                int i11 = wv0Var.f32415x0;
                if (i11 == 2) {
                    wv0Var.f32393o0 = 1.0f - abs;
                } else if (i11 == 1) {
                    wv0Var.f32393o0 = abs;
                }
                wv0Var.x1(abs);
                float b02 = wv0Var.b0(abs);
                wv0Var.f32395p0 = b02;
                ImageView imageView = wv0Var.f32400r0;
                if (b02 != 0.0f && wv0Var.E() && !wv0Var.s0()) {
                    i10 = 0;
                } else {
                    i10 = 4;
                }
                imageView.setVisibility(i10);
            } else {
                wv0Var.f32393o0 = 0.0f;
            }
            wv0Var.u1(false);
        }
        wv0Var.J();
        wv0Var.L();
        wv0Var.q0();
    }
}
