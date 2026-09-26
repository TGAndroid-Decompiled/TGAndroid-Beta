package org.telegram.ui;

import android.view.View;
public final class o71 implements View.OnClickListener {
    public final x71 f36075a;

    public o71(x71 x71Var) {
        this.f36075a = x71Var;
    }

    @Override
    public final void onClick(View view) {
        org.telegram.ui.Components.mj0 mj0Var = this.f36075a.d;
        if (!mj0Var.b() && mj0Var.getAnimatedDrawable() != null) {
            mj0Var.getAnimatedDrawable().M(40);
            mj0Var.d();
        }
    }
}
