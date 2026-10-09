package org.telegram.ui;

import android.content.Context;
import android.view.View;
public final class c91 extends org.telegram.ui.Components.o61 {
    public static final int f36593a = 0;

    static {
        org.telegram.ui.Components.o61.setup(new org.telegram.ui.Components.o61());
    }

    @Override
    public final void bindView(View view, org.telegram.ui.Components.p61 p61Var, boolean z10, org.telegram.ui.Components.c71 c71Var, org.telegram.ui.Components.k71 k71Var) {
        ((d91) view).set(p61Var.f29747z);
    }

    @Override
    public final boolean contentsEquals(org.telegram.ui.Components.p61 p61Var, org.telegram.ui.Components.p61 p61Var2) {
        if (p61Var.f29747z == p61Var2.f29747z) {
            return true;
        }
        return false;
    }

    @Override
    public final View createView(Context context, org.telegram.ui.Components.qm0 qm0Var, int i10, int i11, org.telegram.ui.ActionBar.e6 e6Var) {
        return new d91(context, e6Var);
    }

    @Override
    public final boolean equals(org.telegram.ui.Components.p61 p61Var, org.telegram.ui.Components.p61 p61Var2) {
        if (p61Var.d == p61Var2.d) {
            return true;
        }
        return false;
    }
}
