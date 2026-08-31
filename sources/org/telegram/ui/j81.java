package org.telegram.ui;

import android.content.Context;
import android.view.View;
public final class j81 extends org.telegram.ui.Components.i51 {
    public static final int f38056a = 0;

    static {
        org.telegram.ui.Components.i51.setup(new org.telegram.ui.Components.i51());
    }

    @Override
    public final void bindView(View view, org.telegram.ui.Components.j51 j51Var, boolean z4, org.telegram.ui.Components.x51 x51Var, org.telegram.ui.Components.i61 i61Var) {
        ((k81) view).set(j51Var.f28027z);
    }

    @Override
    public final boolean contentsEquals(org.telegram.ui.Components.j51 j51Var, org.telegram.ui.Components.j51 j51Var2) {
        if (j51Var.f28027z == j51Var2.f28027z) {
            return true;
        }
        return false;
    }

    @Override
    public final View createView(Context context, org.telegram.ui.Components.tl0 tl0Var, int i10, int i11, org.telegram.ui.ActionBar.g6 g6Var) {
        return new k81(context, g6Var);
    }

    @Override
    public final boolean equals(org.telegram.ui.Components.j51 j51Var, org.telegram.ui.Components.j51 j51Var2) {
        if (j51Var.d == j51Var2.d) {
            return true;
        }
        return false;
    }
}
