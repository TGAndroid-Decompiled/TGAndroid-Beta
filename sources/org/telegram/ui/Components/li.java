package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
public final class li extends v31 {
    public static final int f35664b = 0;

    static {
        v31.h(new v31());
    }

    @Override
    public final void b(View view, w31 w31Var, boolean z9, k41 k41Var, p41 p41Var) {
        mi miVar = (mi) view;
        CharSequence charSequence = w31Var.f39830l;
        CharSequence charSequence2 = w31Var.f39831m;
        miVar.f35942b.setText(charSequence);
        miVar.f35943c.setText(charSequence2);
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
