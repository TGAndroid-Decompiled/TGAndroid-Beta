package org.telegram.ui;

import android.view.View;
public final class l71 implements View.OnClickListener {
    public final u71 f38564a;

    public l71(u71 u71Var) {
        this.f38564a = u71Var;
    }

    @Override
    public final void onClick(View view) {
        org.telegram.ui.Components.kj0 kj0Var = this.f38564a.d;
        if (!kj0Var.b() && kj0Var.getAnimatedDrawable() != null) {
            kj0Var.getAnimatedDrawable().K(40);
            kj0Var.d();
        }
    }
}
