package org.telegram.ui;

import android.view.View;
public final class e21 implements View.OnClickListener {
    public final m21 f47083a;

    public e21(m21 m21Var) {
        this.f47083a = m21Var;
    }

    @Override
    public final void onClick(View view) {
        org.telegram.ui.Components.rh0 rh0Var = this.f47083a.f49721o1;
        if (!rh0Var.b() && rh0Var.getAnimatedDrawable() != null) {
            rh0Var.getAnimatedDrawable().M(40);
            rh0Var.d();
        }
    }
}
