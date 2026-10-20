package org.telegram.ui.Components;

import android.view.View;
public final class lt0 implements View.OnLayoutChangeListener {
    public final uv0 f28275a;

    public lt0(uv0 uv0Var) {
        this.f28275a = uv0Var;
    }

    @Override
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        uv0 uv0Var = this.f28275a;
        org.telegram.ui.ActionBar.u0 u0Var = uv0Var.f31051n0;
        if (u0Var == null) {
            return;
        }
        uv0Var.f31051n0.setTranslationX(((View) u0Var.getParent()).getMeasuredWidth() - uv0Var.f31051n0.getRight());
    }
}
