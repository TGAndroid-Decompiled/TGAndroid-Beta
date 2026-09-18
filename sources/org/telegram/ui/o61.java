package org.telegram.ui;

import android.content.Context;
import android.view.View;
public final class o61 extends rg.b1 {
    public final p61 M;

    public o61(p61 p61Var, Context context) {
        super(context, 2, null);
        this.M = p61Var;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        p61 p61Var = this.M;
        if (p61Var.getParent() instanceof View) {
            ((View) p61Var.getParent()).invalidate();
        }
    }
}
