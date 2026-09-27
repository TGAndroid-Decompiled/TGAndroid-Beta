package org.telegram.ui;

import android.content.Context;
import android.view.View;
public final class jz extends org.telegram.ui.Components.w51 {
    public static final int f34882a = 0;

    static {
        org.telegram.ui.Components.w51.setup(new org.telegram.ui.Components.w51());
    }

    @Override
    public final void bindView(View view, org.telegram.ui.Components.x51 x51Var, boolean z10, org.telegram.ui.Components.l61 l61Var, org.telegram.ui.Components.t61 t61Var) {
        kz kzVar = (kz) view;
        kzVar.f35198b.setOnClickListener((View.OnClickListener) x51Var.G);
        kzVar.e.setOnClickListener((View.OnClickListener) x51Var.H);
        kzVar.a(x51Var.e, false);
    }

    @Override
    public final View createView(Context context, org.telegram.ui.Components.yl0 yl0Var, int i10, int i11, org.telegram.ui.ActionBar.e6 e6Var) {
        return new kz(context, e6Var);
    }
}
