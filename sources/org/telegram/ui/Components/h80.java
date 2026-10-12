package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
public final class h80 extends org.telegram.ui.ActionBar.m1 {
    public final ViewGroup f25538o;
    public final m80 f25539p;

    public h80(m80 m80Var, View view, ViewGroup viewGroup) {
        super(view, -2, -2);
        this.f25539p = m80Var;
        this.f25538o = viewGroup;
    }

    @Override
    public final void dismiss() {
        d(true);
        ViewGroup viewGroup = this.f25538o;
        m80 m80Var = this.f25539p;
        m80.a(m80Var, viewGroup);
        Runnable runnable = m80Var.f27293p;
        if (runnable != null) {
            runnable.run();
            m80Var.f27293p = null;
        }
    }
}
