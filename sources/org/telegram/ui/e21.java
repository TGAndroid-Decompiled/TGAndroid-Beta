package org.telegram.ui;

import android.view.View;
public final class e21 implements View.OnClickListener {
    public final m21 f47041a;

    public e21(m21 m21Var) {
        this.f47041a = m21Var;
    }

    @Override
    public final void onClick(View view) {
        org.telegram.ui.Components.ph0 ph0Var = this.f47041a.f49700o1;
        if (!ph0Var.b() && ph0Var.getAnimatedDrawable() != null) {
            ph0Var.getAnimatedDrawable().M(40);
            ph0Var.d();
        }
    }
}
