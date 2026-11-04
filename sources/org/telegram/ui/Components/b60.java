package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
public final class b60 extends org.telegram.ui.ActionBar.f1 {
    public final ViewGroup f32098o;
    public final f60 f32099p;

    public b60(f60 f60Var, View view, ViewGroup viewGroup) {
        super(view, -2, -2);
        this.f32099p = f60Var;
        this.f32098o = viewGroup;
    }

    @Override
    public final void dismiss() {
        d(true);
        ViewGroup viewGroup = this.f32098o;
        f60 f60Var = this.f32099p;
        f60.a(f60Var, viewGroup);
        Runnable runnable = f60Var.f33742p;
        if (runnable != null) {
            runnable.run();
            f60Var.f33742p = null;
        }
    }
}
