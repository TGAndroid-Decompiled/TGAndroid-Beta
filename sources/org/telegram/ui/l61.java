package org.telegram.ui;

import android.view.View;
public final class l61 implements View.OnClickListener {
    public final u61 f38824a;

    public l61(u61 u61Var) {
        this.f38824a = u61Var;
    }

    @Override
    public final void onClick(View view) {
        org.telegram.ui.Components.xj0 xj0Var = this.f38824a.d;
        if (!xj0Var.b() && xj0Var.getAnimatedDrawable() != null) {
            xj0Var.getAnimatedDrawable().M(40);
            xj0Var.d();
        }
    }
}
