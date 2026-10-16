package org.telegram.ui;

import android.content.Context;
import android.view.View;
public final class oz extends org.telegram.ui.Components.l61 {
    public static final int f38769a = 0;

    static {
        org.telegram.ui.Components.l61.setup(new org.telegram.ui.Components.l61());
    }

    @Override
    public final void bindView(View view, org.telegram.ui.Components.m61 m61Var, boolean z10, org.telegram.ui.Components.a71 a71Var, org.telegram.ui.Components.i71 i71Var) {
        pz pzVar = (pz) view;
        pzVar.f39031b.setOnClickListener((View.OnClickListener) m61Var.G);
        pzVar.e.setOnClickListener((View.OnClickListener) m61Var.H);
        pzVar.a(m61Var.e, false);
    }

    @Override
    public final View createView(Context context, org.telegram.ui.Components.mm0 mm0Var, int i10, int i11, org.telegram.ui.ActionBar.c6 c6Var) {
        return new pz(context, c6Var);
    }
}
