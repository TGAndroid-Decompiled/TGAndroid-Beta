package org.telegram.ui.ActionBar;

import android.view.View;
public final class j2 implements ri.n, r0.m, q1 {
    public final u2 f28724a;

    public j2(u2 u2Var) {
        this.f28724a = u2Var;
    }

    @Override
    public r0.k1 M0(View view, r0.k1 k1Var) {
        return this.f28724a.b0(k1Var);
    }

    @Override
    public int e() {
        u2 u2Var = this.f28724a;
        u2Var.getClass();
        return j6.w0(j6.f28922h5, u2Var.J0);
    }

    @Override
    public void h(t1 t1Var, int i7) {
        this.f28724a.dismiss();
        wg.c1.l1(0, null);
    }
}
