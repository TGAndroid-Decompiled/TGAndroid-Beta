package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.MessageObject;
public final class hb1 extends org.telegram.ui.Components.q61 {
    public static final int f38373b = 0;
    public org.telegram.ui.Cells.s7 f38374a;

    static {
        org.telegram.ui.Components.q61.setup(new org.telegram.ui.Components.q61());
    }

    @Override
    public final void attachedView(org.telegram.ui.Components.sm0 sm0Var, View view, org.telegram.ui.Components.r61 r61Var) {
        boolean z10;
        org.telegram.ui.Cells.t7 t7Var = (org.telegram.ui.Cells.t7) view;
        if (r61Var != null && r61Var.h) {
            z10 = true;
        } else {
            z10 = false;
        }
        t7Var.l(z10, false);
    }

    @Override
    public final void bindView(View view, org.telegram.ui.Components.r61 r61Var, boolean z10, org.telegram.ui.Components.e71 e71Var, org.telegram.ui.Components.m71 m71Var) {
        org.telegram.ui.Cells.t7 t7Var = (org.telegram.ui.Cells.t7) view;
        t7Var.k((MessageObject) r61Var.G, r61Var.v, false);
        t7Var.i(r61Var.f30355e, false);
        t7Var.l(r61Var.h, false);
    }

    @Override
    public final View createView(Context context, org.telegram.ui.Components.sm0 sm0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        if (this.f38374a == null) {
            this.f38374a = new org.telegram.ui.Cells.s7(context, d6Var);
        }
        org.telegram.ui.Cells.t7 t7Var = new org.telegram.ui.Cells.t7(context, this.f38374a, i10);
        t7Var.f23083w0 = true;
        t7Var.f23059d0 = true;
        return t7Var;
    }

    @Override
    public final boolean equals(org.telegram.ui.Components.r61 r61Var, org.telegram.ui.Components.r61 r61Var2) {
        if (r61Var.f30366q == r61Var2.f30366q && r61Var.f30355e == r61Var2.f30355e && r61Var.B == r61Var2.B) {
            return true;
        }
        return false;
    }
}
