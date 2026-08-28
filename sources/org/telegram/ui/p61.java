package org.telegram.ui;

import android.view.View;
public final class p61 implements View.OnClickListener {
    public final y61 f41349a;

    public p61(y61 y61Var) {
        this.f41349a = y61Var;
    }

    @Override
    public final void onClick(View view) {
        org.telegram.ui.Components.pi0 pi0Var = this.f41349a.d;
        if (!pi0Var.b() && pi0Var.getAnimatedDrawable() != null) {
            pi0Var.getAnimatedDrawable().K(40);
            pi0Var.d();
        }
    }
}
