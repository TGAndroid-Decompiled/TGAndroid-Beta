package org.telegram.ui;

import android.content.Context;
import android.view.View;
public final class e31 extends org.telegram.ui.Components.a41 {
    public static final int f46529b = 0;

    static {
        org.telegram.ui.Components.a41.h(new org.telegram.ui.Components.a41());
    }

    @Override
    public final void b(View view, org.telegram.ui.Components.b41 b41Var, boolean z10, org.telegram.ui.Components.p41 p41Var, org.telegram.ui.Components.u41 u41Var) {
        ((f31) view).set(b41Var.f33197z);
    }

    @Override
    public final boolean c(org.telegram.ui.Components.b41 b41Var, org.telegram.ui.Components.b41 b41Var2) {
        if (b41Var.f33197z == b41Var2.f33197z) {
            return true;
        }
        return false;
    }

    @Override
    public final View d(Context context, org.telegram.ui.Components.uj0 uj0Var, int i7, org.telegram.ui.ActionBar.e6 e6Var) {
        return new f31(context, e6Var);
    }

    @Override
    public final boolean e(org.telegram.ui.Components.b41 b41Var, org.telegram.ui.Components.b41 b41Var2) {
        if (b41Var.d == b41Var2.d) {
            return true;
        }
        return false;
    }
}
