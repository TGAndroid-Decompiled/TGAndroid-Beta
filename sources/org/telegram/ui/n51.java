package org.telegram.ui;

import android.content.Context;
import android.view.View;
public final class n51 extends tg.c1 {
    public final o51 M;

    public n51(o51 o51Var, Context context) {
        super(context, 2, null);
        this.M = o51Var;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        o51 o51Var = this.M;
        if (o51Var.getParent() instanceof View) {
            ((View) o51Var.getParent()).invalidate();
        }
    }
}
