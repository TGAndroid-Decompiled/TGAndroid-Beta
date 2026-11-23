package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Rect;
public final class jq0 extends org.telegram.ui.nx0 {
    public final jt0 f36586x;

    public jq0(jt0 jt0Var, Context context, fi.d6 d6Var, iq0 iq0Var) {
        super(context, d6Var, iq0Var);
        this.f36586x = jt0Var;
    }

    @Override
    public final void b() {
        nq0 nq0Var;
        Rect rect = this.f50354s;
        rect.set(0, 0, getMeasuredWidth(), (int) getVisualHeight());
        setClipBounds(rect);
        invalidate();
        jt0 jt0Var = this.f36586x;
        ds0[] ds0VarArr = jt0Var.f36651n0;
        if (ds0VarArr != null) {
            for (ds0 ds0Var : ds0VarArr) {
                if (ds0Var != null && (nq0Var = ds0Var.h) != null) {
                    int paddingTop = nq0Var.getPaddingTop();
                    nq0 nq0Var2 = ds0Var.h;
                    int paddingLeft = nq0Var2.getPaddingLeft();
                    int j02 = jt0Var.j0(ds0Var.F);
                    int paddingRight = ds0Var.h.getPaddingRight();
                    nq0 nq0Var3 = ds0Var.h;
                    int i02 = jt0Var.i0(jt0Var.I0());
                    nq0Var3.f34296i3 = i02;
                    nq0Var2.setPadding(paddingLeft, j02, paddingRight, i02);
                    int paddingTop2 = paddingTop - ds0Var.h.getPaddingTop();
                    if (paddingTop2 != 0) {
                        org.telegram.messenger.g0.J(ds0Var.h, new qp0(ds0Var, paddingTop2, 2));
                    }
                }
                if (ds0Var != null && ds0Var.f34563s != null) {
                    jt0Var.K1(ds0Var);
                }
            }
        }
        jt0Var.U();
    }
}
