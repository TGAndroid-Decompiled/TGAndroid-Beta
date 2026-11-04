package org.telegram.ui.Components;

import android.view.View;
public final class vq0 implements View.OnLayoutChangeListener {
    public final ws0 f39768a;

    public vq0(ws0 ws0Var) {
        this.f39768a = ws0Var;
    }

    @Override
    public final void onLayoutChange(View view, int i3, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        ws0 ws0Var = this.f39768a;
        org.telegram.ui.ActionBar.q0 q0Var = ws0Var.f40117q0;
        if (q0Var == null) {
            return;
        }
        ws0Var.f40117q0.setTranslationX(((View) q0Var.getParent()).getMeasuredWidth() - ws0Var.f40117q0.getRight());
    }
}
