package org.telegram.ui;

import android.content.Context;
import android.view.View;
public final class a91 extends org.telegram.ui.Components.i51 {
    public static final int f31769a = 0;

    static {
        org.telegram.ui.Components.i51.setup(new org.telegram.ui.Components.i51());
    }

    @Override
    public final void bindView(View view, org.telegram.ui.Components.j51 j51Var, boolean z10, org.telegram.ui.Components.x51 x51Var, org.telegram.ui.Components.f61 f61Var) {
        ((b91) view).set(j51Var.f25140z);
    }

    @Override
    public final boolean contentsEquals(org.telegram.ui.Components.j51 j51Var, org.telegram.ui.Components.j51 j51Var2) {
        if (j51Var.f25140z == j51Var2.f25140z) {
            return true;
        }
        return false;
    }

    @Override
    public final View createView(Context context, org.telegram.ui.Components.ml0 ml0Var, int i10, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        return new b91(context, f6Var);
    }

    @Override
    public final boolean equals(org.telegram.ui.Components.j51 j51Var, org.telegram.ui.Components.j51 j51Var2) {
        if (j51Var.d == j51Var2.d) {
            return true;
        }
        return false;
    }
}
