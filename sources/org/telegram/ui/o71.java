package org.telegram.ui;

import android.view.View;
public final class o71 implements View.OnClickListener {
    public final x71 f39110a;

    public o71(x71 x71Var) {
        this.f39110a = x71Var;
    }

    @Override
    public final void onClick(View view) {
        org.telegram.ui.Components.nj0 nj0Var = this.f39110a.d;
        if (!nj0Var.b() && nj0Var.getAnimatedDrawable() != null) {
            nj0Var.getAnimatedDrawable().M(40);
            nj0Var.d();
        }
    }
}
