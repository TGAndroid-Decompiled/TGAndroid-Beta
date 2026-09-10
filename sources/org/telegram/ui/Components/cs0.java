package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Rect;
public final class cs0 extends org.telegram.ui.h21 {
    public final iv0 H;

    public cs0(iv0 iv0Var, Context context, aw0 aw0Var, zh.w4 w4Var, as0 as0Var) {
        super(context, aw0Var, w4Var, as0Var);
        this.H = iv0Var;
    }

    @Override
    public final void a() {
        gs0 gs0Var;
        Rect rect = this.F;
        rect.set(0, 0, getMeasuredWidth(), (int) getVisualHeight());
        setClipBounds(rect);
        invalidate();
        iv0 iv0Var = this.H;
        au0[] au0VarArr = iv0Var.f24107k0;
        if (au0VarArr != null) {
            for (au0 au0Var : au0VarArr) {
                if (au0Var != null && (gs0Var = au0Var.h) != null) {
                    int paddingLeft = gs0Var.getPaddingLeft();
                    int Z = iv0Var.Z(au0Var.F);
                    int paddingRight = au0Var.h.getPaddingRight();
                    gs0 gs0Var2 = au0Var.h;
                    int Y = iv0Var.Y(iv0Var.v0());
                    gs0Var2.f29809e3 = Y;
                    gs0Var.setPadding(paddingLeft, Z, paddingRight, Y);
                }
            }
        }
        iv0Var.K();
    }
}
