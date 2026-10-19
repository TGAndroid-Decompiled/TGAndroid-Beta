package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
public final class d80 extends org.telegram.ui.ActionBar.m1 {
    public final ViewGroup f25461o;
    public final i80 f25462p;

    public d80(i80 i80Var, View view, ViewGroup viewGroup) {
        super(view, -2, -2);
        this.f25462p = i80Var;
        this.f25461o = viewGroup;
    }

    @Override
    public final void dismiss() {
        d(true);
        ViewGroup viewGroup = this.f25461o;
        i80 i80Var = this.f25462p;
        i80.a(i80Var, viewGroup);
        Runnable runnable = i80Var.f27129p;
        if (runnable != null) {
            runnable.run();
            i80Var.f27129p = null;
        }
    }
}
