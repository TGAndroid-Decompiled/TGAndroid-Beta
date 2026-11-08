package org.telegram.ui;

import android.view.View;
public final class de0 implements org.telegram.ui.Components.cj0, org.telegram.ui.ActionBar.r1 {
    public final ee0 f45051a;

    public de0(ee0 ee0Var) {
        this.f45051a = ee0Var;
    }

    @Override
    public void f(float f10, float f11, int i7, View view) {
        ee0.b0(this.f45051a, i7);
    }

    @Override
    public boolean f1(View view) {
        return false;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        ee0.a0(this.f45051a);
    }

    @Override
    public void r0(View view, float f10, float f11) {
    }
}
