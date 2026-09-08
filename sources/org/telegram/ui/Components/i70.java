package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
public final class i70 extends org.telegram.ui.ActionBar.n1 {
    public final ViewGroup f27010o;
    public final n70 f27011p;

    public i70(n70 n70Var, View view, ViewGroup viewGroup) {
        super(view, -2, -2);
        this.f27011p = n70Var;
        this.f27010o = viewGroup;
    }

    @Override
    public final void dismiss() {
        d(true);
        ViewGroup viewGroup = this.f27010o;
        n70 n70Var = this.f27011p;
        n70.a(n70Var, viewGroup);
        Runnable runnable = n70Var.f28682p;
        if (runnable != null) {
            runnable.run();
            n70Var.f28682p = null;
        }
    }
}
