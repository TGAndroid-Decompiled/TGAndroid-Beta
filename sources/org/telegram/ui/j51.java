package org.telegram.ui;

import android.content.Context;
import android.view.View;
public final class j51 extends org.telegram.ui.Components.k41 {
    public static final int f48883c = 0;
    public m.o3 f48884b;

    static {
        org.telegram.ui.Components.k41.h(new org.telegram.ui.Components.k41());
    }

    @Override
    public final void a(org.telegram.ui.Components.ck0 ck0Var, View view, org.telegram.ui.Components.l41 l41Var) {
        boolean z10;
        org.telegram.ui.Cells.o7 o7Var = (org.telegram.ui.Cells.o7) view;
        if (l41Var != null && l41Var.h) {
            z10 = true;
        } else {
            z10 = false;
        }
        o7Var.l(z10, false);
    }

    @Override
    public final void b(View view, org.telegram.ui.Components.l41 l41Var, boolean z10, org.telegram.ui.Components.z41 z41Var, org.telegram.ui.Components.e51 e51Var) {
        org.telegram.ui.Cells.o7 o7Var = (org.telegram.ui.Cells.o7) view;
        o7Var.k((org.telegram.messenger.fj) l41Var.H, l41Var.f37027w, false);
        o7Var.i(l41Var.f37011e, false);
        o7Var.l(l41Var.h, false);
    }

    @Override
    public final View d(Context context, org.telegram.ui.Components.ck0 ck0Var, int i7, org.telegram.ui.ActionBar.i6 i6Var) {
        if (this.f48884b == null) {
            this.f48884b = new m.o3(context, i6Var);
        }
        org.telegram.ui.Cells.o7 o7Var = new org.telegram.ui.Cells.o7(context, this.f48884b, i7);
        o7Var.f31207x0 = true;
        o7Var.f31183e0 = true;
        return o7Var;
    }

    @Override
    public final boolean e(org.telegram.ui.Components.l41 l41Var, org.telegram.ui.Components.l41 l41Var2) {
        if (l41Var.f37023r == l41Var2.f37023r && l41Var.f37011e == l41Var2.f37011e && l41Var.C == l41Var2.C) {
            return true;
        }
        return false;
    }
}
