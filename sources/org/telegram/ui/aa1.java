package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.MessageObject;
public final class aa1 extends org.telegram.ui.Components.k61 {
    public static final int f35718b = 0;
    public org.telegram.ui.Cells.r7 f35719a;

    static {
        org.telegram.ui.Components.k61.setup(new org.telegram.ui.Components.k61());
    }

    @Override
    public final void attachedView(org.telegram.ui.Components.lm0 lm0Var, View view, org.telegram.ui.Components.l61 l61Var) {
        boolean z10;
        org.telegram.ui.Cells.s7 s7Var = (org.telegram.ui.Cells.s7) view;
        if (l61Var != null && l61Var.h) {
            z10 = true;
        } else {
            z10 = false;
        }
        s7Var.l(z10, false);
    }

    @Override
    public final void bindView(View view, org.telegram.ui.Components.l61 l61Var, boolean z10, org.telegram.ui.Components.a71 a71Var, org.telegram.ui.Components.i71 i71Var) {
        org.telegram.ui.Cells.s7 s7Var = (org.telegram.ui.Cells.s7) view;
        s7Var.k((MessageObject) l61Var.G, l61Var.v, false);
        s7Var.i(l61Var.e, false);
        s7Var.l(l61Var.h, false);
    }

    @Override
    public final View createView(Context context, org.telegram.ui.Components.lm0 lm0Var, int i10, int i11, org.telegram.ui.ActionBar.g6 g6Var) {
        if (this.f35719a == null) {
            this.f35719a = new org.telegram.ui.Cells.r7(context, g6Var);
        }
        org.telegram.ui.Cells.s7 s7Var = new org.telegram.ui.Cells.s7(context, this.f35719a, i10);
        s7Var.f23289w0 = true;
        s7Var.f23266d0 = true;
        return s7Var;
    }

    @Override
    public final boolean equals(org.telegram.ui.Components.l61 l61Var, org.telegram.ui.Components.l61 l61Var2) {
        if (l61Var.f28232q == l61Var2.f28232q && l61Var.e == l61Var2.e && l61Var.B == l61Var2.B) {
            return true;
        }
        return false;
    }
}
