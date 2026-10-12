package org.telegram.ui;

import android.content.Context;
import android.view.View;
public final class lz extends org.telegram.ui.Components.t61 {
    public static final int f39869a = 0;

    static {
        org.telegram.ui.Components.t61.setup(new org.telegram.ui.Components.t61());
    }

    @Override
    public final void bindView(View view, org.telegram.ui.Components.u61 u61Var, boolean z10, org.telegram.ui.Components.h71 h71Var, org.telegram.ui.Components.p71 p71Var) {
        mz mzVar = (mz) view;
        mzVar.f40151b.setOnClickListener((View.OnClickListener) u61Var.G);
        mzVar.f40153e.setOnClickListener((View.OnClickListener) u61Var.H);
        mzVar.a(u61Var.f31070e, false);
    }

    @Override
    public final View createView(Context context, org.telegram.ui.Components.wm0 wm0Var, int i10, int i11, org.telegram.ui.ActionBar.c6 c6Var) {
        return new mz(context, c6Var);
    }
}
