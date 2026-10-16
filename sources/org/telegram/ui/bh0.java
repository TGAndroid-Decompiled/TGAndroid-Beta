package org.telegram.ui;

import android.view.View;
public final class bh0 implements org.telegram.ui.Components.bm0, org.telegram.ui.ActionBar.z1 {
    public final dh0 f34332a;

    public bh0(dh0 dh0Var) {
        this.f34332a = dh0Var;
    }

    @Override
    public boolean c1(View view) {
        return false;
    }

    @Override
    public void d(float f7, float f10, int i10, View view) {
        dh0.W(this.f34332a, i10);
    }

    @Override
    public void g(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        dh0.U(this.f34332a);
    }

    @Override
    public void p0(View view, float f7, float f10) {
    }
}
