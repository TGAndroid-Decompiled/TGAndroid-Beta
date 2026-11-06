package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
public final class f60 extends org.telegram.ui.ActionBar.g1 {
    public final ViewGroup f33466o;
    public final k60 f33467p;

    public f60(k60 k60Var, View view, ViewGroup viewGroup) {
        super(view, -2, -2);
        this.f33467p = k60Var;
        this.f33466o = viewGroup;
    }

    @Override
    public final void dismiss() {
        d(true);
        ViewGroup viewGroup = this.f33466o;
        k60 k60Var = this.f33467p;
        k60.a(k60Var, viewGroup);
        Runnable runnable = k60Var.f35175p;
        if (runnable != null) {
            runnable.run();
            k60Var.f35175p = null;
        }
    }
}
