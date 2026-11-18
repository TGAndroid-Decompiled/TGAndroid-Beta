package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Rect;
public final class hq0 extends org.telegram.ui.nx0 {
    public final gt0 f35951x;

    public hq0(gt0 gt0Var, Context context, fi.d6 d6Var, gq0 gq0Var) {
        super(context, d6Var, gq0Var);
        this.f35951x = gt0Var;
    }

    @Override
    public final void b() {
        lq0 lq0Var;
        Rect rect = this.f50343s;
        rect.set(0, 0, getMeasuredWidth(), (int) getVisualHeight());
        setClipBounds(rect);
        invalidate();
        gt0 gt0Var = this.f35951x;
        bs0[] bs0VarArr = gt0Var.f35609n0;
        if (bs0VarArr != null) {
            for (bs0 bs0Var : bs0VarArr) {
                if (bs0Var != null && (lq0Var = bs0Var.h) != null) {
                    int paddingTop = lq0Var.getPaddingTop();
                    lq0 lq0Var2 = bs0Var.h;
                    int paddingLeft = lq0Var2.getPaddingLeft();
                    int j02 = gt0Var.j0(bs0Var.F);
                    int paddingRight = bs0Var.h.getPaddingRight();
                    lq0 lq0Var3 = bs0Var.h;
                    int i02 = gt0Var.i0(gt0Var.I0());
                    lq0Var3.f33443i3 = i02;
                    lq0Var2.setPadding(paddingLeft, j02, paddingRight, i02);
                    int paddingTop2 = paddingTop - bs0Var.h.getPaddingTop();
                    if (paddingTop2 != 0) {
                        org.telegram.messenger.g0.J(bs0Var.h, new op0(bs0Var, paddingTop2, 2));
                    }
                }
                if (bs0Var != null && bs0Var.f33773s != null) {
                    gt0Var.K1(bs0Var);
                }
            }
        }
        gt0Var.U();
    }
}
