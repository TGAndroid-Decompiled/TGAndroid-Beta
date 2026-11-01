package org.telegram.ui;

import android.content.Context;
import android.view.View;
public final class ny extends org.telegram.ui.Components.a51 {
    public static final int f39983b = 0;

    static {
        org.telegram.ui.Components.a51.h(new org.telegram.ui.Components.a51());
    }

    @Override
    public final void b(View view, org.telegram.ui.Components.b51 b51Var, boolean z10, org.telegram.ui.Components.q51 q51Var, org.telegram.ui.Components.v51 v51Var) {
        oy oyVar = (oy) view;
        oyVar.f40290n = (org.telegram.messenger.r20) b51Var.G;
        oyVar.f40291r = b51Var;
        oyVar.b(b51Var.f24656z, false);
    }

    @Override
    public final View d(Context context, org.telegram.ui.Components.uk0 uk0Var, int i10, org.telegram.ui.ActionBar.p6 p6Var) {
        return new oy(context, p6Var);
    }
}
