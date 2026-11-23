package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
public final class t60 extends org.telegram.ui.ActionBar.g1 {
    public final ViewGroup f39741o;
    public final a70 f39742p;

    public t60(a70 a70Var, View view, ViewGroup viewGroup) {
        super(view, -2, -2);
        this.f39742p = a70Var;
        this.f39741o = viewGroup;
    }

    @Override
    public final void dismiss() {
        d(true);
        ViewGroup viewGroup = this.f39741o;
        a70 a70Var = this.f39742p;
        a70.a(a70Var, viewGroup);
        Runnable runnable = a70Var.f33357p;
        if (runnable != null) {
            runnable.run();
            a70Var.f33357p = null;
        }
    }
}
