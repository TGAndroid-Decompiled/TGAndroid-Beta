package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Rect;
public final class tr0 extends org.telegram.ui.m11 {
    public final zu0 E;

    public tr0(zu0 zu0Var, Context context, qv0 qv0Var, oh.h6 h6Var, sr0 sr0Var) {
        super(context, qv0Var, h6Var, sr0Var);
        this.E = zu0Var;
    }

    @Override
    public final void a() {
        xr0 xr0Var;
        Rect rect = this.C;
        rect.set(0, 0, getMeasuredWidth(), (int) getVisualHeight());
        setClipBounds(rect);
        invalidate();
        zu0 zu0Var = this.E;
        rt0[] rt0VarArr = zu0Var.f33980h0;
        if (rt0VarArr != null) {
            for (rt0 rt0Var : rt0VarArr) {
                if (rt0Var != null && (xr0Var = rt0Var.h) != null) {
                    int paddingLeft = xr0Var.getPaddingLeft();
                    int Z = zu0Var.Z(rt0Var.C);
                    int paddingRight = rt0Var.h.getPaddingRight();
                    xr0 xr0Var2 = rt0Var.h;
                    int Y = zu0Var.Y(zu0Var.v0());
                    xr0Var2.f30478b3 = Y;
                    xr0Var.setPadding(paddingLeft, Z, paddingRight, Y);
                }
            }
        }
        zu0Var.K();
    }
}
