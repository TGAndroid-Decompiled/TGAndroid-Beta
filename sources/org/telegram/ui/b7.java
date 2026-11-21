package org.telegram.ui;

import android.view.View;
public final class b7 implements org.telegram.ui.Components.qj0 {
    public final org.telegram.ui.Components.ek0 f45795a;
    public final c7 f45796b;

    public b7(c7 c7Var, org.telegram.ui.Components.ek0 ek0Var) {
        this.f45796b = c7Var;
        this.f45795a = ek0Var;
    }

    @Override
    public final void c(int i7, View view) {
        s7 s7Var = this.f45796b.f46473f;
        org.telegram.ui.Components.ek0 ek0Var = this.f45795a;
        e7 e7Var = (e7) ek0Var.getAdapter();
        l7 l7Var = (l7) e7Var.f47150e.get(i7);
        if (view instanceof org.telegram.ui.Cells.p7) {
            s7.a(s7Var, l7Var, (n7) e7Var, ek0Var);
            return;
        }
        h7 h7Var = s7Var.G;
        if (h7Var != null) {
            h7Var.m(l7Var.f49508c, l7Var.d, false);
        }
    }
}
