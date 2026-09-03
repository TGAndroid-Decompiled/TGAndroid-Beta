package org.telegram.ui;

import android.view.View;
public final class m71 implements View.OnClickListener {
    public final v71 f35992a;

    public m71(v71 v71Var) {
        this.f35992a = v71Var;
    }

    @Override
    public final void onClick(View view) {
        org.telegram.ui.Components.jj0 jj0Var = this.f35992a.d;
        if (!jj0Var.b() && jj0Var.getAnimatedDrawable() != null) {
            jj0Var.getAnimatedDrawable().K(40);
            jj0Var.d();
        }
    }
}
