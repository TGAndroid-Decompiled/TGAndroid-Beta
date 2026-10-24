package org.telegram.ui.Components;

import android.view.View;
public final class nt0 implements View.OnLayoutChangeListener {
    public final wv0 f29034a;

    public nt0(wv0 wv0Var) {
        this.f29034a = wv0Var;
    }

    @Override
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        wv0 wv0Var = this.f29034a;
        org.telegram.ui.ActionBar.u0 u0Var = wv0Var.f32391n0;
        if (u0Var == null) {
            return;
        }
        wv0Var.f32391n0.setTranslationX(((View) u0Var.getParent()).getMeasuredWidth() - wv0Var.f32391n0.getRight());
    }
}
