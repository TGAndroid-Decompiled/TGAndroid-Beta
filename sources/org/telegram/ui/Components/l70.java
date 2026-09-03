package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
public final class l70 extends org.telegram.ui.ActionBar.p1 {
    public final ViewGroup f28654o;
    public final q70 f28655p;

    public l70(q70 q70Var, View view, ViewGroup viewGroup) {
        super(view, -2, -2);
        this.f28655p = q70Var;
        this.f28654o = viewGroup;
    }

    @Override
    public final void dismiss() {
        d(true);
        ViewGroup viewGroup = this.f28654o;
        q70 q70Var = this.f28655p;
        q70.a(q70Var, viewGroup);
        Runnable runnable = q70Var.f30328p;
        if (runnable != null) {
            runnable.run();
            q70Var.f30328p = null;
        }
    }
}
