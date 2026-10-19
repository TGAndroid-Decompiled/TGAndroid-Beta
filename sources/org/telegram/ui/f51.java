package org.telegram.ui;

import android.content.Context;
import android.view.View;
public final class f51 extends sg.c1 {
    public final g51 M;

    public f51(g51 g51Var, Context context) {
        super(context, 2, null);
        this.M = g51Var;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        g51 g51Var = this.M;
        if (g51Var.getParent() instanceof View) {
            ((View) g51Var.getParent()).invalidate();
        }
    }
}
