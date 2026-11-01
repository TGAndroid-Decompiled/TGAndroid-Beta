package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
public final class ki extends a51 {
    public static final int f27856b = 0;

    static {
        a51.h(new a51());
    }

    @Override
    public final void b(View view, b51 b51Var, boolean z10, q51 q51Var, v51 v51Var) {
        li liVar = (li) view;
        CharSequence charSequence = b51Var.f24643l;
        CharSequence charSequence2 = b51Var.f24644m;
        liVar.f28174b.setText(charSequence);
        liVar.f28175c.setText(charSequence2);
    }

    @Override
    public final View d(Context context, uk0 uk0Var, int i10, org.telegram.ui.ActionBar.p6 p6Var) {
        return new li(context, p6Var);
    }

    @Override
    public final boolean f() {
        return false;
    }
}
