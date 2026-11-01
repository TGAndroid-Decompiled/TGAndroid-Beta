package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
public final class u60 extends org.telegram.ui.ActionBar.k1 {
    public final ViewGroup f30868o;
    public final z60 f30869p;

    public u60(z60 z60Var, View view, ViewGroup viewGroup) {
        super(view, -2, -2);
        this.f30869p = z60Var;
        this.f30868o = viewGroup;
    }

    @Override
    public final void dismiss() {
        d(true);
        ViewGroup viewGroup = this.f30868o;
        z60 z60Var = this.f30869p;
        z60.a(z60Var, viewGroup);
        Runnable runnable = z60Var.f33039p;
        if (runnable != null) {
            runnable.run();
            z60Var.f33039p = null;
        }
    }
}
