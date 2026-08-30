package org.telegram.ui;

import android.view.View;
public final class f71 implements View.OnClickListener {
    public final o71 f34180a;

    public f71(o71 o71Var) {
        this.f34180a = o71Var;
    }

    @Override
    public final void onClick(View view) {
        org.telegram.ui.Components.jj0 jj0Var = this.f34180a.d;
        if (!jj0Var.b() && jj0Var.getAnimatedDrawable() != null) {
            jj0Var.getAnimatedDrawable().K(40);
            jj0Var.d();
        }
    }
}
