package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;

public final class pi extends m41 {

    public static final int f31612a = 0;

    static {
        m41.setup(new pi());
    }

    @Override
    public final void bindView(View view, n41 n41Var, boolean z10, b51 b51Var, k51 k51Var) {
        qi qiVar = (qi) view;
        CharSequence charSequence = n41Var.f30844l;
        CharSequence charSequence2 = n41Var.f30845m;
        qiVar.f31910b.setText(charSequence);
        qiVar.f31911c.setText(charSequence2);
    }

    @Override
    public final View createView(Context context, zk0 zk0Var, int i10, int i11, org.telegram.ui.ActionBar.c6 c6Var) {
        return new qi(context, c6Var);
    }

    @Override
    public final boolean isShadow() {
        return true;
    }
}
