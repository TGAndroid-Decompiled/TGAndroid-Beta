package org.telegram.ui;

import android.view.View;
public final class f21 implements View.OnClickListener {
    public final n21 f45567a;

    public f21(n21 n21Var) {
        this.f45567a = n21Var;
    }

    @Override
    public final void onClick(View view) {
        org.telegram.ui.Components.dh0 dh0Var = this.f45567a.f48065k1;
        if (!dh0Var.b() && dh0Var.getAnimatedDrawable() != null) {
            dh0Var.getAnimatedDrawable().M(40);
            dh0Var.d();
        }
    }
}
