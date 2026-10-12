package org.telegram.ui.Components;

import android.view.View;
public final class yt0 implements View.OnLayoutChangeListener {
    public final hw0 f33175a;

    public yt0(hw0 hw0Var) {
        this.f33175a = hw0Var;
    }

    @Override
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        hw0 hw0Var = this.f33175a;
        org.telegram.ui.ActionBar.u0 u0Var = hw0Var.f26938n0;
        if (u0Var == null) {
            return;
        }
        hw0Var.f26938n0.setTranslationX(((View) u0Var.getParent()).getMeasuredWidth() - hw0Var.f26938n0.getRight());
    }
}
