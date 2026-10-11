package org.telegram.ui;

import android.content.Context;
import android.view.View;
public final class b91 extends org.telegram.ui.Components.q61 {
    public static final int f36310a = 0;

    static {
        org.telegram.ui.Components.q61.setup(new org.telegram.ui.Components.q61());
    }

    @Override
    public final void bindView(View view, org.telegram.ui.Components.r61 r61Var, boolean z10, org.telegram.ui.Components.e71 e71Var, org.telegram.ui.Components.m71 m71Var) {
        ((c91) view).set(r61Var.f30374z);
    }

    @Override
    public final boolean contentsEquals(org.telegram.ui.Components.r61 r61Var, org.telegram.ui.Components.r61 r61Var2) {
        if (r61Var.f30374z == r61Var2.f30374z) {
            return true;
        }
        return false;
    }

    @Override
    public final View createView(Context context, org.telegram.ui.Components.sm0 sm0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        return new c91(context, d6Var);
    }

    @Override
    public final boolean equals(org.telegram.ui.Components.r61 r61Var, org.telegram.ui.Components.r61 r61Var2) {
        if (r61Var.d == r61Var2.d) {
            return true;
        }
        return false;
    }
}
