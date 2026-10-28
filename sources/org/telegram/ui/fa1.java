package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.MessageObject;
public final class fa1 extends org.telegram.ui.Components.t61 {
    public static final int f39310b = 0;
    public org.telegram.ui.Cells.v7 f39311a;

    static {
        org.telegram.ui.Components.t61.setup(new org.telegram.ui.Components.t61());
    }

    @Override
    public final void attachedView(org.telegram.ui.Components.nm0 nm0Var, View view, org.telegram.ui.Components.u61 u61Var) {
        boolean z10;
        org.telegram.ui.Cells.w7 w7Var = (org.telegram.ui.Cells.w7) view;
        if (u61Var != null && u61Var.h) {
            z10 = true;
        } else {
            z10 = false;
        }
        w7Var.l(z10, false);
    }

    @Override
    public final void bindView(View view, org.telegram.ui.Components.u61 u61Var, boolean z10, org.telegram.ui.Components.k71 k71Var, org.telegram.ui.Components.s71 s71Var) {
        org.telegram.ui.Cells.w7 w7Var = (org.telegram.ui.Cells.w7) view;
        w7Var.k((MessageObject) u61Var.G, u61Var.v, false);
        w7Var.i(u61Var.e, false);
        w7Var.l(u61Var.h, false);
    }

    @Override
    public final View createView(Context context, org.telegram.ui.Components.nm0 nm0Var, int i10, int i11, org.telegram.ui.ActionBar.u6 u6Var) {
        if (this.f39311a == null) {
            this.f39311a = new org.telegram.ui.Cells.v7(context, u6Var);
        }
        org.telegram.ui.Cells.w7 w7Var = new org.telegram.ui.Cells.w7(context, this.f39311a, i10);
        w7Var.f25665w0 = true;
        w7Var.f25642d0 = true;
        return w7Var;
    }

    @Override
    public final boolean equals(org.telegram.ui.Components.u61 u61Var, org.telegram.ui.Components.u61 u61Var2) {
        if (u61Var.f33254q == u61Var2.f33254q && u61Var.e == u61Var2.e && u61Var.B == u61Var2.B) {
            return true;
        }
        return false;
    }
}
