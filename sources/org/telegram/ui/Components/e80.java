package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
public final class e80 extends org.telegram.ui.ActionBar.m1 {
    public final ViewGroup f25919o;
    public final j80 f25920p;

    public e80(j80 j80Var, View view, ViewGroup viewGroup) {
        super(view, -2, -2);
        this.f25920p = j80Var;
        this.f25919o = viewGroup;
    }

    @Override
    public final void dismiss() {
        d(true);
        ViewGroup viewGroup = this.f25919o;
        j80 j80Var = this.f25920p;
        j80.a(j80Var, viewGroup);
        Runnable runnable = j80Var.f27575p;
        if (runnable != null) {
            runnable.run();
            j80Var.f27575p = null;
        }
    }
}
