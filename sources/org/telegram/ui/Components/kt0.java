package org.telegram.ui.Components;

import android.view.View;
public final class kt0 implements View.OnLayoutChangeListener {
    public final tv0 f27969a;

    public kt0(tv0 tv0Var) {
        this.f27969a = tv0Var;
    }

    @Override
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        tv0 tv0Var = this.f27969a;
        org.telegram.ui.ActionBar.u0 u0Var = tv0Var.f30713n0;
        if (u0Var == null) {
            return;
        }
        tv0Var.f30713n0.setTranslationX(((View) u0Var.getParent()).getMeasuredWidth() - tv0Var.f30713n0.getRight());
    }
}
