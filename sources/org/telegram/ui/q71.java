package org.telegram.ui;

import android.view.View;
public final class q71 implements View.OnClickListener {
    public final z71 f39634a;

    public q71(z71 z71Var) {
        this.f39634a = z71Var;
    }

    @Override
    public final void onClick(View view) {
        org.telegram.ui.Components.nj0 nj0Var = this.f39634a.d;
        if (!nj0Var.b() && nj0Var.getAnimatedDrawable() != null) {
            nj0Var.getAnimatedDrawable().M(40);
            nj0Var.d();
        }
    }
}
