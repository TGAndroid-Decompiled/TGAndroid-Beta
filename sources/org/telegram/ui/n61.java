package org.telegram.ui;

import android.view.View;
public final class n61 implements View.OnClickListener {
    public final w61 f39384a;

    public n61(w61 w61Var) {
        this.f39384a = w61Var;
    }

    @Override
    public final void onClick(View view) {
        org.telegram.ui.Components.xj0 xj0Var = this.f39384a.d;
        if (!xj0Var.b() && xj0Var.getAnimatedDrawable() != null) {
            xj0Var.getAnimatedDrawable().M(40);
            xj0Var.d();
        }
    }
}
