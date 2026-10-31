package org.telegram.ui;

import android.content.Context;
import android.view.View;
public final class oy extends org.telegram.ui.Components.z41 {
    public static final int f40391b = 0;

    static {
        org.telegram.ui.Components.z41.h(new org.telegram.ui.Components.z41());
    }

    @Override
    public final void b(View view, org.telegram.ui.Components.a51 a51Var, boolean z10, org.telegram.ui.Components.p51 p51Var, org.telegram.ui.Components.u51 u51Var) {
        py pyVar = (py) view;
        pyVar.f40809n = (org.telegram.messenger.q20) a51Var.G;
        pyVar.f40810r = a51Var;
        pyVar.b(a51Var.f24305z, false);
    }

    @Override
    public final View d(Context context, org.telegram.ui.Components.tk0 tk0Var, int i10, org.telegram.ui.ActionBar.p6 p6Var) {
        return new py(context, p6Var);
    }
}
