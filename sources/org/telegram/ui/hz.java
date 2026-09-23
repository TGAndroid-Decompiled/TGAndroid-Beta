package org.telegram.ui;

import android.content.Context;
import android.view.View;
public final class hz extends org.telegram.ui.Components.g51 {
    public static final int f33950a = 0;

    static {
        org.telegram.ui.Components.g51.setup(new org.telegram.ui.Components.g51());
    }

    @Override
    public final void bindView(View view, org.telegram.ui.Components.h51 h51Var, boolean z10, org.telegram.ui.Components.v51 v51Var, org.telegram.ui.Components.d61 d61Var) {
        iz izVar = (iz) view;
        izVar.f34285b.setOnClickListener((View.OnClickListener) h51Var.G);
        izVar.e.setOnClickListener((View.OnClickListener) h51Var.H);
        izVar.a(h51Var.e, false);
    }

    @Override
    public final View createView(Context context, org.telegram.ui.Components.ml0 ml0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        return new iz(context, d6Var);
    }
}
