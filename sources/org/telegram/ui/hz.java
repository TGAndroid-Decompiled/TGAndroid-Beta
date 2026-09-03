package org.telegram.ui;

import android.content.Context;
import android.view.View;
public final class hz extends org.telegram.ui.Components.h51 {
    public static final int f34772a = 0;

    static {
        org.telegram.ui.Components.h51.setup(new org.telegram.ui.Components.h51());
    }

    @Override
    public final void bindView(View view, org.telegram.ui.Components.i51 i51Var, boolean z4, org.telegram.ui.Components.w51 w51Var, org.telegram.ui.Components.g61 g61Var) {
        iz izVar = (iz) view;
        izVar.f35048b.setOnClickListener((View.OnClickListener) i51Var.G);
        izVar.e.setOnClickListener((View.OnClickListener) i51Var.H);
        izVar.a(i51Var.e, false);
    }

    @Override
    public final View createView(Context context, org.telegram.ui.Components.rl0 rl0Var, int i10, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        return new iz(context, f6Var);
    }
}
