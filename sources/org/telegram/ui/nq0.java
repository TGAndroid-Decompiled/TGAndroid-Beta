package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
public final class nq0 extends FrameLayout {
    public org.telegram.ui.ActionBar.n2 f39519a;
    public FrameLayout f39520b;
    public org.telegram.ui.ActionBar.k f39521c;
    public org.telegram.ui.Components.im0 d;
    public int e;
    public final pq0 f39522f;

    public nq0(pq0 pq0Var, Context context) {
        super(context);
        this.f39522f = pq0Var;
    }

    @Override
    public final void setTranslationX(float f7) {
        nq0 nq0Var;
        super.setTranslationX(f7);
        pq0 pq0Var = this.f39522f;
        nq0[] nq0VarArr = pq0Var.f40223n;
        if (pq0Var.f40225s && (nq0Var = nq0VarArr[0]) == this) {
            pq0Var.h.j(Math.abs(nq0Var.getTranslationX()) / nq0VarArr[0].getMeasuredWidth(), nq0VarArr[1].e);
        }
    }
}
