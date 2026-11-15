package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
public final class ti extends a41 {
    public static final int f39703b = 0;

    static {
        a41.h(new a41());
    }

    @Override
    public final void b(View view, b41 b41Var, boolean z10, p41 p41Var, u41 u41Var) {
        ui uiVar = (ui) view;
        CharSequence charSequence = b41Var.f33181l;
        CharSequence charSequence2 = b41Var.f33182m;
        uiVar.f40031b.setText(charSequence);
        uiVar.f40032c.setText(charSequence2);
    }

    @Override
    public final View d(Context context, uj0 uj0Var, int i7, org.telegram.ui.ActionBar.e6 e6Var) {
        return new ui(context, e6Var);
    }

    @Override
    public final boolean f() {
        return false;
    }
}
