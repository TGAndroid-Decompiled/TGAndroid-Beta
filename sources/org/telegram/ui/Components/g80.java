package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
public final class g80 extends org.telegram.ui.ActionBar.o1 {
    public final ViewGroup f28462o;
    public final l80 f28463p;

    public g80(l80 l80Var, View view, ViewGroup viewGroup) {
        super(view, -2, -2);
        this.f28463p = l80Var;
        this.f28462o = viewGroup;
    }

    @Override
    public final void dismiss() {
        d(true);
        ViewGroup viewGroup = this.f28462o;
        l80 l80Var = this.f28463p;
        l80.a(l80Var, viewGroup);
        Runnable runnable = l80Var.f30163p;
        if (runnable != null) {
            runnable.run();
            l80Var.f30163p = null;
        }
    }
}
