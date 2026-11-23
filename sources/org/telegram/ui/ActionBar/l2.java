package org.telegram.ui.ActionBar;

import android.view.View;
public final class l2 implements ri.n, r0.m, q1 {
    public final w2 f29250a;

    public l2(w2 w2Var) {
        this.f29250a = w2Var;
    }

    @Override
    public void i(t1 t1Var, int i7) {
        this.f29250a.dismiss();
        bi.f2.l1(false, null);
    }

    @Override
    public int j() {
        w2 w2Var = this.f29250a;
        w2Var.getClass();
        return n6.w0(n6.f29524h5, w2Var.J0);
    }

    @Override
    public r0.l1 l1(View view, r0.l1 l1Var) {
        return this.f29250a.b0(l1Var);
    }
}
