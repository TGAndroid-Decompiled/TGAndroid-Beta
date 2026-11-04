package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Rect;
public final class yp0 extends org.telegram.ui.cx0 {
    public final ws0 f40802x;

    public yp0(ws0 ws0Var, Context context, ei.n6 n6Var, xp0 xp0Var) {
        super(context, n6Var, xp0Var);
        this.f40802x = ws0Var;
    }

    @Override
    public final void b() {
        cq0 cq0Var;
        Rect rect = this.f44473s;
        rect.set(0, 0, getMeasuredWidth(), (int) getVisualHeight());
        setClipBounds(rect);
        invalidate();
        ws0 ws0Var = this.f40802x;
        rr0[] rr0VarArr = ws0Var.f40108n0;
        if (rr0VarArr != null) {
            for (rr0 rr0Var : rr0VarArr) {
                if (rr0Var != null && (cq0Var = rr0Var.h) != null) {
                    int paddingTop = cq0Var.getPaddingTop();
                    cq0 cq0Var2 = rr0Var.h;
                    int paddingLeft = cq0Var2.getPaddingLeft();
                    int j02 = ws0Var.j0(rr0Var.F);
                    int paddingRight = rr0Var.h.getPaddingRight();
                    cq0 cq0Var3 = rr0Var.h;
                    int i02 = ws0Var.i0(ws0Var.H0());
                    cq0Var3.i3 = i02;
                    cq0Var2.setPadding(paddingLeft, j02, paddingRight, i02);
                    int paddingTop2 = paddingTop - rr0Var.h.getPaddingTop();
                    if (paddingTop2 != 0) {
                        org.telegram.messenger.g0.J(rr0Var.h, new dp0(rr0Var, paddingTop2, 2));
                    }
                }
                if (rr0Var != null && rr0Var.f37789s != null) {
                    ws0Var.I1(rr0Var);
                }
            }
        }
        ws0Var.U();
    }
}
