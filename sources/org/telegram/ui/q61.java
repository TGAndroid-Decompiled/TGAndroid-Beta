package org.telegram.ui;

import android.view.View;
public final class q61 implements View.OnClickListener {
    public final z61 f42754a;

    public q61(z61 z61Var) {
        this.f42754a = z61Var;
    }

    @Override
    public final void onClick(View view) {
        org.telegram.ui.Components.ak0 ak0Var = this.f42754a.d;
        if (!ak0Var.b() && ak0Var.getAnimatedDrawable() != null) {
            ak0Var.getAnimatedDrawable().M(40);
            ak0Var.d();
        }
    }
}
