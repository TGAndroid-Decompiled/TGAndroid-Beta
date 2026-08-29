package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
public final class wi extends v41 {
    public static final int f34421a = 0;

    static {
        v41.setup(new v41());
    }

    @Override
    public final void bindView(View view, w41 w41Var, boolean z10, k51 k51Var, u51 u51Var) {
        xi xiVar = (xi) view;
        CharSequence charSequence = w41Var.f34300l;
        CharSequence charSequence2 = w41Var.f34301m;
        xiVar.f34728b.setText(charSequence);
        xiVar.f34729c.setText(charSequence2);
    }

    @Override
    public final View createView(Context context, jl0 jl0Var, int i10, int i11, org.telegram.ui.ActionBar.c6 c6Var) {
        return new xi(context, c6Var);
    }

    @Override
    public final boolean isShadow() {
        return true;
    }
}
