package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
public final class ej extends g51 {
    public static final int f25744a = 0;

    static {
        g51.setup(new g51());
    }

    @Override
    public final void bindView(View view, h51 h51Var, boolean z10, v51 v51Var, d61 d61Var) {
        fj fjVar = (fj) view;
        CharSequence charSequence = h51Var.f26621l;
        CharSequence charSequence2 = h51Var.f26622m;
        fjVar.f26092b.setText(charSequence);
        fjVar.f26093c.setText(charSequence2);
    }

    @Override
    public final View createView(Context context, ll0 ll0Var, int i10, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        return new fj(context, f6Var);
    }

    @Override
    public final boolean isShadow() {
        return true;
    }
}
