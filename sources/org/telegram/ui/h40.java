package org.telegram.ui;

import android.graphics.Paint;
import android.view.ViewGroup;
public final class h40 extends Paint {
    public final u50 f37738a;

    public h40(u50 u50Var) {
        this.f37738a = u50Var;
    }

    @Override
    public final void setAlpha(int i10) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        super.setAlpha(i10);
        u50 u50Var = this.f37738a;
        viewGroup = ((org.telegram.ui.ActionBar.h3) u50Var).containerView;
        if (viewGroup != null) {
            viewGroup2 = ((org.telegram.ui.ActionBar.h3) u50Var).containerView;
            viewGroup2.invalidate();
        }
    }
}
