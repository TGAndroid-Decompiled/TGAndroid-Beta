package org.telegram.ui.Components;

import android.view.View;
public final class ps0 implements View.OnLayoutChangeListener {
    public final yu0 f27134a;

    public ps0(yu0 yu0Var) {
        this.f27134a = yu0Var;
    }

    @Override
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        yu0 yu0Var = this.f27134a;
        org.telegram.ui.ActionBar.v0 v0Var = yu0Var.f30370n0;
        if (v0Var == null) {
            return;
        }
        yu0Var.f30370n0.setTranslationX(((View) v0Var.getParent()).getMeasuredWidth() - yu0Var.f30370n0.getRight());
    }
}
