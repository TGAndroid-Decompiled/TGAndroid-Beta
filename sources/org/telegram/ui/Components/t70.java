package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
public final class t70 extends org.telegram.ui.ActionBar.m1 {
    public final ViewGroup f28442o;
    public final y70 f28443p;

    public t70(y70 y70Var, View view, ViewGroup viewGroup) {
        super(view, -2, -2);
        this.f28443p = y70Var;
        this.f28442o = viewGroup;
    }

    @Override
    public final void dismiss() {
        d(true);
        ViewGroup viewGroup = this.f28442o;
        y70 y70Var = this.f28443p;
        y70.a(y70Var, viewGroup);
        Runnable runnable = y70Var.f30550p;
        if (runnable != null) {
            runnable.run();
            y70Var.f30550p = null;
        }
    }
}
