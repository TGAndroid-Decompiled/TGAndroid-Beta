package org.telegram.ui;

import android.content.Context;
import android.view.View;
public final class i31 extends org.telegram.ui.Components.n41 {
    public static final int f48568b = 0;

    static {
        org.telegram.ui.Components.n41.h(new org.telegram.ui.Components.n41());
    }

    @Override
    public final void b(View view, org.telegram.ui.Components.o41 o41Var, boolean z10, org.telegram.ui.Components.c51 c51Var, org.telegram.ui.Components.h51 h51Var) {
        ((j31) view).set(o41Var.A);
    }

    @Override
    public final boolean c(org.telegram.ui.Components.o41 o41Var, org.telegram.ui.Components.o41 o41Var2) {
        if (o41Var.A == o41Var2.A) {
            return true;
        }
        return false;
    }

    @Override
    public final View d(Context context, org.telegram.ui.Components.ek0 ek0Var, int i7, org.telegram.ui.ActionBar.h6 h6Var) {
        return new j31(context, h6Var);
    }

    @Override
    public final boolean e(org.telegram.ui.Components.o41 o41Var, org.telegram.ui.Components.o41 o41Var2) {
        if (o41Var.d == o41Var2.d) {
            return true;
        }
        return false;
    }
}
