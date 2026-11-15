package org.telegram.ui;

import android.content.Context;
import android.view.View;
public final class mx extends org.telegram.ui.Components.a41 {
    public static final int f49329b = 0;

    static {
        org.telegram.ui.Components.a41.h(new org.telegram.ui.Components.a41());
    }

    @Override
    public final void b(View view, org.telegram.ui.Components.b41 b41Var, boolean z10, org.telegram.ui.Components.p41 p41Var, org.telegram.ui.Components.u41 u41Var) {
        nx nxVar = (nx) view;
        nxVar.f49713n = (org.telegram.messenger.z10) b41Var.G;
        nxVar.f49714r = b41Var;
        nxVar.b(b41Var.f33194z, false);
    }

    @Override
    public final View d(Context context, org.telegram.ui.Components.uj0 uj0Var, int i7, org.telegram.ui.ActionBar.e6 e6Var) {
        return new nx(context, e6Var);
    }
}
