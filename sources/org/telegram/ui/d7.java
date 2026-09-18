package org.telegram.ui;

import android.view.View;
public final class d7 implements org.telegram.ui.Components.kl0 {
    public final org.telegram.ui.Components.wl0 f32884a;
    public final e7 f32885b;

    public d7(e7 e7Var, org.telegram.ui.Components.wl0 wl0Var) {
        this.f32885b = e7Var;
        this.f32884a = wl0Var;
    }

    @Override
    public final void d(int i10, View view) {
        t7 t7Var = this.f32885b.e;
        org.telegram.ui.Components.wl0 wl0Var = this.f32884a;
        g7 g7Var = (g7) wl0Var.getAdapter();
        n7 n7Var = (n7) g7Var.e.get(i10);
        if (view instanceof org.telegram.ui.Cells.t7) {
            t7.a(t7Var, n7Var, (p7) g7Var, wl0Var);
            return;
        }
        j7 j7Var = t7Var.E;
        if (j7Var != null) {
            j7Var.H0(n7Var.f35829c, n7Var.d, false);
        }
    }
}
