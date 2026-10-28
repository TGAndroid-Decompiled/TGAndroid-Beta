package org.telegram.ui.Components;

import android.view.View;
public final class xt0 implements View.OnLayoutChangeListener {
    public final bw0 f34846a;

    public xt0(bw0 bw0Var) {
        this.f34846a = bw0Var;
    }

    @Override
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        bw0 bw0Var = this.f34846a;
        org.telegram.ui.ActionBar.w0 w0Var = bw0Var.f26971p0;
        if (w0Var == null) {
            return;
        }
        bw0Var.f26971p0.setTranslationX(((View) w0Var.getParent()).getMeasuredWidth() - bw0Var.f26971p0.getRight());
    }
}
