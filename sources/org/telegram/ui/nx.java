package org.telegram.ui;

import android.content.Context;
import android.view.View;
public final class nx extends org.telegram.ui.Components.x31 {
    public static final int f48245b = 0;

    static {
        org.telegram.ui.Components.x31.h(new org.telegram.ui.Components.x31());
    }

    @Override
    public final void b(View view, org.telegram.ui.Components.y31 y31Var, boolean z9, org.telegram.ui.Components.m41 m41Var, org.telegram.ui.Components.r41 r41Var) {
        ox oxVar = (ox) view;
        oxVar.f48540n = (org.telegram.messenger.c20) y31Var.G;
        oxVar.f48541r = y31Var;
        oxVar.b(y31Var.f40581z, false);
    }

    @Override
    public final View d(Context context, org.telegram.ui.Components.qj0 qj0Var, int i7, org.telegram.ui.ActionBar.g6 g6Var) {
        return new ox(context, g6Var);
    }
}
