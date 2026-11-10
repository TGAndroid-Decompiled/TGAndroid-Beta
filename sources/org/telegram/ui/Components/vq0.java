package org.telegram.ui.Components;

import android.view.View;
public final class vq0 implements View.OnLayoutChangeListener {
    public final ys0 f39716a;

    public vq0(ys0 ys0Var) {
        this.f39716a = ys0Var;
    }

    @Override
    public final void onLayoutChange(View view, int i7, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        ys0 ys0Var = this.f39716a;
        org.telegram.ui.ActionBar.r0 r0Var = ys0Var.f40695p0;
        if (r0Var == null) {
            return;
        }
        ys0Var.f40695p0.setTranslationX(((View) r0Var.getParent()).getMeasuredWidth() - ys0Var.f40695p0.getRight());
    }
}
