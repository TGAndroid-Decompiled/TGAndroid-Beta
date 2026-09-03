package org.telegram.ui;

import android.content.Context;
import android.view.View;
public final class gz extends org.telegram.ui.Components.g51 {
    public static final int f37185a = 0;

    static {
        org.telegram.ui.Components.g51.setup(new org.telegram.ui.Components.g51());
    }

    @Override
    public final void bindView(View view, org.telegram.ui.Components.h51 h51Var, boolean z4, org.telegram.ui.Components.w51 w51Var, org.telegram.ui.Components.h61 h61Var) {
        hz hzVar = (hz) view;
        hzVar.f37502b.setOnClickListener((View.OnClickListener) h51Var.G);
        hzVar.f37504e.setOnClickListener((View.OnClickListener) h51Var.H);
        hzVar.a(h51Var.f27369e, false);
    }

    @Override
    public final View createView(Context context, org.telegram.ui.Components.sl0 sl0Var, int i10, int i11, org.telegram.ui.ActionBar.g6 g6Var) {
        return new hz(context, g6Var);
    }
}
