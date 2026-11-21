package org.telegram.ui;

import android.view.View;
public final class ee0 implements org.telegram.ui.Components.rj0, org.telegram.ui.ActionBar.q1 {
    public final ge0 f47247a;

    public ee0(ge0 ge0Var) {
        this.f47247a = ge0Var;
    }

    @Override
    public boolean b1(View view) {
        return false;
    }

    @Override
    public void f(float f10, float f11, int i7, View view) {
        ge0.b0(this.f47247a, i7);
    }

    @Override
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        ge0.a0(this.f47247a);
    }

    @Override
    public void s0(View view, float f10, float f11) {
    }
}
