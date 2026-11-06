package org.telegram.ui;

import android.content.Context;
import android.view.View;
public final class j51 extends org.telegram.ui.Components.v31 {
    public static final int f46848c = 0;
    public m.q3 f46849b;

    static {
        org.telegram.ui.Components.v31.h(new org.telegram.ui.Components.v31());
    }

    @Override
    public final void a(org.telegram.ui.Components.pj0 pj0Var, View view, org.telegram.ui.Components.w31 w31Var) {
        boolean z9;
        org.telegram.ui.Cells.o7 o7Var = (org.telegram.ui.Cells.o7) view;
        if (w31Var != null && w31Var.h) {
            z9 = true;
        } else {
            z9 = false;
        }
        o7Var.l(z9, false);
    }

    @Override
    public final void b(View view, org.telegram.ui.Components.w31 w31Var, boolean z9, org.telegram.ui.Components.k41 k41Var, org.telegram.ui.Components.p41 p41Var) {
        org.telegram.ui.Cells.o7 o7Var = (org.telegram.ui.Cells.o7) view;
        o7Var.k((org.telegram.messenger.ij) w31Var.G, w31Var.v, false);
        o7Var.i(w31Var.f39824e, false);
        o7Var.l(w31Var.h, false);
    }

    @Override
    public final View d(Context context, org.telegram.ui.Components.pj0 pj0Var, int i7, org.telegram.ui.ActionBar.f6 f6Var) {
        if (this.f46849b == null) {
            this.f46849b = new m.q3(context, f6Var);
        }
        org.telegram.ui.Cells.o7 o7Var = new org.telegram.ui.Cells.o7(context, this.f46849b, i7);
        o7Var.f29686w0 = true;
        o7Var.f29662d0 = true;
        return o7Var;
    }

    @Override
    public final boolean e(org.telegram.ui.Components.w31 w31Var, org.telegram.ui.Components.w31 w31Var2) {
        if (w31Var.f39835q == w31Var2.f39835q && w31Var.f39824e == w31Var2.f39824e && w31Var.B == w31Var2.B) {
            return true;
        }
        return false;
    }
}
