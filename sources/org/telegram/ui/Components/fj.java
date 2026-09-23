package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
public final class fj extends g51 {
    public static final int f23994a = 0;

    static {
        g51.setup(new g51());
    }

    @Override
    public final void bindView(View view, h51 h51Var, boolean z10, v51 v51Var, d61 d61Var) {
        gj gjVar = (gj) view;
        CharSequence charSequence = h51Var.f24507l;
        CharSequence charSequence2 = h51Var.f24508m;
        gjVar.f24307b.setText(charSequence);
        gjVar.f24308c.setText(charSequence2);
    }

    @Override
    public final View createView(Context context, ml0 ml0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        return new gj(context, d6Var);
    }

    @Override
    public final boolean isShadow() {
        return true;
    }
}
