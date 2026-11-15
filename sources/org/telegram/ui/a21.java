package org.telegram.ui;

import android.view.View;
public final class a21 implements View.OnClickListener {
    public final i21 f44925a;

    public a21(i21 i21Var) {
        this.f44925a = i21Var;
    }

    @Override
    public final void onClick(View view) {
        org.telegram.ui.Components.fh0 fh0Var = this.f44925a.f47888o1;
        if (!fh0Var.b() && fh0Var.getAnimatedDrawable() != null) {
            fh0Var.getAnimatedDrawable().M(40);
            fh0Var.d();
        }
    }
}
