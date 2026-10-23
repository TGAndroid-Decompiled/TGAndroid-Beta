package org.telegram.ui;

import android.view.View;
public final class p61 implements View.OnClickListener {
    public final y61 f40386a;

    public p61(y61 y61Var) {
        this.f40386a = y61Var;
    }

    @Override
    public final void onClick(View view) {
        org.telegram.ui.Components.bk0 bk0Var = this.f40386a.d;
        if (!bk0Var.b() && bk0Var.getAnimatedDrawable() != null) {
            bk0Var.getAnimatedDrawable().M(40);
            bk0Var.d();
        }
    }
}
