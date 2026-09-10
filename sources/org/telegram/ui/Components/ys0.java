package org.telegram.ui.Components;

import android.view.View;
public final class ys0 implements View.OnLayoutChangeListener {
    public final iv0 f29490a;

    public ys0(iv0 iv0Var) {
        this.f29490a = iv0Var;
    }

    @Override
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        iv0 iv0Var = this.f29490a;
        org.telegram.ui.ActionBar.w0 w0Var = iv0Var.f24112n0;
        if (w0Var == null) {
            return;
        }
        iv0Var.f24112n0.setTranslationX(((View) w0Var.getParent()).getMeasuredWidth() - iv0Var.f24112n0.getRight());
    }
}
