package org.telegram.ui;

import android.view.View;
public final class d21 implements View.OnClickListener {
    public final l21 f44943a;

    public d21(l21 l21Var) {
        this.f44943a = l21Var;
    }

    @Override
    public final void onClick(View view) {
        org.telegram.ui.Components.ch0 ch0Var = this.f44943a.f47397k1;
        if (!ch0Var.b() && ch0Var.getAnimatedDrawable() != null) {
            ch0Var.getAnimatedDrawable().M(40);
            ch0Var.d();
        }
    }
}
