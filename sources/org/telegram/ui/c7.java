package org.telegram.ui;

import android.view.View;
public final class c7 implements org.telegram.ui.Components.cj0 {
    public final org.telegram.ui.Components.qj0 f44233a;
    public final d7 f44234b;

    public c7(d7 d7Var, org.telegram.ui.Components.qj0 qj0Var) {
        this.f44234b = d7Var;
        this.f44233a = qj0Var;
    }

    @Override
    public final void c(int i7, View view) {
        t7 t7Var = this.f44234b.f44872f;
        org.telegram.ui.Components.qj0 qj0Var = this.f44233a;
        f7 f7Var = (f7) qj0Var.getAdapter();
        m7 m7Var = (m7) f7Var.f45604e.get(i7);
        if (view instanceof org.telegram.ui.Cells.o7) {
            t7.a(t7Var, m7Var, (o7) f7Var, qj0Var);
            return;
        }
        i7 i7Var = t7Var.F;
        if (i7Var != null) {
            i7Var.o(m7Var.f47784c, m7Var.d, false);
        }
    }
}
