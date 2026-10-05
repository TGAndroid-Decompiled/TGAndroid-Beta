package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.MessageObject;
public final class ab1 extends org.telegram.ui.Components.g61 {
    public static final int f34830b = 0;
    public org.telegram.ui.Cells.s7 f34831a;

    static {
        org.telegram.ui.Components.g61.setup(new org.telegram.ui.Components.g61());
    }

    @Override
    public final void attachedView(org.telegram.ui.Components.zl0 zl0Var, View view, org.telegram.ui.Components.h61 h61Var) {
        boolean z10;
        org.telegram.ui.Cells.t7 t7Var = (org.telegram.ui.Cells.t7) view;
        if (h61Var != null && h61Var.h) {
            z10 = true;
        } else {
            z10 = false;
        }
        t7Var.l(z10, false);
    }

    @Override
    public final void bindView(View view, org.telegram.ui.Components.h61 h61Var, boolean z10, org.telegram.ui.Components.w61 w61Var, org.telegram.ui.Components.e71 e71Var) {
        org.telegram.ui.Cells.t7 t7Var = (org.telegram.ui.Cells.t7) view;
        t7Var.k((MessageObject) h61Var.G, h61Var.v, false);
        t7Var.i(h61Var.f27087e, false);
        t7Var.l(h61Var.h, false);
    }

    @Override
    public final View createView(Context context, org.telegram.ui.Components.zl0 zl0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        if (this.f34831a == null) {
            this.f34831a = new org.telegram.ui.Cells.s7(context, d6Var);
        }
        org.telegram.ui.Cells.t7 t7Var = new org.telegram.ui.Cells.t7(context, this.f34831a, i10);
        t7Var.f23105w0 = true;
        t7Var.f23081d0 = true;
        return t7Var;
    }

    @Override
    public final boolean equals(org.telegram.ui.Components.h61 h61Var, org.telegram.ui.Components.h61 h61Var2) {
        if (h61Var.f27098q == h61Var2.f27098q && h61Var.f27087e == h61Var2.f27087e && h61Var.B == h61Var2.B) {
            return true;
        }
        return false;
    }
}
