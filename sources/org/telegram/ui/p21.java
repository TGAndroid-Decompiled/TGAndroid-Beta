package org.telegram.ui;

import android.content.Context;
import android.view.View;
public final class p21 extends kg.l1 {
    public final q21 M;

    public p21(q21 q21Var, Context context) {
        super(2, context, null);
        this.M = q21Var;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        q21 q21Var = this.M;
        if (q21Var.getParent() instanceof View) {
            ((View) q21Var.getParent()).invalidate();
        }
    }
}
