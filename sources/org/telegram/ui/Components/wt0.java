package org.telegram.ui.Components;

import android.view.View;
public final class wt0 implements View.OnLayoutChangeListener {
    public final aw0 f34534a;

    public wt0(aw0 aw0Var) {
        this.f34534a = aw0Var;
    }

    @Override
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        aw0 aw0Var = this.f34534a;
        org.telegram.ui.ActionBar.w0 w0Var = aw0Var.f26683p0;
        if (w0Var == null) {
            return;
        }
        aw0Var.f26683p0.setTranslationX(((View) w0Var.getParent()).getMeasuredWidth() - aw0Var.f26683p0.getRight());
    }
}
