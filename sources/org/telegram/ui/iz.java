package org.telegram.ui;

import android.content.Context;
import android.view.View;
public final class iz extends org.telegram.ui.Components.q61 {
    public static final int f38802a = 0;

    static {
        org.telegram.ui.Components.q61.setup(new org.telegram.ui.Components.q61());
    }

    @Override
    public final void bindView(View view, org.telegram.ui.Components.r61 r61Var, boolean z10, org.telegram.ui.Components.e71 e71Var, org.telegram.ui.Components.m71 m71Var) {
        jz jzVar = (jz) view;
        jzVar.f39145b.setOnClickListener((View.OnClickListener) r61Var.G);
        jzVar.f39147e.setOnClickListener((View.OnClickListener) r61Var.H);
        jzVar.a(r61Var.f30355e, false);
    }

    @Override
    public final View createView(Context context, org.telegram.ui.Components.sm0 sm0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        return new jz(context, d6Var);
    }
}
