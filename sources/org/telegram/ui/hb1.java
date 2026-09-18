package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.MessageObject;
public final class hb1 extends org.telegram.ui.Components.i51 {
    public static final int f34231b = 0;
    public org.telegram.ui.Cells.s7 f34232a;

    static {
        org.telegram.ui.Components.i51.setup(new org.telegram.ui.Components.i51());
    }

    @Override
    public final void attachedView(org.telegram.ui.Components.ml0 ml0Var, View view, org.telegram.ui.Components.j51 j51Var) {
        ((org.telegram.ui.Cells.t7) view).l(j51Var.h, false);
    }

    @Override
    public final void bindView(View view, org.telegram.ui.Components.j51 j51Var, boolean z10, org.telegram.ui.Components.x51 x51Var, org.telegram.ui.Components.f61 f61Var) {
        org.telegram.ui.Cells.t7 t7Var = (org.telegram.ui.Cells.t7) view;
        t7Var.k((MessageObject) j51Var.G, j51Var.v, false);
        t7Var.i(j51Var.e, false);
        t7Var.l(j51Var.h, false);
    }

    @Override
    public final View createView(Context context, org.telegram.ui.Components.ml0 ml0Var, int i10, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        if (this.f34232a == null) {
            this.f34232a = new org.telegram.ui.Cells.s7(context, f6Var);
        }
        org.telegram.ui.Cells.t7 t7Var = new org.telegram.ui.Cells.t7(context, this.f34232a, i10);
        t7Var.f21411w0 = true;
        t7Var.f21388d0 = true;
        return t7Var;
    }

    @Override
    public final boolean equals(org.telegram.ui.Components.j51 j51Var, org.telegram.ui.Components.j51 j51Var2) {
        if (j51Var.f25132q == j51Var2.f25132q && j51Var.e == j51Var2.e && j51Var.B == j51Var2.B) {
            return true;
        }
        return false;
    }
}
