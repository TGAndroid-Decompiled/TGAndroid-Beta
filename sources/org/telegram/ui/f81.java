package org.telegram.ui;

import android.view.View;
public final class f81 implements View.OnClickListener {
    public final o81 f35761a;

    public f81(o81 o81Var) {
        this.f35761a = o81Var;
    }

    @Override
    public final void onClick(View view) {
        org.telegram.ui.Components.bk0 bk0Var = this.f35761a.d;
        if (!bk0Var.b() && bk0Var.getAnimatedDrawable() != null) {
            bk0Var.getAnimatedDrawable().M(40);
            bk0Var.d();
        }
    }
}
