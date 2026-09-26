package org.telegram.ui;

import android.view.View;
public final class o71 implements View.OnClickListener {
    public final x71 f36076a;

    public o71(x71 x71Var) {
        this.f36076a = x71Var;
    }

    @Override
    public final void onClick(View view) {
        org.telegram.ui.Components.lj0 lj0Var = this.f36076a.d;
        if (!lj0Var.b() && lj0Var.getAnimatedDrawable() != null) {
            lj0Var.getAnimatedDrawable().M(40);
            lj0Var.d();
        }
    }
}
