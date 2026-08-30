package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
public final class j70 extends org.telegram.ui.ActionBar.p1 {
    public final ViewGroup f25928o;
    public final o70 f25929p;

    public j70(o70 o70Var, View view, ViewGroup viewGroup) {
        super(view, -2, -2);
        this.f25929p = o70Var;
        this.f25928o = viewGroup;
    }

    @Override
    public final void dismiss() {
        d(true);
        ViewGroup viewGroup = this.f25928o;
        o70 o70Var = this.f25929p;
        o70.a(o70Var, viewGroup);
        Runnable runnable = o70Var.f27484p;
        if (runnable != null) {
            runnable.run();
            o70Var.f27484p = null;
        }
    }
}
