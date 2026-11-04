package org.telegram.ui;

import android.graphics.Paint;
import android.view.ViewGroup;
public final class q20 extends Paint {
    public final x30 f48737a;

    public q20(x30 x30Var) {
        this.f48737a = x30Var;
    }

    @Override
    public final void setAlpha(int i3) {
        super.setAlpha(i3);
        ViewGroup viewGroup = this.f48737a.f28586b;
        if (viewGroup != null) {
            viewGroup.invalidate();
        }
    }
}
