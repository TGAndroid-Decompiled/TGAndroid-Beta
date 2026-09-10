package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.MessageObject;
public final class mb1 extends org.telegram.ui.Components.u51 {
    public static final int f34902b = 0;
    public org.telegram.ui.Cells.t7 f34903a;

    static {
        org.telegram.ui.Components.u51.setup(new org.telegram.ui.Components.u51());
    }

    @Override
    public final void attachedView(org.telegram.ui.Components.vl0 vl0Var, View view, org.telegram.ui.Components.v51 v51Var) {
        ((org.telegram.ui.Cells.u7) view).l(v51Var.h, false);
    }

    @Override
    public final void bindView(View view, org.telegram.ui.Components.v51 v51Var, boolean z10, org.telegram.ui.Components.j61 j61Var, org.telegram.ui.Components.r61 r61Var) {
        org.telegram.ui.Cells.u7 u7Var = (org.telegram.ui.Cells.u7) view;
        u7Var.k((MessageObject) v51Var.G, v51Var.v, false);
        u7Var.i(v51Var.e, false);
        u7Var.l(v51Var.h, false);
    }

    @Override
    public final View createView(Context context, org.telegram.ui.Components.vl0 vl0Var, int i10, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        if (this.f34903a == null) {
            this.f34903a = new org.telegram.ui.Cells.t7(context, f6Var);
        }
        org.telegram.ui.Cells.u7 u7Var = new org.telegram.ui.Cells.u7(context, this.f34903a, i10);
        u7Var.f20522w0 = true;
        u7Var.f20499d0 = true;
        return u7Var;
    }

    @Override
    public final boolean equals(org.telegram.ui.Components.v51 v51Var, org.telegram.ui.Components.v51 v51Var2) {
        if (v51Var.f27834q == v51Var2.f27834q && v51Var.e == v51Var2.e && v51Var.B == v51Var2.B) {
            return true;
        }
        return false;
    }
}
