package org.telegram.ui;

import android.content.Context;
import android.view.View;
public final class h51 extends sg.c1 {
    public final i51 M;

    public h51(i51 i51Var, Context context) {
        super(context, 2, null);
        this.M = i51Var;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        i51 i51Var = this.M;
        if (i51Var.getParent() instanceof View) {
            ((View) i51Var.getParent()).invalidate();
        }
    }
}
