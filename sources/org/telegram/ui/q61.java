package org.telegram.ui;

import android.content.Context;
import android.view.View;
public final class q61 extends rg.b1 {
    public final r61 M;

    public q61(r61 r61Var, Context context) {
        super(context, 2, null);
        this.M = r61Var;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        r61 r61Var = this.M;
        if (r61Var.getParent() instanceof View) {
            ((View) r61Var.getParent()).invalidate();
        }
    }
}
