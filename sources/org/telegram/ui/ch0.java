package org.telegram.ui;

import android.view.View;
public final class ch0 implements org.telegram.ui.Components.bm0, org.telegram.ui.ActionBar.z1 {
    public final eh0 f34950a;

    public ch0(eh0 eh0Var) {
        this.f34950a = eh0Var;
    }

    @Override
    public boolean c1(View view) {
        return false;
    }

    @Override
    public void d(float f7, float f10, int i10, View view) {
        eh0.W(this.f34950a, i10);
    }

    @Override
    public void g(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        eh0.U(this.f34950a);
    }

    @Override
    public void p0(View view, float f7, float f10) {
    }
}
