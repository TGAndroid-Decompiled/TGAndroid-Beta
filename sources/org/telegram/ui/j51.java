package org.telegram.ui;

import android.content.Context;
import android.view.View;
public final class j51 extends org.telegram.ui.Components.q31 {
    public static final int f46824c = 0;
    public m.q3 f46825b;

    static {
        org.telegram.ui.Components.q31.h(new org.telegram.ui.Components.q31());
    }

    @Override
    public final void a(org.telegram.ui.Components.pj0 pj0Var, View view, org.telegram.ui.Components.r31 r31Var) {
        boolean z9;
        org.telegram.ui.Cells.o7 o7Var = (org.telegram.ui.Cells.o7) view;
        if (r31Var != null && r31Var.h) {
            z9 = true;
        } else {
            z9 = false;
        }
        o7Var.l(z9, false);
    }

    @Override
    public final void b(View view, org.telegram.ui.Components.r31 r31Var, boolean z9, org.telegram.ui.Components.f41 f41Var, org.telegram.ui.Components.k41 k41Var) {
        org.telegram.ui.Cells.o7 o7Var = (org.telegram.ui.Cells.o7) view;
        o7Var.k((org.telegram.messenger.ij) r31Var.G, r31Var.v, false);
        o7Var.i(r31Var.f37592e, false);
        o7Var.l(r31Var.h, false);
    }

    @Override
    public final View d(Context context, org.telegram.ui.Components.pj0 pj0Var, int i7, org.telegram.ui.ActionBar.f6 f6Var) {
        if (this.f46825b == null) {
            this.f46825b = new m.q3(context, f6Var);
        }
        org.telegram.ui.Cells.o7 o7Var = new org.telegram.ui.Cells.o7(context, this.f46825b, i7);
        o7Var.f29686w0 = true;
        o7Var.f29662d0 = true;
        return o7Var;
    }

    @Override
    public final boolean e(org.telegram.ui.Components.r31 r31Var, org.telegram.ui.Components.r31 r31Var2) {
        if (r31Var.f37603q == r31Var2.f37603q && r31Var.f37592e == r31Var2.f37592e && r31Var.B == r31Var2.B) {
            return true;
        }
        return false;
    }
}
