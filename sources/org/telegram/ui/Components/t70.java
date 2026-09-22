package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
public final class t70 extends org.telegram.ui.ActionBar.n1 {
    public final ViewGroup f28407o;
    public final y70 f28408p;

    public t70(y70 y70Var, View view, ViewGroup viewGroup) {
        super(view, -2, -2);
        this.f28408p = y70Var;
        this.f28407o = viewGroup;
    }

    @Override
    public final void dismiss() {
        d(true);
        ViewGroup viewGroup = this.f28407o;
        y70 y70Var = this.f28408p;
        y70.a(y70Var, viewGroup);
        Runnable runnable = y70Var.f30563p;
        if (runnable != null) {
            runnable.run();
            y70Var.f30563p = null;
        }
    }
}
