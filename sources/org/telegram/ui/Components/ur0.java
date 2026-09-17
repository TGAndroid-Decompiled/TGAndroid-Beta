package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Rect;
public final class ur0 extends org.telegram.ui.c21 {
    public final zu0 H;

    public ur0(zu0 zu0Var, Context context, qv0 qv0Var, ai.x8 x8Var, sr0 sr0Var) {
        super(context, qv0Var, x8Var, sr0Var);
        this.H = zu0Var;
    }

    @Override
    public final void a() {
        yr0 yr0Var;
        Rect rect = this.F;
        rect.set(0, 0, getMeasuredWidth(), (int) getVisualHeight());
        setClipBounds(rect);
        invalidate();
        zu0 zu0Var = this.H;
        st0[] st0VarArr = zu0Var.f30632k0;
        if (st0VarArr != null) {
            for (st0 st0Var : st0VarArr) {
                if (st0Var != null && (yr0Var = st0Var.h) != null) {
                    int paddingLeft = yr0Var.getPaddingLeft();
                    int Z = zu0Var.Z(st0Var.F);
                    int paddingRight = st0Var.h.getPaddingRight();
                    yr0 yr0Var2 = st0Var.h;
                    int Y = zu0Var.Y(zu0Var.v0());
                    yr0Var2.f27690e3 = Y;
                    yr0Var.setPadding(paddingLeft, Z, paddingRight, Y);
                }
            }
        }
        zu0Var.K();
    }
}
