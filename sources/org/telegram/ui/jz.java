package org.telegram.ui;

import android.content.Context;
import android.view.View;
public final class jz extends org.telegram.ui.Components.p61 {
    public static final int f39089a = 0;

    static {
        org.telegram.ui.Components.p61.setup(new org.telegram.ui.Components.p61());
    }

    @Override
    public final void bindView(View view, org.telegram.ui.Components.q61 q61Var, boolean z10, org.telegram.ui.Components.d71 d71Var, org.telegram.ui.Components.l71 l71Var) {
        kz kzVar = (kz) view;
        kzVar.f39417b.setOnClickListener((View.OnClickListener) q61Var.G);
        kzVar.f39419e.setOnClickListener((View.OnClickListener) q61Var.H);
        kzVar.a(q61Var.f30057e, false);
    }

    @Override
    public final View createView(Context context, org.telegram.ui.Components.rm0 rm0Var, int i10, int i11, org.telegram.ui.ActionBar.e6 e6Var) {
        return new kz(context, e6Var);
    }
}
