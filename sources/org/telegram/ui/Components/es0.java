package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Rect;
public final class es0 extends org.telegram.ui.s11 {
    public final jv0 H;

    public es0(jv0 jv0Var, Context context, aw0 aw0Var, ai.x8 x8Var, ds0 ds0Var) {
        super(context, aw0Var, x8Var, ds0Var);
        this.H = jv0Var;
    }

    @Override
    public final void a() {
        is0 is0Var;
        Rect rect = this.F;
        rect.set(0, 0, getMeasuredWidth(), (int) getVisualHeight());
        setClipBounds(rect);
        invalidate();
        jv0 jv0Var = this.H;
        cu0[] cu0VarArr = jv0Var.f25535k0;
        if (cu0VarArr != null) {
            for (cu0 cu0Var : cu0VarArr) {
                if (cu0Var != null && (is0Var = cu0Var.h) != null) {
                    int paddingLeft = is0Var.getPaddingLeft();
                    int Z = jv0Var.Z(cu0Var.F);
                    int paddingRight = cu0Var.h.getPaddingRight();
                    is0 is0Var2 = cu0Var.h;
                    int Y = jv0Var.Y(jv0Var.v0());
                    is0Var2.f23092e3 = Y;
                    is0Var.setPadding(paddingLeft, Z, paddingRight, Y);
                }
            }
        }
        jv0Var.K();
    }
}
