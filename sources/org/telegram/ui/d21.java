package org.telegram.ui;

import android.view.View;
public final class d21 implements View.OnClickListener {
    public final l21 f46937a;

    public d21(l21 l21Var) {
        this.f46937a = l21Var;
    }

    @Override
    public final void onClick(View view) {
        org.telegram.ui.Components.qh0 qh0Var = this.f46937a.f49579o1;
        if (!qh0Var.b() && qh0Var.getAnimatedDrawable() != null) {
            qh0Var.getAnimatedDrawable().M(40);
            qh0Var.d();
        }
    }
}
