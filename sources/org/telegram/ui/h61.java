package org.telegram.ui;

import android.content.Context;
import android.view.View;
public final class h61 extends rg.b1 {
    public final i61 M;

    public h61(i61 i61Var, Context context) {
        super(context, 2, null);
        this.M = i61Var;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        i61 i61Var = this.M;
        if (i61Var.getParent() instanceof View) {
            ((View) i61Var.getParent()).invalidate();
        }
    }
}
