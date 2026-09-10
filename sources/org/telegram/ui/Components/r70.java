package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
public final class r70 extends org.telegram.ui.ActionBar.p1 {
    public final ViewGroup f26614o;
    public final w70 f26615p;

    public r70(w70 w70Var, View view, ViewGroup viewGroup) {
        super(view, -2, -2);
        this.f26615p = w70Var;
        this.f26614o = viewGroup;
    }

    @Override
    public final void dismiss() {
        d(true);
        ViewGroup viewGroup = this.f26614o;
        w70 w70Var = this.f26615p;
        w70.a(w70Var, viewGroup);
        Runnable runnable = w70Var.f28696p;
        if (runnable != null) {
            runnable.run();
            w70Var.f28696p = null;
        }
    }
}
