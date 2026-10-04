package org.telegram.ui.Components;

import android.view.View;
public final class gt0 implements View.OnLayoutChangeListener {
    public final pv0 f26920a;

    public gt0(pv0 pv0Var) {
        this.f26920a = pv0Var;
    }

    @Override
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        pv0 pv0Var = this.f26920a;
        org.telegram.ui.ActionBar.v0 v0Var = pv0Var.f29782n0;
        if (v0Var == null) {
            return;
        }
        pv0Var.f29782n0.setTranslationX(((View) v0Var.getParent()).getMeasuredWidth() - pv0Var.f29782n0.getRight());
    }
}
