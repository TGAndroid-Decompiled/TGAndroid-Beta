package org.telegram.ui.Components;

import android.view.View;
public final class er0 implements View.OnLayoutChangeListener {
    public final gt0 f34787a;

    public er0(gt0 gt0Var) {
        this.f34787a = gt0Var;
    }

    @Override
    public final void onLayoutChange(View view, int i7, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        gt0 gt0Var = this.f34787a;
        org.telegram.ui.ActionBar.r0 r0Var = gt0Var.f35617q0;
        if (r0Var == null) {
            return;
        }
        gt0Var.f35617q0.setTranslationX(((View) r0Var.getParent()).getMeasuredWidth() - gt0Var.f35617q0.getRight());
    }
}
