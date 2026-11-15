package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Rect;
public final class zp0 extends org.telegram.ui.jx0 {
    public final ys0 f42413x;

    public zp0(ys0 ys0Var, Context context, fi.g6 g6Var, yp0 yp0Var) {
        super(context, g6Var, yp0Var);
        this.f42413x = ys0Var;
    }

    @Override
    public final void b() {
        dq0 dq0Var;
        Rect rect = this.f48452s;
        rect.set(0, 0, getMeasuredWidth(), (int) getVisualHeight());
        setClipBounds(rect);
        invalidate();
        ys0 ys0Var = this.f42413x;
        tr0[] tr0VarArr = ys0Var.f42119n0;
        if (tr0VarArr != null) {
            for (tr0 tr0Var : tr0VarArr) {
                if (tr0Var != null && (dq0Var = tr0Var.h) != null) {
                    int paddingTop = dq0Var.getPaddingTop();
                    dq0 dq0Var2 = tr0Var.h;
                    int paddingLeft = dq0Var2.getPaddingLeft();
                    int j02 = ys0Var.j0(tr0Var.F);
                    int paddingRight = tr0Var.h.getPaddingRight();
                    dq0 dq0Var3 = tr0Var.h;
                    int i02 = ys0Var.i0(ys0Var.I0());
                    dq0Var3.f39400i3 = i02;
                    dq0Var2.setPadding(paddingLeft, j02, paddingRight, i02);
                    int paddingTop2 = paddingTop - tr0Var.h.getPaddingTop();
                    if (paddingTop2 != 0) {
                        org.telegram.messenger.g0.J(tr0Var.h, new ep0(tr0Var, paddingTop2, 2));
                    }
                }
                if (tr0Var != null && tr0Var.f39794s != null) {
                    ys0Var.K1(tr0Var);
                }
            }
        }
        ys0Var.U();
    }
}
