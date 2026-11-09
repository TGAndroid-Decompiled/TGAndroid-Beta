package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
public final class li extends x31 {
    public static final int f35750b = 0;

    static {
        x31.h(new x31());
    }

    @Override
    public final void b(View view, y31 y31Var, boolean z9, m41 m41Var, r41 r41Var) {
        mi miVar = (mi) view;
        CharSequence charSequence = y31Var.f40568l;
        CharSequence charSequence2 = y31Var.f40569m;
        miVar.f36095b.setText(charSequence);
        miVar.f36096c.setText(charSequence2);
    }

    @Override
    public final View d(Context context, qj0 qj0Var, int i7, org.telegram.ui.ActionBar.g6 g6Var) {
        return new mi(context, g6Var);
    }

    @Override
    public final boolean f() {
        return false;
    }
}
