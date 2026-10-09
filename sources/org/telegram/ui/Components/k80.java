package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
public final class k80 extends org.telegram.ui.ActionBar.n1 {
    public final ViewGroup f27873o;
    public final p80 f27874p;

    public k80(p80 p80Var, View view, ViewGroup viewGroup) {
        super(view, -2, -2);
        this.f27874p = p80Var;
        this.f27873o = viewGroup;
    }

    @Override
    public final void dismiss() {
        d(true);
        ViewGroup viewGroup = this.f27873o;
        p80 p80Var = this.f27874p;
        p80.a(p80Var, viewGroup);
        Runnable runnable = p80Var.f29784p;
        if (runnable != null) {
            runnable.run();
            p80Var.f29784p = null;
        }
    }
}
