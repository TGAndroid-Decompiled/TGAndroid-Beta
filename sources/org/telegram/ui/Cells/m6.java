package org.telegram.ui.Cells;

import android.view.View;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.no;
import org.telegram.ui.LaunchActivity;
public final class m6 extends bi.m9 {
    public final int S = 0;
    public final View T;

    public m6(o6 o6Var, org.telegram.ui.ActionBar.c6 c6Var) {
        super(c6Var, false);
        this.T = o6Var;
    }

    @Override
    public final void f(long j10) {
        switch (this.S) {
            case 0:
                ((o6) this.T).b(j10);
                return;
            case 1:
                xa xaVar = (xa) this.T;
                org.telegram.ui.ActionBar.m2 R = LaunchActivity.R();
                if (R != null) {
                    R.getOrCreateStoryViewer().getClass();
                    R.getOrCreateStoryViewer().D(xaVar.getContext(), j10, bi.g9.a((mm0) xaVar.getParent()));
                    return;
                }
                return;
            default:
                no noVar = (no) this.T;
                noVar.H.getOrCreateStoryViewer().D(noVar.getContext(), j10, new org.telegram.ui.Components.s(this, 25));
                return;
        }
    }

    public m6(xa xaVar) {
        super(null, false);
        this.T = xaVar;
    }

    public m6(no noVar) {
        super(null, true);
        this.T = noVar;
    }
}
