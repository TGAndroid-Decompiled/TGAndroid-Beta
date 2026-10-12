package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Rect;
public final class ct0 extends org.telegram.ui.c21 {
    public final hw0 H;

    public ct0(hw0 hw0Var, Context context, yw0 yw0Var, ai.y8 y8Var, bt0 bt0Var) {
        super(context, yw0Var, y8Var, bt0Var);
        this.H = hw0Var;
    }

    @Override
    public final void a() {
        gt0 gt0Var;
        Rect rect = this.F;
        rect.set(0, 0, getMeasuredWidth(), (int) getVisualHeight());
        setClipBounds(rect);
        invalidate();
        hw0 hw0Var = this.H;
        av0[] av0VarArr = hw0Var.f26948k0;
        if (av0VarArr != null) {
            for (av0 av0Var : av0VarArr) {
                if (av0Var != null && (gt0Var = av0Var.h) != null) {
                    int paddingLeft = gt0Var.getPaddingLeft();
                    int Z = hw0Var.Z(av0Var.F);
                    int paddingRight = av0Var.h.getPaddingRight();
                    gt0 gt0Var2 = av0Var.h;
                    int Y = hw0Var.Y(hw0Var.v0());
                    gt0Var2.f33494c3 = Y;
                    gt0Var.setPadding(paddingLeft, Z, paddingRight, Y);
                }
            }
        }
        hw0Var.K();
    }
}
