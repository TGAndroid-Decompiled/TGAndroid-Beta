package org.telegram.ui.Components;

import android.view.View;
public final class ot0 implements View.OnLayoutChangeListener {
    public final xv0 f29313a;

    public ot0(xv0 xv0Var) {
        this.f29313a = xv0Var;
    }

    @Override
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        xv0 xv0Var = this.f29313a;
        org.telegram.ui.ActionBar.u0 u0Var = xv0Var.f32692n0;
        if (u0Var == null) {
            return;
        }
        xv0Var.f32692n0.setTranslationX(((View) u0Var.getParent()).getMeasuredWidth() - xv0Var.f32692n0.getRight());
    }
}
