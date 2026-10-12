package org.telegram.ui;

import android.content.Context;
import android.view.View;
public final class oz extends org.telegram.ui.Components.k61 {
    public static final int f39064a = 0;

    static {
        org.telegram.ui.Components.k61.setup(new org.telegram.ui.Components.k61());
    }

    @Override
    public final void bindView(View view, org.telegram.ui.Components.l61 l61Var, boolean z10, org.telegram.ui.Components.z61 z61Var, org.telegram.ui.Components.h71 h71Var) {
        pz pzVar = (pz) view;
        pzVar.f39309b.setOnClickListener((View.OnClickListener) l61Var.G);
        pzVar.e.setOnClickListener((View.OnClickListener) l61Var.H);
        pzVar.a(l61Var.e, false);
    }

    @Override
    public final View createView(Context context, org.telegram.ui.Components.mm0 mm0Var, int i10, int i11, org.telegram.ui.ActionBar.c6 c6Var) {
        return new pz(context, c6Var);
    }
}
