package org.telegram.ui.Cells;

import android.content.Context;
import android.view.ViewGroup;
import org.telegram.ui.Components.ep;
public final class n2 extends ep {
    public final int d;
    public final ViewGroup e;

    public n2(ViewGroup viewGroup, Context context, org.telegram.ui.ActionBar.p6 p6Var, int i10) {
        super(21, context, p6Var);
        this.d = i10;
        this.e = viewGroup;
    }

    @Override
    public final void invalidate() {
        switch (this.d) {
            case 0:
                super.invalidate();
                ((v2) this.e).invalidate();
                return;
            case 1:
                super.invalidate();
                ((org.telegram.ui.web.g) this.e).invalidate();
                return;
            default:
                super.invalidate();
                ((vh.h2) this.e).invalidate();
                return;
        }
    }

    public n2(vh.h2 h2Var, Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(24, context, p6Var);
        this.d = 2;
        this.e = h2Var;
    }
}
