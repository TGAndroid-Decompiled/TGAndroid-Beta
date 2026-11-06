package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
public final class f60 extends org.telegram.ui.ActionBar.g1 {
    public final ViewGroup f33487o;
    public final k60 f33488p;

    public f60(k60 k60Var, View view, ViewGroup viewGroup) {
        super(view, -2, -2);
        this.f33488p = k60Var;
        this.f33487o = viewGroup;
    }

    @Override
    public final void dismiss() {
        d(true);
        ViewGroup viewGroup = this.f33487o;
        k60 k60Var = this.f33488p;
        k60.a(k60Var, viewGroup);
        Runnable runnable = k60Var.f35211p;
        if (runnable != null) {
            runnable.run();
            k60Var.f35211p = null;
        }
    }
}
