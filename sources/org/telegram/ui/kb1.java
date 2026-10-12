package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.MessageObject;
public final class kb1 extends org.telegram.ui.Components.t61 {
    public static final int f39441b = 0;
    public org.telegram.ui.Cells.s7 f39442a;

    static {
        org.telegram.ui.Components.t61.setup(new org.telegram.ui.Components.t61());
    }

    @Override
    public final void attachedView(org.telegram.ui.Components.wm0 wm0Var, View view, org.telegram.ui.Components.u61 u61Var) {
        boolean z10;
        org.telegram.ui.Cells.t7 t7Var = (org.telegram.ui.Cells.t7) view;
        if (u61Var != null && u61Var.h) {
            z10 = true;
        } else {
            z10 = false;
        }
        t7Var.l(z10, false);
    }

    @Override
    public final void bindView(View view, org.telegram.ui.Components.u61 u61Var, boolean z10, org.telegram.ui.Components.h71 h71Var, org.telegram.ui.Components.p71 p71Var) {
        org.telegram.ui.Cells.t7 t7Var = (org.telegram.ui.Cells.t7) view;
        t7Var.k((MessageObject) u61Var.G, u61Var.v, false);
        t7Var.i(u61Var.f31070e, false);
        t7Var.l(u61Var.h, false);
    }

    @Override
    public final View createView(Context context, org.telegram.ui.Components.wm0 wm0Var, int i10, int i11, org.telegram.ui.ActionBar.c6 c6Var) {
        if (this.f39442a == null) {
            this.f39442a = new org.telegram.ui.Cells.s7(context, c6Var);
        }
        org.telegram.ui.Cells.t7 t7Var = new org.telegram.ui.Cells.t7(context, this.f39442a, i10);
        t7Var.f22863w0 = true;
        t7Var.f22839d0 = true;
        return t7Var;
    }

    @Override
    public final boolean equals(org.telegram.ui.Components.u61 u61Var, org.telegram.ui.Components.u61 u61Var2) {
        if (u61Var.f31081q == u61Var2.f31081q && u61Var.f31070e == u61Var2.f31070e && u61Var.B == u61Var2.B) {
            return true;
        }
        return false;
    }
}
