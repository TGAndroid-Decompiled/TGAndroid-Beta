package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.MessageObject;
public final class oa1 extends org.telegram.ui.Components.i51 {
    public static final int f39697b = 0;
    public org.telegram.ui.Cells.q7 f39698a;

    static {
        org.telegram.ui.Components.i51.setup(new org.telegram.ui.Components.i51());
    }

    @Override
    public final void attachedView(org.telegram.ui.Components.tl0 tl0Var, View view, org.telegram.ui.Components.j51 j51Var) {
        ((org.telegram.ui.Cells.r7) view).l(j51Var.h, false);
    }

    @Override
    public final void bindView(View view, org.telegram.ui.Components.j51 j51Var, boolean z4, org.telegram.ui.Components.x51 x51Var, org.telegram.ui.Components.i61 i61Var) {
        org.telegram.ui.Cells.r7 r7Var = (org.telegram.ui.Cells.r7) view;
        r7Var.k((MessageObject) j51Var.G, j51Var.v, false);
        r7Var.i(j51Var.f28008e, false);
        r7Var.l(j51Var.h, false);
    }

    @Override
    public final View createView(Context context, org.telegram.ui.Components.tl0 tl0Var, int i10, int i11, org.telegram.ui.ActionBar.g6 g6Var) {
        if (this.f39698a == null) {
            this.f39698a = new org.telegram.ui.Cells.q7(context, g6Var);
        }
        org.telegram.ui.Cells.r7 r7Var = new org.telegram.ui.Cells.r7(context, this.f39698a, i10);
        r7Var.f23583t0 = true;
        r7Var.f23558a0 = true;
        return r7Var;
    }

    @Override
    public final boolean equals(org.telegram.ui.Components.j51 j51Var, org.telegram.ui.Components.j51 j51Var2) {
        if (j51Var.f28019q == j51Var2.f28019q && j51Var.f28008e == j51Var2.f28008e && j51Var.B == j51Var2.B) {
            return true;
        }
        return false;
    }
}
