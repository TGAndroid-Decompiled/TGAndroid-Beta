package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
public final class ej extends w51 {
    public static final int f23888a = 0;

    static {
        w51.setup(new w51());
    }

    @Override
    public final void bindView(View view, x51 x51Var, boolean z10, l61 l61Var, t61 t61Var) {
        fj fjVar = (fj) view;
        CharSequence charSequence = x51Var.f30248l;
        CharSequence charSequence2 = x51Var.f30249m;
        fjVar.f24174b.setText(charSequence);
        fjVar.f24175c.setText(charSequence2);
    }

    @Override
    public final View createView(Context context, wl0 wl0Var, int i10, int i11, org.telegram.ui.ActionBar.e6 e6Var) {
        return new fj(context, e6Var);
    }

    @Override
    public final boolean isShadow() {
        return true;
    }
}
