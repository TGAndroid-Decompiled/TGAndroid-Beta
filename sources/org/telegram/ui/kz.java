package org.telegram.ui;

import android.content.Context;
import android.view.View;
public final class kz extends org.telegram.ui.Components.g61 {
    public static final int f38201a = 0;

    static {
        org.telegram.ui.Components.g61.setup(new org.telegram.ui.Components.g61());
    }

    @Override
    public final void bindView(View view, org.telegram.ui.Components.h61 h61Var, boolean z10, org.telegram.ui.Components.w61 w61Var, org.telegram.ui.Components.e71 e71Var) {
        lz lzVar = (lz) view;
        lzVar.f38424b.setOnClickListener((View.OnClickListener) h61Var.G);
        lzVar.f38426e.setOnClickListener((View.OnClickListener) h61Var.H);
        lzVar.a(h61Var.f27087e, false);
    }

    @Override
    public final View createView(Context context, org.telegram.ui.Components.zl0 zl0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        return new lz(context, d6Var);
    }
}
