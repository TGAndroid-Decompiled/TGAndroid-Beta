package org.telegram.ui;

import android.content.Context;
import android.view.View;
public final class b11 extends ug.b1 {
    public final c11 N;

    public b11(c11 c11Var, Context context) {
        super(2, context, null);
        this.N = c11Var;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        c11 c11Var = this.N;
        if (c11Var.getParent() instanceof View) {
            ((View) c11Var.getParent()).invalidate();
        }
    }
}
