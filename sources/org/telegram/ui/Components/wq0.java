package org.telegram.ui.Components;

import android.view.View;
public final class wq0 implements View.OnLayoutChangeListener {
    public final zs0 f40131a;

    public wq0(zs0 zs0Var) {
        this.f40131a = zs0Var;
    }

    @Override
    public final void onLayoutChange(View view, int i7, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        zs0 zs0Var = this.f40131a;
        org.telegram.ui.ActionBar.r0 r0Var = zs0Var.f41103p0;
        if (r0Var == null) {
            return;
        }
        zs0Var.f41103p0.setTranslationX(((View) r0Var.getParent()).getMeasuredWidth() - zs0Var.f41103p0.getRight());
    }
}
