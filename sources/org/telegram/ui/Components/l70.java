package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
public final class l70 extends org.telegram.ui.ActionBar.p1 {
    public final ViewGroup f28639o;
    public final q70 f28640p;

    public l70(q70 q70Var, View view, ViewGroup viewGroup) {
        super(view, -2, -2);
        this.f28640p = q70Var;
        this.f28639o = viewGroup;
    }

    @Override
    public final void dismiss() {
        d(true);
        ViewGroup viewGroup = this.f28639o;
        q70 q70Var = this.f28640p;
        q70.a(q70Var, viewGroup);
        Runnable runnable = q70Var.f30324p;
        if (runnable != null) {
            runnable.run();
            q70Var.f30324p = null;
        }
    }
}
