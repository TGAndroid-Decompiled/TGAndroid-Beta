package org.telegram.ui;

import android.content.Context;
import android.view.View;
public final class g51 extends org.telegram.ui.Components.a41 {
    public static final int f47349c = 0;
    public m.o3 f47350b;

    static {
        org.telegram.ui.Components.a41.h(new org.telegram.ui.Components.a41());
    }

    @Override
    public final void a(org.telegram.ui.Components.uj0 uj0Var, View view, org.telegram.ui.Components.b41 b41Var) {
        boolean z10;
        org.telegram.ui.Cells.n7 n7Var = (org.telegram.ui.Cells.n7) view;
        if (b41Var != null && b41Var.h) {
            z10 = true;
        } else {
            z10 = false;
        }
        n7Var.l(z10, false);
    }

    @Override
    public final void b(View view, org.telegram.ui.Components.b41 b41Var, boolean z10, org.telegram.ui.Components.p41 p41Var, org.telegram.ui.Components.u41 u41Var) {
        org.telegram.ui.Cells.n7 n7Var = (org.telegram.ui.Cells.n7) view;
        n7Var.k((org.telegram.messenger.gj) b41Var.G, b41Var.v, false);
        n7Var.i(b41Var.f33175e, false);
        n7Var.l(b41Var.h, false);
    }

    @Override
    public final View d(Context context, org.telegram.ui.Components.uj0 uj0Var, int i7, org.telegram.ui.ActionBar.e6 e6Var) {
        if (this.f47350b == null) {
            this.f47350b = new m.o3(context, e6Var);
        }
        org.telegram.ui.Cells.n7 n7Var = new org.telegram.ui.Cells.n7(context, this.f47350b, i7);
        n7Var.f30772x0 = true;
        n7Var.f30748e0 = true;
        return n7Var;
    }

    @Override
    public final boolean e(org.telegram.ui.Components.b41 b41Var, org.telegram.ui.Components.b41 b41Var2) {
        if (b41Var.f33186q == b41Var2.f33186q && b41Var.f33175e == b41Var2.f33175e && b41Var.B == b41Var2.B) {
            return true;
        }
        return false;
    }
}
