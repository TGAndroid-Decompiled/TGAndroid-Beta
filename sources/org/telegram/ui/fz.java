package org.telegram.ui;

import android.content.Context;
import android.view.View;
public final class fz extends org.telegram.ui.Components.h51 {
    public static final int f34420a = 0;

    static {
        org.telegram.ui.Components.h51.setup(new org.telegram.ui.Components.h51());
    }

    @Override
    public final void bindView(View view, org.telegram.ui.Components.i51 i51Var, boolean z4, org.telegram.ui.Components.w51 w51Var, org.telegram.ui.Components.g61 g61Var) {
        gz gzVar = (gz) view;
        gzVar.f34703b.setOnClickListener((View.OnClickListener) i51Var.G);
        gzVar.e.setOnClickListener((View.OnClickListener) i51Var.H);
        gzVar.a(i51Var.e, false);
    }

    @Override
    public final View createView(Context context, org.telegram.ui.Components.sl0 sl0Var, int i10, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        return new gz(context, f6Var);
    }
}
