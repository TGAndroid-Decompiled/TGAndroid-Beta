package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Rect;
public final class ws0 extends org.telegram.ui.a21 {
    public final bw0 H;

    public ws0(bw0 bw0Var, Context context, sw0 sw0Var, ai.y8 y8Var, vs0 vs0Var) {
        super(context, sw0Var, y8Var, vs0Var);
        this.H = bw0Var;
    }

    @Override
    public final void a() {
        at0 at0Var;
        Rect rect = this.F;
        rect.set(0, 0, getMeasuredWidth(), (int) getVisualHeight());
        setClipBounds(rect);
        invalidate();
        bw0 bw0Var = this.H;
        uu0[] uu0VarArr = bw0Var.f25142k0;
        if (uu0VarArr != null) {
            for (uu0 uu0Var : uu0VarArr) {
                if (uu0Var != null && (at0Var = uu0Var.h) != null) {
                    int paddingLeft = at0Var.getPaddingLeft();
                    int Z = bw0Var.Z(uu0Var.F);
                    int paddingRight = uu0Var.h.getPaddingRight();
                    at0 at0Var2 = uu0Var.h;
                    int Y = bw0Var.Y(bw0Var.v0());
                    at0Var2.f31280c3 = Y;
                    at0Var.setPadding(paddingLeft, Z, paddingRight, Y);
                }
            }
        }
        bw0Var.K();
    }
}
