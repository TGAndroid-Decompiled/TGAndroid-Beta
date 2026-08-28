package org.telegram.ui;

import android.content.Context;
import android.view.View;
public final class j51 extends zf.b1 {
    public final k51 I;

    public j51(k51 k51Var, Context context) {
        super(context, 2, null);
        this.I = k51Var;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        k51 k51Var = this.I;
        if (k51Var.getParent() instanceof View) {
            ((View) k51Var.getParent()).invalidate();
        }
    }
}
