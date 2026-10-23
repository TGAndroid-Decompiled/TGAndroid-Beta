package org.telegram.ui;

import android.view.View;
public final class l61 implements View.OnClickListener {
    public final u61 f38835a;

    public l61(u61 u61Var) {
        this.f38835a = u61Var;
    }

    @Override
    public final void onClick(View view) {
        org.telegram.ui.Components.yj0 yj0Var = this.f38835a.d;
        if (!yj0Var.b() && yj0Var.getAnimatedDrawable() != null) {
            yj0Var.getAnimatedDrawable().M(40);
            yj0Var.d();
        }
    }
}
