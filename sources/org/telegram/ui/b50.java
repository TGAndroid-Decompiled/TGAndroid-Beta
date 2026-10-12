package org.telegram.ui;

import android.graphics.Paint;
import android.view.ViewGroup;
public final class b50 extends Paint {
    public final n60 f34422a;

    public b50(n60 n60Var) {
        this.f34422a = n60Var;
    }

    @Override
    public final void setAlpha(int i10) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        super.setAlpha(i10);
        n60 n60Var = this.f34422a;
        viewGroup = ((org.telegram.ui.ActionBar.e3) n60Var).containerView;
        if (viewGroup != null) {
            viewGroup2 = ((org.telegram.ui.ActionBar.e3) n60Var).containerView;
            viewGroup2.invalidate();
        }
    }
}
