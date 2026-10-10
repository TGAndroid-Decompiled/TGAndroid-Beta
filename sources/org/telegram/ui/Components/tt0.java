package org.telegram.ui.Components;

import android.view.View;
public final class tt0 implements View.OnLayoutChangeListener {
    public final cw0 f31217a;

    public tt0(cw0 cw0Var) {
        this.f31217a = cw0Var;
    }

    @Override
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        cw0 cw0Var = this.f31217a;
        org.telegram.ui.ActionBar.v0 v0Var = cw0Var.f25455n0;
        if (v0Var == null) {
            return;
        }
        cw0Var.f25455n0.setTranslationX(((View) v0Var.getParent()).getMeasuredWidth() - cw0Var.f25455n0.getRight());
    }
}
