package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
public final class ki extends w31 {
    public static final int f35352b = 0;

    static {
        w31.h(new w31());
    }

    @Override
    public final void b(View view, x31 x31Var, boolean z9, m41 m41Var, r41 r41Var) {
        li liVar = (li) view;
        CharSequence charSequence = x31Var.f40156l;
        CharSequence charSequence2 = x31Var.f40157m;
        liVar.f35679b.setText(charSequence);
        liVar.f35680c.setText(charSequence2);
    }

    @Override
    public final View d(Context context, pj0 pj0Var, int i7, org.telegram.ui.ActionBar.h6 h6Var) {
        return new li(context, h6Var);
    }

    @Override
    public final boolean f() {
        return false;
    }
}
