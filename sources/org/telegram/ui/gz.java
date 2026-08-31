package org.telegram.ui;

import android.content.Context;
import android.view.View;
public final class gz extends org.telegram.ui.Components.i51 {
    public static final int f37290a = 0;

    static {
        org.telegram.ui.Components.i51.setup(new org.telegram.ui.Components.i51());
    }

    @Override
    public final void bindView(View view, org.telegram.ui.Components.j51 j51Var, boolean z4, org.telegram.ui.Components.x51 x51Var, org.telegram.ui.Components.i61 i61Var) {
        hz hzVar = (hz) view;
        hzVar.f37691b.setOnClickListener((View.OnClickListener) j51Var.G);
        hzVar.f37693e.setOnClickListener((View.OnClickListener) j51Var.H);
        hzVar.a(j51Var.f28008e, false);
    }

    @Override
    public final View createView(Context context, org.telegram.ui.Components.tl0 tl0Var, int i10, int i11, org.telegram.ui.ActionBar.g6 g6Var) {
        return new hz(context, g6Var);
    }
}
