package org.telegram.ui;

import android.content.Context;
import android.view.View;
public final class p01 extends vg.y0 {
    public final q01 N;

    public p01(q01 q01Var, Context context) {
        super(2, context, null);
        this.N = q01Var;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        q01 q01Var = this.N;
        if (q01Var.getParent() instanceof View) {
            ((View) q01Var.getParent()).invalidate();
        }
    }
}
