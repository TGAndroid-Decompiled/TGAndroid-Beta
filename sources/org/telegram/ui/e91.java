package org.telegram.ui;

import android.content.Context;
import android.view.View;
public final class e91 extends org.telegram.ui.Components.u51 {
    public static final int f32129a = 0;

    static {
        org.telegram.ui.Components.u51.setup(new org.telegram.ui.Components.u51());
    }

    @Override
    public final void bindView(View view, org.telegram.ui.Components.v51 v51Var, boolean z10, org.telegram.ui.Components.j61 j61Var, org.telegram.ui.Components.r61 r61Var) {
        ((f91) view).set(v51Var.f27842z);
    }

    @Override
    public final boolean contentsEquals(org.telegram.ui.Components.v51 v51Var, org.telegram.ui.Components.v51 v51Var2) {
        if (v51Var.f27842z == v51Var2.f27842z) {
            return true;
        }
        return false;
    }

    @Override
    public final View createView(Context context, org.telegram.ui.Components.vl0 vl0Var, int i10, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        return new f91(context, f6Var);
    }

    @Override
    public final boolean equals(org.telegram.ui.Components.v51 v51Var, org.telegram.ui.Components.v51 v51Var2) {
        if (v51Var.d == v51Var2.d) {
            return true;
        }
        return false;
    }
}
