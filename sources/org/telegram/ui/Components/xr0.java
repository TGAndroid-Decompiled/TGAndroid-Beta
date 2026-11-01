package org.telegram.ui.Components;

import android.view.View;
public final class xr0 implements View.OnLayoutChangeListener {
    public final au0 f32630a;

    public xr0(au0 au0Var) {
        this.f32630a = au0Var;
    }

    @Override
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        au0 au0Var = this.f32630a;
        org.telegram.ui.ActionBar.t0 t0Var = au0Var.f24544p0;
        if (t0Var == null) {
            return;
        }
        au0Var.f24544p0.setTranslationX(((View) t0Var.getParent()).getMeasuredWidth() - au0Var.f24544p0.getRight());
    }
}
