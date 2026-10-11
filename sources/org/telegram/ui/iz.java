package org.telegram.ui;

import android.content.Context;
import android.view.View;
public final class iz extends org.telegram.ui.Components.p61 {
    public static final int f38836a = 0;

    static {
        org.telegram.ui.Components.p61.setup(new org.telegram.ui.Components.p61());
    }

    @Override
    public final void bindView(View view, org.telegram.ui.Components.q61 q61Var, boolean z10, org.telegram.ui.Components.d71 d71Var, org.telegram.ui.Components.l71 l71Var) {
        jz jzVar = (jz) view;
        jzVar.f39179b.setOnClickListener((View.OnClickListener) q61Var.G);
        jzVar.f39181e.setOnClickListener((View.OnClickListener) q61Var.H);
        jzVar.a(q61Var.f30161e, false);
    }

    @Override
    public final View createView(Context context, org.telegram.ui.Components.rm0 rm0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        return new jz(context, d6Var);
    }
}
