package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
public final class ki extends z41 {
    public static final int f27767b = 0;

    static {
        z41.h(new z41());
    }

    @Override
    public final void b(View view, a51 a51Var, boolean z10, p51 p51Var, u51 u51Var) {
        li liVar = (li) view;
        CharSequence charSequence = a51Var.f24292l;
        CharSequence charSequence2 = a51Var.f24293m;
        liVar.f28116b.setText(charSequence);
        liVar.f28117c.setText(charSequence2);
    }

    @Override
    public final View d(Context context, tk0 tk0Var, int i10, org.telegram.ui.ActionBar.p6 p6Var) {
        return new li(context, p6Var);
    }

    @Override
    public final boolean f() {
        return false;
    }
}
