package org.telegram.ui;

import android.content.Context;
import android.view.View;
public final class mz extends org.telegram.ui.Components.u51 {
    public static final int f35078a = 0;

    static {
        org.telegram.ui.Components.u51.setup(new org.telegram.ui.Components.u51());
    }

    @Override
    public final void bindView(View view, org.telegram.ui.Components.v51 v51Var, boolean z10, org.telegram.ui.Components.j61 j61Var, org.telegram.ui.Components.r61 r61Var) {
        nz nzVar = (nz) view;
        nzVar.f35361b.setOnClickListener((View.OnClickListener) v51Var.G);
        nzVar.e.setOnClickListener((View.OnClickListener) v51Var.H);
        nzVar.a(v51Var.e, false);
    }

    @Override
    public final View createView(Context context, org.telegram.ui.Components.vl0 vl0Var, int i10, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        return new nz(context, f6Var);
    }
}
