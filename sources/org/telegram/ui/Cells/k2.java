package org.telegram.ui.Cells;

import android.content.Context;
import android.view.ViewGroup;
import org.telegram.ui.Components.np;
public final class k2 extends np {
    public final int d;
    public final ViewGroup f23043e;

    public k2(ViewGroup viewGroup, Context context, org.telegram.ui.ActionBar.g6 g6Var, int i10) {
        super(context, 21, g6Var);
        this.d = i10;
        this.f23043e = viewGroup;
    }

    @Override
    public final void invalidate() {
        switch (this.d) {
            case 0:
                super.invalidate();
                ((r2) this.f23043e).invalidate();
                return;
            case 1:
                super.invalidate();
                ((org.telegram.ui.web.h) this.f23043e).invalidate();
                return;
            default:
                super.invalidate();
                ((qh.x2) this.f23043e).invalidate();
                return;
        }
    }

    public k2(qh.x2 x2Var, Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, 24, g6Var);
        this.d = 2;
        this.f23043e = x2Var;
    }
}
