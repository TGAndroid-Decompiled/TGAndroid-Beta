package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Rect;
public final class ks0 extends org.telegram.ui.t11 {
    public final pv0 H;

    public ks0(pv0 pv0Var, Context context, lw0 lw0Var, ai.x8 x8Var, js0 js0Var) {
        super(context, lw0Var, x8Var, js0Var);
        this.H = pv0Var;
    }

    @Override
    public final void a() {
        os0 os0Var;
        Rect rect = this.F;
        rect.set(0, 0, getMeasuredWidth(), (int) getVisualHeight());
        setClipBounds(rect);
        invalidate();
        pv0 pv0Var = this.H;
        iu0[] iu0VarArr = pv0Var.f29777k0;
        if (iu0VarArr != null) {
            for (iu0 iu0Var : iu0VarArr) {
                if (iu0Var != null && (os0Var = iu0Var.h) != null) {
                    int paddingLeft = os0Var.getPaddingLeft();
                    int Z = pv0Var.Z(iu0Var.F);
                    int paddingRight = iu0Var.h.getPaddingRight();
                    os0 os0Var2 = iu0Var.h;
                    int Y = pv0Var.Y(pv0Var.v0());
                    os0Var2.f27238l3 = Y;
                    os0Var.setPadding(paddingLeft, Z, paddingRight, Y);
                }
            }
        }
        pv0Var.K();
    }
}
