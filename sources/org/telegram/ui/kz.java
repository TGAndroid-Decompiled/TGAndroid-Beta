package org.telegram.ui;

import android.content.Context;
import android.view.View;
public final class kz extends org.telegram.ui.Components.f61 {
    public static final int f38127a = 0;

    static {
        org.telegram.ui.Components.f61.setup(new org.telegram.ui.Components.f61());
    }

    @Override
    public final void bindView(View view, org.telegram.ui.Components.g61 g61Var, boolean z10, org.telegram.ui.Components.u61 u61Var, org.telegram.ui.Components.c71 c71Var) {
        lz lzVar = (lz) view;
        lzVar.f38364b.setOnClickListener((View.OnClickListener) g61Var.G);
        lzVar.f38366e.setOnClickListener((View.OnClickListener) g61Var.H);
        lzVar.a(g61Var.f26662e, false);
    }

    @Override
    public final View createView(Context context, org.telegram.ui.Components.zl0 zl0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        return new lz(context, d6Var);
    }
}
