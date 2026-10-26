package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.MessageObject;
public final class da1 extends org.telegram.ui.Components.s61 {
    public static final int f38811b = 0;
    public org.telegram.ui.Cells.v7 f38812a;

    static {
        org.telegram.ui.Components.s61.setup(new org.telegram.ui.Components.s61());
    }

    @Override
    public final void attachedView(org.telegram.ui.Components.mm0 mm0Var, View view, org.telegram.ui.Components.t61 t61Var) {
        boolean z10;
        org.telegram.ui.Cells.w7 w7Var = (org.telegram.ui.Cells.w7) view;
        if (t61Var != null && t61Var.h) {
            z10 = true;
        } else {
            z10 = false;
        }
        w7Var.l(z10, false);
    }

    @Override
    public final void bindView(View view, org.telegram.ui.Components.t61 t61Var, boolean z10, org.telegram.ui.Components.j71 j71Var, org.telegram.ui.Components.r71 r71Var) {
        org.telegram.ui.Cells.w7 w7Var = (org.telegram.ui.Cells.w7) view;
        w7Var.k((MessageObject) t61Var.G, t61Var.v, false);
        w7Var.i(t61Var.e, false);
        w7Var.l(t61Var.h, false);
    }

    @Override
    public final View createView(Context context, org.telegram.ui.Components.mm0 mm0Var, int i10, int i11, org.telegram.ui.ActionBar.u6 u6Var) {
        if (this.f38812a == null) {
            this.f38812a = new org.telegram.ui.Cells.v7(context, u6Var);
        }
        org.telegram.ui.Cells.w7 w7Var = new org.telegram.ui.Cells.w7(context, this.f38812a, i10);
        w7Var.f25663w0 = true;
        w7Var.f25640d0 = true;
        return w7Var;
    }

    @Override
    public final boolean equals(org.telegram.ui.Components.t61 t61Var, org.telegram.ui.Components.t61 t61Var2) {
        if (t61Var.f32880q == t61Var2.f32880q && t61Var.e == t61Var2.e && t61Var.B == t61Var2.B) {
            return true;
        }
        return false;
    }
}
