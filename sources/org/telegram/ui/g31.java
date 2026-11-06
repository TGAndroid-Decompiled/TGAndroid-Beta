package org.telegram.ui;

import android.content.Context;
import android.view.View;
public final class g31 extends org.telegram.ui.Components.v31 {
    public static final int f45799b = 0;

    static {
        org.telegram.ui.Components.v31.h(new org.telegram.ui.Components.v31());
    }

    @Override
    public final void b(View view, org.telegram.ui.Components.w31 w31Var, boolean z9, org.telegram.ui.Components.k41 k41Var, org.telegram.ui.Components.p41 p41Var) {
        ((h31) view).set(w31Var.f39843z);
    }

    @Override
    public final boolean c(org.telegram.ui.Components.w31 w31Var, org.telegram.ui.Components.w31 w31Var2) {
        if (w31Var.f39843z == w31Var2.f39843z) {
            return true;
        }
        return false;
    }

    @Override
    public final View d(Context context, org.telegram.ui.Components.pj0 pj0Var, int i7, org.telegram.ui.ActionBar.f6 f6Var) {
        return new h31(context, f6Var);
    }

    @Override
    public final boolean e(org.telegram.ui.Components.w31 w31Var, org.telegram.ui.Components.w31 w31Var2) {
        if (w31Var.d == w31Var2.d) {
            return true;
        }
        return false;
    }
}
