package org.telegram.ui.Components;

import android.view.View;
public final class at0 implements View.OnLayoutChangeListener {
    public final jv0 f22766a;

    public at0(jv0 jv0Var) {
        this.f22766a = jv0Var;
    }

    @Override
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        jv0 jv0Var = this.f22766a;
        org.telegram.ui.ActionBar.v0 v0Var = jv0Var.f25509n0;
        if (v0Var == null) {
            return;
        }
        jv0Var.f25509n0.setTranslationX(((View) v0Var.getParent()).getMeasuredWidth() - jv0Var.f25509n0.getRight());
    }
}
