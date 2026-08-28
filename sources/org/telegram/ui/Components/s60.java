package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
public final class s60 extends org.telegram.ui.ActionBar.o1 {
    public final ViewGroup f32381o;
    public final x60 f32382p;

    public s60(x60 x60Var, View view, ViewGroup viewGroup) {
        super(view, -2, -2);
        this.f32382p = x60Var;
        this.f32381o = viewGroup;
    }

    @Override
    public final void dismiss() {
        d(true);
        ViewGroup viewGroup = this.f32381o;
        x60 x60Var = this.f32382p;
        x60.a(x60Var, viewGroup);
        Runnable runnable = x60Var.f34575p;
        if (runnable != null) {
            runnable.run();
            x60Var.f34575p = null;
        }
    }
}
