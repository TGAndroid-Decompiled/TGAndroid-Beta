package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.MessageObject;
public final class fb1 extends org.telegram.ui.Components.h51 {
    public static final int f33530b = 0;
    public org.telegram.ui.Cells.s7 f33531a;

    static {
        org.telegram.ui.Components.h51.setup(new org.telegram.ui.Components.h51());
    }

    @Override
    public final void attachedView(org.telegram.ui.Components.ll0 ll0Var, View view, org.telegram.ui.Components.i51 i51Var) {
        ((org.telegram.ui.Cells.t7) view).l(i51Var.h, false);
    }

    @Override
    public final void bindView(View view, org.telegram.ui.Components.i51 i51Var, boolean z10, org.telegram.ui.Components.w51 w51Var, org.telegram.ui.Components.e61 e61Var) {
        org.telegram.ui.Cells.t7 t7Var = (org.telegram.ui.Cells.t7) view;
        t7Var.k((MessageObject) i51Var.G, i51Var.v, false);
        t7Var.i(i51Var.e, false);
        t7Var.l(i51Var.h, false);
    }

    @Override
    public final View createView(Context context, org.telegram.ui.Components.ll0 ll0Var, int i10, int i11, org.telegram.ui.ActionBar.e6 e6Var) {
        if (this.f33531a == null) {
            this.f33531a = new org.telegram.ui.Cells.s7(context, e6Var);
        }
        org.telegram.ui.Cells.t7 t7Var = new org.telegram.ui.Cells.t7(context, this.f33531a, i10);
        t7Var.f21400w0 = true;
        t7Var.f21377d0 = true;
        return t7Var;
    }

    @Override
    public final boolean equals(org.telegram.ui.Components.i51 i51Var, org.telegram.ui.Components.i51 i51Var2) {
        if (i51Var.f24899q == i51Var2.f24899q && i51Var.e == i51Var2.e && i51Var.B == i51Var2.B) {
            return true;
        }
        return false;
    }
}
