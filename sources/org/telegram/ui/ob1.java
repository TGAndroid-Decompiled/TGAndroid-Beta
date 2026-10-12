package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.MessageObject;
public final class ob1 extends org.telegram.ui.Components.k61 {
    public static final int f38920b = 0;
    public org.telegram.ui.Cells.s7 f38921a;

    static {
        org.telegram.ui.Components.k61.setup(new org.telegram.ui.Components.k61());
    }

    @Override
    public final void attachedView(org.telegram.ui.Components.mm0 mm0Var, View view, org.telegram.ui.Components.l61 l61Var) {
        boolean z10;
        org.telegram.ui.Cells.t7 t7Var = (org.telegram.ui.Cells.t7) view;
        if (l61Var != null && l61Var.h) {
            z10 = true;
        } else {
            z10 = false;
        }
        t7Var.l(z10, false);
    }

    @Override
    public final void bindView(View view, org.telegram.ui.Components.l61 l61Var, boolean z10, org.telegram.ui.Components.z61 z61Var, org.telegram.ui.Components.h71 h71Var) {
        org.telegram.ui.Cells.t7 t7Var = (org.telegram.ui.Cells.t7) view;
        t7Var.k((MessageObject) l61Var.G, l61Var.v, false);
        t7Var.i(l61Var.e, false);
        t7Var.l(l61Var.h, false);
    }

    @Override
    public final View createView(Context context, org.telegram.ui.Components.mm0 mm0Var, int i10, int i11, org.telegram.ui.ActionBar.c6 c6Var) {
        if (this.f38921a == null) {
            this.f38921a = new org.telegram.ui.Cells.s7(context, c6Var);
        }
        org.telegram.ui.Cells.t7 t7Var = new org.telegram.ui.Cells.t7(context, this.f38921a, i10);
        t7Var.f22126w0 = true;
        t7Var.f22103d0 = true;
        return t7Var;
    }

    @Override
    public final boolean equals(org.telegram.ui.Components.l61 l61Var, org.telegram.ui.Components.l61 l61Var2) {
        if (l61Var.f26959q == l61Var2.f26959q && l61Var.e == l61Var2.e && l61Var.B == l61Var2.B) {
            return true;
        }
        return false;
    }
}
