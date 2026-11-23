package org.telegram.ui;

import android.content.Context;
import android.view.View;
public final class i51 extends org.telegram.ui.Components.m41 {
    public static final int f48723c = 0;
    public ga.d f48724b;

    static {
        org.telegram.ui.Components.m41.h(new org.telegram.ui.Components.m41());
    }

    @Override
    public final void a(org.telegram.ui.Components.ek0 ek0Var, View view, org.telegram.ui.Components.n41 n41Var) {
        boolean z10;
        org.telegram.ui.Cells.o7 o7Var = (org.telegram.ui.Cells.o7) view;
        if (n41Var != null && n41Var.h) {
            z10 = true;
        } else {
            z10 = false;
        }
        o7Var.l(z10, false);
    }

    @Override
    public final void b(View view, org.telegram.ui.Components.n41 n41Var, boolean z10, org.telegram.ui.Components.b51 b51Var, org.telegram.ui.Components.g51 g51Var) {
        org.telegram.ui.Cells.o7 o7Var = (org.telegram.ui.Cells.o7) view;
        o7Var.k((org.telegram.messenger.fj) n41Var.H, n41Var.f37664w, false);
        o7Var.i(n41Var.f37648e, false);
        o7Var.l(n41Var.h, false);
    }

    @Override
    public final View d(Context context, org.telegram.ui.Components.ek0 ek0Var, int i7, org.telegram.ui.ActionBar.i6 i6Var) {
        if (this.f48724b == null) {
            this.f48724b = new ga.d(context, i6Var);
        }
        org.telegram.ui.Cells.o7 o7Var = new org.telegram.ui.Cells.o7(context, this.f48724b, i7);
        o7Var.f31291x0 = true;
        o7Var.f31267e0 = true;
        return o7Var;
    }

    @Override
    public final boolean e(org.telegram.ui.Components.n41 n41Var, org.telegram.ui.Components.n41 n41Var2) {
        if (n41Var.f37660r == n41Var2.f37660r && n41Var.f37648e == n41Var2.f37648e && n41Var.C == n41Var2.C) {
            return true;
        }
        return false;
    }
}
