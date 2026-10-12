package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
public final class n80 extends org.telegram.ui.ActionBar.m1 {
    public final ViewGroup f28753o;
    public final s80 f28754p;

    public n80(s80 s80Var, View view, ViewGroup viewGroup) {
        super(view, -2, -2);
        this.f28754p = s80Var;
        this.f28753o = viewGroup;
    }

    @Override
    public final void dismiss() {
        d(true);
        ViewGroup viewGroup = this.f28753o;
        s80 s80Var = this.f28754p;
        s80.a(s80Var, viewGroup);
        Runnable runnable = s80Var.f30467p;
        if (runnable != null) {
            runnable.run();
            s80Var.f30467p = null;
        }
    }
}
