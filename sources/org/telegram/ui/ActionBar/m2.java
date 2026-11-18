package org.telegram.ui.ActionBar;

import android.view.View;
public final class m2 implements ri.n, r0.m, r1 {
    public final x2 f29214a;

    public m2(x2 x2Var) {
        this.f29214a = x2Var;
    }

    @Override
    public r0.l1 P0(View view, r0.l1 l1Var) {
        return this.f29214a.b0(l1Var);
    }

    @Override
    public int e() {
        x2 x2Var = this.f29214a;
        x2Var.getClass();
        return n6.w0(n6.f29467h5, x2Var.J0);
    }

    @Override
    public void h(u1 u1Var, int i7) {
        this.f29214a.dismiss();
        bi.a2.l1(false, null);
    }
}
