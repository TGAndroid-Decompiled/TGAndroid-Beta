package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
public final class bj extends k61 {
    public static final int f25021a = 0;

    static {
        k61.setup(new k61());
    }

    @Override
    public final void bindView(View view, l61 l61Var, boolean z10, a71 a71Var, i71 i71Var) {
        cj cjVar = (cj) view;
        CharSequence charSequence = l61Var.f28227l;
        CharSequence charSequence2 = l61Var.f28228m;
        cjVar.f25342b.setText(charSequence);
        cjVar.f25343c.setText(charSequence2);
    }

    @Override
    public final View createView(Context context, lm0 lm0Var, int i10, int i11, org.telegram.ui.ActionBar.g6 g6Var) {
        return new cj(context, g6Var);
    }

    @Override
    public final boolean isShadow() {
        return true;
    }
}
