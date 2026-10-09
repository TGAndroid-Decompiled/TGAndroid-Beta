package org.telegram.ui;

import android.content.Context;
import android.view.View;
public final class jz extends org.telegram.ui.Components.o61 {
    public static final int f39045a = 0;

    static {
        org.telegram.ui.Components.o61.setup(new org.telegram.ui.Components.o61());
    }

    @Override
    public final void bindView(View view, org.telegram.ui.Components.p61 p61Var, boolean z10, org.telegram.ui.Components.c71 c71Var, org.telegram.ui.Components.k71 k71Var) {
        kz kzVar = (kz) view;
        kzVar.f39373b.setOnClickListener((View.OnClickListener) p61Var.G);
        kzVar.f39375e.setOnClickListener((View.OnClickListener) p61Var.H);
        kzVar.a(p61Var.f29728e, false);
    }

    @Override
    public final View createView(Context context, org.telegram.ui.Components.qm0 qm0Var, int i10, int i11, org.telegram.ui.ActionBar.e6 e6Var) {
        return new kz(context, e6Var);
    }
}
