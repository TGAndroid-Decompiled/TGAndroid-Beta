package org.telegram.ui;

import android.content.Context;
import android.view.View;
public final class mz extends org.telegram.ui.Components.i51 {
    public static final int f35913a = 0;

    static {
        org.telegram.ui.Components.i51.setup(new org.telegram.ui.Components.i51());
    }

    @Override
    public final void bindView(View view, org.telegram.ui.Components.j51 j51Var, boolean z10, org.telegram.ui.Components.x51 x51Var, org.telegram.ui.Components.f61 f61Var) {
        nz nzVar = (nz) view;
        nzVar.f36184b.setOnClickListener((View.OnClickListener) j51Var.G);
        nzVar.e.setOnClickListener((View.OnClickListener) j51Var.H);
        nzVar.a(j51Var.e, false);
    }

    @Override
    public final View createView(Context context, org.telegram.ui.Components.ml0 ml0Var, int i10, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        return new nz(context, f6Var);
    }
}
