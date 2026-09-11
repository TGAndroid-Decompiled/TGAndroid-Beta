package org.telegram.ui.Components;

import android.view.View;
public final class os0 implements View.OnLayoutChangeListener {
    public final xu0 f29178a;

    public os0(xu0 xu0Var) {
        this.f29178a = xu0Var;
    }

    @Override
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        xu0 xu0Var = this.f29178a;
        org.telegram.ui.ActionBar.v0 v0Var = xu0Var.f32707n0;
        if (v0Var == null) {
            return;
        }
        xu0Var.f32707n0.setTranslationX(((View) v0Var.getParent()).getMeasuredWidth() - xu0Var.f32707n0.getRight());
    }
}
