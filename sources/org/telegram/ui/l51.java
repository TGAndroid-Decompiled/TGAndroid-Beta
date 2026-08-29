package org.telegram.ui;

import android.content.Context;
import android.view.View;
public final class l51 extends cg.t1 {
    public final m51 I;

    public l51(m51 m51Var, Context context) {
        super(context, 2, null);
        this.I = m51Var;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        m51 m51Var = this.I;
        if (m51Var.getParent() instanceof View) {
            ((View) m51Var.getParent()).invalidate();
        }
    }
}
