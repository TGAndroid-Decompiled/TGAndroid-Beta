package org.telegram.ui.Components;

import android.content.Context;
import android.widget.ImageView;
public final class lr0 extends it0 {
    public final qu0 I;

    public lr0(qu0 qu0Var, Context context) {
        super(context);
        this.I = qu0Var;
    }

    @Override
    public final void setTranslationX(float f9) {
        it0 it0Var;
        int i10;
        super.setTranslationX(f9);
        qu0 qu0Var = this.I;
        it0[] it0VarArr = qu0Var.f32070g0;
        if (qu0Var.f32061c1 && (it0Var = it0VarArr[0]) == this) {
            float abs = Math.abs(it0Var.getTranslationX()) / it0VarArr[0].getMeasuredWidth();
            qu0Var.Z0(abs, it0VarArr[1].B);
            if (qu0Var.D()) {
                int i11 = qu0Var.f32097t0;
                if (i11 == 2) {
                    qu0Var.f32078k0 = 1.0f - abs;
                } else if (i11 == 1) {
                    qu0Var.f32078k0 = abs;
                }
                qu0Var.s1(abs);
                float a02 = qu0Var.a0(abs);
                qu0Var.f32080l0 = a02;
                ImageView imageView = qu0Var.f32083n0;
                if (a02 != 0.0f && qu0Var.D() && !qu0Var.q0()) {
                    i10 = 0;
                } else {
                    i10 = 4;
                }
                imageView.setVisibility(i10);
            } else {
                qu0Var.f32078k0 = 0.0f;
            }
            qu0Var.q1(false);
        }
        qu0Var.I();
        qu0Var.K();
        qu0Var.o0();
    }
}
