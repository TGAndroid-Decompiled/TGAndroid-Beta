package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
public final class pq0 extends FrameLayout {
    public org.telegram.ui.ActionBar.p2 f40103a;
    public FrameLayout f40104b;
    public org.telegram.ui.ActionBar.k f40105c;
    public org.telegram.ui.Components.sl0 d;
    public int f40106e;
    public final rq0 f40107f;

    public pq0(rq0 rq0Var, Context context) {
        super(context);
        this.f40107f = rq0Var;
    }

    @Override
    public final void setTranslationX(float f10) {
        pq0 pq0Var;
        super.setTranslationX(f10);
        rq0 rq0Var = this.f40107f;
        pq0[] pq0VarArr = rq0Var.f40916n;
        if (rq0Var.f40918s && (pq0Var = pq0VarArr[0]) == this) {
            rq0Var.h.j(Math.abs(pq0Var.getTranslationX()) / pq0VarArr[0].getMeasuredWidth(), pq0VarArr[1].f40106e);
        }
    }
}
