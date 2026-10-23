package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.MessageObject;
public final class ba1 extends org.telegram.ui.Components.l61 {
    public static final int f36006b = 0;
    public org.telegram.ui.Cells.r7 f36007a;

    static {
        org.telegram.ui.Components.l61.setup(new org.telegram.ui.Components.l61());
    }

    @Override
    public final void attachedView(org.telegram.ui.Components.mm0 mm0Var, View view, org.telegram.ui.Components.m61 m61Var) {
        boolean z10;
        org.telegram.ui.Cells.s7 s7Var = (org.telegram.ui.Cells.s7) view;
        if (m61Var != null && m61Var.h) {
            z10 = true;
        } else {
            z10 = false;
        }
        s7Var.l(z10, false);
    }

    @Override
    public final void bindView(View view, org.telegram.ui.Components.m61 m61Var, boolean z10, org.telegram.ui.Components.b71 b71Var, org.telegram.ui.Components.j71 j71Var) {
        org.telegram.ui.Cells.s7 s7Var = (org.telegram.ui.Cells.s7) view;
        s7Var.k((MessageObject) m61Var.G, m61Var.v, false);
        s7Var.i(m61Var.e, false);
        s7Var.l(m61Var.h, false);
    }

    @Override
    public final View createView(Context context, org.telegram.ui.Components.mm0 mm0Var, int i10, int i11, org.telegram.ui.ActionBar.g6 g6Var) {
        if (this.f36007a == null) {
            this.f36007a = new org.telegram.ui.Cells.r7(context, g6Var);
        }
        org.telegram.ui.Cells.s7 s7Var = new org.telegram.ui.Cells.s7(context, this.f36007a, i10);
        s7Var.f23288w0 = true;
        s7Var.f23265d0 = true;
        return s7Var;
    }

    @Override
    public final boolean equals(org.telegram.ui.Components.m61 m61Var, org.telegram.ui.Components.m61 m61Var2) {
        if (m61Var.f28564q == m61Var2.f28564q && m61Var.e == m61Var2.e && m61Var.B == m61Var2.B) {
            return true;
        }
        return false;
    }
}
