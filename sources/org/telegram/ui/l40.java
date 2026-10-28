package org.telegram.ui;

import android.graphics.Paint;
import android.view.ViewGroup;
public final class l40 extends Paint {
    public final x50 f40968a;

    public l40(x50 x50Var) {
        this.f40968a = x50Var;
    }

    @Override
    public final void setAlpha(int i10) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        super.setAlpha(i10);
        x50 x50Var = this.f40968a;
        viewGroup = ((org.telegram.ui.ActionBar.k3) x50Var).containerView;
        if (viewGroup != null) {
            viewGroup2 = ((org.telegram.ui.ActionBar.k3) x50Var).containerView;
            viewGroup2.invalidate();
        }
    }
}
