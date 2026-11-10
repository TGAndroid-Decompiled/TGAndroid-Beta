package org.telegram.ui;

import android.content.Context;
import android.view.View;
public final class c11 extends ug.z0 {
    public final d11 M;

    public c11(d11 d11Var, Context context) {
        super(2, context, null);
        this.M = d11Var;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        d11 d11Var = this.M;
        if (d11Var.getParent() instanceof View) {
            ((View) d11Var.getParent()).invalidate();
        }
    }
}
