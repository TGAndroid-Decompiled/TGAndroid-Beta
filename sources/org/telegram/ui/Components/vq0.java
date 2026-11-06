package org.telegram.ui.Components;

import android.view.View;
public final class vq0 implements View.OnLayoutChangeListener {
    public final xs0 f39669a;

    public vq0(xs0 xs0Var) {
        this.f39669a = xs0Var;
    }

    @Override
    public final void onLayoutChange(View view, int i7, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        xs0 xs0Var = this.f39669a;
        org.telegram.ui.ActionBar.r0 r0Var = xs0Var.f40416p0;
        if (r0Var == null) {
            return;
        }
        xs0Var.f40416p0.setTranslationX(((View) r0Var.getParent()).getMeasuredWidth() - xs0Var.f40416p0.getRight());
    }
}
