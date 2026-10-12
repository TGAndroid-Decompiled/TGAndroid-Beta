package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Rect;
public final class ss0 extends org.telegram.ui.h21 {
    public final xv0 H;

    public ss0(xv0 xv0Var, Context context, ow0 ow0Var, bi.i8 i8Var, rs0 rs0Var) {
        super(context, ow0Var, i8Var, rs0Var);
        this.H = xv0Var;
    }

    @Override
    public final void a() {
        ws0 ws0Var;
        Rect rect = this.F;
        rect.set(0, 0, getMeasuredWidth(), (int) getVisualHeight());
        setClipBounds(rect);
        invalidate();
        xv0 xv0Var = this.H;
        qu0[] qu0VarArr = xv0Var.f31364k0;
        if (qu0VarArr != null) {
            for (qu0 qu0Var : qu0VarArr) {
                if (qu0Var != null && (ws0Var = qu0Var.h) != null) {
                    int paddingLeft = ws0Var.getPaddingLeft();
                    int Z = xv0Var.Z(qu0Var.F);
                    int paddingRight = qu0Var.h.getPaddingRight();
                    ws0 ws0Var2 = qu0Var.h;
                    int Y = xv0Var.Y(xv0Var.v0());
                    ws0Var2.f28423c3 = Y;
                    ws0Var.setPadding(paddingLeft, Z, paddingRight, Y);
                }
            }
        }
        xv0Var.K();
    }
}
