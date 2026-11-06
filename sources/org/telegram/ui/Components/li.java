package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
public final class li extends q31 {
    public static final int f35659b = 0;

    static {
        q31.h(new q31());
    }

    @Override
    public final void b(View view, r31 r31Var, boolean z9, f41 f41Var, k41 k41Var) {
        mi miVar = (mi) view;
        CharSequence charSequence = r31Var.f37598l;
        CharSequence charSequence2 = r31Var.f37599m;
        miVar.f36004b.setText(charSequence);
        miVar.f36005c.setText(charSequence2);
    }

    @Override
    public final View d(Context context, pj0 pj0Var, int i7, org.telegram.ui.ActionBar.f6 f6Var) {
        return new mi(context, f6Var);
    }

    @Override
    public final boolean f() {
        return false;
    }
}
