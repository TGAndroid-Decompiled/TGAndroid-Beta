package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Rect;
import org.telegram.messenger.AndroidUtilities;
public final class at0 extends org.telegram.ui.n11 {
    public final bw0 f26662w;

    public at0(bw0 bw0Var, Context context, di.v6 v6Var, zs0 zs0Var) {
        super(context, v6Var, zs0Var);
        this.f26662w = bw0Var;
    }

    @Override
    public final void b() {
        et0 et0Var;
        Rect rect = this.f41614s;
        rect.set(0, 0, getMeasuredWidth(), (int) getVisualHeight());
        setClipBounds(rect);
        invalidate();
        bw0 bw0Var = this.f26662w;
        uu0[] uu0VarArr = bw0Var.m0;
        if (uu0VarArr != null) {
            for (uu0 uu0Var : uu0VarArr) {
                if (uu0Var != null && (et0Var = uu0Var.h) != null) {
                    int paddingTop = et0Var.getPaddingTop();
                    et0 et0Var2 = uu0Var.h;
                    int paddingLeft = et0Var2.getPaddingLeft();
                    int g02 = bw0Var.g0(uu0Var.E);
                    int paddingRight = uu0Var.h.getPaddingRight();
                    et0 et0Var3 = uu0Var.h;
                    int f02 = bw0Var.f0(bw0Var.D0());
                    et0Var3.f33153i3 = f02;
                    et0Var2.setPadding(paddingLeft, g02, paddingRight, f02);
                    int paddingTop2 = paddingTop - uu0Var.h.getPaddingTop();
                    if (paddingTop2 != 0) {
                        AndroidUtilities.doOnLayout(uu0Var.h, new fs0(uu0Var, paddingTop2, 2));
                    }
                }
                if (uu0Var != null && uu0Var.f33470s != null) {
                    bw0Var.E1(uu0Var);
                }
            }
        }
        bw0Var.R();
    }
}
