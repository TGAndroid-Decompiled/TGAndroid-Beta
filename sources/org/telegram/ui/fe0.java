package org.telegram.ui;

import android.view.View;
public final class fe0 implements org.telegram.ui.Components.pj0, org.telegram.ui.ActionBar.r1 {
    public final ge0 f47603a;

    public fe0(ge0 ge0Var) {
        this.f47603a = ge0Var;
    }

    @Override
    public boolean b1(View view) {
        return false;
    }

    @Override
    public void f(float f10, float f11, int i7, View view) {
        ge0.b0(this.f47603a, i7);
    }

    @Override
    public void h(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        ge0.a0(this.f47603a);
    }

    @Override
    public void s0(View view, float f10, float f11) {
    }
}
