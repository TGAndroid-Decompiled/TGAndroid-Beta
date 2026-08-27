package org.telegram.ui;

import android.graphics.Paint;

public final class g40 extends Paint {

    public final s50 f38309a;

    public g40(s50 s50Var) {
        this.f38309a = s50Var;
    }

    @Override
    public final void setAlpha(int i10) {
        super.setAlpha(i10);
        s50 s50Var = this.f38309a;
        if (((org.telegram.ui.ActionBar.e3) s50Var).containerView != null) {
            ((org.telegram.ui.ActionBar.e3) s50Var).containerView.invalidate();
        }
    }
}
