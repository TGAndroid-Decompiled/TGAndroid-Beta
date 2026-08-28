package org.telegram.ui.Components;

import android.view.View;
public final class vr0 implements View.OnLayoutChangeListener {
    public final eu0 f33985a;

    public vr0(eu0 eu0Var) {
        this.f33985a = eu0Var;
    }

    @Override
    public final void onLayoutChange(View view, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        eu0 eu0Var = this.f33985a;
        org.telegram.ui.ActionBar.w0 w0Var = eu0Var.f28143j0;
        if (w0Var == null) {
            return;
        }
        eu0Var.f28143j0.setTranslationX(((View) w0Var.getParent()).getMeasuredWidth() - eu0Var.f28143j0.getRight());
    }
}
