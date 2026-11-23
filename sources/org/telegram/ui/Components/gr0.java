package org.telegram.ui.Components;

import android.view.View;
public final class gr0 implements View.OnLayoutChangeListener {
    public final jt0 f35656a;

    public gr0(jt0 jt0Var) {
        this.f35656a = jt0Var;
    }

    @Override
    public final void onLayoutChange(View view, int i7, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        jt0 jt0Var = this.f35656a;
        org.telegram.ui.ActionBar.q0 q0Var = jt0Var.f36659q0;
        if (q0Var == null) {
            return;
        }
        jt0Var.f36659q0.setTranslationX(((View) q0Var.getParent()).getMeasuredWidth() - jt0Var.f36659q0.getRight());
    }
}
