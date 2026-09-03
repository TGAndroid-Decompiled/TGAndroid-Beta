package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
public final class k70 extends org.telegram.ui.ActionBar.p1 {
    public final ViewGroup f26179o;
    public final p70 f26180p;

    public k70(p70 p70Var, View view, ViewGroup viewGroup) {
        super(view, -2, -2);
        this.f26180p = p70Var;
        this.f26179o = viewGroup;
    }

    @Override
    public final void dismiss() {
        d(true);
        ViewGroup viewGroup = this.f26179o;
        p70 p70Var = this.f26180p;
        p70.a(p70Var, viewGroup);
        Runnable runnable = p70Var.f27772p;
        if (runnable != null) {
            runnable.run();
            p70Var.f27772p = null;
        }
    }
}
