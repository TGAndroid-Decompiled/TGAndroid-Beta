package org.telegram.ui.Components;

import android.view.View;
public final class tt0 implements View.OnLayoutChangeListener {
    public final cw0 f31336a;

    public tt0(cw0 cw0Var) {
        this.f31336a = cw0Var;
    }

    @Override
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        cw0 cw0Var = this.f31336a;
        org.telegram.ui.ActionBar.u0 u0Var = cw0Var.f25517n0;
        if (u0Var == null) {
            return;
        }
        cw0Var.f25517n0.setTranslationX(((View) u0Var.getParent()).getMeasuredWidth() - cw0Var.f25517n0.getRight());
    }
}
