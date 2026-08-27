package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;

public final class w60 extends org.telegram.ui.ActionBar.n1 {

    public final ViewGroup f34127o;

    public final b70 f34128p;

    public w60(b70 b70Var, View view, ViewGroup viewGroup) {
        super(view, -2, -2);
        this.f34128p = b70Var;
        this.f34127o = viewGroup;
    }

    @Override
    public final void dismiss() {
        d(true);
        ViewGroup viewGroup = this.f34127o;
        b70 b70Var = this.f34128p;
        b70.a(b70Var, viewGroup);
        Runnable runnable = b70Var.f26987p;
        if (runnable != null) {
            runnable.run();
            b70Var.f26987p = null;
        }
    }
}
