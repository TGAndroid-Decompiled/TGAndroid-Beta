package org.telegram.ui;

import android.graphics.Paint;
import android.view.ViewGroup;
public final class e40 extends Paint {
    public final q50 f36535a;

    public e40(q50 q50Var) {
        this.f36535a = q50Var;
    }

    @Override
    public final void setAlpha(int i10) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        super.setAlpha(i10);
        q50 q50Var = this.f36535a;
        viewGroup = ((org.telegram.ui.ActionBar.f3) q50Var).containerView;
        if (viewGroup != null) {
            viewGroup2 = ((org.telegram.ui.ActionBar.f3) q50Var).containerView;
            viewGroup2.invalidate();
        }
    }
}
