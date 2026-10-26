package org.telegram.ui;

import android.graphics.Paint;
import android.view.ViewGroup;
public final class j40 extends Paint {
    public final v50 f40455a;

    public j40(v50 v50Var) {
        this.f40455a = v50Var;
    }

    @Override
    public final void setAlpha(int i10) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        super.setAlpha(i10);
        v50 v50Var = this.f40455a;
        viewGroup = ((org.telegram.ui.ActionBar.k3) v50Var).containerView;
        if (viewGroup != null) {
            viewGroup2 = ((org.telegram.ui.ActionBar.k3) v50Var).containerView;
            viewGroup2.invalidate();
        }
    }
}
