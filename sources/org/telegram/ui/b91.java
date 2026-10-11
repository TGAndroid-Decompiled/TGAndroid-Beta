package org.telegram.ui;

import android.content.Context;
import android.view.View;
public final class b91 extends org.telegram.ui.Components.p61 {
    public static final int f36344a = 0;

    static {
        org.telegram.ui.Components.p61.setup(new org.telegram.ui.Components.p61());
    }

    @Override
    public final void bindView(View view, org.telegram.ui.Components.q61 q61Var, boolean z10, org.telegram.ui.Components.d71 d71Var, org.telegram.ui.Components.l71 l71Var) {
        ((c91) view).set(q61Var.f30180z);
    }

    @Override
    public final boolean contentsEquals(org.telegram.ui.Components.q61 q61Var, org.telegram.ui.Components.q61 q61Var2) {
        if (q61Var.f30180z == q61Var2.f30180z) {
            return true;
        }
        return false;
    }

    @Override
    public final View createView(Context context, org.telegram.ui.Components.rm0 rm0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        return new c91(context, d6Var);
    }

    @Override
    public final boolean equals(org.telegram.ui.Components.q61 q61Var, org.telegram.ui.Components.q61 q61Var2) {
        if (q61Var.d == q61Var2.d) {
            return true;
        }
        return false;
    }
}
