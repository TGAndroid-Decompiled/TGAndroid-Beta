package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
public final class f80 extends org.telegram.ui.ActionBar.o1 {
    public final ViewGroup f28085o;
    public final k80 f28086p;

    public f80(k80 k80Var, View view, ViewGroup viewGroup) {
        super(view, -2, -2);
        this.f28086p = k80Var;
        this.f28085o = viewGroup;
    }

    @Override
    public final void dismiss() {
        d(true);
        ViewGroup viewGroup = this.f28085o;
        k80 k80Var = this.f28086p;
        k80.a(k80Var, viewGroup);
        Runnable runnable = k80Var.f29863p;
        if (runnable != null) {
            runnable.run();
            k80Var.f29863p = null;
        }
    }
}
