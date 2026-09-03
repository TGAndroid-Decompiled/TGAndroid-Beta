package org.telegram.ui;

import android.content.Context;
import android.view.View;
public final class e61 extends fg.r1 {
    public final f61 J;

    public e61(f61 f61Var, Context context) {
        super(context, 2, null);
        this.J = f61Var;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        f61 f61Var = this.J;
        if (f61Var.getParent() instanceof View) {
            ((View) f61Var.getParent()).invalidate();
        }
    }
}
