package org.telegram.ui;

import android.content.Context;
import android.view.View;
public final class j51 extends sg.c1 {
    public final k51 M;

    public j51(k51 k51Var, Context context) {
        super(context, 2, null);
        this.M = k51Var;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        k51 k51Var = this.M;
        if (k51Var.getParent() instanceof View) {
            ((View) k51Var.getParent()).invalidate();
        }
    }
}
