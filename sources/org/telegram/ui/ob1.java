package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.MessageObject;
public final class ob1 extends org.telegram.ui.Components.l61 {
    public static final int f38600b = 0;
    public org.telegram.ui.Cells.s7 f38601a;

    static {
        org.telegram.ui.Components.l61.setup(new org.telegram.ui.Components.l61());
    }

    @Override
    public final void attachedView(org.telegram.ui.Components.mm0 mm0Var, View view, org.telegram.ui.Components.m61 m61Var) {
        boolean z10;
        org.telegram.ui.Cells.t7 t7Var = (org.telegram.ui.Cells.t7) view;
        if (m61Var != null && m61Var.h) {
            z10 = true;
        } else {
            z10 = false;
        }
        t7Var.l(z10, false);
    }

    @Override
    public final void bindView(View view, org.telegram.ui.Components.m61 m61Var, boolean z10, org.telegram.ui.Components.a71 a71Var, org.telegram.ui.Components.i71 i71Var) {
        org.telegram.ui.Cells.t7 t7Var = (org.telegram.ui.Cells.t7) view;
        t7Var.k((MessageObject) m61Var.G, m61Var.v, false);
        t7Var.i(m61Var.e, false);
        t7Var.l(m61Var.h, false);
    }

    @Override
    public final View createView(Context context, org.telegram.ui.Components.mm0 mm0Var, int i10, int i11, org.telegram.ui.ActionBar.c6 c6Var) {
        if (this.f38601a == null) {
            this.f38601a = new org.telegram.ui.Cells.s7(context, c6Var);
        }
        org.telegram.ui.Cells.t7 t7Var = new org.telegram.ui.Cells.t7(context, this.f38601a, i10);
        t7Var.f21829w0 = true;
        t7Var.f21806d0 = true;
        return t7Var;
    }

    @Override
    public final boolean equals(org.telegram.ui.Components.m61 m61Var, org.telegram.ui.Components.m61 m61Var2) {
        if (m61Var.f26951q == m61Var2.f26951q && m61Var.e == m61Var2.e && m61Var.B == m61Var2.B) {
            return true;
        }
        return false;
    }
}
