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
        qu0[] qu0VarArr = xv0Var.f32687k0;
        if (xv0Var.f32680g1 && (qu0Var = qu0VarArr[0]) == this) {
            float abs = Math.abs(qu0Var.getTranslationX()) / qu0VarArr[0].getMeasuredWidth();
            xv0Var.c1(abs, qu0VarArr[1].F);
            if (xv0Var.E()) {
                int i11 = xv0Var.f32716x0;
                if (i11 == 2) {
                    xv0Var.f32694o0 = 1.0f - abs;
                } else if (i11 == 1) {
                    xv0Var.f32694o0 = abs;
                }
                xv0Var.x1(abs);
                float b02 = xv0Var.b0(abs);
                xv0Var.f32696p0 = b02;
                ImageView imageView = xv0Var.f32701r0;
                if (b02 != 0.0f && xv0Var.E() && !xv0Var.s0()) {
                    i10 = 0;
                } else {
                    i10 = 4;
                }
                imageView.setVisibility(i10);
            } else {
                xv0Var.f32694o0 = 0.0f;
            }
            xv0Var.u1(false);
        }
        xv0Var.J();
        xv0Var.L();
        xv0Var.q0();
    }
}
