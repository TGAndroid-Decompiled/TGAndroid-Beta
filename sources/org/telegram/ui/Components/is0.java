package org.telegram.ui.Components;

import android.content.Context;
import android.widget.ImageView;
public final class is0 extends fu0 {
    public final mv0 M;

    public is0(mv0 mv0Var, Context context) {
        super(context);
        this.M = mv0Var;
    }

    @Override
    public final void setTranslationX(float f7) {
        fu0 fu0Var;
        int i10;
        super.setTranslationX(f7);
        mv0 mv0Var = this.M;
        fu0[] fu0VarArr = mv0Var.f26425k0;
        if (mv0Var.f26418g1 && (fu0Var = fu0VarArr[0]) == this) {
            float abs = Math.abs(fu0Var.getTranslationX()) / fu0VarArr[0].getMeasuredWidth();
            mv0Var.Z0(abs, fu0VarArr[1].F);
            if (mv0Var.D()) {
                int i11 = mv0Var.f26454x0;
                if (i11 == 2) {
                    mv0Var.f26432o0 = 1.0f - abs;
                } else if (i11 == 1) {
                    mv0Var.f26432o0 = abs;
                }
                mv0Var.s1(abs);
                float a02 = mv0Var.a0(abs);
                mv0Var.f26434p0 = a02;
                ImageView imageView = mv0Var.f26439r0;
                if (a02 != 0.0f && mv0Var.D() && !mv0Var.q0()) {
                    i10 = 0;
                } else {
                    i10 = 4;
                }
                imageView.setVisibility(i10);
            } else {
                mv0Var.f26432o0 = 0.0f;
            }
            mv0Var.q1(false);
        }
        mv0Var.I();
        mv0Var.K();
        mv0Var.o0();
    }
}
