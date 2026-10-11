package org.telegram.ui.Components;

import android.view.View;
public final class ut0 implements View.OnLayoutChangeListener {
    public final dw0 f31564a;

    public ut0(dw0 dw0Var) {
        this.f31564a = dw0Var;
    }

    @Override
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        dw0 dw0Var = this.f31564a;
        org.telegram.ui.ActionBar.u0 u0Var = dw0Var.f25716n0;
        if (u0Var == null) {
            return;
        }
        dw0Var.f25716n0.setTranslationX(((View) u0Var.getParent()).getMeasuredWidth() - dw0Var.f25716n0.getRight());
    }
}
