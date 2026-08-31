package org.telegram.ui;

import android.view.View;
public final class g71 implements View.OnClickListener {
    public final p71 f37109a;

    public g71(p71 p71Var) {
        this.f37109a = p71Var;
    }

    @Override
    public final void onClick(View view) {
        org.telegram.ui.Components.lj0 lj0Var = this.f37109a.d;
        if (!lj0Var.b() && lj0Var.getAnimatedDrawable() != null) {
            lj0Var.getAnimatedDrawable().K(40);
            lj0Var.d();
        }
    }
}
