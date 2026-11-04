package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
public final class li extends q31 {
    public static final int f35732b = 0;

    static {
        q31.h(new q31());
    }

    @Override
    public final void b(View view, r31 r31Var, boolean z10, f41 f41Var, l41 l41Var) {
        mi miVar = (mi) view;
        CharSequence charSequence = r31Var.f37627l;
        CharSequence charSequence2 = r31Var.f37628m;
        miVar.f36156b.setText(charSequence);
        miVar.f36157c.setText(charSequence2);
    }

    @Override
    public final View d(Context context, tj0 tj0Var, int i3, org.telegram.ui.ActionBar.e6 e6Var) {
        return new mi(context, e6Var);
    }

    @Override
    public final boolean f() {
        return false;
    }
}
