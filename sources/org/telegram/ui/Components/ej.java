package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
public final class ej extends h51 {
    public static final int f23676a = 0;

    static {
        h51.setup(new h51());
    }

    @Override
    public final void bindView(View view, i51 i51Var, boolean z10, w51 w51Var, e61 e61Var) {
        fj fjVar = (fj) view;
        CharSequence charSequence = i51Var.f24900l;
        CharSequence charSequence2 = i51Var.f24901m;
        fjVar.f23954b.setText(charSequence);
        fjVar.f23955c.setText(charSequence2);
    }

    @Override
    public final View createView(Context context, ll0 ll0Var, int i10, int i11, org.telegram.ui.ActionBar.e6 e6Var) {
        return new fj(context, e6Var);
    }

    @Override
    public final boolean isShadow() {
        return true;
    }
}
