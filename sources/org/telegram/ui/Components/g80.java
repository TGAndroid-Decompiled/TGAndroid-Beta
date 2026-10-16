package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
public final class g80 extends org.telegram.ui.ActionBar.m1 {
    public final ViewGroup f24908o;
    public final l80 f24909p;

    public g80(l80 l80Var, View view, ViewGroup viewGroup) {
        super(view, -2, -2);
        this.f24909p = l80Var;
        this.f24908o = viewGroup;
    }

    @Override
    public final void dismiss() {
        d(true);
        ViewGroup viewGroup = this.f24908o;
        l80 l80Var = this.f24909p;
        l80.a(l80Var, viewGroup);
        Runnable runnable = l80Var.f26663p;
        if (runnable != null) {
            runnable.run();
            l80Var.f26663p = null;
        }
    }
}
