package org.telegram.ui;

import android.content.Context;
import android.view.View;

public final class i51 extends ag.k2 {
    public final j51 I;

    public i51(j51 j51Var, Context context) {
        super(context, 2, null);
        this.I = j51Var;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        j51 j51Var = this.I;
        if (j51Var.getParent() instanceof View) {
            ((View) j51Var.getParent()).invalidate();
        }
    }
}
