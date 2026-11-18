package org.telegram.ui;

import android.view.View;
public final class b7 implements org.telegram.ui.Components.oj0 {
    public final org.telegram.ui.Components.ck0 f45766a;
    public final c7 f45767b;

    public b7(c7 c7Var, org.telegram.ui.Components.ck0 ck0Var) {
        this.f45767b = c7Var;
        this.f45766a = ck0Var;
    }

    @Override
    public final void c(int i7, View view) {
        s7 s7Var = this.f45767b.f46441f;
        org.telegram.ui.Components.ck0 ck0Var = this.f45766a;
        e7 e7Var = (e7) ck0Var.getAdapter();
        l7 l7Var = (l7) e7Var.f47077e.get(i7);
        if (view instanceof org.telegram.ui.Cells.p7) {
            s7.a(s7Var, l7Var, (n7) e7Var, ck0Var);
            return;
        }
        h7 h7Var = s7Var.G;
        if (h7Var != null) {
            h7Var.m(l7Var.f49468c, l7Var.d, false);
        }
    }
}
