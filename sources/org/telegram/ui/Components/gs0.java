package org.telegram.ui.Components;

import android.view.View;
public final class gs0 implements View.OnLayoutChangeListener {
    public final qu0 f28976a;

    public gs0(qu0 qu0Var) {
        this.f28976a = qu0Var;
    }

    @Override
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        qu0 qu0Var = this.f28976a;
        org.telegram.ui.ActionBar.w0 w0Var = qu0Var.f32076j0;
        if (w0Var == null) {
            return;
        }
        qu0Var.f32076j0.setTranslationX(((View) w0Var.getParent()).getMeasuredWidth() - qu0Var.f32076j0.getRight());
    }
}
