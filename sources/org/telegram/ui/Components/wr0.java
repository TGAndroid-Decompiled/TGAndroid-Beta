package org.telegram.ui.Components;

import android.view.View;
public final class wr0 implements View.OnLayoutChangeListener {
    public final zt0 f32236a;

    public wr0(zt0 zt0Var) {
        this.f32236a = zt0Var;
    }

    @Override
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        zt0 zt0Var = this.f32236a;
        org.telegram.ui.ActionBar.t0 t0Var = zt0Var.f33216p0;
        if (t0Var == null) {
            return;
        }
        zt0Var.f33216p0.setTranslationX(((View) t0Var.getParent()).getMeasuredWidth() - zt0Var.f33216p0.getRight());
    }
}
