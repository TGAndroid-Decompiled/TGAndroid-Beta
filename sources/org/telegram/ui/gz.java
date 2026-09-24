package org.telegram.ui;

import android.content.Context;
import android.view.View;
public final class gz extends org.telegram.ui.Components.u51 {
    public static final int f34068a = 0;

    static {
        org.telegram.ui.Components.u51.setup(new org.telegram.ui.Components.u51());
    }

    @Override
    public final void bindView(View view, org.telegram.ui.Components.v51 v51Var, boolean z10, org.telegram.ui.Components.j61 j61Var, org.telegram.ui.Components.r61 r61Var) {
        hz hzVar = (hz) view;
        hzVar.f34315b.setOnClickListener((View.OnClickListener) v51Var.G);
        hzVar.e.setOnClickListener((View.OnClickListener) v51Var.H);
        hzVar.a(v51Var.e, false);
    }

    @Override
    public final View createView(Context context, org.telegram.ui.Components.wl0 wl0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        return new hz(context, d6Var);
    }
}
