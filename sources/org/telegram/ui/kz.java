package org.telegram.ui;

import android.content.Context;
import android.view.View;
public final class kz extends org.telegram.ui.Components.g51 {
    public static final int f38153a = 0;

    static {
        org.telegram.ui.Components.g51.setup(new org.telegram.ui.Components.g51());
    }

    @Override
    public final void bindView(View view, org.telegram.ui.Components.h51 h51Var, boolean z10, org.telegram.ui.Components.v51 v51Var, org.telegram.ui.Components.d61 d61Var) {
        lz lzVar = (lz) view;
        lzVar.f38518b.setOnClickListener((View.OnClickListener) h51Var.G);
        lzVar.f38520e.setOnClickListener((View.OnClickListener) h51Var.H);
        lzVar.a(h51Var.f26588e, false);
    }

    @Override
    public final View createView(Context context, org.telegram.ui.Components.ll0 ll0Var, int i10, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        return new lz(context, f6Var);
    }
}
