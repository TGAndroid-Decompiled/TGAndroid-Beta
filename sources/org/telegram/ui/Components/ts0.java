package org.telegram.ui.Components;

import android.content.Context;
import android.widget.ImageView;
public final class ts0 extends qu0 {
    public final xv0 M;

    public ts0(xv0 xv0Var, Context context) {
        super(context);
        this.M = xv0Var;
    }

    @Override
    public final void setTranslationX(float f7) {
        qu0 qu0Var;
        int i10;
        super.setTranslationX(f7);
        xv0 xv0Var = this.M;
        qu0[] qu0VarArr = xv0Var.f31364k0;
        if (xv0Var.f31357g1 && (qu0Var = qu0VarArr[0]) == this) {
            float abs = Math.abs(qu0Var.getTranslationX()) / qu0VarArr[0].getMeasuredWidth();
            xv0Var.Z0(abs, qu0VarArr[1].F);
            if (xv0Var.D()) {
                int i11 = xv0Var.f31393x0;
                if (i11 == 2) {
                    xv0Var.f31371o0 = 1.0f - abs;
                } else if (i11 == 1) {
                    xv0Var.f31371o0 = abs;
                }
                xv0Var.s1(abs);
                float a02 = xv0Var.a0(abs);
                xv0Var.f31373p0 = a02;
                ImageView imageView = xv0Var.f31378r0;
                if (a02 != 0.0f && xv0Var.D() && !xv0Var.q0()) {
                    i10 = 0;
                } else {
                    i10 = 4;
                }
                imageView.setVisibility(i10);
            } else {
                xv0Var.f31371o0 = 0.0f;
            }
            xv0Var.q1(false);
        }
        xv0Var.I();
        xv0Var.K();
        xv0Var.o0();
    }
}
