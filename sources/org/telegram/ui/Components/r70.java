package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
public final class r70 extends org.telegram.ui.ActionBar.n1 {
    public final ViewGroup f27843o;
    public final w70 f27844p;

    public r70(w70 w70Var, View view, ViewGroup viewGroup) {
        super(view, -2, -2);
        this.f27844p = w70Var;
        this.f27843o = viewGroup;
    }

    @Override
    public final void dismiss() {
        d(true);
        ViewGroup viewGroup = this.f27843o;
        w70 w70Var = this.f27844p;
        w70.a(w70Var, viewGroup);
        Runnable runnable = w70Var.f29919p;
        if (runnable != null) {
            runnable.run();
            w70Var.f29919p = null;
        }
    }
}
