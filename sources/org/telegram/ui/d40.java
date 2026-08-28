package org.telegram.ui;

import android.graphics.Paint;
import android.view.ViewGroup;
public final class d40 extends Paint {
    public final o50 f37402a;

    public d40(o50 o50Var) {
        this.f37402a = o50Var;
    }

    @Override
    public final void setAlpha(int i9) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        super.setAlpha(i9);
        o50 o50Var = this.f37402a;
        viewGroup = ((org.telegram.ui.ActionBar.f3) o50Var).containerView;
        if (viewGroup != null) {
            viewGroup2 = ((org.telegram.ui.ActionBar.f3) o50Var).containerView;
            viewGroup2.invalidate();
        }
    }
}
