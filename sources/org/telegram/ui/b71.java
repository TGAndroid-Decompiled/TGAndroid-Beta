package org.telegram.ui;

import android.content.Context;
import android.view.View;
public final class b71 extends org.telegram.ui.Components.z41 {
    public static final int f36122c = 0;
    public m.p3 f36123b;

    static {
        org.telegram.ui.Components.z41.h(new org.telegram.ui.Components.z41());
    }

    @Override
    public final void a(org.telegram.ui.Components.tk0 tk0Var, View view, org.telegram.ui.Components.a51 a51Var) {
        boolean z10;
        org.telegram.ui.Cells.s7 s7Var = (org.telegram.ui.Cells.s7) view;
        if (a51Var != null && a51Var.h) {
            z10 = true;
        } else {
            z10 = false;
        }
        s7Var.l(z10, false);
    }

    @Override
    public final void b(View view, org.telegram.ui.Components.a51 a51Var, boolean z10, org.telegram.ui.Components.p51 p51Var, org.telegram.ui.Components.u51 u51Var) {
        org.telegram.ui.Cells.s7 s7Var = (org.telegram.ui.Cells.s7) view;
        s7Var.k((org.telegram.messenger.jj) a51Var.G, a51Var.v, false);
        s7Var.i(a51Var.e, false);
        s7Var.l(a51Var.h, false);
    }

    @Override
    public final View d(Context context, org.telegram.ui.Components.tk0 tk0Var, int i10, org.telegram.ui.ActionBar.p6 p6Var) {
        if (this.f36123b == null) {
            this.f36123b = new m.p3(context, p6Var);
        }
        org.telegram.ui.Cells.s7 s7Var = new org.telegram.ui.Cells.s7(context, this.f36123b, i10);
        s7Var.f23046w0 = true;
        s7Var.f23023d0 = true;
        return s7Var;
    }

    @Override
    public final boolean e(org.telegram.ui.Components.a51 a51Var, org.telegram.ui.Components.a51 a51Var2) {
        if (a51Var.f24297q == a51Var2.f24297q && a51Var.e == a51Var2.e && a51Var.B == a51Var2.B) {
            return true;
        }
        return false;
    }
}
