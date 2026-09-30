package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Rect;
public final class hs0 extends org.telegram.ui.s11 {
    public final mv0 H;

    public hs0(mv0 mv0Var, Context context, dw0 dw0Var, ai.x8 x8Var, gs0 gs0Var) {
        super(context, dw0Var, x8Var, gs0Var);
        this.H = mv0Var;
    }

    @Override
    public final void a() {
        ls0 ls0Var;
        Rect rect = this.F;
        rect.set(0, 0, getMeasuredWidth(), (int) getVisualHeight());
        setClipBounds(rect);
        invalidate();
        mv0 mv0Var = this.H;
        fu0[] fu0VarArr = mv0Var.f26425k0;
        if (fu0VarArr != null) {
            for (fu0 fu0Var : fu0VarArr) {
                if (fu0Var != null && (ls0Var = fu0Var.h) != null) {
                    int paddingLeft = ls0Var.getPaddingLeft();
                    int Z = mv0Var.Z(fu0Var.F);
                    int paddingRight = fu0Var.h.getPaddingRight();
                    ls0 ls0Var2 = fu0Var.h;
                    int Y = mv0Var.Y(mv0Var.v0());
                    ls0Var2.f24049l3 = Y;
                    ls0Var.setPadding(paddingLeft, Z, paddingRight, Y);
                }
            }
        }
        mv0Var.K();
    }
}
