package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
public final class pq0 extends FrameLayout {
    public org.telegram.ui.ActionBar.o2 f40523a;
    public FrameLayout f40524b;
    public org.telegram.ui.ActionBar.k f40525c;
    public org.telegram.ui.Components.mm0 d;
    public int e;
    public final rq0 f40526f;

    public pq0(rq0 rq0Var, Context context) {
        super(context);
        this.f40526f = rq0Var;
    }

    @Override
    public final void setTranslationX(float f7) {
        pq0 pq0Var;
        super.setTranslationX(f7);
        rq0 rq0Var = this.f40526f;
        pq0[] pq0VarArr = rq0Var.f41227n;
        if (rq0Var.f41229s && (pq0Var = pq0VarArr[0]) == this) {
            rq0Var.h.i(Math.abs(pq0Var.getTranslationX()) / pq0VarArr[0].getMeasuredWidth(), pq0VarArr[1].e);
        }
    }
}
