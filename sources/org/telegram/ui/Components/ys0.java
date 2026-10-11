package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Rect;
public final class ys0 extends org.telegram.ui.z11 {
    public final dw0 H;

    public ys0(dw0 dw0Var, Context context, uw0 uw0Var, ai.y8 y8Var, xs0 xs0Var) {
        super(context, uw0Var, y8Var, xs0Var);
        this.H = dw0Var;
    }

    @Override
    public final void a() {
        ct0 ct0Var;
        Rect rect = this.F;
        rect.set(0, 0, getMeasuredWidth(), (int) getVisualHeight());
        setClipBounds(rect);
        invalidate();
        dw0 dw0Var = this.H;
        wu0[] wu0VarArr = dw0Var.f25711k0;
        if (wu0VarArr != null) {
            for (wu0 wu0Var : wu0VarArr) {
                if (wu0Var != null && (ct0Var = wu0Var.h) != null) {
                    int paddingLeft = ct0Var.getPaddingLeft();
                    int Z = dw0Var.Z(wu0Var.F);
                    int paddingRight = wu0Var.h.getPaddingRight();
                    ct0 ct0Var2 = wu0Var.h;
                    int Y = dw0Var.Y(dw0Var.v0());
                    ct0Var2.f32485c3 = Y;
                    ct0Var.setPadding(paddingLeft, Z, paddingRight, Y);
                }
            }
        }
        dw0Var.K();
    }
}
