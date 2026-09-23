package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
public final class j70 extends org.telegram.ui.ActionBar.n1 {
    public final ViewGroup f25159o;
    public final o70 f25160p;

    public j70(o70 o70Var, View view, ViewGroup viewGroup) {
        super(view, -2, -2);
        this.f25160p = o70Var;
        this.f25159o = viewGroup;
    }

    @Override
    public final void dismiss() {
        d(true);
        ViewGroup viewGroup = this.f25159o;
        o70 o70Var = this.f25160p;
        o70.a(o70Var, viewGroup);
        Runnable runnable = o70Var.f26664p;
        if (runnable != null) {
            runnable.run();
            o70Var.f26664p = null;
        }
    }
}
