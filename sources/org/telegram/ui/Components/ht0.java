package org.telegram.ui.Components;

import android.view.View;
public final class ht0 implements View.OnLayoutChangeListener {
    public final qv0 f27325a;

    public ht0(qv0 qv0Var) {
        this.f27325a = qv0Var;
    }

    @Override
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        qv0 qv0Var = this.f27325a;
        org.telegram.ui.ActionBar.v0 v0Var = qv0Var.f30244n0;
        if (v0Var == null) {
            return;
        }
        qv0Var.f30244n0.setTranslationX(((View) v0Var.getParent()).getMeasuredWidth() - qv0Var.f30244n0.getRight());
    }
}
