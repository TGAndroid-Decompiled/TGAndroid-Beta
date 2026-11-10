package org.telegram.ui.ActionBar;

import android.view.View;
public final class l2 implements oi.n, r0.m, r1 {
    public final w2 f27727a;

    public l2(w2 w2Var) {
        this.f27727a = w2Var;
    }

    @Override
    public r0.k1 S0(View view, r0.k1 k1Var) {
        return this.f27727a.b0(k1Var);
    }

    @Override
    public void g(u1 u1Var, int i7) {
        this.f27727a.dismiss();
        wg.f1.l1(0, null);
    }

    @Override
    public int h() {
        w2 w2Var = this.f27727a;
        w2Var.getClass();
        return m6.w0(m6.f27963h5, w2Var.I0);
    }
}
