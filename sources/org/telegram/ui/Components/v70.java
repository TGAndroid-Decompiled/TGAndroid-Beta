package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
public final class v70 extends org.telegram.ui.ActionBar.o1 {
    public final ViewGroup f29067o;
    public final a80 f29068p;

    public v70(a80 a80Var, View view, ViewGroup viewGroup) {
        super(view, -2, -2);
        this.f29068p = a80Var;
        this.f29067o = viewGroup;
    }

    @Override
    public final void dismiss() {
        d(true);
        ViewGroup viewGroup = this.f29067o;
        a80 a80Var = this.f29068p;
        a80.a(a80Var, viewGroup);
        Runnable runnable = a80Var.f22601p;
        if (runnable != null) {
            runnable.run();
            a80Var.f22601p = null;
        }
    }
}
