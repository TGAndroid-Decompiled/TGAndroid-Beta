package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Rect;
public final class xs0 extends org.telegram.ui.z11 {
    public final cw0 H;

    public xs0(cw0 cw0Var, Context context, tw0 tw0Var, ai.y8 y8Var, ws0 ws0Var) {
        super(context, tw0Var, y8Var, ws0Var);
        this.H = cw0Var;
    }

    @Override
    public final void a() {
        bt0 bt0Var;
        Rect rect = this.F;
        rect.set(0, 0, getMeasuredWidth(), (int) getVisualHeight());
        setClipBounds(rect);
        invalidate();
        cw0 cw0Var = this.H;
        vu0[] vu0VarArr = cw0Var.f25512k0;
        if (vu0VarArr != null) {
            for (vu0 vu0Var : vu0VarArr) {
                if (vu0Var != null && (bt0Var = vu0Var.h) != null) {
                    int paddingLeft = bt0Var.getPaddingLeft();
                    int Z = cw0Var.Z(vu0Var.F);
                    int paddingRight = vu0Var.h.getPaddingRight();
                    bt0 bt0Var2 = vu0Var.h;
                    int Y = cw0Var.Y(cw0Var.v0());
                    bt0Var2.f31721c3 = Y;
                    bt0Var.setPadding(paddingLeft, Z, paddingRight, Y);
                }
            }
        }
        cw0Var.K();
    }
}
