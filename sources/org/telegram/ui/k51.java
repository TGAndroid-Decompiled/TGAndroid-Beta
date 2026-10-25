package org.telegram.ui;

import android.content.Context;
import android.view.View;
public final class k51 extends tg.c1 {
    public final l51 M;

    public k51(l51 l51Var, Context context) {
        super(context, 2, null);
        this.M = l51Var;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        l51 l51Var = this.M;
        if (l51Var.getParent() instanceof View) {
            ((View) l51Var.getParent()).invalidate();
        }
    }
}
