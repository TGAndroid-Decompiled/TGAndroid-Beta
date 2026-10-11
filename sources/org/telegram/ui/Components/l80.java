package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
public final class l80 extends org.telegram.ui.ActionBar.m1 {
    public final ViewGroup f28231o;
    public final q80 f28232p;

    public l80(q80 q80Var, View view, ViewGroup viewGroup) {
        super(view, -2, -2);
        this.f28232p = q80Var;
        this.f28231o = viewGroup;
    }

    @Override
    public final void dismiss() {
        d(true);
        ViewGroup viewGroup = this.f28231o;
        q80 q80Var = this.f28232p;
        q80.a(q80Var, viewGroup);
        Runnable runnable = q80Var.f30078p;
        if (runnable != null) {
            runnable.run();
            q80Var.f30078p = null;
        }
    }
}
