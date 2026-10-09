package org.telegram.ui.Components;

import android.view.View;
public final class st0 implements View.OnLayoutChangeListener {
    public final bw0 f30891a;

    public st0(bw0 bw0Var) {
        this.f30891a = bw0Var;
    }

    @Override
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        bw0 bw0Var = this.f30891a;
        org.telegram.ui.ActionBar.v0 v0Var = bw0Var.f25147n0;
        if (v0Var == null) {
            return;
        }
        bw0Var.f25147n0.setTranslationX(((View) v0Var.getParent()).getMeasuredWidth() - bw0Var.f25147n0.getRight());
    }
}
