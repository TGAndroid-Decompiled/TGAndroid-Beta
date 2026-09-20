package org.telegram.ui;

import android.content.Context;
import android.view.View;
public final class c91 extends org.telegram.ui.Components.v51 {
    public static final int f32683a = 0;

    static {
        org.telegram.ui.Components.v51.setup(new org.telegram.ui.Components.v51());
    }

    @Override
    public final void bindView(View view, org.telegram.ui.Components.w51 w51Var, boolean z10, org.telegram.ui.Components.k61 k61Var, org.telegram.ui.Components.s61 s61Var) {
        ((d91) view).set(w51Var.f29961z);
    }

    @Override
    public final boolean contentsEquals(org.telegram.ui.Components.w51 w51Var, org.telegram.ui.Components.w51 w51Var2) {
        if (w51Var.f29961z == w51Var2.f29961z) {
            return true;
        }
        return false;
    }

    @Override
    public final View createView(Context context, org.telegram.ui.Components.vl0 vl0Var, int i10, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        return new d91(context, f6Var);
    }

    @Override
    public final boolean equals(org.telegram.ui.Components.w51 w51Var, org.telegram.ui.Components.w51 w51Var2) {
        if (w51Var.d == w51Var2.d) {
            return true;
        }
        return false;
    }
}
