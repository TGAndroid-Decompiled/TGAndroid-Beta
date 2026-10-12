package org.telegram.ui;

import android.view.View;
public final class b81 implements View.OnClickListener {
    public final k81 f36107a;

    public b81(k81 k81Var) {
        this.f36107a = k81Var;
    }

    @Override
    public final void onClick(View view) {
        org.telegram.ui.Components.ik0 ik0Var = this.f36107a.d;
        if (!ik0Var.b() && ik0Var.getAnimatedDrawable() != null) {
            ik0Var.getAnimatedDrawable().M(40);
            ik0Var.d();
        }
    }
}
