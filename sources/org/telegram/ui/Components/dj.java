package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
public final class dj extends e61 {
    public static final int f25605a = 0;

    static {
        e61.setup(new e61());
    }

    @Override
    public final void bindView(View view, f61 f61Var, boolean z10, s61 s61Var, a71 a71Var) {
        ej ejVar = (ej) view;
        CharSequence charSequence = f61Var.f26147l;
        CharSequence charSequence2 = f61Var.f26148m;
        ejVar.f25932b.setText(charSequence);
        ejVar.f25933c.setText(charSequence2);
    }

    @Override
    public final View createView(Context context, im0 im0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        return new ej(context, d6Var);
    }

    @Override
    public final boolean isShadow() {
        return true;
    }
}
