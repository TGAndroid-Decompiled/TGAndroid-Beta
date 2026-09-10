package org.telegram.ui;

import android.view.View;
public final class a81 implements View.OnClickListener {
    public final j81 f30834a;

    public a81(j81 j81Var) {
        this.f30834a = j81Var;
    }

    @Override
    public final void onClick(View view) {
        org.telegram.ui.Components.kj0 kj0Var = this.f30834a.d;
        if (!kj0Var.b() && kj0Var.getAnimatedDrawable() != null) {
            kj0Var.getAnimatedDrawable().M(40);
            kj0Var.d();
        }
    }
}
