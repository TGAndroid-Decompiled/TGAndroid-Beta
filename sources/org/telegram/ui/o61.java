package org.telegram.ui;

import android.view.View;
public final class o61 implements View.OnClickListener {
    public final x61 f40091a;

    public o61(x61 x61Var) {
        this.f40091a = x61Var;
    }

    @Override
    public final void onClick(View view) {
        org.telegram.ui.Components.ak0 ak0Var = this.f40091a.d;
        if (!ak0Var.b() && ak0Var.getAnimatedDrawable() != null) {
            ak0Var.getAnimatedDrawable().M(40);
            ak0Var.d();
        }
    }
}
