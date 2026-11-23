package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Rect;
public final class iq0 extends org.telegram.ui.lx0 {
    public final it0 f36077x;

    public iq0(it0 it0Var, Context context, fi.d6 d6Var, hq0 hq0Var) {
        super(context, d6Var, hq0Var);
        this.f36077x = it0Var;
    }

    @Override
    public final void b() {
        mq0 mq0Var;
        Rect rect = this.f49876s;
        rect.set(0, 0, getMeasuredWidth(), (int) getVisualHeight());
        setClipBounds(rect);
        invalidate();
        it0 it0Var = this.f36077x;
        ds0[] ds0VarArr = it0Var.f36133n0;
        if (ds0VarArr != null) {
            for (ds0 ds0Var : ds0VarArr) {
                if (ds0Var != null && (mq0Var = ds0Var.h) != null) {
                    int paddingTop = mq0Var.getPaddingTop();
                    mq0 mq0Var2 = ds0Var.h;
                    int paddingLeft = mq0Var2.getPaddingLeft();
                    int j02 = it0Var.j0(ds0Var.F);
                    int paddingRight = ds0Var.h.getPaddingRight();
                    mq0 mq0Var3 = ds0Var.h;
                    int i02 = it0Var.i0(it0Var.I0());
                    mq0Var3.f34120i3 = i02;
                    mq0Var2.setPadding(paddingLeft, j02, paddingRight, i02);
                    int paddingTop2 = paddingTop - ds0Var.h.getPaddingTop();
                    if (paddingTop2 != 0) {
                        org.telegram.messenger.g0.J(ds0Var.h, new pp0(ds0Var, paddingTop2, 2));
                    }
                }
                if (ds0Var != null && ds0Var.f34448s != null) {
                    it0Var.K1(ds0Var);
                }
            }
        }
        it0Var.U();
    }
}
