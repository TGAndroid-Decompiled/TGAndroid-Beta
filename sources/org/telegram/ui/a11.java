package org.telegram.ui;

import android.content.Context;
import android.view.View;
public final class a11 extends ug.b1 {
    public final b11 N;

    public a11(b11 b11Var, Context context) {
        super(2, context, null);
        this.N = b11Var;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        b11 b11Var = this.N;
        if (b11Var.getParent() instanceof View) {
            ((View) b11Var.getParent()).invalidate();
        }
    }
}
