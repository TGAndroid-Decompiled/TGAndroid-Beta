package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.MessageObject;
public final class ib1 extends org.telegram.ui.Components.v51 {
    public static final int f34521b = 0;
    public org.telegram.ui.Cells.t7 f34522a;

    static {
        org.telegram.ui.Components.v51.setup(new org.telegram.ui.Components.v51());
    }

    @Override
    public final void attachedView(org.telegram.ui.Components.vl0 vl0Var, View view, org.telegram.ui.Components.w51 w51Var) {
        ((org.telegram.ui.Cells.u7) view).l(w51Var.h, false);
    }

    @Override
    public final void bindView(View view, org.telegram.ui.Components.w51 w51Var, boolean z10, org.telegram.ui.Components.k61 k61Var, org.telegram.ui.Components.s61 s61Var) {
        org.telegram.ui.Cells.u7 u7Var = (org.telegram.ui.Cells.u7) view;
        u7Var.k((MessageObject) w51Var.G, w51Var.v, false);
        u7Var.i(w51Var.e, false);
        u7Var.l(w51Var.h, false);
    }

    @Override
    public final View createView(Context context, org.telegram.ui.Components.vl0 vl0Var, int i10, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        if (this.f34522a == null) {
            this.f34522a = new org.telegram.ui.Cells.t7(context, f6Var);
        }
        org.telegram.ui.Cells.u7 u7Var = new org.telegram.ui.Cells.u7(context, this.f34522a, i10);
        u7Var.f21648w0 = true;
        u7Var.f21625d0 = true;
        return u7Var;
    }

    @Override
    public final boolean equals(org.telegram.ui.Components.w51 w51Var, org.telegram.ui.Components.w51 w51Var2) {
        if (w51Var.f29953q == w51Var2.f29953q && w51Var.e == w51Var2.e && w51Var.B == w51Var2.B) {
            return true;
        }
        return false;
    }
}
