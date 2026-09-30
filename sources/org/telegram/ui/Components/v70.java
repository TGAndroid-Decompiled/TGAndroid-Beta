package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
public final class v70 extends org.telegram.ui.ActionBar.m1 {
    public final ViewGroup f29002o;
    public final a80 f29003p;

    public v70(a80 a80Var, View view, ViewGroup viewGroup) {
        super(view, -2, -2);
        this.f29003p = a80Var;
        this.f29002o = viewGroup;
    }

    @Override
    public final void dismiss() {
        d(true);
        ViewGroup viewGroup = this.f29002o;
        a80 a80Var = this.f29003p;
        a80.a(a80Var, viewGroup);
        Runnable runnable = a80Var.f22599p;
        if (runnable != null) {
            runnable.run();
            a80Var.f22599p = null;
        }
    }
}
