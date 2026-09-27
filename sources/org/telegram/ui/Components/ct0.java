package org.telegram.ui.Components;

import android.view.View;
public final class ct0 implements View.OnLayoutChangeListener {
    public final lv0 f23407a;

    public ct0(lv0 lv0Var) {
        this.f23407a = lv0Var;
    }

    @Override
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        lv0 lv0Var = this.f23407a;
        org.telegram.ui.ActionBar.w0 w0Var = lv0Var.f26193n0;
        if (w0Var == null) {
            return;
        }
        lv0Var.f26193n0.setTranslationX(((View) w0Var.getParent()).getMeasuredWidth() - lv0Var.f26193n0.getRight());
    }
}
