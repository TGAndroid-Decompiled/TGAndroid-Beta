package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
public final class g60 extends org.telegram.ui.ActionBar.g1 {
    public final ViewGroup f33880o;
    public final l60 f33881p;

    public g60(l60 l60Var, View view, ViewGroup viewGroup) {
        super(view, -2, -2);
        this.f33881p = l60Var;
        this.f33880o = viewGroup;
    }

    @Override
    public final void dismiss() {
        d(true);
        ViewGroup viewGroup = this.f33880o;
        l60 l60Var = this.f33881p;
        l60.a(l60Var, viewGroup);
        Runnable runnable = l60Var.f35612p;
        if (runnable != null) {
            runnable.run();
            l60Var.f35612p = null;
        }
    }
}
