package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
public final class li extends w31 {
    public static final int f35702b = 0;

    static {
        w31.h(new w31());
    }

    @Override
    public final void b(View view, x31 x31Var, boolean z9, l41 l41Var, q41 q41Var) {
        mi miVar = (mi) view;
        CharSequence charSequence = x31Var.f40180l;
        CharSequence charSequence2 = x31Var.f40181m;
        miVar.f35986b.setText(charSequence);
        miVar.f35987c.setText(charSequence2);
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
