package org.telegram.ui;

import android.view.View;
public final class d7 implements org.telegram.ui.Components.al0 {
    public final org.telegram.ui.Components.ml0 f32526a;
    public final e7 f32527b;

    public d7(e7 e7Var, org.telegram.ui.Components.ml0 ml0Var) {
        this.f32527b = e7Var;
        this.f32526a = ml0Var;
    }

    @Override
    public final void d(int i10, View view) {
        s7 s7Var = this.f32527b.d;
        org.telegram.ui.Components.ml0 ml0Var = this.f32526a;
        f7 f7Var = (f7) ml0Var.getAdapter();
        m7 m7Var = (m7) f7Var.e.get(i10);
        if (view instanceof org.telegram.ui.Cells.t7) {
            s7.a(s7Var, m7Var, (o7) f7Var, ml0Var);
            return;
        }
        i7 i7Var = s7Var.v;
        if (i7Var != null) {
            i7Var.H0(m7Var.f35165c, m7Var.d, false);
        }
    }
}
