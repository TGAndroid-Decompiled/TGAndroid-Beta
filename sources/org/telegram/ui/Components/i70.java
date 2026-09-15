package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
public final class i70 extends org.telegram.ui.ActionBar.n1 {
    public final ViewGroup f24914o;
    public final n70 f24915p;

    public i70(n70 n70Var, View view, ViewGroup viewGroup) {
        super(view, -2, -2);
        this.f24915p = n70Var;
        this.f24914o = viewGroup;
    }

    @Override
    public final void dismiss() {
        d(true);
        ViewGroup viewGroup = this.f24914o;
        n70 n70Var = this.f24915p;
        n70.a(n70Var, viewGroup);
        Runnable runnable = n70Var.f26363p;
        if (runnable != null) {
            runnable.run();
            n70Var.f26363p = null;
        }
    }
}
