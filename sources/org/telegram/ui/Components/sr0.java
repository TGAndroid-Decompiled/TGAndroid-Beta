package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Rect;
public final class sr0 extends org.telegram.ui.q11 {
    public final yu0 E;

    public sr0(yu0 yu0Var, Context context, pv0 pv0Var, oh.h6 h6Var, rr0 rr0Var) {
        super(context, pv0Var, h6Var, rr0Var);
        this.E = yu0Var;
    }

    @Override
    public final void a() {
        wr0 wr0Var;
        Rect rect = this.C;
        rect.set(0, 0, getMeasuredWidth(), (int) getVisualHeight());
        setClipBounds(rect);
        invalidate();
        yu0 yu0Var = this.E;
        qt0[] qt0VarArr = yu0Var.f33625h0;
        if (qt0VarArr != null) {
            for (qt0 qt0Var : qt0VarArr) {
                if (qt0Var != null && (wr0Var = qt0Var.h) != null) {
                    int paddingLeft = wr0Var.getPaddingLeft();
                    int Z = yu0Var.Z(qt0Var.C);
                    int paddingRight = qt0Var.h.getPaddingRight();
                    wr0 wr0Var2 = qt0Var.h;
                    int Y = yu0Var.Y(yu0Var.v0());
                    wr0Var2.f30187b3 = Y;
                    wr0Var.setPadding(paddingLeft, Z, paddingRight, Y);
                }
            }
        }
        yu0Var.K();
    }
}
