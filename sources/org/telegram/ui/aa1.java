package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.MessageObject;
public final class aa1 extends org.telegram.ui.Components.v41 {
    public static final int f36498b = 0;
    public org.telegram.ui.Cells.o7 f36499a;

    static {
        org.telegram.ui.Components.v41.setup(new org.telegram.ui.Components.v41());
    }

    @Override
    public final void attachedView(org.telegram.ui.Components.jl0 jl0Var, View view, org.telegram.ui.Components.w41 w41Var) {
        ((org.telegram.ui.Cells.p7) view).l(w41Var.h, false);
    }

    @Override
    public final void bindView(View view, org.telegram.ui.Components.w41 w41Var, boolean z10, org.telegram.ui.Components.k51 k51Var, org.telegram.ui.Components.u51 u51Var) {
        org.telegram.ui.Cells.p7 p7Var = (org.telegram.ui.Cells.p7) view;
        p7Var.k((MessageObject) w41Var.G, w41Var.v, false);
        p7Var.i(w41Var.f34294e, false);
        p7Var.l(w41Var.h, false);
    }

    @Override
    public final View createView(Context context, org.telegram.ui.Components.jl0 jl0Var, int i10, int i11, org.telegram.ui.ActionBar.c6 c6Var) {
        if (this.f36499a == null) {
            this.f36499a = new org.telegram.ui.Cells.o7(context, c6Var);
        }
        org.telegram.ui.Cells.p7 p7Var = new org.telegram.ui.Cells.p7(context, this.f36499a, i10);
        p7Var.f24999s0 = true;
        p7Var.W = true;
        return p7Var;
    }

    @Override
    public final boolean equals(org.telegram.ui.Components.w41 w41Var, org.telegram.ui.Components.w41 w41Var2) {
        if (w41Var.f34305q == w41Var2.f34305q && w41Var.f34294e == w41Var2.f34294e && w41Var.B == w41Var2.B) {
            return true;
        }
        return false;
    }
}
