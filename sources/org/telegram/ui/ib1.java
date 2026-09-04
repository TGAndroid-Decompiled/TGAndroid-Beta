package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.MessageObject;
public final class ib1 extends org.telegram.ui.Components.g51 {
    public static final int f37291b = 0;
    public org.telegram.ui.Cells.s7 f37292a;

    static {
        org.telegram.ui.Components.g51.setup(new org.telegram.ui.Components.g51());
    }

    @Override
    public final void attachedView(org.telegram.ui.Components.ll0 ll0Var, View view, org.telegram.ui.Components.h51 h51Var) {
        ((org.telegram.ui.Cells.t7) view).l(h51Var.h, false);
    }

    @Override
    public final void bindView(View view, org.telegram.ui.Components.h51 h51Var, boolean z10, org.telegram.ui.Components.v51 v51Var, org.telegram.ui.Components.d61 d61Var) {
        org.telegram.ui.Cells.t7 t7Var = (org.telegram.ui.Cells.t7) view;
        t7Var.k((MessageObject) h51Var.G, h51Var.v, false);
        t7Var.i(h51Var.f26588e, false);
        t7Var.l(h51Var.h, false);
    }

    @Override
    public final View createView(Context context, org.telegram.ui.Components.ll0 ll0Var, int i10, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        if (this.f37292a == null) {
            this.f37292a = new org.telegram.ui.Cells.s7(context, f6Var);
        }
        org.telegram.ui.Cells.t7 t7Var = new org.telegram.ui.Cells.t7(context, this.f37292a, i10);
        t7Var.f23288w0 = true;
        t7Var.f23264d0 = true;
        return t7Var;
    }

    @Override
    public final boolean equals(org.telegram.ui.Components.h51 h51Var, org.telegram.ui.Components.h51 h51Var2) {
        if (h51Var.f26599q == h51Var2.f26599q && h51Var.f26588e == h51Var2.f26588e && h51Var.B == h51Var2.B) {
            return true;
        }
        return false;
    }
}
