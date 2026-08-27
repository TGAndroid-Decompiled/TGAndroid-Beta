package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Rect;

public final class ar0 extends org.telegram.ui.y01 {
    public final hu0 D;

    public ar0(hu0 hu0Var, Context context, zu0 zu0Var, jh.f6 f6Var, zq0 zq0Var) {
        super(context, zu0Var, f6Var, zq0Var);
        this.D = hu0Var;
    }

    @Override
    public final void a() {
        er0 er0Var;
        int measuredWidth = getMeasuredWidth();
        int visualHeight = (int) getVisualHeight();
        Rect rect = this.B;
        rect.set(0, 0, measuredWidth, visualHeight);
        setClipBounds(rect);
        invalidate();
        hu0 hu0Var = this.D;
        zs0[] zs0VarArr = hu0Var.f29122g0;
        if (zs0VarArr != null) {
            for (zs0 zs0Var : zs0VarArr) {
                if (zs0Var != null && (er0Var = zs0Var.h) != null) {
                    int paddingLeft = er0Var.getPaddingLeft();
                    int iZ = hu0Var.Z(zs0Var.B);
                    int paddingRight = zs0Var.h.getPaddingRight();
                    er0 er0Var2 = zs0Var.h;
                    int iY = hu0Var.Y(hu0Var.v0());
                    er0Var2.a3 = iY;
                    er0Var.setPadding(paddingLeft, iZ, paddingRight, iY);
                }
            }
        }
        hu0Var.K();
    }
}
