package org.telegram.ui.Components;

import android.view.View;
public final class wq0 implements View.OnLayoutChangeListener {
    public final ys0 f41423a;

    public wq0(ys0 ys0Var) {
        this.f41423a = ys0Var;
    }

    @Override
    public final void onLayoutChange(View view, int i7, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        ys0 ys0Var = this.f41423a;
        org.telegram.ui.ActionBar.q0 q0Var = ys0Var.f42125q0;
        if (q0Var == null) {
            return;
        }
        ys0Var.f42125q0.setTranslationX(((View) q0Var.getParent()).getMeasuredWidth() - ys0Var.f42125q0.getRight());
    }
}
