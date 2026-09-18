package org.telegram.ui.Components;

import android.view.View;
public final class bt0 implements View.OnLayoutChangeListener {
    public final kv0 f23075a;

    public bt0(kv0 kv0Var) {
        this.f23075a = kv0Var;
    }

    @Override
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        kv0 kv0Var = this.f23075a;
        org.telegram.ui.ActionBar.v0 v0Var = kv0Var.f25829n0;
        if (v0Var == null) {
            return;
        }
        kv0Var.f25829n0.setTranslationX(((View) v0Var.getParent()).getMeasuredWidth() - kv0Var.f25829n0.getRight());
    }
}
