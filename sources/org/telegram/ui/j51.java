package org.telegram.ui;

import android.content.Context;
import android.view.View;
public final class j51 extends org.telegram.ui.Components.n41 {
    public static final int f48912c = 0;
    public m.o3 f48913b;

    static {
        org.telegram.ui.Components.n41.h(new org.telegram.ui.Components.n41());
    }

    @Override
    public final void a(org.telegram.ui.Components.ek0 ek0Var, View view, org.telegram.ui.Components.o41 o41Var) {
        boolean z10;
        org.telegram.ui.Cells.p7 p7Var = (org.telegram.ui.Cells.p7) view;
        if (o41Var != null && o41Var.h) {
            z10 = true;
        } else {
            z10 = false;
        }
        p7Var.l(z10, false);
    }

    @Override
    public final void b(View view, org.telegram.ui.Components.o41 o41Var, boolean z10, org.telegram.ui.Components.c51 c51Var, org.telegram.ui.Components.h51 h51Var) {
        org.telegram.ui.Cells.p7 p7Var = (org.telegram.ui.Cells.p7) view;
        p7Var.k((org.telegram.messenger.gj) o41Var.H, o41Var.f38067w, false);
        p7Var.i(o41Var.f38051e, false);
        p7Var.l(o41Var.h, false);
    }

    @Override
    public final View d(Context context, org.telegram.ui.Components.ek0 ek0Var, int i7, org.telegram.ui.ActionBar.h6 h6Var) {
        if (this.f48913b == null) {
            this.f48913b = new m.o3(context, h6Var);
        }
        org.telegram.ui.Cells.p7 p7Var = new org.telegram.ui.Cells.p7(context, this.f48913b, i7);
        p7Var.f31251x0 = true;
        p7Var.f31227e0 = true;
        return p7Var;
    }

    @Override
    public final boolean e(org.telegram.ui.Components.o41 o41Var, org.telegram.ui.Components.o41 o41Var2) {
        if (o41Var.f38063r == o41Var2.f38063r && o41Var.f38051e == o41Var2.f38051e && o41Var.C == o41Var2.C) {
            return true;
        }
        return false;
    }
}
