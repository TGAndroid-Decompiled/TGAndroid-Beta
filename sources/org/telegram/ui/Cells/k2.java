package org.telegram.ui.Cells;

import android.content.Context;
import android.view.ViewGroup;
import org.telegram.ui.Components.lp;
public final class k2 extends lp {
    public final int d;
    public final ViewGroup e;

    public k2(ViewGroup viewGroup, Context context, org.telegram.ui.ActionBar.f6 f6Var, int i10) {
        super(context, 21, f6Var);
        this.d = i10;
        this.e = viewGroup;
    }

    @Override
    public final void invalidate() {
        switch (this.d) {
            case 0:
                super.invalidate();
                ((r2) this.e).invalidate();
                return;
            case 1:
                super.invalidate();
                ((org.telegram.ui.web.h) this.e).invalidate();
                return;
            default:
                super.invalidate();
                ((ph.x2) this.e).invalidate();
                return;
        }
    }

    public k2(ph.x2 x2Var, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, 24, f6Var);
        this.d = 2;
        this.e = x2Var;
    }
}
