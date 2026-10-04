package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
public final class w70 extends org.telegram.ui.ActionBar.n1 {
    public final ViewGroup f32474o;
    public final b80 f32475p;

    public w70(b80 b80Var, View view, ViewGroup viewGroup) {
        super(view, -2, -2);
        this.f32475p = b80Var;
        this.f32474o = viewGroup;
    }

    @Override
    public final void dismiss() {
        d(true);
        ViewGroup viewGroup = this.f32474o;
        b80 b80Var = this.f32475p;
        b80.a(b80Var, viewGroup);
        Runnable runnable = b80Var.f24839p;
        if (runnable != null) {
            runnable.run();
            b80Var.f24839p = null;
        }
    }
}
