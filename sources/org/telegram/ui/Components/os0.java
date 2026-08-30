package org.telegram.ui.Components;

import android.view.View;
public final class os0 implements View.OnLayoutChangeListener {
    public final yu0 f27660a;

    public os0(yu0 yu0Var) {
        this.f27660a = yu0Var;
    }

    @Override
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        yu0 yu0Var = this.f27660a;
        org.telegram.ui.ActionBar.w0 w0Var = yu0Var.f31126k0;
        if (w0Var == null) {
            return;
        }
        yu0Var.f31126k0.setTranslationX(((View) w0Var.getParent()).getMeasuredWidth() - yu0Var.f31126k0.getRight());
    }
}
