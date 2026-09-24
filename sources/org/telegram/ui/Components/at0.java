package org.telegram.ui.Components;

import android.view.View;
public final class at0 implements View.OnLayoutChangeListener {
    public final jv0 f22751a;

    public at0(jv0 jv0Var) {
        this.f22751a = jv0Var;
    }

    @Override
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        jv0 jv0Var = this.f22751a;
        org.telegram.ui.ActionBar.u0 u0Var = jv0Var.f25524n0;
        if (u0Var == null) {
            return;
        }
        jv0Var.f25524n0.setTranslationX(((View) u0Var.getParent()).getMeasuredWidth() - jv0Var.f25524n0.getRight());
    }
}
