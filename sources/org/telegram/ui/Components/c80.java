package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
public final class c80 extends org.telegram.ui.ActionBar.m1 {
    public final ViewGroup f25252o;
    public final h80 f25253p;

    public c80(h80 h80Var, View view, ViewGroup viewGroup) {
        super(view, -2, -2);
        this.f25253p = h80Var;
        this.f25252o = viewGroup;
    }

    @Override
    public final void dismiss() {
        d(true);
        ViewGroup viewGroup = this.f25252o;
        h80 h80Var = this.f25253p;
        h80.a(h80Var, viewGroup);
        Runnable runnable = h80Var.f26924p;
        if (runnable != null) {
            runnable.run();
            h80Var.f26924p = null;
        }
    }
}
