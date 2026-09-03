package org.telegram.ui;

import android.content.Context;
import android.view.View;
public final class p81 extends org.telegram.ui.Components.g51 {
    public static final int f39919a = 0;

    static {
        org.telegram.ui.Components.g51.setup(new org.telegram.ui.Components.g51());
    }

    @Override
    public final void bindView(View view, org.telegram.ui.Components.h51 h51Var, boolean z4, org.telegram.ui.Components.w51 w51Var, org.telegram.ui.Components.h61 h61Var) {
        ((q81) view).set(h51Var.f27388z);
    }

    @Override
    public final boolean contentsEquals(org.telegram.ui.Components.h51 h51Var, org.telegram.ui.Components.h51 h51Var2) {
        if (h51Var.f27388z == h51Var2.f27388z) {
            return true;
        }
        return false;
    }

    @Override
    public final View createView(Context context, org.telegram.ui.Components.sl0 sl0Var, int i10, int i11, org.telegram.ui.ActionBar.g6 g6Var) {
        return new q81(context, g6Var);
    }

    @Override
    public final boolean equals(org.telegram.ui.Components.h51 h51Var, org.telegram.ui.Components.h51 h51Var2) {
        if (h51Var.d == h51Var2.d) {
            return true;
        }
        return false;
    }
}
