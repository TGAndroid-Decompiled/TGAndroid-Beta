package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
public final class d80 extends org.telegram.ui.ActionBar.m1 {
    public final ViewGroup f25378o;
    public final i80 f25379p;

    public d80(i80 i80Var, View view, ViewGroup viewGroup) {
        super(view, -2, -2);
        this.f25379p = i80Var;
        this.f25378o = viewGroup;
    }

    @Override
    public final void dismiss() {
        d(true);
        ViewGroup viewGroup = this.f25378o;
        i80 i80Var = this.f25379p;
        i80.a(i80Var, viewGroup);
        Runnable runnable = i80Var.f27183p;
        if (runnable != null) {
            runnable.run();
            i80Var.f27183p = null;
        }
    }
}
