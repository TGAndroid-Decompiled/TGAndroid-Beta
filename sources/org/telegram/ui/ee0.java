package org.telegram.ui;

import android.view.View;
public final class ee0 implements org.telegram.ui.Components.rj0, org.telegram.ui.ActionBar.q1 {
    public final fe0 f47220a;

    public ee0(fe0 fe0Var) {
        this.f47220a = fe0Var;
    }

    @Override
    public boolean b1(View view) {
        return false;
    }

    @Override
    public void f(float f10, float f11, int i7, View view) {
        fe0.b0(this.f47220a, i7);
    }

    @Override
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        fe0.a0(this.f47220a);
    }

    @Override
    public void s0(View view, float f10, float f11) {
    }
}
