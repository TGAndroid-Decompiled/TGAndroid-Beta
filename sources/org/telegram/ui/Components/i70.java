package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
public final class i70 extends org.telegram.ui.ActionBar.o1 {
    public final ViewGroup f24849o;
    public final n70 f24850p;

    public i70(n70 n70Var, View view, ViewGroup viewGroup) {
        super(view, -2, -2);
        this.f24850p = n70Var;
        this.f24849o = viewGroup;
    }

    @Override
    public final void dismiss() {
        d(true);
        ViewGroup viewGroup = this.f24849o;
        n70 n70Var = this.f24850p;
        n70.a(n70Var, viewGroup);
        Runnable runnable = n70Var.f26379p;
        if (runnable != null) {
            runnable.run();
            n70Var.f26379p = null;
        }
    }
}
