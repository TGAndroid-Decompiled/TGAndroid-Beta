package org.telegram.ui;

import android.view.View;
public final class g21 implements View.OnClickListener {
    public final o21 f45923a;

    public g21(o21 o21Var) {
        this.f45923a = o21Var;
    }

    @Override
    public final void onClick(View view) {
        org.telegram.ui.Components.ch0 ch0Var = this.f45923a.n1;
        if (!ch0Var.b() && ch0Var.getAnimatedDrawable() != null) {
            ch0Var.getAnimatedDrawable().M(40);
            ch0Var.d();
        }
    }
}
