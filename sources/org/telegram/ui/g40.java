package org.telegram.ui;

import android.graphics.Paint;
import android.view.ViewGroup;
public final class g40 extends Paint {
    public final r50 f38451a;

    public g40(r50 r50Var) {
        this.f38451a = r50Var;
    }

    @Override
    public final void setAlpha(int i10) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        super.setAlpha(i10);
        r50 r50Var = this.f38451a;
        viewGroup = ((org.telegram.ui.ActionBar.f3) r50Var).containerView;
        if (viewGroup != null) {
            viewGroup2 = ((org.telegram.ui.ActionBar.f3) r50Var).containerView;
            viewGroup2.invalidate();
        }
    }
}
