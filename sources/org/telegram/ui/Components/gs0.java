package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Rect;
public final class gs0 extends org.telegram.ui.a21 {
    public final lv0 H;

    public gs0(lv0 lv0Var, Context context, cw0 cw0Var, ai.x8 x8Var, fs0 fs0Var) {
        super(context, cw0Var, x8Var, fs0Var);
        this.H = lv0Var;
    }

    @Override
    public final void a() {
        ks0 ks0Var;
        Rect rect = this.F;
        rect.set(0, 0, getMeasuredWidth(), (int) getVisualHeight());
        setClipBounds(rect);
        invalidate();
        lv0 lv0Var = this.H;
        eu0[] eu0VarArr = lv0Var.f26210k0;
        if (eu0VarArr != null) {
            for (eu0 eu0Var : eu0VarArr) {
                if (eu0Var != null && (ks0Var = eu0Var.h) != null) {
                    int paddingLeft = ks0Var.getPaddingLeft();
                    int Z = lv0Var.Z(eu0Var.F);
                    int paddingRight = eu0Var.h.getPaddingRight();
                    ks0 ks0Var2 = eu0Var.h;
                    int Y = lv0Var.Y(lv0Var.v0());
                    ks0Var2.f23747e3 = Y;
                    ks0Var.setPadding(paddingLeft, Z, paddingRight, Y);
                }
            }
        }
        lv0Var.K();
    }
}
