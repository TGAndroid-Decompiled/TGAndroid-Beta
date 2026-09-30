package org.telegram.ui;

import android.view.View;
public final class o71 implements View.OnClickListener {
    public final x71 f36213a;

    public o71(x71 x71Var) {
        this.f36213a = x71Var;
    }

    @Override
    public final void onClick(View view) {
        org.telegram.ui.Components.oj0 oj0Var = this.f36213a.d;
        if (!oj0Var.b() && oj0Var.getAnimatedDrawable() != null) {
            oj0Var.getAnimatedDrawable().M(40);
            oj0Var.d();
        }
    }
}
