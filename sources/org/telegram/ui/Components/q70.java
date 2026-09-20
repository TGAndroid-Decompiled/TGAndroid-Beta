package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
public final class q70 extends org.telegram.ui.ActionBar.n1 {
    public final ViewGroup f27532o;
    public final v70 f27533p;

    public q70(v70 v70Var, View view, ViewGroup viewGroup) {
        super(view, -2, -2);
        this.f27533p = v70Var;
        this.f27532o = viewGroup;
    }

    @Override
    public final void dismiss() {
        d(true);
        ViewGroup viewGroup = this.f27532o;
        v70 v70Var = this.f27533p;
        v70.a(v70Var, viewGroup);
        Runnable runnable = v70Var.f28989p;
        if (runnable != null) {
            runnable.run();
            v70Var.f28989p = null;
        }
    }
}
