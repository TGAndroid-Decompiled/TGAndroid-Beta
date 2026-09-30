package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
public final class hj extends x51 {
    public static final int f24875a = 0;

    static {
        x51.setup(new x51());
    }

    @Override
    public final void bindView(View view, y51 y51Var, boolean z10, m61 m61Var, u61 u61Var) {
        ij ijVar = (ij) view;
        CharSequence charSequence = y51Var.f30637l;
        CharSequence charSequence2 = y51Var.f30638m;
        ijVar.f25139b.setText(charSequence);
        ijVar.f25140c.setText(charSequence2);
    }

    @Override
    public final View createView(Context context, zl0 zl0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        return new ij(context, d6Var);
    }

    @Override
    public final boolean isShadow() {
        return true;
    }
}
