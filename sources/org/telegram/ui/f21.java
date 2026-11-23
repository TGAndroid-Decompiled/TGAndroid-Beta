package org.telegram.ui;

import android.view.View;
public final class f21 implements View.OnClickListener {
    public final n21 f47462a;

    public f21(n21 n21Var) {
        this.f47462a = n21Var;
    }

    @Override
    public final void onClick(View view) {
        org.telegram.ui.Components.rh0 rh0Var = this.f47462a.f50076o1;
        if (!rh0Var.b() && rh0Var.getAnimatedDrawable() != null) {
            rh0Var.getAnimatedDrawable().M(40);
            rh0Var.d();
        }
    }
}
