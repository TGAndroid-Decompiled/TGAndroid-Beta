package org.telegram.ui;

import android.view.View;
public final class fe0 implements org.telegram.ui.Components.dj0, org.telegram.ui.ActionBar.r1 {
    public final ge0 f45693a;

    public fe0(ge0 ge0Var) {
        this.f45693a = ge0Var;
    }

    @Override
    public void f(float f10, float f11, int i7, View view) {
        ge0.b0(this.f45693a, i7);
    }

    @Override
    public boolean f1(View view) {
        return false;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        ge0.a0(this.f45693a);
    }

    @Override
    public void r0(View view, float f10, float f11) {
    }
}
