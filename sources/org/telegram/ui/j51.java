package org.telegram.ui;

import android.content.Context;
import android.view.View;
public final class j51 extends org.telegram.ui.Components.w31 {
    public static final int f46850c = 0;
    public m.q3 f46851b;

    static {
        org.telegram.ui.Components.w31.h(new org.telegram.ui.Components.w31());
    }

    @Override
    public final void a(org.telegram.ui.Components.pj0 pj0Var, View view, org.telegram.ui.Components.x31 x31Var) {
        boolean z9;
        org.telegram.ui.Cells.o7 o7Var = (org.telegram.ui.Cells.o7) view;
        if (x31Var != null && x31Var.h) {
            z9 = true;
        } else {
            z9 = false;
        }
        o7Var.l(z9, false);
    }

    @Override
    public final void b(View view, org.telegram.ui.Components.x31 x31Var, boolean z9, org.telegram.ui.Components.l41 l41Var, org.telegram.ui.Components.q41 q41Var) {
        org.telegram.ui.Cells.o7 o7Var = (org.telegram.ui.Cells.o7) view;
        o7Var.k((org.telegram.messenger.ij) x31Var.G, x31Var.v, false);
        o7Var.i(x31Var.f40174e, false);
        o7Var.l(x31Var.h, false);
    }

    @Override
    public final View d(Context context, org.telegram.ui.Components.pj0 pj0Var, int i7, org.telegram.ui.ActionBar.f6 f6Var) {
        if (this.f46851b == null) {
            this.f46851b = new m.q3(context, f6Var);
        }
        org.telegram.ui.Cells.o7 o7Var = new org.telegram.ui.Cells.o7(context, this.f46851b, i7);
        o7Var.f29690w0 = true;
        o7Var.f29666d0 = true;
        return o7Var;
    }

    @Override
    public final boolean e(org.telegram.ui.Components.x31 x31Var, org.telegram.ui.Components.x31 x31Var2) {
        if (x31Var.f40185q == x31Var2.f40185q && x31Var.f40174e == x31Var2.f40174e && x31Var.B == x31Var2.B) {
            return true;
        }
        return false;
    }
}
