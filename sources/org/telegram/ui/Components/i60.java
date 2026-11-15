package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
public final class i60 extends org.telegram.ui.ActionBar.g1 {
    public final ViewGroup f35462o;
    public final m60 f35463p;

    public i60(m60 m60Var, View view, ViewGroup viewGroup) {
        super(view, -2, -2);
        this.f35463p = m60Var;
        this.f35462o = viewGroup;
    }

    @Override
    public final void dismiss() {
        d(true);
        ViewGroup viewGroup = this.f35462o;
        m60 m60Var = this.f35463p;
        m60.a(m60Var, viewGroup);
        Runnable runnable = m60Var.f37106p;
        if (runnable != null) {
            runnable.run();
            m60Var.f37106p = null;
        }
    }
}
