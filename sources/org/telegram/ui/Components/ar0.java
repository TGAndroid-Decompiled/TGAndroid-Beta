package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Rect;
public final class ar0 extends org.telegram.ui.yy0 {
    public final au0 f24480x;

    public ar0(au0 au0Var, Context context, th.t4 t4Var, zq0 zq0Var) {
        super(context, t4Var, zq0Var);
        this.f24480x = au0Var;
    }

    @Override
    public final void b() {
        er0 er0Var;
        Rect rect = this.f43753s;
        rect.set(0, 0, getMeasuredWidth(), (int) getVisualHeight());
        setClipBounds(rect);
        invalidate();
        au0 au0Var = this.f24480x;
        ts0[] ts0VarArr = au0Var.m0;
        if (ts0VarArr != null) {
            for (ts0 ts0Var : ts0VarArr) {
                if (ts0Var != null && (er0Var = ts0Var.h) != null) {
                    int paddingTop = er0Var.getPaddingTop();
                    er0 er0Var2 = ts0Var.h;
                    int paddingLeft = er0Var2.getPaddingLeft();
                    int i02 = au0Var.i0(ts0Var.E);
                    int paddingRight = ts0Var.h.getPaddingRight();
                    er0 er0Var3 = ts0Var.h;
                    int h02 = au0Var.h0(au0Var.F0());
                    er0Var3.f30438h3 = h02;
                    er0Var2.setPadding(paddingLeft, i02, paddingRight, h02);
                    int paddingTop2 = paddingTop - ts0Var.h.getPaddingTop();
                    if (paddingTop2 != 0) {
                        org.telegram.messenger.i0.J(ts0Var.h, new eq0(ts0Var, paddingTop2, 2));
                    }
                }
                if (ts0Var != null && ts0Var.f30721s != null) {
                    au0Var.G1(ts0Var);
                }
            }
        }
        au0Var.T();
    }
}
