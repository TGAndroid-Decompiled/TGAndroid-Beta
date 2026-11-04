package org.telegram.ui.ActionBar;

import android.view.View;
public final class i2 implements r0.m, p1 {
    public final t2 f27591a;

    public i2(t2 t2Var) {
        this.f27591a = t2Var;
    }

    @Override
    public r0.k1 R0(View view, r0.k1 k1Var) {
        return this.f27591a.b0(k1Var);
    }

    @Override
    public void g(s1 s1Var, int i3) {
        this.f27591a.dismiss();
        xg.e1.l1(0, null);
    }
}
