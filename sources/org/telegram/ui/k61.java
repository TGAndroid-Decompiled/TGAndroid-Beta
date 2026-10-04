package org.telegram.ui;

import android.content.Context;
import android.view.View;
public final class k61 extends rg.c1 {
    public final l61 M;

    public k61(l61 l61Var, Context context) {
        super(context, 2, null);
        this.M = l61Var;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        l61 l61Var = this.M;
        if (l61Var.getParent() instanceof View) {
            ((View) l61Var.getParent()).invalidate();
        }
    }
}
