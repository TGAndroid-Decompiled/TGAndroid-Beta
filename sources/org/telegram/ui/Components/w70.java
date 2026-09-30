package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
public final class w70 extends org.telegram.ui.ActionBar.m1 {
    public final ViewGroup f29854o;
    public final b80 f29855p;

    public w70(b80 b80Var, View view, ViewGroup viewGroup) {
        super(view, -2, -2);
        this.f29855p = b80Var;
        this.f29854o = viewGroup;
    }

    @Override
    public final void dismiss() {
        d(true);
        ViewGroup viewGroup = this.f29854o;
        b80 b80Var = this.f29855p;
        b80.a(b80Var, viewGroup);
        Runnable runnable = b80Var.f22867p;
        if (runnable != null) {
            runnable.run();
            b80Var.f22867p = null;
        }
    }
}
