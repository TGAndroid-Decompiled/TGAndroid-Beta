package org.telegram.ui;

import android.content.Context;
import android.view.View;
public final class kz extends org.telegram.ui.Components.v51 {
    public static final int f35265a = 0;

    static {
        org.telegram.ui.Components.v51.setup(new org.telegram.ui.Components.v51());
    }

    @Override
    public final void bindView(View view, org.telegram.ui.Components.w51 w51Var, boolean z10, org.telegram.ui.Components.k61 k61Var, org.telegram.ui.Components.s61 s61Var) {
        lz lzVar = (lz) view;
        lzVar.f35544b.setOnClickListener((View.OnClickListener) w51Var.G);
        lzVar.e.setOnClickListener((View.OnClickListener) w51Var.H);
        lzVar.a(w51Var.e, false);
    }

    @Override
    public final View createView(Context context, org.telegram.ui.Components.vl0 vl0Var, int i10, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        return new lz(context, f6Var);
    }
}
