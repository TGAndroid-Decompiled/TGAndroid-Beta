package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
public final class ej extends v51 {
    public static final int f23864a = 0;

    static {
        v51.setup(new v51());
    }

    @Override
    public final void bindView(View view, w51 w51Var, boolean z10, k61 k61Var, s61 s61Var) {
        fj fjVar = (fj) view;
        CharSequence charSequence = w51Var.f29948l;
        CharSequence charSequence2 = w51Var.f29949m;
        fjVar.f24129b.setText(charSequence);
        fjVar.f24130c.setText(charSequence2);
    }

    @Override
    public final View createView(Context context, vl0 vl0Var, int i10, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        return new fj(context, f6Var);
    }

    @Override
    public final boolean isShadow() {
        return true;
    }
}
