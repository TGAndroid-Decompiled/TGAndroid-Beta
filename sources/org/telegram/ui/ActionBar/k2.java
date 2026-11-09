package org.telegram.ui.ActionBar;

import android.view.View;
public final class k2 implements r0.m, r1 {
    public final v2 f27698a;

    public k2(v2 v2Var) {
        this.f27698a = v2Var;
    }

    @Override
    public r0.k1 S0(View view, r0.k1 k1Var) {
        return this.f27698a.b0(k1Var);
    }

    @Override
    public void g(u1 u1Var, int i7) {
        this.f27698a.dismiss();
        wg.f1.l1(0, null);
    }
}
