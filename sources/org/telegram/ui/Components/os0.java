package org.telegram.ui.Components;

import android.content.Context;
import android.widget.ImageView;
public final class os0 extends lu0 {
    public final sv0 M;

    public os0(sv0 sv0Var, Context context) {
        super(context);
        this.M = sv0Var;
    }

    @Override
    public final void setTranslationX(float f7) {
        lu0 lu0Var;
        int i10;
        super.setTranslationX(f7);
        sv0 sv0Var = this.M;
        lu0[] lu0VarArr = sv0Var.f30371k0;
        if (sv0Var.f30364g1 && (lu0Var = lu0VarArr[0]) == this) {
            float abs = Math.abs(lu0Var.getTranslationX()) / lu0VarArr[0].getMeasuredWidth();
            sv0Var.b1(abs, lu0VarArr[1].F);
            if (sv0Var.D()) {
                int i11 = sv0Var.f30400x0;
                if (i11 == 2) {
                    sv0Var.f30378o0 = 1.0f - abs;
                } else if (i11 == 1) {
                    sv0Var.f30378o0 = abs;
                }
                sv0Var.v1(abs);
                float a02 = sv0Var.a0(abs);
                sv0Var.f30380p0 = a02;
                ImageView imageView = sv0Var.f30385r0;
                if (a02 != 0.0f && sv0Var.D() && !sv0Var.r0()) {
                    i10 = 0;
                } else {
                    i10 = 4;
                }
                imageView.setVisibility(i10);
            } else {
                sv0Var.f30378o0 = 0.0f;
            }
            sv0Var.s1(false);
        }
        sv0Var.I();
        sv0Var.K();
        sv0Var.p0();
    }
}
