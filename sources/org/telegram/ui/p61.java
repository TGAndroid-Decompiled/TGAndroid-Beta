package org.telegram.ui;

import android.content.Context;
import android.view.View;
public final class p61 extends rg.b1 {
    public final q61 M;

    public p61(q61 q61Var, Context context) {
        super(context, 2, null);
        this.M = q61Var;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        q61 q61Var = this.M;
        if (q61Var.getParent() instanceof View) {
            ((View) q61Var.getParent()).invalidate();
        }
    }
}
