package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.MessageObject;
public final class ib1 extends org.telegram.ui.Components.x51 {
    public static final int f34541b = 0;
    public org.telegram.ui.Cells.t7 f34542a;

    static {
        org.telegram.ui.Components.x51.setup(new org.telegram.ui.Components.x51());
    }

    @Override
    public final void attachedView(org.telegram.ui.Components.yl0 yl0Var, View view, org.telegram.ui.Components.y51 y51Var) {
        ((org.telegram.ui.Cells.u7) view).l(y51Var.h, false);
    }

    @Override
    public final void bindView(View view, org.telegram.ui.Components.y51 y51Var, boolean z10, org.telegram.ui.Components.m61 m61Var, org.telegram.ui.Components.u61 u61Var) {
        org.telegram.ui.Cells.u7 u7Var = (org.telegram.ui.Cells.u7) view;
        u7Var.k((MessageObject) y51Var.G, y51Var.v, false);
        u7Var.i(y51Var.e, false);
        u7Var.l(y51Var.h, false);
    }

    @Override
    public final View createView(Context context, org.telegram.ui.Components.yl0 yl0Var, int i10, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        if (this.f34542a == null) {
            this.f34542a = new org.telegram.ui.Cells.t7(context, f6Var);
        }
        org.telegram.ui.Cells.u7 u7Var = new org.telegram.ui.Cells.u7(context, this.f34542a, i10);
        u7Var.f21663w0 = true;
        u7Var.f21640d0 = true;
        return u7Var;
    }

    @Override
    public final boolean equals(org.telegram.ui.Components.y51 y51Var, org.telegram.ui.Components.y51 y51Var2) {
        if (y51Var.f30523q == y51Var2.f30523q && y51Var.e == y51Var2.e && y51Var.B == y51Var2.B) {
            return true;
        }
        return false;
    }
}
