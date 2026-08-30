package org.telegram.ui;

import android.content.Context;
import android.view.View;
public final class i81 extends org.telegram.ui.Components.h51 {
    public static final int f35044a = 0;

    static {
        org.telegram.ui.Components.h51.setup(new org.telegram.ui.Components.h51());
    }

    @Override
    public final void bindView(View view, org.telegram.ui.Components.i51 i51Var, boolean z4, org.telegram.ui.Components.w51 w51Var, org.telegram.ui.Components.g61 g61Var) {
        ((j81) view).set(i51Var.f25578z);
    }

    @Override
    public final boolean contentsEquals(org.telegram.ui.Components.i51 i51Var, org.telegram.ui.Components.i51 i51Var2) {
        if (i51Var.f25578z == i51Var2.f25578z) {
            return true;
        }
        return false;
    }

    @Override
    public final View createView(Context context, org.telegram.ui.Components.sl0 sl0Var, int i10, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        return new j81(context, f6Var);
    }

    @Override
    public final boolean equals(org.telegram.ui.Components.i51 i51Var, org.telegram.ui.Components.i51 i51Var2) {
        if (i51Var.d == i51Var2.d) {
            return true;
        }
        return false;
    }
}
