package org.telegram.ui;

import android.content.Context;
import android.view.View;
public final class i91 extends org.telegram.ui.Components.k61 {
    public static final int f37074a = 0;

    static {
        org.telegram.ui.Components.k61.setup(new org.telegram.ui.Components.k61());
    }

    @Override
    public final void bindView(View view, org.telegram.ui.Components.l61 l61Var, boolean z10, org.telegram.ui.Components.z61 z61Var, org.telegram.ui.Components.h71 h71Var) {
        ((j91) view).set(l61Var.f26967z);
    }

    @Override
    public final boolean contentsEquals(org.telegram.ui.Components.l61 l61Var, org.telegram.ui.Components.l61 l61Var2) {
        if (l61Var.f26967z == l61Var2.f26967z) {
            return true;
        }
        return false;
    }

    @Override
    public final View createView(Context context, org.telegram.ui.Components.mm0 mm0Var, int i10, int i11, org.telegram.ui.ActionBar.c6 c6Var) {
        return new j91(context, c6Var);
    }

    @Override
    public final boolean equals(org.telegram.ui.Components.l61 l61Var, org.telegram.ui.Components.l61 l61Var2) {
        if (l61Var.d == l61Var2.d) {
            return true;
        }
        return false;
    }
}
