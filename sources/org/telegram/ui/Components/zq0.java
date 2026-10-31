package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Rect;
public final class zq0 extends org.telegram.ui.zy0 {
    public final zt0 f33150x;

    public zq0(zt0 zt0Var, Context context, th.t4 t4Var, yq0 yq0Var) {
        super(context, t4Var, yq0Var);
        this.f33150x = zt0Var;
    }

    @Override
    public final void b() {
        dr0 dr0Var;
        Rect rect = this.f44259s;
        rect.set(0, 0, getMeasuredWidth(), (int) getVisualHeight());
        setClipBounds(rect);
        invalidate();
        zt0 zt0Var = this.f33150x;
        ss0[] ss0VarArr = zt0Var.m0;
        if (ss0VarArr != null) {
            for (ss0 ss0Var : ss0VarArr) {
                if (ss0Var != null && (dr0Var = ss0Var.h) != null) {
                    int paddingTop = dr0Var.getPaddingTop();
                    dr0 dr0Var2 = ss0Var.h;
                    int paddingLeft = dr0Var2.getPaddingLeft();
                    int h02 = zt0Var.h0(ss0Var.E);
                    int paddingRight = ss0Var.h.getPaddingRight();
                    dr0 dr0Var3 = ss0Var.h;
                    int g02 = zt0Var.g0(zt0Var.E0());
                    dr0Var3.f30014h3 = g02;
                    dr0Var2.setPadding(paddingLeft, h02, paddingRight, g02);
                    int paddingTop2 = paddingTop - ss0Var.h.getPaddingTop();
                    if (paddingTop2 != 0) {
                        org.telegram.messenger.i0.J(ss0Var.h, new dq0(ss0Var, paddingTop2, 2));
                    }
                }
                if (ss0Var != null && ss0Var.f30354s != null) {
                    zt0Var.F1(ss0Var);
                }
            }
        }
        zt0Var.S();
    }
}
