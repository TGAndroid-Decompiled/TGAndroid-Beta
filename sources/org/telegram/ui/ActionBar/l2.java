package org.telegram.ui.ActionBar;

import android.view.View;
public final class l2 implements ri.n, r0.m, q1 {
    public final w2 f29199a;

    public l2(w2 w2Var) {
        this.f29199a = w2Var;
    }

    @Override
    public r0.l1 P0(View view, r0.l1 l1Var) {
        return this.f29199a.b0(l1Var);
    }

    @Override
    public int e() {
        w2 w2Var = this.f29199a;
        w2Var.getClass();
        return m6.w0(m6.f29454h5, w2Var.J0);
    }

    @Override
    public void h(t1 t1Var, int i7) {
        this.f29199a.dismiss();
        bi.e2.l1(false, null);
    }
}
