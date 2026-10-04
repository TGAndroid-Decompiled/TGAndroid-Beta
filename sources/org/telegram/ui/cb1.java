package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.MessageObject;
public final class cb1 extends org.telegram.ui.Components.f61 {
    public static final int f35397b = 0;
    public org.telegram.ui.Cells.s7 f35398a;

    static {
        org.telegram.ui.Components.f61.setup(new org.telegram.ui.Components.f61());
    }

    @Override
    public final void attachedView(org.telegram.ui.Components.zl0 zl0Var, View view, org.telegram.ui.Components.g61 g61Var) {
        ((org.telegram.ui.Cells.t7) view).l(g61Var.h, false);
    }

    @Override
    public final void bindView(View view, org.telegram.ui.Components.g61 g61Var, boolean z10, org.telegram.ui.Components.u61 u61Var, org.telegram.ui.Components.c71 c71Var) {
        org.telegram.ui.Cells.t7 t7Var = (org.telegram.ui.Cells.t7) view;
        t7Var.k((MessageObject) g61Var.G, g61Var.v, false);
        t7Var.i(g61Var.f26662e, false);
        t7Var.l(g61Var.h, false);
    }

    @Override
    public final View createView(Context context, org.telegram.ui.Components.zl0 zl0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        if (this.f35398a == null) {
            this.f35398a = new org.telegram.ui.Cells.s7(context, d6Var);
        }
        org.telegram.ui.Cells.t7 t7Var = new org.telegram.ui.Cells.t7(context, this.f35398a, i10);
        t7Var.f23097w0 = true;
        t7Var.f23073d0 = true;
        return t7Var;
    }

    @Override
    public final boolean equals(org.telegram.ui.Components.g61 g61Var, org.telegram.ui.Components.g61 g61Var2) {
        if (g61Var.f26673q == g61Var2.f26673q && g61Var.f26662e == g61Var2.f26662e && g61Var.B == g61Var2.B) {
            return true;
        }
        return false;
    }
}
