package org.telegram.ui;

import android.content.Context;
import android.view.View;
public final class kz extends org.telegram.ui.Components.h51 {
    public static final int f35289a = 0;

    static {
        org.telegram.ui.Components.h51.setup(new org.telegram.ui.Components.h51());
    }

    @Override
    public final void bindView(View view, org.telegram.ui.Components.i51 i51Var, boolean z10, org.telegram.ui.Components.w51 w51Var, org.telegram.ui.Components.e61 e61Var) {
        lz lzVar = (lz) view;
        lzVar.f35580b.setOnClickListener((View.OnClickListener) i51Var.G);
        lzVar.e.setOnClickListener((View.OnClickListener) i51Var.H);
        lzVar.a(i51Var.e, false);
    }

    @Override
    public final View createView(Context context, org.telegram.ui.Components.ll0 ll0Var, int i10, int i11, org.telegram.ui.ActionBar.e6 e6Var) {
        return new lz(context, e6Var);
    }
}
