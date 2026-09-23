package org.telegram.ui;

import android.view.View;
public final class n71 implements View.OnClickListener {
    public final w71 f35448a;

    public n71(w71 w71Var) {
        this.f35448a = w71Var;
    }

    @Override
    public final void onClick(View view) {
        org.telegram.ui.Components.bj0 bj0Var = this.f35448a.d;
        if (!bj0Var.b() && bj0Var.getAnimatedDrawable() != null) {
            bj0Var.getAnimatedDrawable().M(40);
            bj0Var.d();
        }
    }
}
