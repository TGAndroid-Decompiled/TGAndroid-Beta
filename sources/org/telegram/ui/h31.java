package org.telegram.ui;

import android.content.Context;
import android.view.View;
public final class h31 extends org.telegram.ui.Components.x31 {
    public static final int f46138b = 0;

    static {
        org.telegram.ui.Components.x31.h(new org.telegram.ui.Components.x31());
    }

    @Override
    public final void b(View view, org.telegram.ui.Components.y31 y31Var, boolean z9, org.telegram.ui.Components.m41 m41Var, org.telegram.ui.Components.r41 r41Var) {
        ((i31) view).set(y31Var.f40581z);
    }

    @Override
    public final boolean c(org.telegram.ui.Components.y31 y31Var, org.telegram.ui.Components.y31 y31Var2) {
        if (y31Var.f40581z == y31Var2.f40581z) {
            return true;
        }
        return false;
    }

    @Override
    public final View d(Context context, org.telegram.ui.Components.qj0 qj0Var, int i7, org.telegram.ui.ActionBar.g6 g6Var) {
        return new i31(context, g6Var);
    }

    @Override
    public final boolean e(org.telegram.ui.Components.y31 y31Var, org.telegram.ui.Components.y31 y31Var2) {
        if (y31Var.d == y31Var2.d) {
            return true;
        }
        return false;
    }
}
