package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
public final class ej extends x51 {
    public static final int f23957a = 0;

    static {
        x51.setup(new x51());
    }

    @Override
    public final void bindView(View view, y51 y51Var, boolean z10, m61 m61Var, u61 u61Var) {
        fj fjVar = (fj) view;
        CharSequence charSequence = y51Var.f30518l;
        CharSequence charSequence2 = y51Var.f30519m;
        fjVar.f24238b.setText(charSequence);
        fjVar.f24239c.setText(charSequence2);
    }

    @Override
    public final View createView(Context context, yl0 yl0Var, int i10, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        return new fj(context, f6Var);
    }

    @Override
    public final boolean isShadow() {
        return true;
    }
}
