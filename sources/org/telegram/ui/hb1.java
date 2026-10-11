package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.MessageObject;
public final class hb1 extends org.telegram.ui.Components.p61 {
    public static final int f38407b = 0;
    public org.telegram.ui.Cells.s7 f38408a;

    static {
        org.telegram.ui.Components.p61.setup(new org.telegram.ui.Components.p61());
    }

    @Override
    public final void attachedView(org.telegram.ui.Components.rm0 rm0Var, View view, org.telegram.ui.Components.q61 q61Var) {
        boolean z10;
        org.telegram.ui.Cells.t7 t7Var = (org.telegram.ui.Cells.t7) view;
        if (q61Var != null && q61Var.h) {
            z10 = true;
        } else {
            z10 = false;
        }
        t7Var.l(z10, false);
    }

    @Override
    public final void bindView(View view, org.telegram.ui.Components.q61 q61Var, boolean z10, org.telegram.ui.Components.d71 d71Var, org.telegram.ui.Components.l71 l71Var) {
        org.telegram.ui.Cells.t7 t7Var = (org.telegram.ui.Cells.t7) view;
        t7Var.k((MessageObject) q61Var.G, q61Var.v, false);
        t7Var.i(q61Var.f30161e, false);
        t7Var.l(q61Var.h, false);
    }

    @Override
    public final View createView(Context context, org.telegram.ui.Components.rm0 rm0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        if (this.f38408a == null) {
            this.f38408a = new org.telegram.ui.Cells.s7(context, d6Var);
        }
        org.telegram.ui.Cells.t7 t7Var = new org.telegram.ui.Cells.t7(context, this.f38408a, i10);
        t7Var.f23119w0 = true;
        t7Var.f23095d0 = true;
        return t7Var;
    }

    @Override
    public final boolean equals(org.telegram.ui.Components.q61 q61Var, org.telegram.ui.Components.q61 q61Var2) {
        if (q61Var.f30172q == q61Var2.f30172q && q61Var.f30161e == q61Var2.f30161e && q61Var.B == q61Var2.B) {
            return true;
        }
        return false;
    }
}
