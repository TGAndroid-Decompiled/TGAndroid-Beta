package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Rect;
public final class ls0 extends org.telegram.ui.t11 {
    public final qv0 H;

    public ls0(qv0 qv0Var, Context context, mw0 mw0Var, ai.x8 x8Var, ks0 ks0Var) {
        super(context, mw0Var, x8Var, ks0Var);
        this.H = qv0Var;
    }

    @Override
    public final void a() {
        ps0 ps0Var;
        Rect rect = this.F;
        rect.set(0, 0, getMeasuredWidth(), (int) getVisualHeight());
        setClipBounds(rect);
        invalidate();
        qv0 qv0Var = this.H;
        ju0[] ju0VarArr = qv0Var.f30239k0;
        if (ju0VarArr != null) {
            for (ju0 ju0Var : ju0VarArr) {
                if (ju0Var != null && (ps0Var = ju0Var.h) != null) {
                    int paddingLeft = ps0Var.getPaddingLeft();
                    int Z = qv0Var.Z(ju0Var.F);
                    int paddingRight = ju0Var.h.getPaddingRight();
                    ps0 ps0Var2 = ju0Var.h;
                    int Y = qv0Var.Y(qv0Var.v0());
                    ps0Var2.f27599l3 = Y;
                    ps0Var.setPadding(paddingLeft, Z, paddingRight, Y);
                }
            }
        }
        qv0Var.K();
    }
}
