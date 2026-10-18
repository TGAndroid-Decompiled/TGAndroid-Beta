package org.telegram.ui;

import android.graphics.Paint;
import android.view.ViewGroup;
public final class g40 extends Paint {
    public final s50 f37099a;

    public g40(s50 s50Var) {
        this.f37099a = s50Var;
    }

    @Override
    public final void setAlpha(int i10) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        super.setAlpha(i10);
        s50 s50Var = this.f37099a;
        viewGroup = ((org.telegram.ui.ActionBar.f3) s50Var).containerView;
        if (viewGroup != null) {
            viewGroup2 = ((org.telegram.ui.ActionBar.f3) s50Var).containerView;
            viewGroup2.invalidate();
        }
    }
}
