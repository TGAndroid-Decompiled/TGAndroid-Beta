package org.telegram.ui;

import android.content.Context;
import android.view.View;
public final class gz extends org.telegram.ui.Components.x51 {
    public static final int f34174a = 0;

    static {
        org.telegram.ui.Components.x51.setup(new org.telegram.ui.Components.x51());
    }

    @Override
    public final void bindView(View view, org.telegram.ui.Components.y51 y51Var, boolean z10, org.telegram.ui.Components.m61 m61Var, org.telegram.ui.Components.u61 u61Var) {
        hz hzVar = (hz) view;
        hzVar.f34423b.setOnClickListener((View.OnClickListener) y51Var.G);
        hzVar.e.setOnClickListener((View.OnClickListener) y51Var.H);
        hzVar.a(y51Var.e, false);
    }

    @Override
    public final View createView(Context context, org.telegram.ui.Components.zl0 zl0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        return new hz(context, d6Var);
    }
}
