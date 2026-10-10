package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.MessageObject;
public final class ib1 extends org.telegram.ui.Components.p61 {
    public static final int f38648b = 0;
    public org.telegram.ui.Cells.s7 f38649a;

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
        t7Var.i(q61Var.f30057e, false);
        t7Var.l(q61Var.h, false);
    }

    @Override
    public final View createView(Context context, org.telegram.ui.Components.rm0 rm0Var, int i10, int i11, org.telegram.ui.ActionBar.e6 e6Var) {
        if (this.f38649a == null) {
            this.f38649a = new org.telegram.ui.Cells.s7(context, e6Var);
        }
        org.telegram.ui.Cells.t7 t7Var = new org.telegram.ui.Cells.t7(context, this.f38649a, i10);
        t7Var.f23095w0 = true;
        t7Var.f23071d0 = true;
        return t7Var;
    }

    @Override
    public final boolean equals(org.telegram.ui.Components.q61 q61Var, org.telegram.ui.Components.q61 q61Var2) {
        if (q61Var.f30068q == q61Var2.f30068q && q61Var.f30057e == q61Var2.f30057e && q61Var.B == q61Var2.B) {
            return true;
        }
        return false;
    }
}
