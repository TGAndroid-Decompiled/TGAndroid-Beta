package org.telegram.ui.Components;

import android.view.View;
public final class ct0 implements View.OnLayoutChangeListener {
    public final lv0 f23392a;

    public ct0(lv0 lv0Var) {
        this.f23392a = lv0Var;
    }

    @Override
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        lv0 lv0Var = this.f23392a;
        org.telegram.ui.ActionBar.u0 u0Var = lv0Var.f26135n0;
        if (u0Var == null) {
            return;
        }
        lv0Var.f26135n0.setTranslationX(((View) u0Var.getParent()).getMeasuredWidth() - lv0Var.f26135n0.getRight());
    }
}
