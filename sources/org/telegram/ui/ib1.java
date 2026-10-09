package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.MessageObject;
public final class ib1 extends org.telegram.ui.Components.o61 {
    public static final int f38604b = 0;
    public org.telegram.ui.Cells.s7 f38605a;

    static {
        org.telegram.ui.Components.o61.setup(new org.telegram.ui.Components.o61());
    }

    @Override
    public final void attachedView(org.telegram.ui.Components.qm0 qm0Var, View view, org.telegram.ui.Components.p61 p61Var) {
        boolean z10;
        org.telegram.ui.Cells.t7 t7Var = (org.telegram.ui.Cells.t7) view;
        if (p61Var != null && p61Var.h) {
            z10 = true;
        } else {
            z10 = false;
        }
        t7Var.l(z10, false);
    }

    @Override
    public final void bindView(View view, org.telegram.ui.Components.p61 p61Var, boolean z10, org.telegram.ui.Components.c71 c71Var, org.telegram.ui.Components.k71 k71Var) {
        org.telegram.ui.Cells.t7 t7Var = (org.telegram.ui.Cells.t7) view;
        t7Var.k((MessageObject) p61Var.G, p61Var.v, false);
        t7Var.i(p61Var.f29728e, false);
        t7Var.l(p61Var.h, false);
    }

    @Override
    public final View createView(Context context, org.telegram.ui.Components.qm0 qm0Var, int i10, int i11, org.telegram.ui.ActionBar.e6 e6Var) {
        if (this.f38605a == null) {
            this.f38605a = new org.telegram.ui.Cells.s7(context, e6Var);
        }
        org.telegram.ui.Cells.t7 t7Var = new org.telegram.ui.Cells.t7(context, this.f38605a, i10);
        t7Var.f23091w0 = true;
        t7Var.f23067d0 = true;
        return t7Var;
    }

    @Override
    public final boolean equals(org.telegram.ui.Components.p61 p61Var, org.telegram.ui.Components.p61 p61Var2) {
        if (p61Var.f29739q == p61Var2.f29739q && p61Var.f29728e == p61Var2.f29728e && p61Var.B == p61Var2.B) {
            return true;
        }
        return false;
    }
}
