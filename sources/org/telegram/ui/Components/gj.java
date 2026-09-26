package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
public final class gj extends v51 {
    public static final int f24513a = 0;

    static {
        v51.setup(new v51());
    }

    @Override
    public final void bindView(View view, w51 w51Var, boolean z10, k61 k61Var, s61 s61Var) {
        hj hjVar = (hj) view;
        CharSequence charSequence = w51Var.f29895l;
        CharSequence charSequence2 = w51Var.f29896m;
        hjVar.f24811b.setText(charSequence);
        hjVar.f24812c.setText(charSequence2);
    }

    @Override
    public final View createView(Context context, xl0 xl0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        return new hj(context, d6Var);
    }

    @Override
    public final boolean isShadow() {
        return true;
    }
}
