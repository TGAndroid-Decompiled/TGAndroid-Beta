package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
public final class t70 extends org.telegram.ui.ActionBar.m1 {
    public final ViewGroup f28441o;
    public final y70 f28442p;

    public t70(y70 y70Var, View view, ViewGroup viewGroup) {
        super(view, -2, -2);
        this.f28442p = y70Var;
        this.f28441o = viewGroup;
    }

    @Override
    public final void dismiss() {
        d(true);
        ViewGroup viewGroup = this.f28441o;
        y70 y70Var = this.f28442p;
        y70.a(y70Var, viewGroup);
        Runnable runnable = y70Var.f30549p;
        if (runnable != null) {
            runnable.run();
            y70Var.f30549p = null;
        }
    }
}
