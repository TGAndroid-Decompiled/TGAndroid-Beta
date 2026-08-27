package org.telegram.ui;

import android.view.View;

public final class o61 implements View.OnClickListener {

    public final x61 f41020a;

    public o61(x61 x61Var) {
        this.f41020a = x61Var;
    }

    @Override
    public final void onClick(View view) {
        org.telegram.ui.Components.ri0 ri0Var = this.f41020a.d;
        if (ri0Var.b() || ri0Var.getAnimatedDrawable() == null) {
            return;
        }
        ri0Var.getAnimatedDrawable().K(40);
        ri0Var.d();
    }
}
