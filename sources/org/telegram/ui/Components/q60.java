package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
public final class q60 extends org.telegram.ui.ActionBar.g1 {
    public final ViewGroup f38716o;
    public final x60 f38717p;

    public q60(x60 x60Var, View view, ViewGroup viewGroup) {
        super(view, -2, -2);
        this.f38717p = x60Var;
        this.f38716o = viewGroup;
    }

    @Override
    public final void dismiss() {
        d(true);
        ViewGroup viewGroup = this.f38716o;
        x60 x60Var = this.f38717p;
        x60.a(x60Var, viewGroup);
        Runnable runnable = x60Var.f41886p;
        if (runnable != null) {
            runnable.run();
            x60Var.f41886p = null;
        }
    }
}
