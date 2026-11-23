package org.telegram.ui;

import android.content.Context;
import android.view.View;
public final class h31 extends org.telegram.ui.Components.m41 {
    public static final int f48420b = 0;

    static {
        org.telegram.ui.Components.m41.h(new org.telegram.ui.Components.m41());
    }

    @Override
    public final void b(View view, org.telegram.ui.Components.n41 n41Var, boolean z10, org.telegram.ui.Components.b51 b51Var, org.telegram.ui.Components.g51 g51Var) {
        ((i31) view).set(n41Var.A);
    }

    @Override
    public final boolean c(org.telegram.ui.Components.n41 n41Var, org.telegram.ui.Components.n41 n41Var2) {
        if (n41Var.A == n41Var2.A) {
            return true;
        }
        return false;
    }

    @Override
    public final View d(Context context, org.telegram.ui.Components.ek0 ek0Var, int i7, org.telegram.ui.ActionBar.i6 i6Var) {
        return new i31(context, i6Var);
    }

    @Override
    public final boolean e(org.telegram.ui.Components.n41 n41Var, org.telegram.ui.Components.n41 n41Var2) {
        if (n41Var.d == n41Var2.d) {
            return true;
        }
        return false;
    }
}
