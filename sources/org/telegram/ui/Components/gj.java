package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
public final class gj extends w51 {
    public static final int f24559a = 0;

    static {
        w51.setup(new w51());
    }

    @Override
    public final void bindView(View view, x51 x51Var, boolean z10, l61 l61Var, t61 t61Var) {
        hj hjVar = (hj) view;
        CharSequence charSequence = x51Var.f30292l;
        CharSequence charSequence2 = x51Var.f30293m;
        hjVar.f24842b.setText(charSequence);
        hjVar.f24843c.setText(charSequence2);
    }

    @Override
    public final View createView(Context context, yl0 yl0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        return new hj(context, d6Var);
    }

    @Override
    public final boolean isShadow() {
        return true;
    }
}
