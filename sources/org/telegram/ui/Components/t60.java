package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
public final class t60 extends org.telegram.ui.ActionBar.g1 {
    public final ViewGroup f39786o;
    public final a70 f39787p;

    public t60(a70 a70Var, View view, ViewGroup viewGroup) {
        super(view, -2, -2);
        this.f39787p = a70Var;
        this.f39786o = viewGroup;
    }

    @Override
    public final void dismiss() {
        d(true);
        ViewGroup viewGroup = this.f39786o;
        a70 a70Var = this.f39787p;
        a70.a(a70Var, viewGroup);
        Runnable runnable = a70Var.f33391p;
        if (runnable != null) {
            runnable.run();
            a70Var.f33391p = null;
        }
    }
}
