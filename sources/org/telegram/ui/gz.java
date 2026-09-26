package org.telegram.ui;

import android.content.Context;
import android.view.View;
public final class gz extends org.telegram.ui.Components.v51 {
    public static final int f34080a = 0;

    static {
        org.telegram.ui.Components.v51.setup(new org.telegram.ui.Components.v51());
    }

    @Override
    public final void bindView(View view, org.telegram.ui.Components.w51 w51Var, boolean z10, org.telegram.ui.Components.k61 k61Var, org.telegram.ui.Components.s61 s61Var) {
        hz hzVar = (hz) view;
        hzVar.f34327b.setOnClickListener((View.OnClickListener) w51Var.G);
        hzVar.e.setOnClickListener((View.OnClickListener) w51Var.H);
        hzVar.a(w51Var.e, false);
    }

    @Override
    public final View createView(Context context, org.telegram.ui.Components.xl0 xl0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        return new hz(context, d6Var);
    }
}
