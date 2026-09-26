package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
public final class u70 extends org.telegram.ui.ActionBar.m1 {
    public final ViewGroup f28735o;
    public final z70 f28736p;

    public u70(z70 z70Var, View view, ViewGroup viewGroup) {
        super(view, -2, -2);
        this.f28736p = z70Var;
        this.f28735o = viewGroup;
    }

    @Override
    public final void dismiss() {
        d(true);
        ViewGroup viewGroup = this.f28735o;
        z70 z70Var = this.f28736p;
        z70.a(z70Var, viewGroup);
        Runnable runnable = z70Var.f30834p;
        if (runnable != null) {
            runnable.run();
            z70Var.f30834p = null;
        }
    }
}
