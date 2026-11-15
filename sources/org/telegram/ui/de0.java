package org.telegram.ui;

import android.view.View;
public final class de0 implements org.telegram.ui.Components.hj0, org.telegram.ui.ActionBar.q1 {
    public final ee0 f46349a;

    public de0(ee0 ee0Var) {
        this.f46349a = ee0Var;
    }

    @Override
    public boolean c1(View view) {
        return false;
    }

    @Override
    public void f(float f10, float f11, int i7, View view) {
        ee0.b0(this.f46349a, i7);
    }

    @Override
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        ee0.a0(this.f46349a);
    }

    @Override
    public void r0(View view, float f10, float f11) {
    }
}
