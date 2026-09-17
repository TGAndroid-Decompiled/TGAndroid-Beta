package org.telegram.ui.Components;

import android.view.View;
public final class qs0 implements View.OnLayoutChangeListener {
    public final zu0 f27397a;

    public qs0(zu0 zu0Var) {
        this.f27397a = zu0Var;
    }

    @Override
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        zu0 zu0Var = this.f27397a;
        org.telegram.ui.ActionBar.w0 w0Var = zu0Var.f30637n0;
        if (w0Var == null) {
            return;
        }
        zu0Var.f30637n0.setTranslationX(((View) w0Var.getParent()).getMeasuredWidth() - zu0Var.f30637n0.getRight());
    }
}
