package org.telegram.ui.Components;

import android.view.View;
public final class jt0 implements View.OnLayoutChangeListener {
    public final sv0 f27596a;

    public jt0(sv0 sv0Var) {
        this.f27596a = sv0Var;
    }

    @Override
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        sv0 sv0Var = this.f27596a;
        org.telegram.ui.ActionBar.u0 u0Var = sv0Var.f30369n0;
        if (u0Var == null) {
            return;
        }
        sv0Var.f30369n0.setTranslationX(((View) u0Var.getParent()).getMeasuredWidth() - sv0Var.f30369n0.getRight());
    }
}
