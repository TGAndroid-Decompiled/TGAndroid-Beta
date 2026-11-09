package org.telegram.ui;

import android.content.Context;
import android.view.View;
public final class k51 extends org.telegram.ui.Components.x31 {
    public static final int f47198c = 0;
    public m.q3 f47199b;

    static {
        org.telegram.ui.Components.x31.h(new org.telegram.ui.Components.x31());
    }

    @Override
    public final void a(org.telegram.ui.Components.qj0 qj0Var, View view, org.telegram.ui.Components.y31 y31Var) {
        boolean z9;
        org.telegram.ui.Cells.o7 o7Var = (org.telegram.ui.Cells.o7) view;
        if (y31Var != null && y31Var.h) {
            z9 = true;
        } else {
            z9 = false;
        }
        o7Var.l(z9, false);
    }

    @Override
    public final void b(View view, org.telegram.ui.Components.y31 y31Var, boolean z9, org.telegram.ui.Components.m41 m41Var, org.telegram.ui.Components.r41 r41Var) {
        org.telegram.ui.Cells.o7 o7Var = (org.telegram.ui.Cells.o7) view;
        o7Var.k((org.telegram.messenger.ij) y31Var.G, y31Var.v, false);
        o7Var.i(y31Var.f40562e, false);
        o7Var.l(y31Var.h, false);
    }

    @Override
    public final View d(Context context, org.telegram.ui.Components.qj0 qj0Var, int i7, org.telegram.ui.ActionBar.g6 g6Var) {
        if (this.f47199b == null) {
            this.f47199b = new m.q3(context, g6Var);
        }
        org.telegram.ui.Cells.o7 o7Var = new org.telegram.ui.Cells.o7(context, this.f47199b, i7);
        o7Var.f29694w0 = true;
        o7Var.f29670d0 = true;
        return o7Var;
    }

    @Override
    public final boolean e(org.telegram.ui.Components.y31 y31Var, org.telegram.ui.Components.y31 y31Var2) {
        if (y31Var.f40573q == y31Var2.f40573q && y31Var.f40562e == y31Var2.f40562e && y31Var.B == y31Var2.B) {
            return true;
        }
        return false;
    }
}
