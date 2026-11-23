package org.telegram.ui.Components;

import android.view.View;
public final class fr0 implements View.OnLayoutChangeListener {
    public final it0 f35185a;

    public fr0(it0 it0Var) {
        this.f35185a = it0Var;
    }

    @Override
    public final void onLayoutChange(View view, int i7, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        it0 it0Var = this.f35185a;
        org.telegram.ui.ActionBar.q0 q0Var = it0Var.f36141q0;
        if (q0Var == null) {
            return;
        }
        it0Var.f36141q0.setTranslationX(((View) q0Var.getParent()).getMeasuredWidth() - it0Var.f36141q0.getRight());
    }
}
