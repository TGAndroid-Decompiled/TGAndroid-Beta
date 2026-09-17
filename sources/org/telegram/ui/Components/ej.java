package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
public final class ej extends i51 {
    public static final int f23574a = 0;

    static {
        i51.setup(new i51());
    }

    @Override
    public final void bindView(View view, j51 j51Var, boolean z10, x51 x51Var, f61 f61Var) {
        fj fjVar = (fj) view;
        CharSequence charSequence = j51Var.f25124l;
        CharSequence charSequence2 = j51Var.f25125m;
        fjVar.f23950b.setText(charSequence);
        fjVar.f23951c.setText(charSequence2);
    }

    @Override
    public final View createView(Context context, ml0 ml0Var, int i10, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        return new fj(context, f6Var);
    }

    @Override
    public final boolean isShadow() {
        return true;
    }
}
