package org.telegram.ui;

import android.content.Context;
import android.view.View;
public final class i61 extends rg.b1 {
    public final j61 M;

    public i61(j61 j61Var, Context context) {
        super(context, 2, null);
        this.M = j61Var;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        j61 j61Var = this.M;
        if (j61Var.getParent() instanceof View) {
            ((View) j61Var.getParent()).invalidate();
        }
    }
}
