package org.telegram.ui.Components;

import android.view.View;

public final class wr0 implements View.OnLayoutChangeListener {

    public final hu0 f34315a;

    public wr0(hu0 hu0Var) {
        this.f34315a = hu0Var;
    }

    @Override
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        hu0 hu0Var = this.f34315a;
        org.telegram.ui.ActionBar.v0 v0Var = hu0Var.f29128j0;
        if (v0Var == null) {
            return;
        }
        hu0Var.f29128j0.setTranslationX(((View) v0Var.getParent()).getMeasuredWidth() - hu0Var.f29128j0.getRight());
    }
}
