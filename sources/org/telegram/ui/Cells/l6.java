package org.telegram.ui.Cells;

import android.view.View;
import org.telegram.ui.Components.pn;
import org.telegram.ui.Components.wk0;
import org.telegram.ui.LaunchActivity;
public final class l6 extends ih.l7 {
    public final int S = 0;
    public final View T;

    public l6(n6 n6Var, org.telegram.ui.ActionBar.b6 b6Var) {
        super(b6Var, false);
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
                org.telegram.ui.ActionBar.o2 R = LaunchActivity.R();
                if (R != null) {
                    R.getOrCreateStoryViewer().getClass();
                    R.getOrCreateStoryViewer().D(vaVar.getContext(), j10, ih.e7.a((wk0) vaVar.getParent()));
                    return;
                }
                return;
            default:
                pn pnVar = (pn) this.T;
                pnVar.D.getOrCreateStoryViewer().D(pnVar.getContext(), j10, new org.telegram.ui.Components.s(this, 25));
                return;
        }
    }

    public l6(va vaVar) {
        super(null, false);
        this.T = vaVar;
    }

    public l6(pn pnVar) {
        super(null, true);
        this.T = pnVar;
    }
}
