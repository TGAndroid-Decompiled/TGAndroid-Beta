package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
public final class l80 extends org.telegram.ui.ActionBar.n1 {
    public final ViewGroup f28224o;
    public final q80 f28225p;

    public l80(q80 q80Var, View view, ViewGroup viewGroup) {
        super(view, -2, -2);
        this.f28225p = q80Var;
        this.f28224o = viewGroup;
    }

    @Override
    public final void dismiss() {
        d(true);
        ViewGroup viewGroup = this.f28224o;
        q80 q80Var = this.f28225p;
        q80.a(q80Var, viewGroup);
        Runnable runnable = q80Var.f30115p;
        if (runnable != null) {
            runnable.run();
            q80Var.f30115p = null;
        }
    }
}
