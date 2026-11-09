package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Rect;
public final class zp0 extends org.telegram.ui.ox0 {
    public final zs0 f41040x;

    public zp0(zs0 zs0Var, Context context, di.n6 n6Var, yp0 yp0Var) {
        super(context, n6Var, yp0Var);
        this.f41040x = zs0Var;
    }

    @Override
    public final void b() {
        dq0 dq0Var;
        Rect rect = this.f48552s;
        rect.set(0, 0, getMeasuredWidth(), (int) getVisualHeight());
        setClipBounds(rect);
        invalidate();
        zs0 zs0Var = this.f41040x;
        ur0[] ur0VarArr = zs0Var.m0;
        if (ur0VarArr != null) {
            for (ur0 ur0Var : ur0VarArr) {
                if (ur0Var != null && (dq0Var = ur0Var.h) != null) {
                    int paddingTop = dq0Var.getPaddingTop();
                    dq0 dq0Var2 = ur0Var.h;
                    int paddingLeft = dq0Var2.getPaddingLeft();
                    int j02 = zs0Var.j0(ur0Var.E);
                    int paddingRight = ur0Var.h.getPaddingRight();
                    dq0 dq0Var3 = ur0Var.h;
                    int i02 = zs0Var.i0(zs0Var.I0());
                    dq0Var3.f38479h3 = i02;
                    dq0Var2.setPadding(paddingLeft, j02, paddingRight, i02);
                    int paddingTop2 = paddingTop - ur0Var.h.getPaddingTop();
                    if (paddingTop2 != 0) {
                        org.telegram.messenger.g0.J(ur0Var.h, new cp0(ur0Var, paddingTop2, 2));
                    }
                }
                if (ur0Var != null && ur0Var.f38794s != null) {
                    zs0Var.K1(ur0Var);
                }
            }
        }
        zs0Var.U();
    }
}
