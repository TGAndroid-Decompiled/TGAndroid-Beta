package org.telegram.ui.Components;

import android.view.View;
public final class dt0 implements View.OnLayoutChangeListener {
    public final mv0 f23728a;

    public dt0(mv0 mv0Var) {
        this.f23728a = mv0Var;
    }

    @Override
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        mv0 mv0Var = this.f23728a;
        org.telegram.ui.ActionBar.u0 u0Var = mv0Var.f26430n0;
        if (u0Var == null) {
            return;
        }
        mv0Var.f26430n0.setTranslationX(((View) u0Var.getParent()).getMeasuredWidth() - mv0Var.f26430n0.getRight());
    }
}
