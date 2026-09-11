package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
public final class i70 extends org.telegram.ui.ActionBar.n1 {
    public final ViewGroup f26983o;
    public final n70 f26984p;

    public i70(n70 n70Var, View view, ViewGroup viewGroup) {
        super(view, -2, -2);
        this.f26984p = n70Var;
        this.f26983o = viewGroup;
    }

    @Override
    public final void dismiss() {
        d(true);
        ViewGroup viewGroup = this.f26983o;
        n70 n70Var = this.f26984p;
        n70.a(n70Var, viewGroup);
        Runnable runnable = n70Var.f28655p;
        if (runnable != null) {
            runnable.run();
            n70Var.f28655p = null;
        }
    }
}
