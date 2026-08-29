package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Rect;
public final class kr0 extends org.telegram.ui.y01 {
    public final qu0 D;

    public kr0(qu0 qu0Var, Context context, hv0 hv0Var, lh.g6 g6Var, jr0 jr0Var) {
        super(context, hv0Var, g6Var, jr0Var);
        this.D = qu0Var;
    }

    @Override
    public final void a() {
        or0 or0Var;
        Rect rect = this.B;
        rect.set(0, 0, getMeasuredWidth(), (int) getVisualHeight());
        setClipBounds(rect);
        invalidate();
        qu0 qu0Var = this.D;
        it0[] it0VarArr = qu0Var.f32070g0;
        if (it0VarArr != null) {
            for (it0 it0Var : it0VarArr) {
                if (it0Var != null && (or0Var = it0Var.h) != null) {
                    int paddingLeft = or0Var.getPaddingLeft();
                    int Z = qu0Var.Z(it0Var.B);
                    int paddingRight = it0Var.h.getPaddingRight();
                    or0 or0Var2 = it0Var.h;
                    int Y = qu0Var.Y(qu0Var.v0());
                    or0Var2.f29229a3 = Y;
                    or0Var.setPadding(paddingLeft, Z, paddingRight, Y);
                }
            }
        }
        qu0Var.K();
    }
}
