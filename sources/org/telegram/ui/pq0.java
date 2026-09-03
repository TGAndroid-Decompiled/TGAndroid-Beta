package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
public final class pq0 extends FrameLayout {
    public org.telegram.ui.ActionBar.p2 f37211a;
    public FrameLayout f37212b;
    public org.telegram.ui.ActionBar.k f37213c;
    public org.telegram.ui.Components.rl0 d;
    public int e;
    public final rq0 f37214f;

    public pq0(rq0 rq0Var, Context context) {
        super(context);
        this.f37214f = rq0Var;
    }

    @Override
    public final void setTranslationX(float f10) {
        pq0 pq0Var;
        super.setTranslationX(f10);
        rq0 rq0Var = this.f37214f;
        pq0[] pq0VarArr = rq0Var.f37950n;
        if (rq0Var.f37952s && (pq0Var = pq0VarArr[0]) == this) {
            rq0Var.h.j(Math.abs(pq0Var.getTranslationX()) / pq0VarArr[0].getMeasuredWidth(), pq0VarArr[1].e);
        }
    }
}
