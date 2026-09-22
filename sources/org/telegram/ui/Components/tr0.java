package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Rect;
public final class tr0 extends org.telegram.ui.c21 {
    public final yu0 H;

    public tr0(yu0 yu0Var, Context context, pv0 pv0Var, ai.x8 x8Var, rr0 rr0Var) {
        super(context, pv0Var, x8Var, rr0Var);
        this.H = yu0Var;
    }

    @Override
    public final void a() {
        xr0 xr0Var;
        Rect rect = this.F;
        rect.set(0, 0, getMeasuredWidth(), (int) getVisualHeight());
        setClipBounds(rect);
        invalidate();
        yu0 yu0Var = this.H;
        rt0[] rt0VarArr = yu0Var.f30365k0;
        if (rt0VarArr != null) {
            for (rt0 rt0Var : rt0VarArr) {
                if (rt0Var != null && (xr0Var = rt0Var.h) != null) {
                    int paddingLeft = xr0Var.getPaddingLeft();
                    int Z = yu0Var.Z(rt0Var.F);
                    int paddingRight = rt0Var.h.getPaddingRight();
                    xr0 xr0Var2 = rt0Var.h;
                    int Y = yu0Var.Y(yu0Var.v0());
                    xr0Var2.f27442e3 = Y;
                    xr0Var.setPadding(paddingLeft, Z, paddingRight, Y);
                }
            }
        }
        yu0Var.K();
    }
}
