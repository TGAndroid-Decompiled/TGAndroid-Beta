package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Rect;
public final class yp0 extends org.telegram.ui.px0 {
    public final ys0 f40632x;

    public yp0(ys0 ys0Var, Context context, di.n6 n6Var, xp0 xp0Var) {
        super(context, n6Var, xp0Var);
        this.f40632x = ys0Var;
    }

    @Override
    public final void b() {
        cq0 cq0Var;
        Rect rect = this.f48868s;
        rect.set(0, 0, getMeasuredWidth(), (int) getVisualHeight());
        setClipBounds(rect);
        invalidate();
        ys0 ys0Var = this.f40632x;
        tr0[] tr0VarArr = ys0Var.m0;
        if (tr0VarArr != null) {
            for (tr0 tr0Var : tr0VarArr) {
                if (tr0Var != null && (cq0Var = tr0Var.h) != null) {
                    int paddingTop = cq0Var.getPaddingTop();
                    cq0 cq0Var2 = tr0Var.h;
                    int paddingLeft = cq0Var2.getPaddingLeft();
                    int j02 = ys0Var.j0(tr0Var.E);
                    int paddingRight = tr0Var.h.getPaddingRight();
                    cq0 cq0Var3 = tr0Var.h;
                    int i02 = ys0Var.i0(ys0Var.I0());
                    cq0Var3.f38051h3 = i02;
                    cq0Var2.setPadding(paddingLeft, j02, paddingRight, i02);
                    int paddingTop2 = paddingTop - tr0Var.h.getPaddingTop();
                    if (paddingTop2 != 0) {
                        org.telegram.messenger.g0.J(tr0Var.h, new bp0(tr0Var, paddingTop2, 2));
                    }
                }
                if (tr0Var != null && tr0Var.f38388s != null) {
                    ys0Var.K1(tr0Var);
                }
            }
        }
        ys0Var.U();
    }
}
