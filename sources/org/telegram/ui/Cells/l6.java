package org.telegram.ui.Cells;

import android.view.View;
import org.telegram.ui.Components.tl0;
import org.telegram.ui.Components.xn;
import org.telegram.ui.LaunchActivity;
public final class l6 extends oh.i7 {
    public final int S = 0;
    public final View T;

    public l6(n6 n6Var, org.telegram.ui.ActionBar.g6 g6Var) {
        super(g6Var, false);
        this.T = n6Var;
    }

    @Override
    public final void f(long j10) {
        switch (this.S) {
            case 0:
                ((n6) this.T).b(j10);
                return;
            case 1:
                va vaVar = (va) this.T;
                org.telegram.ui.ActionBar.p2 R = LaunchActivity.R();
                if (R != null) {
                    R.getOrCreateStoryViewer().getClass();
                    R.getOrCreateStoryViewer().D(vaVar.getContext(), j10, oh.c7.a((tl0) vaVar.getParent()));
                    return;
                }
                return;
            default:
                xn xnVar = (xn) this.T;
                xnVar.E.getOrCreateStoryViewer().D(xnVar.getContext(), j10, new org.telegram.ui.Components.t(this, 25));
                return;
        }
    }

    public l6(va vaVar) {
        super(null, false);
        this.T = vaVar;
    }

    public l6(xn xnVar) {
        super(null, true);
        this.T = xnVar;
    }
}
